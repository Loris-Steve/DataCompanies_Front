package com.datacompanies.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.datacompanies.beans.BeanException;
import com.datacompanies.beans.AnnualAccount;
import com.datacompanies.beans.DAOException;
import com.datacompanies.beans.User;
import com.datacompanies.dao.DaoFactory;
import com.datacompanies.dao.UserDao;
import com.datacompanies.forms.ConnectionForm;
import com.datacompanies.forms.InscriptionForm;

/**
 * Servlet implementation class Conection
 */
@WebServlet("/Connection")
public class Connection extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private UserDao userDao; 
    
    public void init() throws ServletException {
    	DaoFactory daoFactory = DaoFactory.getInstance(); // renvoi un daoFactory connecté à la bd
    	this.userDao = daoFactory.getUsersDao();
    }
    
    public Connection() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/connection.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String redirection = "connection" ; 
		// traitement de formulaire
		ConnectionForm form = new ConnectionForm();
		User user = form.createUserConnection(request);
		System.out.println("Vérification de l'utilisateur : " + user.getEmail() + " mp : "+user.getPassword());
	
		AnnualAccount annualAccount = new AnnualAccount();
		List<String> annualAccountVarNames = new ArrayList<String>();
		List<String> annualAccountStringVarNames = new ArrayList<String>();
		
		try {
			User userConnection = userDao.findUser(user);
			System.out.println("Connection de l'utilisateur");
			if(userConnection.getFirstName() != null) {
				request.setAttribute("user", userConnection);
				redirection = "search";
			}

			// 	On récupère les différents attribut d'une entreprise
			try {
				annualAccountVarNames = annualAccount.getAttributsName();
				annualAccountStringVarNames = annualAccount.getStringAttributsName();
			} catch (BeanException e1) {
				request.setAttribute("erreur", "Impossible de charger les filters");//+e.getMessage());
			}

			request.setAttribute("annualAccountStringVarNames", annualAccountStringVarNames);
			request.setAttribute("annualAccountVarNames", annualAccountVarNames);
			
		} catch (BeanException e) {
			request.setAttribute("erreur", "Impossible de se connecter ");//+e.getMessage());
		} catch (DAOException e) {
			request.setAttribute("erreur", e.getMessage());//+e.getMessage());
		}

		this.getServletContext().getRequestDispatcher("/WEB-INF/"+redirection+".jsp").forward(request, response);

	}

}
