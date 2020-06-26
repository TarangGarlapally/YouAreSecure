

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


@WebServlet("/myLogin")
public class myLogin extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String aadhar = request.getParameter("username");
		String password = request.getParameter("password");
		
		Connection conn = null;
        try {
        	

        	Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/javadbms";
            String user = "root";
            String dbpassword = "wiseone";
        	
            
            conn = DriverManager.getConnection(url, user, dbpassword);
            String sql="select * from women where aadhar='"+aadhar+"';";
            Statement st = conn.createStatement(); 
            ResultSet m = st.executeQuery(sql); 
            if (!m.isBeforeFirst() ) {    
            	response.sendRedirect("login.jsp?error=nouser");
            } else {

            while(m.next()) {
            	String opass=m.getString(10);
            	if(opass.equals(password)) {
            		HttpSession mysession=request.getSession(); 
            		mysession.setAttribute("aadhar", aadhar);
            		mysession.setAttribute("name",m.getString(1));
            		mysession.setAttribute("mobile",m.getString(6));
            		response.sendRedirect("home.jsp");
            	}
            	else {
            		
            		response.sendRedirect("login.jsp?error=wrongpassword");
            	}
            }
            }

        } catch(SQLException e) {
           System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
        	e.printStackTrace();
        }
		
	}



}
