
<%@ include file="header-post-login.jsp" %>

  <!-- Collection slideshow -->
    <div id="main-slide" class="carousel slide" data-ride="carousel">
      <ul class="carousel-indicators">
        <li data-target="#main-slide" data-slide-to="0" class="active"></li>
        <li data-target="#main-slide" data-slide-to="1"></li>
        <li data-target="#main-slide" data-slide-to="2"></li>
      </ul>
      <div class="carousel-inner">
        <div class="carousel-item active">
          <img src="/images/image.jpg" alt="image-1" width="1100" height="500">
          <div class="carousel-caption">
            <h3>Los Angeles</h3>
            <p>We had such a great time in LA!</p>
          </div>   
        </div>
        <div class="carousel-item">
          <img src="/images/image.jpg" alt="image-2" width="1100" height="500">
          <div class="carousel-caption">
            <h3>Chicago</h3>
            <p>Thank you, Chicago!</p>
          </div>   
        </div>
        <div class="carousel-item">
          <img src="/images/image.jpg" alt="image-3" width="1100" height="500">
          <div class="carousel-caption">
            <h3>New York</h3>
            <p>We love the Big Apple!</p>
          </div>   
        </div>
      </div>
      <a class="carousel-control-prev" href="#main-slide" data-slide="prev">
        <span class="carousel-control-prev-icon"></span>
      </a>
      <a class="carousel-control-next" href="#main-slide" data-slide="next">
        <span class="carousel-control-next-icon"></span>
      </a>
    </div>
  
  <!-- Popular products -->
  <div id="popular-cards">

    <div class="card-columns">
      <div class="card">
        <img class="card-img-top" src="https://photo-resize-zmp3.zadn.vn/w240_r1x1_jpeg/covers/1/5/1545576f27c2475d31833790400bce97_1301715560.jpg" alt="product-1" style="width:100%">
        <div class="card-body text-center">
          <h4 class="card-title">Modern Talking</h4>
          <p class="card-text">The Final Album - The Ultimate Best Of (CD2)</p>
          <a href="#" class="btn bg-dark stretched-link text-light">More</a>
        </div>
      </div>
      <div class="card">
        <img class="card-img-top" src="https://photo-resize-zmp3.zadn.vn/w240_r1x1_jpeg/covers/2/5/25b49d295be8f15021498c7bce76d8a6_1392265597.jpg" alt="product-1" style="width:100%">
        <div class="card-body text-center">
          <h4 class="card-title"> westlife</h4>
          <p class="card-text">The Love Songs</p>
          <a href="#" class="btn bg-dark stretched-link text-light">More</a>
        </div>
      </div>
      <div class="card">
        <img class="card-img-top" src="https://photo-resize-zmp3.zadn.vn/w240_r1x1_jpeg/cover/a/3/8/7/a38758fd4638e440b62d92054fe2744a.jpg" alt="product-1" style="width:100%">
        <div class="card-body text-center">
          <h4 class="card-title">Au/Ra</h4>
          <p class="card-text">Ghost (Remixes)</p>
          <a href="#" class="btn bg-dark stretched-link text-light">More</a>
        </div>
      </div>
    </div>
  </div>


<%@ include file="footer.jsp" %>