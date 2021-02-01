<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
    	<title>DataCompanies</title>
  	</head>
  	
  	<body class="container h-100 bg-light">
    
		<main class="row justify-content-center align-items-center h-100 text-center">
		  <form method="post" action="search" class="col-lg-6 col-12 ">
		    <!-- <img class="mb-4" src="/docs/5.0/assets/brand/bootstrap-logo.svg" alt="" width="72" height="57"> -->
		    <h1 class="h3 mb-3 fw-normal">Please sign in</h1>
		    	<div class="col-12 mt-4 ">
	              <label for="email" class="form-label">Email</label>
	              <div class="input-group">
	              	<input type="email" class="form-control" id="email" name="email" placeholder="exemple@example.com">
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

		  <!--   <div class="checkbox mb-3">
		      <label>
		        <input type="checkbox" value="remember-me"> Remember me
		      </label>
		    </div>  -->
		    <a href="/DataCompanies/register" >inscription</a>
		    
		    <button class="w-100 btn btn-lg btn-primary" type="submit">Sign in</button>
		    <p class="mt-5 mb-3 text-muted">&copy; 2021</p>
		   	<c:if test="${ !empty erreur }"><p style="color:red;"><c:out value="${ erreur }" /></c:if>
		   	<c:if test="${ !empty user }"><p style="color:red;">succes : <c:out value="${ user.firstName }" /></c:if>
		   	
		  </form>
		</main>
	
	</body>
</html>