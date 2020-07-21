// main for testing the connection
package DB;
import java.sql.*;

public class DBmain{
	public static void main(String[] args) {
		Supervisor s= new Supervisor();
		Receptionnist r= new Receptionnist();
		

		try {
			
			//1. get connection to database
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/COMPANY","root","root");

			//2. create a statment
			Statement mystmt= myConn.createStatement();
			//mystmt.executeUpdate("INSERT INTO HOTEL.GUEST VALUES(123,'0505864409','sara@gmail.com','sarah')");
			//3. Excecute sql query
			ResultSet myRS = mystmt.executeQuery("select *\n" + 
					"from company.works_on2 \n" + 
					"where pname='producty'  ");
			
			//4. process the result set
	        while(myRS.next()) 
	        System.out.println(myRS.getString("Fname"));
		  // System.out.println(s.updateEmpSer("S_ID=789",null));
			//String str="INSERT INTO HOTEL.EMPLOYEE VALUES('1122337777','Saleh','Hasan',3500,8.00,'3334445555')";
			//mystmt.executeUpdate(str);
			//String set=r.set(null, null, null, "11",null);
			//System.out.println(r.updateRes(set, "R_ID=103"));
		   //  System.out.print(r.deleteG("666"));
			//System.out.println(s.insertEmployee("4455667788", "lama", "majed", "50000", "8", null));
        
	        //	System.out.println(r.retriveR());
	       // myConn.close();
			
		
		}catch(Exception exc) {
		exc.printStackTrace();}
	
}}