<%@ include file="header-non-login.jsp" %>
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
            <a href="/products/all" class="btn btn-outline-secondary" role="button">Back</a>
            <a class="btn btn-warning" id="addToCartBtn"><i class="fas fa-cart-plus"></i> Add to cart</a>
            
            
            </div>
        </div>
    </div>

</div>

<script>
    $("#addToCartBtn").on('click', function (event) {
        alert("This product has been added to your cart!")
    })
</script>

<%@ include file="footer.jsp" %>