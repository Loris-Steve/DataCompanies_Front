package com.datacompanies.forms;

import javax.servlet.http.HttpServletRequest;

import com.datacompanies.beans.User;

public class InscriptionForm {
	private User newUser ;
	
	public User verifierIdentifiants( HttpServletRequest request) {
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String confirmPassword = request.getParameter("confirmPassword");
		String company = request.getParameter("company");
		
		/*
		 * vérification des informations saisie par l'utilisateur
		 * 
		 */
		if(password.equals(confirmPassword)) {
			System.out.println("mot de pass identique");;
		}

		newUser = new User( firstName, lastName, email, company);
		newUser.setPassword(confirmPassword);
		return newUser;
	}
	
}