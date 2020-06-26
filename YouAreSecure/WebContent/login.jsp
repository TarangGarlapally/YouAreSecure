<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
  <title>YouAreSecure</title>
  <!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>


<style type="text/css">
.reg-btn{
	transition: 0.6s ease;
}
.reg-btn:hover{
	background-color: white;
	color: black;
	text-decoration: none;
}
</style>

</head>
<body>
<%          HttpSession mysession=request.getSession(); 
if(mysession.getAttribute("aadhar")!=null){
	response.sendRedirect("home.jsp?msg=already-logged-in");
}

%>
    <div class="container bg-light" style="padding-top: 30px">
    <div class="row">
        
        <div class="col-3"></div>
        <div class="col-md-6">
            <div class="card">
                <div class="card-header"> 
                    <h2 style="margin: auto">Please login</h2>

                  
                </div>
            
            <form method="get" action="myLogin">
                
                <div class="form-group">
                    <label for="username">User-id <small>(Aadhar)</small></label>
                    <input type="text" class="form-control" formControlName="username" id="username" name="username" placeholder="Your Aadhar is your username" autocomplete="off">
                </div>
                    <div class="form-group">
                        <label for="pwd">Password</label>
                        <input type="password" class="form-control" formControlName="password" id="pwd" name="password"  placeholder="Enter your password" autocomplete="off">
                    </div>
                    
                    
                    <div class="form-group">
                    <button class=" reg-btn btn btn-success" name="login" type="submit" >login</button>
                    <div><br></div>
                    
                
  
                </div>
            </form>
                 <button class="btn btn-primary reg-btn"  onclick="window.location.href='register.jsp'">Register instead</button>
        </div>
        <div class="col-3"></div>
    </div>
    <br>
  </div>
</div>




</body>
</html>
    