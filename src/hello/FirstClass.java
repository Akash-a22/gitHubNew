package hello;
import java.sql.*; //1

public class FirstClass {
	public static void main(String[] args)throws Exception {
		
		/*
		 * 1)import the package which is java.sql.*
		 * 2) load and register
		 * 3) create connection
		 * 4) create statement
		 * 5) execute query
		 * 6) process the result
		 * 7) close
		 * 
		 * */
		String url="jdbc:mysql://localhost:3306//hello";
		String us="root";
		String pw="root123";
		String query="Select ename from emp where empid=101";
		Class.forName("jdbc:mysql://localhost:3306/Driver");  //2
		Connection con=DriverManager.getConnection(url,us,pw);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		
		rs.next();
		String name=rs.getString("ename");
		//int empid=rs.getInt("empid");
		//String address=rs.getString("address");
		
		System.out.println(name);
		//System.out.println(empid);
		//System.out.println(address);
		
		st.close();
		con.close();

		
	
		
		
		
	}

}
