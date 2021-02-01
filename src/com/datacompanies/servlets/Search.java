package com.datacompanies.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.bson.Document;
import org.json.simple.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.bson.Document;
import org.lpld.datacompanies.backend.Requests;
import org.lpld.datacompanies.backend.model.AnnualAccount;

import com.datacompanies.beans.BeanException;
import com.datacompanies.beans.DictionaryAccount;
import com.datacompanies.beans.User;
import com.datacompanies.dao.DaoFactory;
import com.datacompanies.forms.ConnectionForm;
import com.datacompanies.forms.SearchAccountForm;
import com.mongodb.client.MongoCursor;


/**
 * Servlet implementation class Search
 */
@WebServlet("/Search")
public class Search extends HttpServlet {
    
	private DictionaryAccount dict = new DictionaryAccount();
	private Map<String, String> mapAttributs ;

	private Map<String, String> mapCodeToName ;
	private Map<String, String> mapNmaeToCode ;

	private MongoCursor<Document> cursor;
    private JSONObject queryUser = new JSONObject();
    private ArrayList<AnnualAccount> accountList;
	
    private static final long serialVersionUID = 1L;
	
    public void init() throws ServletException {
    	DaoFactory daoFactory = DaoFactory.getInstance(); // renvoi un daoFactory connecté à la bd
    	JSONObject queryUser = new JSONObject();
    	mapNmaeToCode = dict.getCodeAttributs() ;
    	mapCodeToName = dict.getNameCode() ;
		mapAttributs = dict.getCodeAttributs() ;

    }
    
    public Search() {
        super();
    }

	public void initialization(HttpServletRequest request) {
    	try {
			request.setAttribute("annualAccountVarNames",dict.getAttributsName());
			request.setAttribute("annualAccountStringVarNames", dict.getStringAttributsName());

		} catch (BeanException e) {
			request.setAttribute("error", "Impossible de charger les filtres de type chaîne de caractère");//+e.getMessage());
		}
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		initialization(request);
		//getListenerAnnuaalAccount(result, request);
		this.getServletContext().getRequestDispatcher("/WEB-INF/search.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String redirection = "search" ; 
		initialization(request);
		
		SearchAccountForm searchAccountform = new SearchAccountForm();
		try {
			// on créer une requête avec les valeurs saisies par l'utilisateur
			queryUser = searchAccountform.verifyAttributs(request);
			Requests req = new Requests("ec2-3-138-34-23.us-east-2.compute.amazonaws.com");
			cursor = req.doRequest(queryUser);
			

			getListenerAnnuaalAccount(request);
		} catch (BeanException e) {
			request.setAttribute("error", "Formulaire incorrecte");
			
		}

		this.getServletContext().getRequestDispatcher("/WEB-INF/"+redirection+".jsp").forward(request, response);

	}
		
	public void sendListAcount(HttpServletRequest request){
		//request.setAttribute("listeAnnualAccounts", listeAnnualAccounts);
		//*System.out.println( "debut du get"+annualAccountDao.listener());
		//request.setAttribute("companiesww", annualAccountDao.listener());
	}
	
	public void getListenerAnnuaalAccount(HttpServletRequest request){
	
		System.out.println("In getListenerAnnuaalAccount method");

		this.accountList = new ArrayList();
		this.fillAccountList();
		
		request.setAttribute("listeAnnualAccounts", accountList);

	}

	public void nextPage(int nbNextPages){
		for(int i=0;i<nbNextPages;i++){
			this.fillAccountList();
		}
	}

	private void fillAccountList(){
		for(int i=0;i<10;i++){
			if(this.cursor.hasNext()){
				this.accountList.add(new AnnualAccount(this.cursor.next()));
			}
		}
	}
	
	/*public String getCodeAttribut(String key) {
		
		return mapAttributs.get(key);
	}*/
	

}
