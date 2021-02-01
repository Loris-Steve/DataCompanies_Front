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
		String redirection = "search" ; 
		initialization(request);
		
		SearchAccountForm searchAccountform = new SearchAccountForm();
		try {
			// on créer une requête avec les valeurs saisies par l'utilisateur
			queryUser = searchAccountform.verifyAttributs(request);
			Requests req = new Requests("ec2-3-138-34-23.us-east-2.compute.amazonaws.com");
			result = req.doRequest(queryUser);
			
			/*Document doc = new Document() ;
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
		
	public void sendListAcount(HttpServletRequest request){

		Map<String,String> attributsMap = new HashMap<String,String>();
		Map<String,String> attributsMap2 = new HashMap<String,String>();

		//attributsMap.put("siren", "bye");
		attributsMap.put("fonds_commercial", "good");
		attributsMap2.put("actif", "chantaaal");
listeAnnualAccounts.add((HashMap) attributsMap);
listeAnnualAccounts.add((HashMap) attributsMap2);
/*doc.put("siren", "super");
doc.put("fonds_commercial", "vraiment");
doc.put("actif", "chantaaal");
*/
		request.setAttribute("listeAnnualAccounts", listeAnnualAccounts);
		//*System.out.println( "debut du get"+annualAccountDao.listener());
		//request.setAttribute("companiesww", annualAccountDao.listener());
	}
	
	public void getListenerAnnuaalAccount(MongoCursor<Document> cursor,HttpServletRequest request){
	/*	Document doc = new Document() ;
		System.out.println("resultat");
		doc = cursor.next();

    	System.out.println("#i "+doc.toString() );
    	System.out.println("TEST AFFICHE !"+doc.get("DD").toString());*/
		Document doc = new Document() ;
		System.out.println("resultat");
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
	                System.out.println("ID: "+a.getKey()+", Nom: "+a.getValue());
					if(doc.get(a.getValue()) != null){
		                System.out.println(a.getKey()+"Enter"+doc.get(a.getValue()));
		                /*
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
		               */
		                annualAccount.put((String) a.getKey(),doc.get(a.getValue()).toString());
					}
	            }
		        listeAnnualAccounts.add((HashMap) annualAccount);
		    }
}
		request.setAttribute("listeAnnualAccounts", listeAnnualAccounts);

	}
	
	/*public String getCodeAttribut(String key) {
		
		return mapAttributs.get(key);
	}*/
	

}
