package com.datacompanies.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.datacompanies.beans.AnnualAccount;
import com.datacompanies.beans.DAOException;

public class AnnualAccountDaoImpl implements AnnualAccountDao{
	private DaoFactory daoFactory;
	
	AnnualAccountDaoImpl(DaoFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public List<AnnualAccount> listener() throws DAOException{
		/* La liste qui contiendra tous les résultats de nos essais */
		   
		List<AnnualAccount> annualAccounts = new ArrayList<AnnualAccount>();
	    Connection connexion = null;
		Statement statement = null;
	    ResultSet resultat = null;
	    
	    //System.out.println("driver chargé");
	    try {

	    	connexion = daoFactory.getConnection();
	    	statement = connexion.createStatement();

	    	// Exécution de la requête
	    	resultat = statement.executeQuery("SELECT chiffreAffaire,resultatExploitation FROM Companies"
	    			+ ";");
	    	
	    	// recuperation des données 
	    	while (resultat.next()) {
	    		Integer chiffreAffaire = resultat.getInt("chiffreAffaire");
	    		Integer resultatExploitation = resultat.getInt("resultatExploitation");
	    		
	    		AnnualAccount Company = new AnnualAccount();
	    		
				//Company.setChiffreAffaire(chiffreAffaire);
	    		//Company.setResultatExploitation(resultatExploitation);
	    		
	    		annualAccounts.add(Company);
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
	    
	    return annualAccounts;
	}
}