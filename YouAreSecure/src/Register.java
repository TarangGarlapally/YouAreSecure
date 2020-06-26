

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import static java.lang.System.*;


@WebServlet("/Register")
public class Register extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String aadhar = request.getParameter("username");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		String fname = request.getParameter("fname");
		String mname = request.getParameter("mname");
		String dob = request.getParameter("dob");
		String mobile = request.getParameter("mobile");
		String mstatus = request.getParameter("marital");
		String occupation = request.getParameter("occupation");
		String hometown = request.getParameter("hometown");
		
	
		
		
		Connection conn = null;
        try {
        	

        	Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/javadbms?verifyServerCertificate=false&useSSL=true";
            String user = "root";
            String dbpassword = "wiseone";
        	
            
            conn = DriverManager.getConnection(url, user, dbpassword);
            String sql="insert into women values('"+name+"','"+aadhar+"','"+fname+"','"+mname+"','"+dob+"','"+mobile+"','"+mstatus+"','"+occupation+"','"+hometown+"','"+password+"')";
            Statement st = conn.createStatement(); 
            int m = st.executeUpdate(sql); 
            if (m==0 ) {    
            	response.sendRedirect("register.jsp?error=not-updated");
            } else {
            	HttpSession mysession=request.getSession(); 
        		mysession.setAttribute("aadhar", aadhar);
        		mysession.setAttribute("name",name);
        		mysession.setAttribute("mobile",mobile);
            	response.sendRedirect("home.jsp?register=success");
            }

        } catch(SQLException e) {
           System.out.println(e.getMessage());
           response.sendRedirect("register.jsp?error=not-updated");
        } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
        	e.printStackTrace();
        	response.sendRedirect("register.jsp?error=not-updated");
        }
		
	}



}
