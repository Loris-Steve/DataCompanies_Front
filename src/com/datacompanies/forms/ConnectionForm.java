package com.datacompanies.forms;

import javax.servlet.http.HttpServletRequest;

import com.datacompanies.beans.User;

public class ConnectionForm {
		private User newUser ;
		
		public User createUserConnection( HttpServletRequest request) {
			String email = request.getParameter("email");
			String password = request.getParameter("password");
			 System.out.println("Vérification de l'utilisateur : " + email + " mp : "+password);
			
			/*
			 * vérification des informations saisie par l'utilisateur
			 * 
			 */
			/*if(password.equals(password)) {
				System.out.println("mot de pass identique");;
			}*/

			newUser = new User( email, password);
			return newUser;
		}
		
}
