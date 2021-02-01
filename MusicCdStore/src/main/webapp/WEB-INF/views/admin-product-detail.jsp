<%@ include file="header-post-login-admin.jsp" %>
<br><br><br><br>
<div class="container-fluid">
    <h1>Product Detail</h1>
    <p>Here is the detail information of the product!</p>

    <div class="card-columns">
        <div class="card border-0">
            <div class="card-body">
            <img src="${product.getProductImage()}" width=300px height=300px>
            </div>
        </div>
        <div class="card border-0">
            <div class="card-body">
            <h3>${product.getProductName()}</h3>
            <h5>${product.getProductManufacture()}</h5>
            <p><strong>Category:</strong> ${product.getProductCategory()}</p>
            <p><strong>Condition:</strong> ${product.getProductCondition()}</p>
            <p><strong>Price:</strong> $${product.getProductPrice()}</p>
            <p><strong>Descriptions:</strong> ${product.getProductDescription()}</p>
            <a href="/admin/products/all" class="btn btn-outline-secondary" role="button">Back</a>
            <a href="/admin/products/update/${product.getProductId()}" class="btn btn-warning"><i class="fas fa-edit"></i> Modify</a>
            </div>
        </div>
    </div>

</div>



<%@ include file="footer.jsp" %>