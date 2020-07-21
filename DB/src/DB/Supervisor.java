package DB;
import java.sql.*;

public class Supervisor {
	
public static boolean insertEmployee(String ssn,String f_name,String l_name,String salary,String work_hours,String super_ssn) {
		
        try {
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/HOTEL","root","root");
            
            Statement mystmt= myConn.createStatement();
			//String s="INSERT INTO HOTEL.EMPLOYEE VALUES(SSN,Fname,Lname,Salary,WorkHours,Super_SSN) ("+ssn+","+f_name+","+l_name+","+salary+","+work_hours+","+super_ssn+")";
            String str ; 
			//3. Excecute sql query,
                        
	    if ( work_hours.equals("") && super_ssn.equals("") )
                str=String.format("INSERT INTO HOTEL.EMPLOYEE(SSN,Fname,Lname,Salary) "
                     + "VALUES('%s','%s','%s','%s')",ssn,f_name,l_name,salary);
            else if ( work_hours.equals("") )
                str=String.format("INSERT INTO HOTEL.EMPLOYEE(SSN,Fname,Lname,Salary,Super_SSN) "
                     + "VALUES('%s','%s','%s','%s','%s')",ssn,f_name,l_name,salary,super_ssn);
            else if ( super_ssn.equals("") )
                str=String.format("INSERT INTO HOTEL.EMPLOYEE(SSN,Fname,Lname,Salary,WorkHours) "
                     + "VALUES('%s','%s','%s','%s','%s')",ssn,f_name,l_name,salary,work_hours);
            else 
                str=String.format("INSERT INTO HOTEL.EMPLOYEE(SSN,Fname,Lname,Salary,WorkHours,Super_SSN)"
                     + "VALUES('%s','%s','%s','%s','%s','%s')",ssn,f_name,l_name,salary,work_hours,super_ssn);
            
            
            mystmt.executeUpdate(str);
	    myConn.close();
            
	 }catch( Exception exc) {
		 exc.printStackTrace();
            return false;
         }
                
	return true;
    }
	    	
    public static boolean updateEmpSer(String set , String where) {
    	
        try {
            
	    Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/HOTEL","root","root");
            
            Statement mystmt= myConn.createStatement();
			
			
            if(where.equals(""))
		mystmt.executeUpdate("UPDATE HOTEL.EMP_DO_SER SET "+set);
            else
            mystmt.executeUpdate("UPDATE HOTEL.EMP_DO_SER SET "+set+" WHERE "+where);
            
            myConn.close();
            
	  }catch(Exception exc) {
          exc.printStackTrace();
	  return false; 
          }
        
	return true;
    }
    
    public static String set( String ssn , String id ){
        
        String result = null;
     
            if ( id != null && ! id.equals(""))
                result+=" S_ID='"+id+"'";
            if ( ssn != null && ! ssn.equals(""))
                result+=" E_SSN='"+ssn+"'";
         
        if ( result == null )
          return null ;
        
        result=result.substring(result.indexOf(" ")+1);
        result.replace(" ",",");
     
       return result;
     
    }
    
    public static String retriveS(){
        
        String s = "";
    	 
    	try{
    	     
    	    Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/HOTEL","root","root");
    	    
            Statement mystmt= myConn.createStatement();
    	    
            ResultSet myRS = mystmt.executeQuery("select * from SERVICE");
    	    
    	    while(myRS.next()){
    	        s+=myRS.getString("ID")+"\t"+myRS.getString("Price")+"\t"+myRS.getString("Type")+"\t"+myRS.getString("state")+"\t"+myRS.getString("R_ID")+"\n";
    	    }
    	      
            myConn.close();
    	 }catch(Exception e){
    	     return null;
    	 }
    	 
    	return s;
    }

    public static String retriveE(){
    	       
        String s = "";
    	 
        try{
    	     
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/HOTEL","root","root");
    	    
            Statement mystmt= myConn.createStatement();
    	    
            ResultSet myRS = mystmt.executeQuery("select * from EMPLOYEE");
    	    
            while(myRS.next()){
    	        s+=myRS.getString("SSN")+"\t"+myRS.getString("Fname")+"\n"+myRS.getString("Lname")+"\t"+myRS.getString("Salary")+"\t"+myRS.getString("WorkHours")+"\t"+myRS.getString("Super_SSN")+"\n";
    	    }
    	    
    	    myConn.close();
            
    	 }catch(Exception e){
    	     return null;
    	 }
    	 
    	return s;
        
    }
    
    public static boolean deleteEmp(String wh){
    	        
    	try{
    	       
    	    Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/HOTEL","root","root");
    	   
    	    Statement mystmt= myConn.createStatement();
    	     
    	    String q ="" ;
            
    	     
            if (wh.equals(""))
    	        q = "DELETE FROM  EMPLOYEE";
    	    else  
                q = "DELETE FROM EMPLOYEE WHERE "+wh; 
    	                //+"WHERE"+where;

    	    mystmt.executeUpdate(q);
            myConn.close();
    	       	   
    	     }catch(SQLException e){
    	       return false;
    	     }
        
        return true;
    }


    	    }
    	    

    
   