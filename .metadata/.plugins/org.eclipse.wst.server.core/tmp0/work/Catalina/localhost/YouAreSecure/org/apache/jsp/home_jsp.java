/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.34
 * Generated at: 2020-05-23 12:20:04 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.concurrent.TimeUnit");
    _jspx_imports_classes.add("java.sql.SQLException");
    _jspx_imports_classes.add("java.sql.Connection");
    _jspx_imports_classes.add("java.sql.ResultSet");
    _jspx_imports_classes.add("java.sql.Statement");
    _jspx_imports_classes.add("java.io.IOException");
    _jspx_imports_classes.add("java.sql.DriverManager");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<title>Home</title>\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\r\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\r\n");
      out.write("  \r\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\r\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("  <style type=\"text/css\">\r\n");
      out.write("  \t.proinfo{\r\n");
      out.write("  \t\tfont-family: \"Comic Sans MS\", cursive, sans-serif;\r\n");
      out.write("  \t\ttext-align: left;\r\n");
      out.write("  \t\tfont-size: 20px;\r\n");
      out.write("  \t\tmargin-top: 5%;\r\n");
      out.write("\r\n");
      out.write("  \t}\r\n");
      out.write("  \t.proinfo2{\r\n");
      out.write("  \t\tfont-family: \"Comic Sans MS\", cursive, sans-serif;\r\n");
      out.write("  \t\ttext-align: left;\r\n");
      out.write("  \t\tfont-size: 20px;\r\n");
      out.write("  \t\tmargin-top: 2%;\r\n");
      out.write("\r\n");
      out.write("  \t}\r\n");
      out.write("  \t.proinfo4{\r\n");
      out.write("  \t\tfont-family: \"Comic Sans MS\", cursive, sans-serif;\r\n");
      out.write("  \t\ttext-align: left;\r\n");
      out.write("  \t\tfont-size: 20px;\r\n");
      out.write("  \t\tmargin-top: 0.2%;\r\n");
      out.write("\r\n");
      out.write("  \t}\r\n");
      out.write("  \t.con0{\r\n");
      out.write("  \t\tbackground-color:#f3f3f3;\r\n");
      out.write("  \t}\r\n");
      out.write("  \t.sosbtn{\r\n");
      out.write("  \t\tmargin-top: 40%;\r\n");
      out.write("  \t\tfloat: bottom;\r\n");
      out.write("  \t\tmargin-bottom: 5%;\r\n");
      out.write("  \t}\r\n");
      out.write("  \t.mybtn{\r\n");
      out.write("  \t\ttransition: 0.3s ease;\r\n");
      out.write("\r\n");
      out.write("  \t}\r\n");
      out.write("  \t.mybtn:hover{\r\n");
      out.write("  \t\tbackground-color: white;\r\n");
      out.write("  \t\tcolor: black;\r\n");
      out.write("  \t}\r\n");
      out.write("  \t\t\r\n");
      out.write("  \t.modal-header .close {\r\n");
      out.write("        display:none;\r\n");
      out.write("    }\r\n");
      out.write("  </style>\r\n");
      out.write("  \r\n");
      out.write("  <script type=\"text/javascript\">\r\n");
      out.write("  function change(){\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("  </script>\r\n");
      out.write("  \r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
          HttpSession mysession=request.getSession(); 
if(mysession.getAttribute("aadhar")==null){
	response.sendRedirect("login.jsp");
}
else{


      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"myModal\" class=\"modal fade\">\r\n");
      out.write("    <div class=\"modal-dialog\">\r\n");
      out.write("        <div class=\"modal-content\">\r\n");
      out.write("            <div class=\"modal-header\">\r\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">&times;</button>\r\n");
      out.write("                <h4 class=\"modal-title\">Enter the location to be added</h4>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-body\">\r\n");
      out.write("\t\t\r\n");
      out.write("                <form method=\"get\" action=\"AddL\">\r\n");
      out.write("                    \r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" name=\"location\" id=\"myPopupInput\" placeholder=\"Your Current Location\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <input type=\"submit\" name=\"submit\" class=\"btn btn-primary\" id=\"modal-closed\"  value=\"Submit\">\r\n");
      out.write("                </form>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Trigger the modal with a button -->\r\n");
      out.write("<button type=\"button\" id=\"open-modal\" class=\"btn btn-info btn-lg\" style=\"visibility:hidden;\">Open Modal</button>\r\n");
      out.write("\r\n");
      out.write("<!-- Modal -->\r\n");
      out.write("<div id=\"myModal2\" class=\"modal fade\" role=\"dialog\">\r\n");
      out.write("  <div class=\"modal-dialog\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Modal content-->\r\n");
      out.write("    <div class=\"modal-content\">\r\n");
      out.write("      <div class=\"modal-header\">\r\n");
      out.write("        <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\r\n");
      out.write("        <img class=\"modal-title\" src=\"warning-145066_960_720.png\" width=\"50%\" align=\"center\">\r\n");
      out.write("        <h4 class=\"modal-title\" style=\"float: right; margin-top: 20%;margin-right:20%;color:red; \">Area Unsafe!</h4>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"modal-body\">\r\n");
      out.write("        <p class=\"proinfo\" style=\"margin-top: 2px;\" align=\"center\">This location is not in your safe list</p>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"modal-footer\">\r\n");
      out.write("      \t<button type=\"button\" class=\"btn btn-danger mybtn\" style=\"float: left\" onclick=\"window.location.href='sos.jsp'\">Send an SOS</button>\r\n");
      out.write("        <button type=\"button\" class=\"btn btn-success mybtn\" data-dismiss=\"modal\" onclick = \"closefunc()\">I am Safe</button>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Trigger the modal with a button -->\r\n");
      out.write("<button type=\"button\" id=\"open-modal8\" class=\"btn btn-info btn-lg\" data-toggle=\"modal\" data-target=\"#myModal8\" style=\"visibility: hidden;\">Open Modal</button>\r\n");
      out.write("\r\n");
      out.write("<!-- Modal -->\r\n");
      out.write("<div id=\"myModal8\" class=\"modal fade\" role=\"dialog\">\r\n");
      out.write("  <div class=\"modal-dialog\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Modal content-->\r\n");
      out.write("    <div class=\"modal-content\">\r\n");
      out.write("      <div class=\"modal-header\">\r\n");
      out.write("        <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\r\n");
      out.write("        <img class=\"modal-title\" src=\"warning-145066_960_720.png\" width=\"50%\" align=\"center\">\r\n");
      out.write("        <h4 class=\"modal-title\" style=\"float: right; margin-top: 20%;margin-right:20%;color:red; \">Area Unsafe!</h4>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"modal-body\">\r\n");
      out.write("        <p class=\"proinfo\" style=\"margin-top: 2px;\" align=\"center\">This location is not in your safe list</p>\r\n");
      out.write("        <div align=\"center\">\r\n");
      out.write("          <p class=\"proinfo\" style=\"margin-top: 2px;font-size: 15px\" align=\"center\">You've been in this location for too many times, would you like to add it?</p>\r\n");
      out.write("           <button type=\"button\" class=\"btn btn-danger mybtn\" style=\"float: center\" onclick=\"window.location.href='AddL'\">Add</button>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"modal-footer\">\r\n");
      out.write("        <button type=\"button\" class=\"btn btn-danger mybtn\" style=\"float: left\" onclick=\"window.location.href='sos.jsp'\">Send an SOS</button>\r\n");
      out.write("        <button type=\"button\" class=\"btn btn-success mybtn\" data-dismiss=\"modal\" onclick = \"closefunc()\">I am Safe</button>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"container\" >\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<div align=\"center\">\r\n");
      out.write("\t<form method=\"post\" class=\"form-inline\">\r\n");
      out.write("                    \r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" name=\"loc\" placeholder=\"Your Current Location\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <input type=\"submit\" class=\"btn btn-primary\"  name=\"submit2\" value=\"submit\">\r\n");
      out.write("    </form>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");

if(request.getParameter("submit2")!=null){
String loc=request.getParameter("loc");
mysession.setAttribute("location", loc);

}

      out.write("\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("var mkey;\r\n");
      out.write("</script>\r\n");
      out.write("<div class=\"container\" align=\"center\">\r\n");
      out.write("\t<p class=\"col-md-6 proinfo2 loc\">You are at Location</p>\r\n");
      out.write("\t<div class=\"col-md-6\" style=\"margin-top: 2%;\">\r\n");
      out.write("\t\t<form action=\"logout\">\r\n");
      out.write("\t\t<input type=\"submit\" class=\"btn btn-default\" style=\"float: right;\" value=\"Logout\">\r\n");
      out.write("\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<p class=\"proinfo4 safe\" style=\"color:green;\">Safe zone</p>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"container con0\">\r\n");
      out.write("\t<div class=\"col-md-6\">\r\n");
      out.write("\t\t<img src=\"female-3743458.svg\" style=\"height: 60vh\">\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"col-md-6 proinfo\">\r\n");
      out.write("\t\t<p >");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("\t\t<p >@");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aadhar}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("\t\t<button class=\"btn btn-danger sosbtn mybtn\" onclick=\"window.location.href='sos.jsp'\">SOS Local Police</button>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("\t<div class=\"col-md-4\">\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<blockquote>Locations Marked safe by you<br><br>    \t\r\n");
      out.write("\t<button class=\"btn btn-primary mybtn\" onclick=\"window.location.href='mylocations.jsp'\">Registered Locations</button>\r\n");
      out.write("\t</blockquote>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"col-md-4\" align=\"center\">\r\n");
      out.write("    \t<h4 style=\"margin-top: 33px;\">Add a new location to safe list</h4>\r\n");
      out.write("\r\n");
      out.write("\t\t<button type=\"button\" id=\"open-modal2\" class=\"btn btn-info mybtn\" data-toggle=\"modal\" data-target=\"#myModal\" style=\"margin-top: 20px;\"\r\n");
      out.write(">Add Location</button>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"col-md-4\">\r\n");
      out.write("\t<br>\r\n");
      out.write("    <blockquote class=\"blockquote-reverse\">Locations visited but not marked safe<br><br>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<button class=\"btn btn-primary mybtn\" onclick=\"window.location.href='unregloc.jsp'\">UnRegistered locations</button>\r\n");
      out.write("\t</blockquote>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");

if(mysession.getAttribute("location")!=null){
Connection conn = null;
try {
	String aadhar = (String)mysession.getAttribute("aadhar");

	Class.forName("com.mysql.jdbc.Driver");
    String url = "jdbc:mysql://localhost:3306/javadbms?verifyServerCertificate=false&useSSL=true";
    String user = "root";
    String dbpassword = "wiseone";
	
    
    conn = DriverManager.getConnection(url, user, dbpassword);
    String sql="select reglocation from locations where aadhar='"+aadhar+"';";
    Statement st = conn.createStatement(); 
    ResultSet m = st.executeQuery(sql); 
    int f=0;
    while(m.next()) {
    	String s=(String)mysession.getAttribute("location");
    	if(s.equalsIgnoreCase(m.getString(1))){
    		
    	f=2;
    	break;
    	}
    	
    	
    	}
    if(f==0){
    	
    	
    	String s=(String)mysession.getAttribute("location");
        String sql2="select location,nofvisits from unreglocations where aadhar='"+aadhar+"' and location='"+s+"';";
        Statement st2 = conn.createStatement(); 
        ResultSet m2 = st.executeQuery(sql2); 
        
        if (!m2.isBeforeFirst() ) {    
        	//insert
        	
            	String sql4="insert into unreglocations values('"+mysession.getAttribute("aadhar")+"','"+s+"',1)";
                Statement st4 = conn.createStatement(); 
                int m4=st4.executeUpdate(sql4); 
            	
        	
        } else {
        	//update
        	
        		String sql4="update unreglocations set nofvisits=nofvisits+1 where aadhar='"+aadhar+"' and location='"+s+"';";
        	    Statement st4 = conn.createStatement(); 
        	    st4.executeUpdate(sql4); 
        	    
        	    
        	    while(m2.next()){
        	    	mysession.setAttribute("nofvisits", m2.getString(2));
        	    }
        }
        
    	
    	
    	
    	
      out.write("\r\n");
      out.write("    \t<script>\r\n");
      out.write("    \t");

    	if(mysession.getAttribute("nofvisits")==null){
    		
      out.write(" \r\n");
      out.write("    \t\r\n");
      out.write("    \t\t$(document).ready(function(){  // Show the Modal on load\r\n");
      out.write("  \t\t\t  $(\"#myModal2\").modal(\"show\");\r\n");
      out.write("  \t\t\t        $(\"#myModal2\").on('shown.bs.modal', function(){\r\n");
      out.write("  \t\t\t             func();\r\n");
      out.write("  \t\t\t            });\r\n");
      out.write("  \t\t\t\r\n");
      out.write("  \t\t\t});\r\n");
      out.write("    \t\t$(\".safe\").replaceWith(\"<p class='proinfo4 safe' style='color:red;'>UnSafe zone</p>\");\r\n");
      out.write("    \t\t");

    	}
    	else{
    	if(Integer.parseInt((String)mysession.getAttribute("nofvisits"))>=20){
    		
      out.write("\r\n");
      out.write("    \t\t\r\n");
      out.write("    \t\t$(document).ready(function(){  // Show the Modal on load\r\n");
      out.write("  \t\t\t  $(\"#myModal8\").modal(\"show\");\r\n");
      out.write("  \t\t\t        $(\"#myModal8\").on('shown.bs.modal', function(){\r\n");
      out.write("  \t\t\t              func();\r\n");
      out.write("  \t\t\t            });\r\n");
      out.write("  \t\t\t\r\n");
      out.write("  \t\t\t});\r\n");
      out.write("    \t\t");

    		
    	}
    	else{
    		
      out.write("\r\n");
      out.write("    \t\t\r\n");
      out.write("    \t\t$(document).ready(function(){  // Show the Modal on load\r\n");
      out.write("    \t\t\t  $(\"#myModal2\").modal(\"show\");\r\n");
      out.write("    \t\t\t        $(\"#myModal2\").on('shown.bs.modal', function(){\r\n");
      out.write("    \t\t\t              func();\r\n");
      out.write("    \t\t\t            });\r\n");
      out.write("    \t\t\t\r\n");
      out.write("    \t\t\t});\r\n");
      out.write("    \t");

    	}
    	
      out.write("\r\n");
      out.write("    \t$(\".safe\").replaceWith(\"<p class='proinfo4 safe' style='color:red;'>UnSafe zone</p>\");\r\n");
      out.write("    \t\r\n");
      out.write("    \t");

    	}
    	
      out.write("\r\n");
      out.write("        </script>\r\n");
      out.write("    ");

    
    
    }
    
    	
    	
    
    

} catch(SQLException e) {
   System.out.println(e.getMessage());
} catch (ClassNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

}

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    \tvar x= '");
      out.print( mysession.getAttribute("location") );
      out.write("'\r\n");
      out.write("    \tif(x!='null')\r\n");
      out.write("        \t$(\".loc\").replaceWith(\"<p class='col-md-6 proinfo2 loc'>You are at \"+x+\"</p>\");\r\n");
      out.write("    \telse\r\n");
      out.write("    \t\t$(\".loc\").replaceWith(\"<p class='col-md-6 proinfo2 loc'>You are at Location\"+\"</p>\");\r\n");
      out.write("    \t\r\n");
      out.write("    \t\r\n");
      out.write("     \r\n");
      out.write("    \r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("           function func() {\r\n");
      out.write("        \t   mkey = setTimeout(\"waitfunc()\", 20000);\r\n");
      out.write("           }\r\n");
      out.write("           function waitfunc(){\r\n");
      out.write("        \t   location.href = \"sos.jsp\";\r\n");
      out.write("        \t\r\n");
      out.write("        }\r\n");
      out.write("           \r\n");
      out.write("           function closefunc(){\r\n");
      out.write("           clearTimeout(mkey);\r\n");
      out.write("           }\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");

}

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>                            ");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
