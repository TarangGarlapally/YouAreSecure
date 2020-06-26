<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.io.IOException"%>
<!DOCTYPE html>
<html>
<head>
	<title>My Locations</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>


  <style type="text/css">
  	.mybtn{
  		transition: 0.3s ease;

  	}
  	.mybtn:hover{
  		background-color: white;
  		color: black;
  	}
  	.mybtn2{
  		transition: 0.3s ease;
  		background-color: #D6A511;

  	}
  	.mybtn2:hover{
  		background-color: white;
  		color: black;
  	}
  	
  </style>
</head>
<body>
<%          HttpSession mysession=request.getSession(); 
if(mysession.getAttribute("aadhar")==null){
	response.sendRedirect("login.jsp");
}

%>


<div id="myModal" class="modal fade">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                <h4 class="modal-title">Enter Your Location</h4>
            </div>
            <div class="modal-body">
		
                <form method="get" action="AddL">
                    
                    <div class="form-group">
                        <input type="text" class="form-control" name="location" id="myPopupInput" placeholder="Your Current Location">
                    </div>
                    <input type="submit" name="submit" class="btn btn-primary" id="modal-closed"  value="Submit">
                </form>

            </div>
        </div>
    </div>
</div>

<div id="myModal4" class="modal fade">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                <h4 class="modal-title">Enter Location To be removed</h4>
            </div>
            <div class="modal-body">
		
                <form method="get" action="RemoveL">
                    
                    <div class="form-group">
                        <input type="text" class="form-control" name="location" id="myPopupInput" placeholder="Your Current Location">
                    </div>
                    <input type="submit" name="submit" class="btn btn-primary" id="modal-closed"  value="Submit">
                </form>

            </div>
        </div>
    </div>
</div>


<div class="container">
	
	<button class="btn btn-info mybtn2" style="float:right; margin: 5px;" onclick="window.location.href='home.jsp'">RETURN TO HOME</button>
</div>
	<div class="container" style="background-color:#f3f3f3;">

		<div class="col-md-3">
			<br>
			<img src="map.png">
		</div>


		<div class="col-md-6">
			<br>
			<br>
			<h2 align="center">MY LOCATIONS</h2>
			<p align="center">SAFE ZONES</p>
			<div align="center">
			<button type="button" id="open-modal2" class="btn btn-info mybtn" float="center" data-toggle="modal" data-target="#myModal" 
style="margin-right: 5px;">Add Location</button>
			
			<button type="button" id="open-modal4" class="btn btn-info mybtn" float="center" data-toggle="modal" data-target="#myModal4" 
style="margin-right: 5px;">Remove a Location</button>
		</div>

		<div class="col-md-3">
		</div>

	</div>
	<div class="container">
		<table class="table">
		    <thead>
		      <tr>
		        <th>S.no</th>
		        <th>Location</th>
		      </tr>
		    </thead>
		    <tbody>
		     
	
	<%
	Connection conn = null;
    try {
    	String aadhar = (String)mysession.getAttribute("aadhar");

    	Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/javadbms?verifyServerCertificate=false&useSSL=true";
        String user = "root";
        String dbpassword = "wiseone";
    	
        
        conn = DriverManager.getConnection(url, user, dbpassword);
        String sql="select * from locations where aadhar='"+aadhar+"';";
        Statement st = conn.createStatement(); 
        ResultSet m = st.executeQuery(sql); 
        int i=1;
        while(m.next()) {
        	%>
        	<tr>
        	<td><%=i %></td>
        	<td><%=m.getString(2) %></td>
        	<tr>
        	<%
        	i=i+1;
        	}
        	
        
        

    } catch(SQLException e) {
       System.out.println(e.getMessage());
    } catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
    	e.printStackTrace();
    }
	%>
	      
		    </tbody>
        </table>
	</div>

</body>
</html>