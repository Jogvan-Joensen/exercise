package clbo;
import java.sql.*;
import java.util.*;

public class Exercise5 {
	
	public static void main(String[] args) throws SQLException
	{
		Scanner console = new Scanner (System.in);
		Connection conn = null;
		PreparedStatement pS = null;
		ResultSet result = null;
		
		try
		{
			conn = DriverManager.getConnection("jdbc:mysql://localhost/my_first_database?user=root&password=3459");
			pS = conn.prepareStatement("INSERT INTO customers VALUES(default,?,?,?,?)");
			System.out.print("Please enter name :");
			String a = console.next();
			pS.setString(1,a);
			System.out.print("Please enter last name :");
			String b = console.next();
			pS.setString(2,b);
			System.out.print("Please enter phone number :");
			int c = console.nextInt();
			pS.setInt(3,c);
			System.out.print("Please enter email :");
			String d = console.next();
			pS.setString(4,d);
		    
			pS.executeUpdate();
			
			pS = conn.prepareStatement("SELECT * FROM customers"); 
		    result = pS.executeQuery();
		    
			while(result.next())
			{
				int id = result.getInt("id");
				String name = result.getString("name");
				String lastName = result.getString("last_name");
				String phone = result.getString("phone");
				String email = result.getString("email");
				
				System.out.println(id+", "+name+", "+lastName+", "+phone+", "+email+". ");
			}
			
		}
		catch(SQLException e)
		{
			System.err.println(e);
		}
		finally
		{
			if(conn != null)
			{
				conn.close();
			}
		}
		
		
	}

}
