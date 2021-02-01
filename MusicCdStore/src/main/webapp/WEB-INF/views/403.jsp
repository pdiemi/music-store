
<%@ include file="header-non-login.jsp" %>

<div class="container">
	<div class="alert-danger">
		<h3>You do not have permission to access this page!</h3>	
		<p>Please Login or try to access another page</p>
	</div>
            
	<form action="/logout" method="post">
		<input type="submit" class="button red big" value="Login" /> <input
			type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
	</form>
</div>

<%@ include file="footer.jsp" %>