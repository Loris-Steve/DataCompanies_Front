package com.datacompanies.forms;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.json.simple.JSONObject;
// import org.json.JSONObject;
import org.lpld.*;
import org.lpld.datacompanies.*;
import org.lpld.datacompanies.backend.Requests;
import org.lpld.datacompanies.backend.model.*;
import org.lpld.datacompanies.backend.mongodb.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.datacompanies.beans.AnnualAccount;
import com.datacompanies.beans.BeanException;
import com.datacompanies.beans.DAOException;
import com.datacompanies.beans.User;
// import datacompanies-master.src.main.java.org.lpld.datacompanies.backend.Requests.java

public class SearchAccountForm {
	private AnnualAccount annualAccount = new AnnualAccount();

	
	public void verifyAttributs( HttpServletRequest request) throws BeanException {
		List<String> annualAccountVarNames = this.annualAccount.getAttributsName();
		List<String> annualAccountStringVarNames = this.annualAccount.getStringAttributsName();
		//dict int .class egt ( actif )
		String val = "";
		Integer paramInt = null;
		String paramString = "";
		
		JSONObject queryUser = new JSONObject();
		
		JSONObject more_than = new JSONObject();
		JSONObject less_than = new JSONObject();
		JSONObject equals_to = new JSONObject();
		

		
		queryUser.put("more_than", more_than);
		queryUser.put("equals_to", equals_to);
		
		System.out.println("filter"+request.getParameter("moreFilter"));
		
		if(!request.getParameter("moreFilter").equals("true")) {
			System.out.println("Attribut simple");

			for (int i = 0; i < 9; i++) {
				System.out.println("#"+i+" | "+request.getParameter(annualAccountVarNames.get(i)+"simple1")+"\n");
				// on vérifie si le premier champ est rempli
				if(request.getParameter(annualAccountVarNames.get(i)+"simple1") != "" ){
					
				
					if(!annualAccountStringVarNames.contains(annualAccountVarNames.get(i))) {
						System.out.println("INT Mentionnée Nom attribu : "+annualAccountVarNames.get(i)+
								" val : " + request.getParameter(annualAccountVarNames.get(i)+"simple1"));
						// j'ajoute la requête en fonction de son paramètre
						if(request.getParameter(annualAccountVarNames.get(i)+"simpleOption1").equals(">") ) {
							more_than.put("DI.0",request.getParameter(annualAccountVarNames.get(i)+"simple1"));
						}
						else if(request.getParameter(annualAccountVarNames.get(i)+"simpleOption1").equals("=")) {
							
						}
						else {
							
						}
						equals_to.put("siren", "005880");
						less_than = new JSONObject();
						if(request.getParameter(annualAccountVarNames.get(i)+"simple2") != "" ){
	
							// on vérifie si le deuxième champs est remplie
							System.out.println(" op1 : "+request.getParameter(annualAccountVarNames.get(i)+"simpleOption1")+
									" val2 : " + request.getParameter(annualAccountVarNames.get(i)+"simple2") +
									" op2 : " + request.getParameter(annualAccountVarNames.get(i)+"simpleOption2"));
							
						}
					}
					else { 
						System.out.println("String ? Mentionnée Nom attribu : "+annualAccountVarNames.get(i)+
								" val : " + request.getParameter(annualAccountVarNames.get(i)+"simple1"));
						

					}
				}

			}
		}
		else {
			System.out.println("more filter!");

			for (int i = 0; i < annualAccountVarNames.size(); i++) {
				System.out.println("#"+i+" | "+request.getParameter(annualAccountVarNames.get(i)+"1")+"\n");
				// on vérifie si le premier champ est rempli
				if(request.getParameter(annualAccountVarNames.get(i)+"1") != "" ){
		
				
					if(!annualAccountStringVarNames.contains(annualAccountVarNames.get(i))) {
						System.out.println("INT Mentionnée Nom attribu : "+annualAccountVarNames.get(i)+
								" val : " + request.getParameter(annualAccountVarNames.get(i)+"1"));
						if(request.getParameter(annualAccountVarNames.get(i)+"2") != "" ){
		
							// on vérifie si le deuxième champs est remplie
							System.out.println(" op1 : "+request.getParameter(annualAccountVarNames.get(i)+"Option1")+
									" val2 : " + request.getParameter(annualAccountVarNames.get(i)+"2") +
									" op2 : " + request.getParameter(annualAccountVarNames.get(i)+"Option2"));
							
						}
					}
					else { 
						System.out.println("String ? Mentionnée Nom attribu : "+annualAccountVarNames.get(i)+
								" val : " + request.getParameter(annualAccountVarNames.get(i)+"1"));
						
		
					}
				}
			}
		}
		
		/*{
		    "more_than":{
		        "DI.0":"2000",
		        "CC.1":"10000000"
		    },
		    "less_than":{
		        
		    },
		    "equals_to":{
		        "siren":"005880596"
		    }
		    
	
		} */
		
		//dict int .class egt ( actif )
		//JSONObject DI_O = new JSONObject();


		
		System.out.println(queryUser);
		AnnualAccountStringHelper s = new AnnualAccountStringHelper();
		
		Requests r = new Requests("ec2-18-218-240-179.us-east-2.compute.amazonaws.com");
		r.doRequest(queryUser);
		/*
		 * vérification des informations saisie par l'utilisateur
		 * 
		 */
		/*if(password.equals(confirmPassword)) {
			System.out.println("mot de pass identique");;
		}*/

		//return newUser;
	}
	
}
