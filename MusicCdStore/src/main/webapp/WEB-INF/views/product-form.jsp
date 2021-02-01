<%@ include file="header-post-login-admin.jsp" %>
<br><br><br><br>
<div class="container">
    <h1>product Information</h1>
    <p>Please fill in your information below</p>
    <p style="color:red;">Fields marked with (*) are required</p>
    <br>
    <div class="container">
        <form:form modelAttribute="product" name="productForm">
            <fieldset>
                <div class="form-group">
                    <label class="col-form-label" for="productName">Name *:</label>
                    <form:input path="productName" class="form-control" required="true"/>
                    <form:errors path="productName" class="form-control"/>
                </div>
                <div class="form-group">
                    <label class="col-form-label" for="productImage">Image URL *:</label>
                    <form:input path="productImage" class="form-control" required="true"/>
                    <form:errors path="productImage" class="form-control"/>
                </div>
                <div class="form-group">
                    <label class="col-form-label" for="productCategory">Category *:</label>
                    <form:input path="productCategory" class="form-control" required="true"/>
                    <form:errors path="productCategory" class="form-control"/>
                </div>
                <div class="form-group">
                    <label class="col-form-label" for="productCondition">Condition *:</label>
                    <form:input path="productCondition" class="form-control" required="true"/>
                    <form:errors path="productCondition" class="form-control"/>
                </div>
                <div class="form-group">
                    <label class="col-form-label" for="productManufacture">Manufacture *:</label>
                    <form:input path="productManufacture" class="form-control" required="true"/>
                    <form:errors path="productManufacture" class="form-control"/>
                </div>
                <div class="form-group">
                    <label class="col-form-label" for="productGenre">Genre *:</label>
                    <form:input path="productGenre" class="form-control" required="true"/>
                    <form:errors path="productGenre" class="form-control"/>
                </div>
                <div class="form-group">
                    <label class="col-form-label" for="productPrice">Price *:</label>
                    <form:input path="productPrice" class="form-control" type="number" required="true"/>
                    <form:errors path="productPrice" class="form-control"/>
                </div>
                <div class="form-group">
                    <label class="col-form-label" for="productDescription">Descriptions *:</label>
                    <form:textarea path="productDescription" class="form-control" required="true" rows="10"/>
                    <form:errors path="productDescription" class="form-control"/>
                </div>
            </fieldset>
            <input type="submit" value="Submit" class="btn btn-primary"/>
            <a href="/admin/products/all" class="btn btn-outline-secondary" role="button">Cancel</a>
            
        </form:form>
        </div>

</div>



<script>
    var emailList="${registeredEmail}"
    var usernameList="${registeredUsername}"
</script>

<%@ include file="footer.jsp" %>