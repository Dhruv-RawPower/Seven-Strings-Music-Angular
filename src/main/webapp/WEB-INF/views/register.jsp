<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<title>Sign Up</title>
<head>

<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>


<link rel="stylesheet"  href="/css/register.css"/>


</head>

<body>

	 <!--
     <form name="register_form" id="register_form" action="" method="post">
	  
	  <div class="form-group col-lg-1"">
	    <label for="firstName">First Name</label>
	    <input type="text" class="form-control" id="firstName" name="firstName">
	  </div>
	  
	  <div class="form-group col-lg-1"">
	    <label for="lastName">Last Name</label>
	    <input type="text" class="form-control" id="lastName" name = "lastName" placeholder="Password">
	  </div>
	  
	  <div class="form-group col-lg-1"">
	    <label for="email">Email address</label>
	    <input type="text" class="form-control" id="email" name="email">
	  </div>
	  
	  <div class="form-group col-lg-1"">
	    <label for="username">Username</label>
	    <input type="text" class="form-control" id="userName" name="userName">
	  </div>
	  
	  <div class="form-group col-lg-1"">
	    <label for="password">Password</label>
	    <input type="password" class="form-control" id="password" name = "password"placeholder="Password">
	  </div>
	  
	  <div>
	  <input type="submit" id="register" name= "register" value ="Register" />
	  </div>
	  
	 </form>
	 -->
	 
	<div class="mask d-flex align-items-center justify-content-center h-100 mt-5">
    <div class="container h-100">
      <div class="row d-flex justify-content-center align-items-center h-100">
        <div class="col-12 col-md-9 col-lg-7 col-xl-6">
          <div class="card" style="border-radius: 15px;">
            <div class="card-body p-3">
              <h2 class="text-uppercase text-center mb-3">Sign up for free</h2>

              <form name="register_form" id="register_form" action="" method="post">

                <div class="form-outline mb-3">
                  <label class="form-label" for="firstName">First Name</label>
                  <input type="text" id="firstName" name="firstName" placeholder="First Name" class="form-control form-control-lg" />
                </div>
				
				<div class="form-outline mb-3">
				  <label class="form-label" for="lasttName">Last Name</label>
                  <input type="text" id="lastName" name="lastName" placeholder="Last Name" class="form-control form-control-lg" />
                </div>

                <div class="form-outline mb-3">
                  <label class="form-label" for="email">Your Email</label>
                  <input type="email" id="email" name="email" placeholder="Email" class="form-control form-control-lg" />
                </div>
				
				<div class="form-outline mb-3">
				  <label class="form-label" for="userName">Username</label>
                  <input type="text" id="userName" name="userName" placeholder="Username" class="form-control form-control-lg" />
                </div>

                <div class="form-outline mb-3">
                  <label class="form-label" for="password">Password</label>
                  <input type="password" id="password" name="password" placeholder="Password" class="form-control form-control-lg" />
                </div>

                <div class="form-outline mb-3">
                  <label class="form-label" for="name="password"">Repeat your password</label>
                  <input type="password" id="password" name="password" placeholder="Repeat Password" class="form-control form-control-lg" />
                </div>

                <div class="form-check d-flex  mb-5">
                  <input class="form-check-input"  type="checkbox" value="" id="checkBox1" />
                  <label class="form-check-label" for="form2Example3g">
                    I agree all statements in <a href="#!" class="text-body"><u>Terms of service</u></a>
                  </label>
                </div>

                <div class="d-flex justify-content-center">
                  <button type="submit" id="register" name= "register" 
                    class="btn btn-success btn-block btn-lg gradient-custom-4 text-body">Register</button>
                </div>

                <p class="text-center text-muted mt-5 mb-0">Have already an account? <a href="/signin"
                    class="fw-bold text-body"><u>Login here</u></a></p>

              </form>

            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</section>	
		
		
    <script type="text/javascript" src="js/register.js"></script>
</body>
</html>

