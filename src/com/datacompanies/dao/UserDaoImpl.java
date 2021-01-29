package com.datacompanies.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.datacompanies.beans.DAOException;
import com.datacompanies.beans.User;

public class UserDaoImpl implements UserDao{
	private DaoFactory daoFactory;
	
	UserDaoImpl(DaoFactory daoFactory) {
		this.daoFactory = daoFactory;
	}
	
	@Override
	public void createUser(User user) throws DAOException {
		Connection connexion = null;
		PreparedStatement preparedStatement = null;
		 System.out.println("User deatil:\nfirstname : "+user.getFirstName()+"\nlastName : "+user.getLastName()+"\n email : "+user.getEmail()+
				 "\npassword : "+user.getPassword()+"\nCompany : "+user.getCompany());
		try {
			connexion = daoFactory.getConnection();

			preparedStatement = connexion.prepareStatement("INSERT INTO users(firstName,lastName,email,password,company) VALUES (?,?,?,?,?);");
		    preparedStatement.setString(1, user.getFirstName());
		    preparedStatement.setString(2, user.getLastName());
			preparedStatement.setString(3, user.getEmail());
		    preparedStatement.setString(4, user.getPassword());
		    preparedStatement.setString(5, user.getCompany());

			preparedStatement.executeUpdate();
			
			connexion.commit(); // Transaction : annule toute les modifications si problème 
		}catch (SQLException e  ) {
			try {
				if (connexion != null) {
					connexion.rollback();
				}
			} catch (SQLException e2) {
			}
			throw new DAOException("Impossible de communiquer avec la base de données");
	    	// e.printStackTrace();
	    }
		finally {
			//  Transaction : si tout se passe bien on ferme la connxion à la main
			try {
				if (connexion != null) {
					connexion.close();
				}
			} catch (SQLException e) {
				throw new DAOException("Impossible de communiquer avec la base de données");
			}
		}
	}

	@Override
	public User findUser(User user) throws DAOException {
		/* La liste qui contiendra tous les résultats de nos essais */
		User userConnected = new User();
	    Connection connexion = null;
		Statement statement = null;
	    ResultSet resultat = null;
	    
		 System.out.println("User deatil: \nemail : "+user.getEmail()+
				 "\npassword : "+user.getPassword()+"\nCompany : "+user.getCompany());
	    try {

	    	connexion = daoFactory.getConnection();
	    	statement = connexion.createStatement();

	    	// Exécution de la requête
	    	resultat = statement.executeQuery(
	      			"SELECT * FROM users "
	    			+ "WHERE email='"+user.getEmail()+"'"
	    			+ " AND password='"+user.getPassword()+"'"
	    			+";");
	    	
	    	System.out.println("traduction : "+resultat.getRow());

	    	// recuperation des données 
	    	while (resultat.next()) {
	    		userConnected.setFirstName(resultat.getString("firstName"));
	    		userConnected.setLastName(resultat.getString("lastName"));
	    		userConnected.setEmail(resultat.getString("email"));
	    		userConnected.setPassword(resultat.getString("password"));
	    		userConnected.setCompany(resultat.getString("company"));
	    	}

	    }
	    catch (SQLException e) {
			try {
				if (connexion != null) {
					connexion.rollback();
				}
			} catch (SQLException e2) {
			}
			throw new DAOException("Impossible de communiquer avec la base de données");
	    } finally {
	    	// Fermeture de la connxion
	    	try {
	    		if (resultat != null)
	    			resultat.close();
	    		if (resultat != null)
	    			statement.close();
	    		if (resultat != null)
	    			connexion.close();
	    	}
	    	catch (SQLException ignore) {
	    	}
	    }
		 System.out.println("Find User:\nfirstname : "+userConnected.getFirstName()+"\nlastName : "+userConnected.getLastName()+"\n email : "+userConnected.getEmail()+
				 "\npassword : "+userConnected.getPassword()+"\nCompany : "+userConnected.getCompany());
	    return userConnected;
	}
}