<%@ include file="header-post-login-admin.jsp" %>
<br><br><br><br>
<div class="container-fluid">
    <h1 id="header">Customer Management page</h1>
    <p>This is the customer management page!</p>
    <br>
        <div class="card" style="border:transparent">
            <div class="card-header" style="border:transparent; background:transparent;">
                <nav class="navbar navbar-sm">
                <ul class="navbar-nav">
                <li class="nav-item"> Show
                <select>
                    <option id="one" name="entry-number">1</option>
                    <option id="two" name="entry-number">2</option>
                    <option id="three" name="entry-number">3</option>
                </select>
                entries</li>
                </ul>
                <ul class="navbar-nav">
                    <li class="nav-item">
                        <form class="form-inline" action="#">
                            <input class="form-control mr-sm-2" type="text" placeholder="Search">
                            <button class="btn btn-primary" type="submit"><i class="fas fa-search"></i></button>
                        </form>
                    </li>
                </ul>
                </nav>
            </div>
            
            <div class="card-body">
                <div class="table-responsive-sm">
                    <table class="table table-striped table-hover">
                            <thead class="table-dark">
                            <tr>
                                <th>Name</th>
                                <th>Email</th>
                                <th>Phone #</th>
                                <th>Username</th>
                                <th>Password</th>
                                <th>Status</th>
                                <th>Edit</th>
                            </tr>
                            </thead>
                        <c:forEach items="${customerList}" var="customer">
                            <tbody>
                                <tr>
                                    <td>${customer.getCustomerName()}</td>
                                    <td>${customer.getUserEmail()}</td>
                                    <td>${customer.getCustomerPhoneNumber()}</td>
                                    <td>${customer.getUsername()}</td>
                                    <td>${customer.getPassword()}</td>
                                    <td>${customer.getCustomerStatus()}</td>
                                    <td><a href="/admin/customers/update/${customer.getUserId()}"><i class="fa fa-edit" style="font-size:24px"></i></a></td>
                                </tr>
                            </tbody>
                        </c:forEach>
                    </table>
                </div>
            </div>
            <span class="border border-left-0 border-right-0 border-bottom-0">
                <div class="card-footer" style="border:transparent; background:transparent;">
                    <nav class="navbar navbar-sm">
                <ul class="navbar-nav">
                <li class="nav-item"> Showing 1 to 1 of ${customerList.size()} entries</li>
                </ul>
                <ul class="navbar-nav">
                    <li class="nav-item">
                        <ul class="pagination justify-content-end">
                        <li class="page-item"><a class="page-link" href="#">Previous</a></li>
                        <li class="page-item active"><a class="page-link" href="#">1</a></li>
                        <li class="page-item"><a class="page-link" href="#">2</a></li>
                        <li class="page-item"><a class="page-link" href="#">3</a></li>
                        <li class="page-item"><a class="page-link" href="#">Next</a></li>
                    </ul>
                    </li>
                </ul>
                </nav>
                    
                    
                </div>
            </span>
            
        </div>
    
    
</div>

<%@ include file="footer.jsp" %>