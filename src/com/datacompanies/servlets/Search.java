package com.datacompanies.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.datacompanies.beans.BeanException;
import com.datacompanies.beans.AnnualAccount;
import com.datacompanies.beans.User;
import com.datacompanies.dao.AnnualAccountDao;
import com.datacompanies.dao.DaoFactory;
import com.datacompanies.forms.ConnectionForm;
import com.datacompanies.forms.SearchAccountForm;

/**
 * Servlet implementation class Search
 */
@WebServlet("/Search")
public class Search extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private AnnualAccountDao annualAccountDao ;
    
    public void init() throws ServletException {
    	DaoFactory daoFactory = DaoFactory.getInstance(); // renvoi un daoFactory connecté à la bd
    	this.annualAccountDao = daoFactory.getAnnualAccountDao();
    }
    
    public Search() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		sendStringAttributAcount(request);
		sendAllAttributAcount(request);
		sendListAcount(request);
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/search.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String redirection = "search" ; 
		sendStringAttributAcount(request);
		sendAllAttributAcount(request);
		sendListAcount(request);
		
		SearchAccountForm searchAccountform = new SearchAccountForm();
		try {
			searchAccountform.verifyAttributs(request);
		} catch (BeanException e) {
			request.setAttribute("erreur", "Formulaire incorrecte");//+e.getMessage());
			
		}
		//User user = form.createUserConnection(request);
		//System.out.println("Vérification de l'utilisateur : " + user.getEmail() + " mp : "+user.getPassword());
		this.getServletContext().getRequestDispatcher("/WEB-INF/"+redirection+".jsp").forward(request, response);

	}
	
	public void sendStringAttributAcount(HttpServletRequest request){
		// On récupère la liste des attribut d'une entreprise
		AnnualAccount annualAccount = new AnnualAccount();
		List<String> annualAccountStringVarNames = new ArrayList<String>();
		
		// 	On récupère les différents attribut d'une entreprise
		try {
			annualAccountStringVarNames = annualAccount.getStringAttributsName();
		} catch (BeanException e1) {
			request.setAttribute("erreur", "Impossible de charger les filtres de type chaîne de caractère");//+e.getMessage());
		}
		
		//*System.out.println("annualAccountStringVarNames : "+ annualAccountStringVarNames);
		request.setAttribute("annualAccountStringVarNames", annualAccountStringVarNames);
		
		// On récupère la liste des entreprises 
		try {
			//*System.out.println( "debut du get"+annualAccountDao.listener());
			request.setAttribute("companies", annualAccountDao.listener());
		} catch (com.datacompanies.beans.BeanException e) {
			request.setAttribute("erreur", "Impossible de lister les entreprises");//+e.getMessage());
			
		}
	}
	
	public void sendAllAttributAcount(HttpServletRequest request){
		// On récupère la liste des attribut d'une entreprise
		AnnualAccount annualAccount = new AnnualAccount();
		List<String> annualAccountVarNames = new ArrayList<String>();

		// 	On récupère les différents attribut d'une entreprise
		try {
			annualAccountVarNames = annualAccount.getAttributsName();
		} catch (BeanException e1) {
			request.setAttribute("erreur", "Impossible de charger les filters");//+e.getMessage());
		}

		request.setAttribute("annualAccountVarNames", annualAccountVarNames);
	}
		
		public void sendListAcount(HttpServletRequest request){

			// On récupère la liste des entreprises 
			try {
				//*System.out.println( "debut du get"+annualAccountDao.listener());
				request.setAttribute("companies", annualAccountDao.listener());
			} catch (com.datacompanies.beans.BeanException e) {
				request.setAttribute("erreur", "Impossible de lister les entreprises");//+e.getMessage());

			}
		}

}
