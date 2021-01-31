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
            <br>
            <h3>${product.getProductName()}</h3>
            <h5>${product.getProductManufacture()}</h5>
            <p><strong>Category:</strong> ${product.getProductCategory()}</p>
            <p><strong>Condition:</strong> ${product.getProductCondition()}</p>
            <p><strong>Price:</strong> $${product.getProductPrice()}</p>
            <p><strong>Descriptions:</strong> ${product.getProductDescription()}</p>
            <button type="button" class="btn btn-outline-secondary">Back</button>
            <button type="button" class="btn btn-warning"><i class="fas fa-car"></i> Add to cart</button>
            </div>
        </div>
    </div>

</div>



<%@ include file="footer.jsp" %>