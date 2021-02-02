package com.datacompanies.forms;


import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.json.simple.JSONObject;
// import org.json.JSONObject;
import org.lpld.*;
import org.lpld.datacompanies.*;
import org.lpld.datacompanies.backend.Requests;
import org.lpld.datacompanies.backend.model.*;
import org.lpld.datacompanies.backend.mongodb.*;

import com.datacompanies.beans.BeanException;
import com.datacompanies.beans.DictionaryAccount;

public class SearchAccountForm {
	private DictionaryAccount dictionaryAccount = new DictionaryAccount();
	private Map<String, String> mapAttributs ;
	
	private JSONObject queryUser = new JSONObject();
	
	private JSONObject more_than = new JSONObject();
	private JSONObject less_than = new JSONObject();
	private JSONObject equals_to = new JSONObject();
	
	public SearchAccountForm() {
		mapAttributs = dictionaryAccount.getCodeAttributs() ;
	}
	
	public void putJsonOption (String optionFilter,String attributCode , String valAttribut) {
		System.out.println("option filter : "+optionFilter+" attributCode : "+attributCode+" valAttribut : "+valAttribut);
		
		// j'ajoute l'option choisi par l'utilisateur à la requête
		if(optionFilter.equals("1") ) {
			more_than.put(attributCode,valAttribut);
		}
		else if(optionFilter.equals("2")) {
			equals_to.put(attributCode,valAttribut);
			
		}
		else {
			less_than.put(attributCode,valAttribut);
			
		}
	}
	
	public JSONObject verifyAttributs( HttpServletRequest request) throws BeanException {
		List<String> annualAccountVarNames = this.dictionaryAccount.getAttributsName();
		List<String> annualAccountStringVarNames = this.dictionaryAccount.getStringAttributsName();

		String varName = ""; // contient le nom de l'attribut
		String valAttribut = null; // contient la valeur de l'attribut
		String optionFilter = null ; // on récupère l'option de filtre ( supérieur à ...)
		
		String valExtentionName = "";
		String optionExtentionName = "Option";
		Integer nbFilter = annualAccountVarNames.size();
		
		// On vérifie si l'utilisateur a choisi que les filtres simples
		if(request.getParameter("moreFilter") == null) {
			System.out.println("Attributs simple");
			valExtentionName = "simple";
			optionExtentionName = "simpleOption";
			nbFilter = 9;
		}
		else
			System.out.println("more filter!");

		System.out.println("nbFilter : "+nbFilter);
		// on parcour la liste des filtres simples (9 premiers attributs)
		for (int i = 0; i < nbFilter; i++) {
			// On récupère le nom de l'attribut à la position i
			varName = annualAccountVarNames.get(i);
			
			// on récupère le contenu de la première option
			valAttribut = request.getParameter(varName+valExtentionName+"1");
			
			System.out.println("#"+i+"\n");
			System.out.println("INT Mentionnée Nom attribut : "+varName+
					" val : " + valAttribut);
			
			// on vérifie si le premier champ est rempli avant de le traiter
			if(valAttribut != "" ){
				
				// on vérifi si c'est un string
				if(!annualAccountStringVarNames.contains(varName)) {
					optionFilter = request.getParameter(varName+optionExtentionName+"1");
					System.out.println("IF int filtre 1 :"+optionFilter);
					
					putJsonOption(optionFilter, mapAttributs.get(varName), valAttribut);

					// on récupère le contenu de la deuxième option
					valAttribut = request.getParameter(varName+valExtentionName+"2");

					// on vérifie si le champ de la deuxième option a été rempli
					if(valAttribut != "" ){

						optionFilter = request.getParameter(varName+optionExtentionName+"2");
						System.out.println("IF int filtre 2 :"+optionFilter+" | val attribut 2 : "+valAttribut);

						putJsonOption(optionFilter, mapAttributs.get(varName), valAttribut);
					}
				}
				else { 
					System.out.println("IF String filtre 1");

					equals_to.put(mapAttributs.get(varName),valAttribut);


				}
			}

		}

		if(more_than.size() > 0) {
			queryUser.put("more_than", more_than);			
		}
		if(equals_to.size() > 0)
			queryUser.put("equals_to", equals_to);	
		if(less_than.size() > 0)
			queryUser.put("less_than", less_than);
		
		//if(queryUser.size() > 0)
		//else System.out.println("query vide");

		System.out.println(queryUser);

		return queryUser;
	}
	
}
