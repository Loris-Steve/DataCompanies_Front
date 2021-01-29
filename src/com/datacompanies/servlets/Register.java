package com.datacompanies.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.datacompanies.beans.BeanException;
import com.datacompanies.beans.User;
import com.datacompanies.dao.DaoFactory;
import com.datacompanies.dao.UserDao;
import com.datacompanies.forms.InscriptionForm;


@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private UserDao userDao; 
    
    public void init() throws ServletException {
    	DaoFactory daoFactory = DaoFactory.getInstance(); //return daoFactory connecté à la bd sql
    	this.userDao = daoFactory.getUsersDao(); // return DAOImp
    }
    
    public Register() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 // Traitement de formulaire
		 InscriptionForm form = new InscriptionForm();
		 User newUser = form.verifierIdentifiants(request);
		 System.out.println("Vérification de l'utilisateur : " + newUser.toString());
		 try {
			userDao.createUser(newUser);
			System.out.println("Creation de l'utilisateur");
		} catch (BeanException e) {
			request.setAttribute("erreur", "Impossible de créer l'utilisateur : ");//+e.getMessage());
		}
		this.getServletContext().getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);

	}

}
