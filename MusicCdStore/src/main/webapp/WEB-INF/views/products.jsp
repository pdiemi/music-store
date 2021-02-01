<%@ include file="header-non-login.jsp" %>
<br><br><br><br>
<div class="container-fluid">

    <h1 id="header">All Products</h1>
    <p>Checkout all the awesome products available now!</p>
    <br>
        <div class="card" style="border:transparent">
            <div class="card-header" style="border:transparent; background:transparent;">
                <nav class="navbar navbar-sm">
                <ul class="navbar-nav">
                <li class="nav-item"> Show
                <select>
                    <option id="one" name="entry-number">10</option>
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
                                        <a class="btn btn-primary" href="/products/details/${product.getProductId()}">Details</a>
                                        <button class="btn btn-warning my-cart-btn" id="addToCartBtn"
                                                data-id="${product.getProductId()}" 
                                                data-name="${product.getProductName()}" 
                                                data-summary="${product.getProductDescription()}" 
                                                data-price="${product.getProductPrice()}" 
                                                data-quantity="1" 
                                                data-image="${product.getProductImage()}">
                                                <i class="fas fa-cart-plus"></i> Add to Cart
                                        </button>
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
                    
                    
                </div>
            </span>
            
        </div>
    
    
</div>

<%@ include file="footer.jsp" %>