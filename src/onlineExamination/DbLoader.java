package online_examination;

import java.sql.*;

public class DbLoader 
{
     public static ResultSet executeSQL(String sql)
     {
         try
         {
            //Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loading done");
            
            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/OnlineExamination", "root", "Rahul8872");
            System.out.println("Connection done");
            
            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            System.out.println("Statement done");
            
            ResultSet rs = stmt.executeQuery(sql);
            System.out.println("ResultSet Created");  
            
            return rs;
         }
         catch(Exception ex)
         {
             ex.printStackTrace();
             return null;
         }
     }
}
