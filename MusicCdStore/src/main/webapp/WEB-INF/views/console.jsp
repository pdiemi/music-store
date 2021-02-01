<%@ include file="header-post-login-admin.jsp" %>
<br><br><br><br>
<div class="container">
	<h1>Administrtor Console</h1>
    <p>This is the administrator page!</p>
    <br>
    <form class="form-inline" action="/logout" method="post" >
        <h3>Welcome: ${user.getUsername()} | </h3>
        <button class="btn text-primary" type="submit"><h3> Logout</h3></button>
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
    </form>
    
    <br>
    <a href="/admin/products/all"><h4>Product Inventory</h4></a>
    <p>Here you can view, check, and modify the product inventory!</p>
    <br>
    <a href="/admin/customers/all"><h4>Customer Management</h4></a>
    <p>Here you can manage customer information!</p>
    <br>
	
</div>

<%@ include file="footer.jsp" %>