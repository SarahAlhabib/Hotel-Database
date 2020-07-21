package DB;
import java.sql.*;

public class Receptionnist {
	
	public static  boolean deleteG (String id){
	    
	    try{
	        
	    Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/HOTEL","root","root");
	    
	  
	    
	    String q = "DELETE FROM HOTEL.Guest WHERE ID = '"+id+"'";
	    Statement mystmt= myConn.createStatement();
	    ///Statement preparedStmt = myConn.prepareStatement(q);
	 
	   // preparedStmt.setString(1,id);
	   // preparedStmt.execute();
	    
	     //mystmt.executeQuery("select * from EMPLOYEE");
	    mystmt.executeUpdate(q);
	    myConn.close();
	    
	     return true;
	    }
	    catch(SQLException e){
	    	e.printStackTrace();
	        return false;
	    } 
	    
	}

	private Statement excuteUpdate(String q) {
		// TODO Auto-generated method stub
		return null;
	}

	public static String retriveR(){
	 ResultSet myRS = null;
	 String s = "";
	 
	 try{
	     
	    Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/HOTEL","root","root");
	    Statement mystmt= myConn.createStatement();
	     myRS = mystmt.executeQuery("select * from Room");
	    
	    while(myRS.next()){
	        s+=myRS.getString("Number")+"\t"+myRS.getString("Price")+"\t"+myRS.getString("Type_of_Room")+"\t"+myRS.getString("state")+"\t"+myRS.getString("R_ID")+"\n";
	    }
	    
	     myConn.close();
	     
	 }catch(Exception e){
	     return null;
	 }
	 
	    return s;
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



	public static String retriveG(){
	       


	 String s = "";
	 
	 
	 try{
	     
	    Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/HOTEL","root","root");
	    Statement mystmt= myConn.createStatement();
	    ResultSet myRS = mystmt.executeQuery("select * from GUEST");
	    
	    while(myRS.next()){
	        s+=myRS.getString("ID")+"\t"+myRS.getString("Phone_no")+"\t"+myRS.getString("Email")+"\t"+myRS.getString("Name")+"\n";
	    }
	    
	      myConn.close();
	 }catch(Exception e){
	     return null;
	}
	 
	    return s;
	} 
	 public  static boolean insertguest(String id , String phone , String email , String name ){
        try {
                      //1. get connection to database
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/HOTEL","root","root");

			//2. create a statment
			Statement mystmt= myConn.createStatement();
			
			//3. Excecute sql query
			
                       String sq = null;
                       if ( email.equals(""))
                        sq =  String.format("INSERT INTO HOTEL.Guest(ID ,Phone_no,Name) VALUES ('%s','%s','%s')",id,phone,name);
                        		
                      
                       else 
                    	sq =  String.format("INSERT INTO HOTEL.Guest VALUES ('%s','%s','%s','%s')",id,phone,email,name);
     
                      mystmt.executeUpdate(sq);
                      myConn.close();
        }catch(Exception e){
        	e.printStackTrace();
            return false ;
        }
        
        return true ;
   }
    
    public static boolean insertservices(String id , String price , String Type , String State, String R_Id  ){
        try{
       //1. get connection to database
        	Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/HOTEL","root","root");

			//2. create a statment
			Statement mystmt= myConn.createStatement();
			
			//3. Excecute sql query
			
                       
                       String sq = null ;
                       
                       if ( price.equals("") && R_Id.equals(""))
                       sq =  "INSERT INTO HOTEL.SERVICE(ID,Type,State)"
                     + " VALUES ('"+id+"','"+Type+"','"+State+"')";
                       else if ( price.equals("") ){
                        sq =  "INSERT INTO HOTEL.SERVICE(ID,Type,State, R_ID)"
                     + " VALUES ('"+id+"','"+Type+"','"+State+"','"+R_Id+"')"; 
                       }
                       else if ( R_Id.equals("")){
                         sq =  "INSERT INTO HOTEL.SERVICE(ID ,Price,Type,State)"
                     + " VALUES ('"+id+"','"+price+"','"+Type+"','"+State+"')";
                       } else 
                              sq =  "INSERT INTO HOTEL.SERVICE (ID ,Price,Type,State, R_ID )"
                     + " VALUES ('"+id+"','"+price+"','"+Type+"','"+State+"','"+R_Id+"')";
                       
                     
     
                      mystmt.executeUpdate(sq); 
        }catch(Exception e ){
           e.printStackTrace(); 
            return false ; 
            
        }return true;
    }
    
    
    
    public static String set( String id , String Check_in , String Check_out , String DOS , String G_id){
    	System.out.println(id);
     String result = null;
     if ( id != null && ! id.equals(""))
         result+=" R_ID='"+id+"'";
     if ( Check_in != null && ! Check_in.equals(""))
         result+=" Check_in='"+Check_in+"'";
     if ( Check_out != null && ! Check_out.equals(""))
         result+=" Check_out='"+Check_out+"'";
     if ( DOS != null && ! DOS.equals("") )
         result+=" Duration_of_Stay='"+DOS+"'";
     if ( G_id != null && ! G_id.equals("") )
         result+=" G_ID='"+G_id+"'";
     
     result=result.substring(result.indexOf(" ")+1);
     result.replaceAll(" ",",");
     
     System.out.println(result);
     
     return result;
     
    }
    public static boolean updateRes(String set , String where ){
	      
        //1. get connection to database
			try{ Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/HOTEL","root","root");

			//2. create a statment
			Statement mystmt= myConn.createStatement();
			
			//3. Excecute sql query
			
                        String sq;
                        
                        if (where.equals(""))
                        sq =  "UPDATE HOTEL.Reservation "
                        + "SET "+set ;
                        else
                        sq =  "UPDATE HOTEL.Reservation "
                        + "SET "+set
                        + " WHERE "+where;
                        
                        System.out.println(sq);
                        mystmt.executeUpdate(sq);
                        myConn.close();
                        
			}catch(Exception exe) {
			exe.printStackTrace();
			return false;}
      
              return true;     
  
     }
    
    

   
    
    
    


}
