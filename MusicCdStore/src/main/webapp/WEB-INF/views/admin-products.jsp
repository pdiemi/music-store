<%@ include file="header-post-login-admin.jsp" %>
<br><br><br><br>
<div class="container-fluid">
    <h1 id="header">Product Inventory Page</h1>
    <p>This is the product inventory page!</p>
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
                            <thead class="table-success">
                            <tr>
                                <th>Product Thumb</th>
                                <th>Product Name</th>
                                <th>Category</th>
                                <th>Condition</th>
                                <th>Price</th>
                                <th>More</th>
                            </tr>
                            </thead>
                        <c:forEach items="${productList}" var="product">
                            <tbody>
                                <tr>
                                    <td><img src="${product.getProductImage()}" class="img-thumbnail" width=100px height=100px></td>
                                    <td>${product.getProductName()}</td>
                                    <td>${product.getProductCategory()}</td>
                                    <td>${product.getProductCondition()}</td>
                                    <td>$${product.getProductPrice()}</td>
                                    <td>
                                        <a href="/admin/products/details/${product.getProductId()}"><i class="fa fa-info-circle"></i></a>
                                        <a href="/admin/products/update/${product.getProductId()}"><i class="fa fa-edit"></i></a>
                                        <a href="/admin/products/delete/${product.getProductId()}"><i class="fa fa-times"></i></a>
                                    </td>
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
                        <li class="nav-item"> Showing 1 to ${productList.size()} of ${productList.size()} entries</li>
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
                    <a class="btn btn-primary" href="/admin/products/add">Add Product</a>
                    
                </div>
            </span>
            
        </div>
    
    
</div>

<%@ include file="footer.jsp" %>