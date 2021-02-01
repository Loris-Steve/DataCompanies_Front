<form>

	<c:forEach begin="1" end="8" var="varName" items="${annualAccountVarNames}" varStatus="status">
		<c:choose>
			<c:when test="${annualAccountStringVarNames.contains(varName)}">
				<div class="form-group row ">
					<label for="<c:out value ="${varName}" />Option1" class="col-sm-2 col-form-label"><c:out value ="${varName}"/></label>
					<div class="col-sm-10">
					  <input type="number" class="form-control" placeholder="<c:out value ="${varName}"/> ..."
					  id="<c:out value ="${varName}"/>simple1" name="<c:out value ="${varName}simple1"/>" >
					</div>
				 </div>
			</c:when>
			
			<c:otherwise >
	    
			    <div class="form-group row">
				  <label for="<c:out value ="${varName}" />Option1" class="col-sm-2 col-form-label"><c:out value ="${varName}"/></label>
				  <div class="col-sm-2">
				    <select class="custom-select" 
				    id="<c:out value ="${varName}"/>simpleOption1" name="<c:out value ="${varName}"/>simpleOption1">
					    <option value="1">supérieur à </option>
					    <option value="2">égale à </option>
					    <option value="3">inférieur à</option>
					  </select>
				  </div>
				  <div class="col-sm-3">
				    <input type="number" class="form-control" placeholder="<c:out value ="${varName}"/> ..."
				    id="<c:out value ="${varName}"/>simple1" name="<c:out value ="${varName}simple1"/>" >
				  </div>
				  <div class="col-sm-2">
				    <select class="custom-select" 
				    id="<c:out value ="${varName}"/>simpleOption2" name="<c:out value ="${varName}"/>simpleOption2">
					    <option value="3">inférieur à</option>
					    <option value="2">égale à </option>
					    <option value="1">supérieur à </option>
					  </select>
				  </div>
				  <div class="col-sm-3">
				    <input type="text" class="form-control" placeholder="<c:out value ="${varName}"/> ..."
				    id="<c:out value ="${varName}"/>simple2" name="<c:out value ="${varName}"/>simple2" >
				  </div>
				</div>
			
			</c:otherwise>
		</c:choose>
		
	</c:forEach>
</form>