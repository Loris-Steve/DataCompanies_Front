
<!-- Button trigger modal -->
<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModalCenter">
  + plus de filtre 
</button>

<!-- Modal -->
<div class="modal fade " id="exampleModalCenter" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
  <div class="modal-dialog modal-dialog modal-lg " role="document">
    <div class="modal-content">
    
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLongTitle">Filtres suplémentaires</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      
      <form method="post" action="search?moreFilter=true" class="container g-3">
	      <div class="modal-body">
		      	<c:forEach var="varName" items="${annualAccountVarNames}">
			      	<c:choose>
						<c:when test="${annualAccountStringVarNames.contains(varName)}">
							<div class="form-group row ">
								<label for="<c:out value ="${varName}" />Option1" class="col-sm-2 col-form-label"><c:out value ="${varName}"/></label>
								<div class="col-sm-10">
								  <input type="text" class="form-control" placeholder="<c:out value ="${varName}"/> ..."
								  id="<c:out value ="${varName}"/>1" name="<c:out value ="${varName}1"/>" >
								</div>
							 </div>
						</c:when>
						
						<c:otherwise >
						
						    <div class="form-group row">
							  <label for="<c:out value ="${varName}" />Option1" class="col-sm-2 col-form-label"><c:out value ="${varName}"/></label>
							  <div class="col-sm-2">
							    <select class="custom-select" 
							    id="<c:out value ="${varName}"/>Option1" name="<c:out value ="${varName}"/>Option1">
								    <option value="1">supérieur à </option>
								    <option value="2">égale à </option>
								    <option value="3">inférieur à</option>
								  </select>
							  </div>
							  <div class="col-sm-3">
							    <input type="number" class="form-control" placeholder="<c:out value ="${varName}"/> ..."
							    id="<c:out value ="${varName}"/>1" name="<c:out value ="${varName}1"/>" >
							  </div>
							  <div class="col-sm-2">
							    <select class="custom-select" 
							    id="<c:out value ="${varName}"/>Option2" name="<c:out value ="${varName}"/>Option2">
								    <option value="3">inférieur à</option>
								    <option value="2">égale à </option>
								    <option value="1">supérieur à </option>
								  </select>
							  </div>
							  <div class="col-sm-3">
							    <input type="number" class="form-control" placeholder="<c:out value ="${varName}"/> ..."
							    id="<c:out value ="${varName}"/>2" name="<c:out value ="${varName}"/>2" >
							  </div>
							</div>
						
						</c:otherwise>
					</c:choose>
				
				</c:forEach>
		      </div>
		      	
	      <div class="modal-footer">
	        <button type="button" class="btn btn-secondary" data-dismiss="modal">fermer</button>
	        <button type="submit" class="btn btn-primary" >recherhcer</button>
	      </div>
		</form>
    </div>
  </div>
</div>