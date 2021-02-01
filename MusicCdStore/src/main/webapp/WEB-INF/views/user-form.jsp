<%@ include file="header-non-login.jsp" %>
<br><br><br><br>
<div class="container">
    <h1>User Information</h1>
    <p>Please fill in your information below</p>
    <p style="color:red;">Fields marked with (*) are required</p>
    <br>
    <div class="container">
        <form:form modelAttribute="customer" name="userForm" onSubmit="return (userFormValidate())">
            <fieldset>
                <h4>Basic Info</h4>
                <div class="form-group">
                    <label class="col-form-label" for="customerName">Name *:</label>
                    <form:input path="customerName" class="form-control" required="true"/>
                    <form:errors path="customerName" class="form-control"/>
                </div>
                <div class="form-group">
                    <label class="col-form-label" for="userEmail" id="emailLabel">Email *:</label>
                    <form:input path="userEmail" class="form-control" id="email" name="email" type="email" required="true"/>
                    <form:errors path="userEmail" class="form-control"/>
                </div>
                <div class="form-group">
                    <label class="col-form-label" for="customerPhoneNumber">Phone Number *:</label>
                    <form:input path="customerPhoneNumber" class="form-control" type="number" required="true"/>
                    <form:errors path="customerPhoneNumber" class="form-control"/>
                </div>
                <div class="form-group">
                    <label class="col-form-label" for="username" id="usernameLabel">Username *:</label>
                    <form:input path="username" class="form-control" id="username" name="username" required="true"/>
                    <form:errors path="username" class="form-control"/>
                </div>
                <div class="form-group">
                    <label class="col-form-label" for="password">Password *:</label>
                    <form:input path="password" class="form-control" type="password" required="true"/>
                    <form:errors path="password" class="form-control"/>
                </div>
                <br>
                <h4>Billing Address</h4>
                <div class="form-group">
                    <label class="col-form-label" for="customerStreetAddress">Street Address:</label>
                    <form:input path="customerStreetAddress" class="form-control"/>
                    <form:errors path="customerStreetAddress" class="form-control"/>
                </div>
                <div class="form-group">
                    <label class="col-form-label" for="customerCity">City:</label>
                    <form:input path="customerCity" class="form-control"/>
                    <form:errors path="customerCity" class="form-control"/>
                </div>
                <div class="form-group">
                    <label class="col-form-label" for="customerState">State:</label>
                    <form:input path="customerState" class="form-control"/>
                    <form:errors path="customerState" class="form-control"/>
                </div>
                <div class="form-group">
                    <label class="col-form-label" for="customerCountry">Country:</label>
                    <form:input path="customerCountry" class="form-control"/>
                    <form:errors path="customerCountry" class="form-control"/>
                </div>
                <div class="form-group">
                    <label class="col-form-label" for="customerZipcode">Zipcode:</label>
                    <form:input path="customerZipcode" class="form-control" type="number"/>
                    <form:errors path="customerZipcode" class="form-control"/>
                </div>
                
            </fieldset>
            <input type="submit" value="Submit" class="btn btn-primary"/>
            <a href="/" class="btn btn-outline-secondary" role="button">Cancel</a>
            
        </form:form>
        </div>

</div>



<script>
    var emailList="${registeredEmail}"
    var usernameList="${registeredUsername}"
</script>

<%@ include file="footer.jsp" %>