
<div class="container-fluid">
    <p style="text-align:right"><a href="#">Back to top</a></p>
</div>

<div class="container-fluid border border-bottom-0 border-left-0 border-right-0">
    <footer>
        <p>&copy <script>document.write(new Date().getFullYear())</script> My Music's Store <a href="#"> Privacy</a> <a href="#"> Terms</a></p>
    </footer>
</div>

<script type="text/javascript">
     $(function () {
         $(".my-cart-btn").myCart(options);
     });
</script>

<script src="/js/user.js"></script>

<script src="js/jquery-2.2.3.min.js"></script>
  <script type='text/javascript' src="js/bootstrap.min.js"></script>
  <script type='text/javascript' src="js/jquery.mycart.js"></script>
  <script type="text/javascript">
  $(function () {

    var goToCartIcon = function($addTocartBtn){
      var $cartIcon = $(".my-cart-icon");
      var $image = $('<img width="30px" height="30px" src="' + $addTocartBtn.data("image") + '"/>').css({"position": "fixed", "z-index": "999"});
      $addTocartBtn.prepend($image);
      var position = $cartIcon.position();
      $image.animate({
        top: position.top,
        left: position.left
      }, 500 , "linear", function() {
        $image.remove();
      });
    }

    $('.my-cart-btn').myCart({
      currencySymbol: '$',
      classCartIcon: 'my-cart-icon',
      classCartBadge: 'my-cart-badge',
      classProductQuantity: 'my-product-quantity',
      classProductRemove: 'my-product-remove',
      classCheckoutCart: 'my-cart-checkout',
      affixCartIcon: true,
      showCheckoutModal: true,
      numberOfDecimals: 2,
      cartItems: [
        {id: 1, name: 'The Love Songs', summary: 'Song list', price: 200, quantity: 1, image: 'https://photo-resize-zmp3.zadn.vn/w240_r1x1_jpeg/covers/2/5/25b49d295be8f15021498c7bce76d8a6_1392265597.jpg'},
        {id: 2, name: 'The Love Songs', summary: 'Song list', price: 200, quantity: 1, image: 'https://photo-resize-zmp3.zadn.vn/w240_r1x1_jpeg/covers/2/5/25b49d295be8f15021498c7bce76d8a6_1392265597.jpg'},
        {id: 3, name: 'The Love Songs', summary: 'Song list', price: 200, quantity: 1, image: 'https://photo-resize-zmp3.zadn.vn/w240_r1x1_jpeg/covers/2/5/25b49d295be8f15021498c7bce76d8a6_1392265597.jpg'},
      ],
      clickOnAddToCart: function($addTocart){
        goToCartIcon($addTocart);
      },
      afterAddOnCart: function(products, totalPrice, totalQuantity) {
        console.log("afterAddOnCart", products, totalPrice, totalQuantity);
      },
      clickOnCartIcon: function($cartIcon, products, totalPrice, totalQuantity) {
        console.log("cart icon clicked", $cartIcon, products, totalPrice, totalQuantity);
      },
      checkoutCart: function(products, totalPrice, totalQuantity) {
        var checkoutString = "Total Price: " + totalPrice + "\nTotal Quantity: " + totalQuantity;
        checkoutString += "\n\n id \t name \t summary \t price \t quantity \t image path";
        $.each(products, function(){
          checkoutString += ("\n " + this.id + " \t " + this.name + " \t " + this.summary + " \t " + this.price + " \t " + this.quantity + " \t " + this.image);
        });
        alert(checkoutString)
        console.log("checking out", products, totalPrice, totalQuantity);
      },
      getDiscountPrice: function(products, totalPrice, totalQuantity) {
        console.log("calculating discount", products, totalPrice, totalQuantity);
        return totalPrice * 0.5;
      }
    });

    $("#addNewProduct").click(function(event) {
      var currentElementNo = $(".row").children().length + 1;
      $(".row").append('<div class="col-md-3 text-center"><img src="images/img_empty.png" width="150px" height="150px"><br>product ' + currentElementNo + ' - <strong>$' + currentElementNo + '</strong><br><button class="btn btn-danger my-cart-btn" data-id="' + currentElementNo + '" data-name="product ' + currentElementNo + '" data-summary="summary ' + currentElementNo + '" data-price="' + currentElementNo + '" data-quantity="1" data-image="images/img_empty.png">Add to Cart</button><a href="#" class="btn btn-info">Details</a></div>')
    });
  });
  </script>
</body>
</html>