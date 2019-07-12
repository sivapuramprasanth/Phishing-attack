

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


import java.sql.*;


import org.apache.jasper.tagplugins.jstl.core.Out;




public class Validate
 {
	
	private static Statement statement = null;
	private static ResultSet resultset = null;
	
	public static boolean deleteotp(String email)
	{
	boolean flag=false;
	try
	{
		
		Class.forName("com.mysql.jdbc.Driver");

	 	 //creating connection with the database 
	         Connection con=DriverManager.getConnection
	                        ("jdbc:mysql://localhost:3306/mission","root","admin");
	        Statement ps =con.createStatement();
		String sql="delete from m_otp where email='"+email+"'";
		System.out.println(sql);
		int i=statement.executeUpdate(sql);
		if(i!=0)
		{
			flag=true;
		}
		System.out.println("User Registeration Status : "+flag);
	}
	catch(Exception e)
	{
		System.out.println("Opp's Error is in AdminDAO-register()....."+e);
	}
	return flag;
	}
	
	public static boolean inserttootp(String email, String otp)
	{
		boolean flag=false;
		try
		{
			
			Class.forName("com.mysql.jdbc.Driver");

		 	 //creating connection with the database 
		         Connection con=DriverManager.getConnection
		                        ("jdbc:mysql://localhost:3306/mission","root","admin");
		         PreparedStatement ps = con
		                    .prepareStatement("insert into m_otp(email,otp) values(?,?)");
		         ps.setString(1, email);
		            ps.setString(2, otp);
		          
		         int i=    ps.executeUpdate();
		            
			if(i!=0)
			{
				flag=true;
			}
			System.out.println("User Registeration Status : "+flag);
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in AdminDAO-register()....."+e);
		}
		return flag;
	}

	
	
	
	
     public static boolean checkUser(String email,String pass) 
     {
    	boolean st = false;
      try{

	 //loading drivers for mysql
         Class.forName("com.mysql.jdbc.Driver");

 	 //creating connection with the database 
         Connection con=DriverManager.getConnection
                        ("jdbc:mysql://localhost:3306/mission","root","admin");
        Statement ps =con.createStatement();
                             
         
         ResultSet rs =ps.executeQuery("select * from mission2 where email='"+email+"' and pass='"+pass+"'");
       while(rs.next()){
        	st=true;
        	
        	
        	
       }
      }catch(Exception e)
      {
          e.printStackTrace();
      }
         return st;                 
  }

     public static boolean checkotp(String otp) 
     {
    	boolean st = false;
      try{

	 //loading drivers for mysql
         Class.forName("com.mysql.jdbc.Driver");

 	 //creating connection with the database 
         Connection con=DriverManager.getConnection
                        ("jdbc:mysql://localhost:3306/mission","root","admin");
        Statement ps =con.createStatement();
                             
         
         ResultSet rs =ps.executeQuery("select * from m_otp where otp='"+otp+"'");
       while(rs.next()){
        	st=true;
        	
        	
        	
       }
      }catch(Exception e)
      {
          e.printStackTrace();
      }
         return st;                 
  }

     
     
 }