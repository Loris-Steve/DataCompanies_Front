package com.datacompanies.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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

	private MongoCursor<Document> result;
    private JSONObject queryUser = new JSONObject();
    private ArrayList<HashMap> listeAnnualAccounts = new ArrayList<HashMap>();  
	
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
		listeAnnualAccounts = new ArrayList();
		String redirection = "search" ; 
		initialization(request);
		
		SearchAccountForm searchAccountform = new SearchAccountForm();
		try {
			// on créer une requête avec les valeurs saisies par l'utilisateur
			queryUser = searchAccountform.verifyAttributs(request);
			Requests req = new Requests("ec2-3-138-68-101.us-east-2.compute.amazonaws.com"); // localhost
			result = req.doRequest(queryUser);
			
			System.out.println("Mango cursor : "+result.hasNext());
			/*9Document doc = new Document() ;
			System.out.println("resultat");
			doc = result.next();

        	System.out.println("#i "+doc.toString() );
	    	System.out.println("TEST AFFICHE !"+doc.get("DD").toString());*/
			//sendListAcount(request);
			getListenerAnnuaalAccount(result, request);
		} catch (BeanException e) {
			request.setAttribute("error", "Formulaire incorrecte");//+e.getMessage());
			
		}

		this.getServletContext().getRequestDispatcher("/WEB-INF/"+redirection+".jsp").forward(request, response);

	}

	public void getListenerAnnuaalAccount(MongoCursor<Document> cursor,HttpServletRequest request){
	/*	Document doc = new Document() ;
		System.out.println("resultat");
		doc = cursor.next();

    	System.out.println("#i "+doc.toString() );
    	System.out.println("TEST AFFICHE !"+doc.get("DD").toString());*/
		Document doc = new Document() ;
		System.out.println("resultat : "+cursor.hasNext());
		for(int i=0;i<10;i++){
			    //while(cursor.hasNext()){
			if(cursor.hasNext()) {
				doc = cursor.next();
				System.out.println("#i "+doc.toString() );
		    	System.out.println("TEST AFFICHE !");//+doc.get("DD").toString());


	        	Map<String, String> annualAccount = new HashMap<String, String>() ;
	        	// je parcours la liste des attribut que le compte de l'entreprise peut contenir
	            //Parcourir le Hashmap avec la boucle For
	            for (Map.Entry a : mapAttributs.entrySet()) {
	               // System.out.println("ID: "+a.getKey()+", Nom: "+a.getValue());
	                
					if(doc.get(a.getValue()) != null){
		               // System.out.println(a.getKey()+"Enter"+doc.get(a.getValue()));
		                annualAccount.put((String) a.getKey(),doc.get(a.getValue()).toString());
					}
	            }
	            
				if (doc.get("FJ") != null){
					System.out.println("FJ present : "+doc.get("FJ").toString());
					ArrayList<Object> a = (ArrayList<Object>)doc.get("FJ");
	                annualAccount.put("FJ",a.get(0).toString());
				}
				if (doc.get("GG") != null){
					System.out.println("GG present : "+doc.get("GG").toString());
					ArrayList<Object> a = (ArrayList<Object>)doc.get("GG");
					annualAccount.put("GG",a.get(0).toString());
				}
				if (doc.get("HN") != null){
					ArrayList<Object> a = (ArrayList<Object>)doc.get("HN");
	                annualAccount.put("HN",a.get(0).toString());
				}
				if (doc.get("CO") != null){
					ArrayList<Object> a = (ArrayList<Object>)doc.get("CO");
	                annualAccount.put("CO",a.get(0).toString());
				}
				
		        listeAnnualAccounts.add((HashMap) annualAccount);
		    }
			else {
				System.out.println("fin d'affichage");
			}
}
		request.setAttribute("listeAnnualAccounts", listeAnnualAccounts);

	}
	
	/*public String getCodeAttribut(String key) {
		
		return mapAttributs.get(key);
		
		             
		                
		                if(doc.get(a.getValue()) instanceof ArrayList) {
		                	System.out.println("voi Arraylist");

			               ArrayList<Double> list = (ArrayList<Double>) doc.get(a.getValue());
		                	System.out.println("val"+list.get(0));
		                	Double val = list.get(0);
		                	annualAccount.put((String) a.getKey(),String.valueOf(val));

		                }
		                else if(doc.get(a.getValue()) instanceof Object) {
		                	System.out.println("voi objet");
			               // ArrayList val = (ArrayList) doc.get(a.getValue());
			                System.out.println("val");
		                	//annualAccount.put((String) a.getKey(), String.valueOf(val.get(0)));
		                }
		                else if(doc.get(a.getValue()) instanceof String){
		                	System.out.println("Autre");
		                	
		                }
		               
		
	}*/
	

}

