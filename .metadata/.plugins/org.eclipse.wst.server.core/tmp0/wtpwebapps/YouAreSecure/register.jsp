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
                    <h2 style="margin: auto">Please Register</h2>

                  
                </div>
            
            <div class="card-body">
            
            <form method="GET" action="Register">
                <div class="form-group">
                <label for="name">Full name</label>
                <input type="text" class="form-control" formControlName="name" id="name" name="name" autocomplete="off">
                </div>
                <div class="form-group">
                    <label for="username">Aadhar</label>
                    <input type="text" class="form-control" formControlName="username" id="username" name="username" placeholder="Your Aadhar will be your username" autocomplete="off">
                 </div>
                    <div class="form-group">
                        <label for="pwd">Password</label>
                        <input type="password" class="form-control" formControlName="password" id="pwd" name="password" placeholder="Choose your password" autocomplete="off">
                    </div>
                 <div class="form-group">
                    <label for="fname">Father's Name</label>
                    <input type="text" class="form-control" formControlName="fname" id="fname" name="fname" autocomplete="off">
                 </div>
                 <div class="form-group">
                    <label for="mname">Mother's Name</label>
                    <input type="text" class="form-control" formControlName="mname" id="mname" name="mname" autocomplete="off">
                 </div>
                 
                 <div class="form-group">
                    <label for="mobile">Mobile Number</label>
                    <input type="text" class="form-control" formControlName="mobile" id="mobile" name="mobile" autocomplete="off">
                 </div>
                 <div class="form-group">
                    <label for="dob">Date of birth</label>
                    <input type="date" class="form-control" formControlName="dob" id="dob" name="dob" autocomplete="off">
                 </div>
                 <div class="form-group">
                       <label for="marital">Marital Status</label>
                       <select class="form-control" name="marital" id="marital">
                         <option value="Yes">Yes</option>
                         <option value="No">No</option>
                       </select> 
                 </div>
                 <div class="form-group">
                    <label for="occupation">Occupation</label>
                    <input type="text" class="form-control" formControlName="occupation" id="occupation" name="occupation" autocomplete="off">
                 </div>
                 <div class="form-group">
                    <label for="hometown">Hometown</label>
                    <input type="text" class="form-control" formControlName="hometown" id="hometown" name="hometown" autocomplete="off">
                 </div>
                    
                    <div class="card-footer">
                    <button class=" reg-btn btn btn-success" name="register" type="submit" >Register</button>
                    <div><br></div>
                    
                   
                   
                </div>
            </form>
            </div>

                   <button class="btn btn-primary reg-btn"  onclick="window.location.href='login.jsp'">Login instead</button>
    
        </div>
        <div class="col-3"></div>
    </div>
    <br>
  </div>
</div>
    



</body>
</html>
    