<%@ include file="header-non-login.jsp" %>
<br><br><br><br>
<div class="container">
	<h1>Login</h1>

	<form action="/login" method="post">
		<c:if test="${param.error ne null}">
			<div class="alert-danger">Invalid username and password.</div>
		</c:if>
		<div class="form-group">
			<label for="username">Username:</label>
			<input type="text" class="form-control" placeholder="Username" id="username" name="username">
		</div>
		<div class="form-group">
			<label for="password">Password:</label>
			<input type="password" class="form-control" placeholder="Password" id="password" name="password">
		</div>
		<button type="submit" class="btn btn-primary">Submit</button>
		
		<c:if test="${param.logout ne null}">
			<div class="alert-normal">You have been logged out.</div>
		</c:if>
		<input type="hidden" name="${_csrf.parameterName}"
			value="${_csrf.token}" />
	</form>
</div>

<%@ include file="footer.jsp" %>