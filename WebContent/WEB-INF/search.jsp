<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
    	<title>DataCompanies</title>
  	</head>
	
	<body>

		<%@ include file="navbar.jsp" %>
		
		<div class="jumbotron ">
			<form method="post" action="search" class="container g-3">
			  <div class="row">
				  <div class="col-md-11  col-auto ">
				    <input type="number"class="form-control" id="sirensimple1" name="sirensimple1" placeholder="siren...">
				
				  </div>
				
				  <div class="col-md-1 col-auto ">
				    <button type="submit" class="btn btn-primary mb-3 ">valider</button>
				  </div>
				  
				  <div class="col-12 col-auto">
					<%@ include file="simpleFilter.jsp" %>
				  </div>
				  	
				</div>
			</form>
				  	<%@ include file="moreFilter.jsp" %>
		</div>

		<div class="container">

		<c:forEach var="attribut" items="${attributs}" varStatus="status">
		{status.count}
					<p><c:out value =" ${attribut}"/></p>
				</c:forEach>
			<h2>Liste des entreprises</h2>
			<c:out value =" ${attribut}"/>
			<c:if test="${ !empty error }"><p style="color:red;"><c:out value="${ erreur }" /></c:if>
			
			<div class="row list-group">
				<c:forEach var="annualAccount" items="${listeAnnualAccounts}" varStatus="status">
				  	<div class="container-fluid list-group-item list-group-item-action list-group-item-light " type="button" data-toggle="modal" data-target="#detailannualAccount<c:out value ="${statut.count}"/>">
						<div class="row">
							<div class="col-6 ">
								<c:forEach begin="0" end="4" var="varName" items="${annualAccountVarNames}">
							    		<p class="mb-1"><c:out value ="${varName} : "/> <c:out value =" ${annualAccount[varName]}"/></p>
								</c:forEach>
							</div>
							<div class="col-6">
								<c:forEach begin="5" end="8" var="varName" items="${annualAccountVarNames}">
							    		<p class="mb-1"><c:out value ="${varName} : "/><c:out value =" ${annualAccount[varName]}"/></p>
								</c:forEach>
							</div>
						</div>
					</div>
					
					<!-- Modal --><!--
					<div class="modal fade " id="detailannualAccount<c:out value ="${statut.count}"/>" tabindex="-1" role="dialog" aria-labelledby="detailannualAccount<c:out value ="${statut.count}"/>" aria-hidden="true">
					  <div class="modal-dialog modal-dialog modal-lg " role="document">
					    <div class="modal-content">
					    
					      <div class="modal-header">
					        <h5 class="modal-title" id="titleDetailannualAccount<c:out value ="${statut.count}"/>">Détail de l'entreprise</h5>
					        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
					          <span aria-hidden="true">&times;</span>
					        </button>
					      </div>
					      
					      <div class="modal-body">
					      	<div class="row ">
								<div class="col-6 ml-4">
									<c:forEach begin="0" end="13" var="varName" items="${annualAccountVarNames}">
								    		<p class="mb-1"><c:out value ="${varName} : "/> <c:out value =" ${annualAccount[varName]}"/></p>
									</c:forEach>
								</div>
								<div class="col-5 ml-4">
									<c:forEach begin="14" end="28" var="varName" items="${annualAccountVarNames}">
								    		<p class="mb-1"><c:out value ="${varName} : "/><c:out value =" ${annualAccount[varName]}"/></p>
									</c:forEach>
								</div>
							</div>
					     </div>
     	
					      <div class="modal-footer">
					        <button type="button" class="btn btn-secondary" data-dismiss="modal">Termer</button>
					        <button type="button" class="btn btn-primary">Télécharger</button>
					      </div>
					      
					    </div>
					  </div>
					</div>-->
						
				</c:forEach>
			</div>
		</div>
		
		<div class="container text-center mt-4">
			<div class="btn-group btn-group-toggle" data-toggle="buttons">
			  <label class="btn btn-light active">
			    <input type="radio" name="options" id="option1" autocomplete="off" checked> 1
			  </label>
			  <label class="btn btn-light">
			    <input type="radio" name="options" id="option2" autocomplete="off"> 2
			  </label>
			  <label class="btn btn-light">
			    <input type="radio" name="options" id="option3" autocomplete="off"> 3
			  </label>
			</div>
		</div>
			
	</body>
	<%@ include file="footer.jsp" %>
</html>