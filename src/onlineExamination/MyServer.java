
package online_examination;

import java.sql.*;
import com.vmm.JHTTPServer;
import java.time.LocalDateTime;
import java.util.*;


public class MyServer extends JHTTPServer{
    public MyServer(int portno) throws Exception {
        super(portno);
    }
    
    @Override
    public Response serve(String uri, String method, Properties header, 
                                                        Properties parms, Properties files) 
    {
        
        Response res=null;
        
        if(uri.equals("/checklogin")) {
            
            String user = parms.getProperty("username");
            String pass = parms.getProperty("password");
            
            try {
                
                ResultSet rs = DbLoader.executeSQL("select * from admin_info where username=\'"+user+"\' and password=\'"+pass+"\'");
                
                if(rs.next()) {
                    res=new Response(HTTP_OK, "text/plain", "logged in successfull !!!");
                }
                else {
                    res = new Response(HTTP_OK, "text/plain", "login failed !!!");
                }
            }
            catch(Exception ex) {
                ex.printStackTrace();
            }
        }       
        else if(uri.equals("/addCategory")) {
            try {
                String catname = parms.getProperty("catname");
                String desc = parms.getProperty("desc");
                String path = parms.getProperty("path");

                String photo = saveFileOnServerWithRandomName(files, parms, "path", "src/pictures");
            
            
                ResultSet rs = DbLoader.executeSQL("select * from manage_categories where catName=\'"+catname+"\'");
                
                if(rs.next()) {
                    res = new Response(HTTP_OK, "text/plain", "File already existed !!!");
                }
                else {
                    
                    rs.moveToInsertRow();
                    rs.updateString("catName", catname);
                    rs.updateString("desc", desc);
                    rs.updateString("imgPath","src/pictures/" +photo);
                    rs.insertRow();
                    res= new Response(HTTP_OK, "text/plain", "Category Added Successfully!!");
                }
            }
            catch(Exception ex) {
                ex.printStackTrace();
            }
        
        }
        else if(uri.equals("/getAllCategories")) {
            try {
                ResultSet rs = DbLoader.executeSQL("select * from manage_categories");
                String ans="";
                while(rs.next()) {
                    String catname = rs.getString("catName");
                    String desc = rs.getString("desc");
                    String imgPath = rs.getString("imgPath");
                    
                    ans = ans + (catname+ "~" + desc + "~" + imgPath);
                    ans+="#";
                }
                res= new Response (HTTP_OK, "text/plain" , ans);
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        else if( uri.equals("/getCategoriesNames") ) {
            try {
                ResultSet rs =DbLoader.executeSQL("select catName from manage_categories");
                String ans="";
                while(rs.next()) {
                    ans+= (rs.getString("catName")+"~");
                }
                res= new Response(HTTP_OK, "text/plain", ans);
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        else if(uri.equals("/addQuestion")) {
            try {
                String catname = parms.getProperty("catname");
                String quest = parms.getProperty("quest");
                String optA = parms.getProperty("optA");
                String optB = parms.getProperty("optB");
                String optC = parms.getProperty("optC");
                String optD = parms.getProperty("optD");
                String correctopt = parms.getProperty("corr");
                
                ResultSet rs = DbLoader.executeSQL("select * from manage_questions");
                
                rs.moveToInsertRow();
                
                rs.updateString("catName", catname);
                rs.updateString("Question", quest);
                rs.updateString("optA", optA);
                rs.updateString("optB", optB);
                rs.updateString("optC", optC);
                rs.updateString("optD", optD);
                rs.updateString("correctOpt", correctopt);
                
                rs.insertRow();
                res=new Response(HTTP_OK, "text/plain", "Question Added Successfully!!" );
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        else if(uri.equals("/getQuestions")) {
            String catname = parms.getProperty("catname");
            try {
                ResultSet rs = DbLoader.executeSQL("select * from manage_questions where catName=\'"+catname+"\'");
                String ans="";
                while(rs.next()) {
                    int id = rs.getShort("ID");
                    String quest = rs.getString("Question");
                    String optA = rs.getString("optA");
                    String optB = rs.getString("optB");
                    String optC = rs.getString("optC");
                    String optD = rs.getString("optD");
                    String corrOpt = rs.getString("correctOpt");
                    
                    String s = id + "~" + quest+ "~"+ optA + "~" + optB + "~" + optC + "~" + optD + "~" + corrOpt;
                    
                    ans+= (s+"#");
                }
                res=new Response(HTTP_OK, "text/plain", ans);
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        else if(uri.equals("/deleteQuestion")) {
            String s = parms.getProperty("id");
            int id = Integer.parseInt(s);
            System.out.println(id);
            try {
                ResultSet rs = DbLoader.executeSQL("select * from manage_questions where ID=\'"+id+"\'");
                
                if(rs.next()) {
                    rs.moveToCurrentRow();
                    rs.deleteRow();
                    res = new Response(HTTP_OK, "text/plain", "Question Deleted Successfully !!!");
                }
            } 
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        else if(uri.equals("/changePassword")) {
            String user = parms.getProperty("username");
            String pass = parms.getProperty("pass");
            
            try {
                ResultSet rs = DbLoader.executeSQL("select * from admin_info where username=\'"+user+"\'");
                
                rs.next();
                rs.updateString("password", pass);
                rs.updateRow();
                
                res = new Response(HTTP_OK, "text/plain", "Password Changed Successfully");
                
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        else if(uri.equals("/signUp")) {
            String name = parms.getProperty("name");
            String cont = parms.getProperty("cont");
            String mail = parms.getProperty("mail");
            String pass = parms.getProperty("pass");
            
            try {
                ResultSet rs = DbLoader.executeSQL("select * from user_info where Gmail=\'"+mail+"\'");
                if(rs.next()) {
                    res = new Response(HTTP_OK, "text/plain", "Gmail already registered!!!");
                }
                else {
                    rs.moveToInsertRow();
                    rs.updateString("name", name);
                    rs.updateString("Gmail", mail);
                    rs.updateString("contact", cont);
                    rs.updateString("password", pass);
                    
                    rs.insertRow();
                    
                    res=new Response(HTTP_OK, "text/plain", "Signed Up Successfully !!!");
                }
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        else if(uri.equals("/userlogin")) {
            String mail = parms.getProperty("mail");
            String pass = parms.getProperty("pass");
            
            try {
                ResultSet rs = DbLoader.executeSQL("select * from user_info where Gmail=\'"+mail+"\'");
                
                if(rs.next()) {
                    
                    String password = rs.getString("password");
                    
                    if(pass.equals(password)) {
                        res = new Response(HTTP_OK, "text/plain", "Logged in Successfully");
                    }
                    else
                        res = new Response(HTTP_OK, "text/plain", "Username/Password Invalid");
                    
                }
                else 
                    res = new Response(HTTP_OK, "text/plain", "Username/Password Invalid");
            } 
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        else if(uri.equals("/changePasswordUser")) {
            String user = parms.getProperty("username");
            String pass = parms.getProperty("pass");
            
            try {
                ResultSet rs = DbLoader.executeSQL("select * from user_info where Gmail=\'"+user+"\'");
                
                rs.next();
                rs.updateString("password", pass);
                rs.updateRow();
                
                res = new Response(HTTP_OK, "text/plain", "Password Changed Successfully");
                
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        else if(uri.equals("/uploadResult")) {
            try {
                String username = parms.getProperty("user");
                String catname = parms.getProperty("catname");
                int marks = Integer.parseInt(parms.getProperty("marks"));
                
                ResultSet rs = DbLoader.executeSQL("select * from user_result");
                
                rs.moveToInsertRow();
                rs.updateString("username", username);
                rs.updateString("catName", catname);
                rs.updateInt("totalMarks", 30);
                rs.updateInt("obtainedMarks", marks);
                String s = LocalDateTime.now()+"";
                String dt = s.substring(0,10);
                String tm = s.substring(11, 19);
                rs.updateString("Date/Time",dt+"  "+tm);
                
                rs.insertRow();
                
                res = new Response(HTTP_OK,"text/plain", "result uploaded");
                
            }          
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        else if(uri.equals("/viewResult")) {
            String user = parms.getProperty("user");
            
            try {
                ResultSet rs = DbLoader.executeSQL("select * from user_result where username = \'"+user+"\'");
                
                String ans = "";
                while(rs.next()) {
                    String catname = rs.getString("catName");
                    int totalMarks = rs.getInt("totalMarks");
                    int obtMarks = rs.getInt("obtainedMarks");
                    String dateTime = rs.getString("Date/Time");
                    
                    String s = catname + "~" + totalMarks + "~" + obtMarks + "~" + dateTime;
                    ans+= s+"#";
                }
                res=new Response(HTTP_OK, "text/plain", ans);
            } 
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        return res;
    }
}