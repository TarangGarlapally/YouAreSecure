/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.34
 * Generated at: 2020-05-11 12:49:33 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = null;
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<title>Tales Point</title>\r\n");
      out.write("\t<meta charset=\"utf-8\">\r\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\t<!-- Latest compiled and minified CSS -->\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("\r\n");
      out.write(" <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- jQuery library -->\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- Latest compiled JavaScript -->\r\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("<script defer src=\"https://use.fontawesome.com/releases/v5.0.10/js/all.js\" integrity=\"sha384-slN8GvtUJGnv6ca26v8EzVaR9DC58QEwsIk9q1QXdCU8Yu8ck/tL/5szYlBbqmS+\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<link href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\" rel=\"stylesheet\" integrity=\"sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN\" crossorigin=\"anonymous\">\r\n");
      out.write("<link href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.css\" rel=\"stylesheet\" >\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<nav class=\"navbar navbar-inverse fixed-top navbar-expand-md\">\r\n");
      out.write("\r\n");
      out.write("\t   <div class=\"container-fluid\">\r\n");
      out.write("\t      <a class=\"navbar-brand\" href=\"index.php\"><img class=\"logo\" src=\"img/logo-white.png\"></a>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t   <button class=\"navbar-toggle navbar-toggle-right\" type=\"button\" data-toggle=\"collapse\" data-target=\"#Cnav\" aria-controls=\"Cnav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("         <i class=\"fa fa-navicon\" style=\"color:black; font-size:28px;\"></i></span>\r\n");
      out.write("        </button>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"Cnav\">\r\n");
      out.write("\t    <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("\t      <li><a href=\"index.php\">Home</a></li>\r\n");
      out.write("\r\n");
      out.write("\t      <li>\r\n");
      out.write("\t      <form action=\"search.php\" method=\"POST\" role=\"form\" class=\"form-inline search-form\">\r\n");
      out.write("\r\n");
      out.write("\t      <div class=\"form-group search-input-group\"><input class=\"form-control form-control-lg\" type=\"text\" name=\"search-input\" placeholder=\"Search...\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t      <select class=\"form-control search-select\" name=\"search-by\">\r\n");
      out.write("\t      \t<option value=\"title\">By Title</option>\r\n");
      out.write("\t      \t<option value=\"author\">By Author</option>\r\n");
      out.write("\t      </select>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t      <button type=\"submit\" name=\"submit\" onclick=\"window.location.href='search.php'\" class=\"btn btn-inverse search-submit\" ><span class=\"glyphicon glyphicon-search\"></span></button>\r\n");
      out.write("\t     </div>\r\n");
      out.write("\t     </form>\r\n");
      out.write("\t     </li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t      <li>\r\n");
      out.write("\t      \t<a href=\"#\" class=\"btn btn-inverse dropdown-toggle\" type=\"button\" data-toggle=\"dropdown\">WRITE<span class=\"caret\"></span></a>\r\n");
      out.write("\t\t    <ul class=\"dropdown-menu\">\r\n");
      out.write("\t\t      <li><a href=\"Swrite.php\">New Story +</a></li>\r\n");
      out.write("\t\t    </ul>\r\n");
      out.write("\t\t   </li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<li><a href=\"explore.php?result=sci-fi\">EXPLORE</a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t    <li><a href=\"#\" class=\"btn btn-inverse dropdown-toggle\" type=\"button\" data-toggle=\"dropdown\"><span class=\"glyphicon glyphicon-user\"></span><span class=\"caret\"></span></a>\r\n");
      out.write("\t               <ul class=\"dropdown-menu\">\r\n");
      out.write("\t\t\t\t\t      <li><a href=\"profile.php\">Profile</a></li>\r\n");
      out.write("\t\t\t\t\t      <li><a href=\"profile.php#mylist\">My list</a></li>\r\n");
      out.write("\t\t\t\t\t      <li><a href=\"Settings.php#editsettings\">Settings</a></li>\r\n");
      out.write("\t\t\t\t\t      <li><a href=\"#\">Report</a></li>\r\n");
      out.write("\t\t\t\t\t      <li><a href=\"logout.php\">Logout</a></li>\r\n");
      out.write("\t\t\t\t   </ul>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("        </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
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
