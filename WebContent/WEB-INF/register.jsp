<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
    	<title>DataCompanies</title>
  	</head>

	<body class="bg-light">
	    
	  <main class="container">
	  
	    <div class="py-5 text-center">
	      <img class="d-block mx-auto mb-4" src="/docs/5.0/assets/brand/bootstrap-logo.svg" alt="" width="72" height="57">
	      <h2>DataCompanies</h2>
	      <p class="lead">Comparez des millions d'entreprises avec leurs données </p>
	    </div>
	    
		<c:if test="${ !empty erreur }"><p><c:out value="Inscription : ${ erreur } " /></p></c:if>
	
	      <div class="row justify-content-center ">
	        
	        <form method="post" action="conection" class="col-lg-8 col-12 needs-validation" novalidate>
	          <h4 class="mb-3">Inscription</h4>
	          <div class="row g-3">
	          
	            <div class="col-sm-6">
	              <label for="firstName" class="form-label">Prénom</label>
	              <input type="text" class="form-control" id="firstName" name="firstName" placeholder="Veuillez entrer votre prenom" required>
	              <div class="invalid-feedback">
	                Valid first name is required.
	              </div>
	            </div>
	
	            <div class="col-sm-6">
	              <label for="lastName" class="form-label">Nom de famille</label>
	              <input type="text" class="form-control" id="lastName" name="lastName" placeholder="Veuillez entrer votre nom de famille" required>
	              <div class="invalid-feedback">
	                Valid last name is required.
	              </div>
	            </div>
	
	            <div class="col-12 mt-4 ">
	              <label for="email" class="form-label">Email</label>
	              <div class="input-group">
	            	<span class="input-group-text">@</span>
	              	<input type="email" class="form-control" id="email" name="email" placeholder="mail@example.com">
	              </div>
	              <div class="invalid-feedback">
	                Please enter a valid email address for shipping updates.
	              </div>
	            </div>
			    
	            <div class="col-12 mt-4">
		        <label for="password" class="visually-hidden">Password</label>
			    <input type="password" id="password" name="password" class="form-control" placeholder="mot de passe" required>
	              <div class="invalid-feedback">
	                Please enter a valid password for shipping updates.
	              </div>
	            </div>
		
	            <div class="col-12 mt-4">
		        <label for="inputPassword" class="visually-hidden">Confirm Password</label>
			    <input type="password" id="confirmPassword" name="confirmPassword" class="form-control" placeholder="Confirmer le mot de passe" required>
	              <div class="invalid-feedback">
	                Please enter a valid password for shipping updates.
	              </div>
	            </div>
	            
	            <div class="col-12 mt-4">
	              <label for="company" class="form-label">Company <span class="text-muted">(Optional)</span></label>
	              <input type="text" id="company" name="company" class="form-control" id="company" placeholder="Company name...">
	              <div class="invalid-feedback">
	                Please enter a valid company for shipping updates.
	              </div>
	            </div>
	            
	            <div class="col-12 mt-4">
	              <a href="/DataCompanies/" >Connexion</a>
	            </div>
	
	          <button class="w-100 btn btn-primary btn-lg mt-4" type="submit">submit</button>
	         
	         </div>
	        </form>
	    </div>
	    
	  </main>
	  
  </body>
</html>