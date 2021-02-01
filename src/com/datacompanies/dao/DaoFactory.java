package com.datacompanies.dao ;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Properties;

public class DaoFactory {

    private static final String FICHIER_PROPERTIES       = "/com/sdzee/Dao/Dao.properties";
    private static final String PROPERTY_URL             = "url";
    private static final String PROPERTY_DRIVER          = "driver";
    private static final String PROPERTY_NOM_UTILISATEUR = "nomutilisateur";
    private static final String PROPERTY_MOT_DE_PASSE    = "motdepasse"; 

    private String              url;
    private String              username;
    private String              password;

    DaoFactory( String url, String username, String password ) {
        this.url = url;
        this.username = username;
        this.password = password;
    }

    /*
     * Méthode chargée de récupérer les informations de connexion à la base de
     * données, charger le driver JDBC et retourner une instance de la Factory
     */
    public static DaoFactory getInstance() {// throws DAOConfigurationException {
    	 // Chargement du driver
	    try {
	    	Class.forName("com.mysql.cj.jdbc.Driver");
	    }catch (ClassNotFoundException e) {
	    	System.out.println(" No jdbc driver ");
	    }
    	
    	DaoFactory instance = new DaoFactory("jdbc:mysql://localhost:3306/bdd_sdzee?serverTimezone=" + Calendar.getInstance().getTimeZone().getID(),"root","root");
    	
    	return instance ;
    }
    

    /* Méthode chargée de fournir une connexion à la base de données */
   public Connection getConnection() throws SQLException {
      // return DriverManager.getConnection( url, username, password ); // Methode sans transactoin
      /* */
	   // Methode Transaction :
       Connection connexion = DriverManager.getConnection(url,username,password);
	   connexion.setAutoCommit(false);
      return connexion;
     
   }

    /*
     * Méthodes de récupération de l'implémentation des différents Dao (un seul
     * pour le moment)
     */
	    public UserDao getUsersDao() {
	        return new UserDaoImpl( this );
	    }
}