

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class AddL
 */
@WebServlet("/AddL")
public class AddL extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		

		HttpSession mysession=request.getSession(); 
		String aadhar = (String) mysession.getAttribute("aadhar");
		Connection conn = null;
        try {
        	

        	Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/javadbms?verifyServerCertificate=false&useSSL=true";
            String user = "root";
            String dbpassword = "wiseone";
        	
            
    		String loc=request.getParameter("location");
    		if(loc == null) {
    			loc = (String) mysession.getAttribute("location");
    		}
            conn = DriverManager.getConnection(url, user, dbpassword);
            String sql="select * from unreglocations where aadhar='"+aadhar+"' and location='"+loc+"';";
            Statement st = conn.createStatement(); 
            ResultSet m = st.executeQuery(sql); 
           
            while(m.next()) {
            	String sql2="delete from unreglocations where aadhar='"+aadhar+"' and location='"+loc+"';";
                Statement st2 = conn.createStatement(); 
                st2.executeUpdate(sql2); 
            	
            }
            String sql4="insert into locations values('"+aadhar+"','"+loc+"');";
            Statement st4 = conn.createStatement(); 
            st4.executeUpdate(sql4); 
            
            response.sendRedirect("mylocations.jsp?msg=added");
            

        } catch(SQLException e) {
        	
        	System.out.println(mysession.getAttribute("aadhar"));
           System.out.println(e.getMessage());
           
        } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
        	System.out.println(mysession.getAttribute("aadhar"));
        	e.printStackTrace();
        }
		
	}



}
