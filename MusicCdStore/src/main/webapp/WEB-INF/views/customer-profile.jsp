<%@ include file="header-post-login.jsp" %>
<br><br><br><br>
<div class="container-fluid">
    <h1>User Profile</h1>
    <p>Here is the customer information!</p>

    
        <div class="card border-0">
            <div class="card-body">
                <h3>Basic Info</h3>
                <p><strong>Name:</strong> ${customer.getCustomerName()}</p>
                <p><strong>Email:</strong> ${customer.getUserEmail()}</p>
                <p><strong>Phone #:</strong> ${customer.getCustomerPhoneNumber()}</p>
                <p><strong>Username:</strong> ${customer.getUsername()}</p>
                <br>
                <h3>Billing Address</h3>
                <p><strong>Street Address:</strong> ${customer.getCustomerStreetAddress()}</p>
                <p><strong>City:</strong> ${customer.getCustomerCity()}</p>
                <p><strong>State:</strong> ${customer.getCustomerState()}</p>
                <p><strong>Country:</strong> ${customer.getCustomerCountry()}</p>
                <p><strong>Zipcode:</strong> ${customer.getCustomerZipcode()}</p>
                <p><strong>Status:</strong> ${customer.getCustomerStatus()}</p>
            
                <a href="/user/${customer.getUserId()}/update" class="btn btn-warning" ><i class="fas fa-edit"></i> Modify</a>
            
            
            </div>
        </div>
    

</div>

<%@ include file="footer.jsp" %>