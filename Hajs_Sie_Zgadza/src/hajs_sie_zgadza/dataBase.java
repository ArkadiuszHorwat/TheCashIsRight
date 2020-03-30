package hajs_sie_zgadza;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class dataBase {
    
    public static List<User> user = new ArrayList<>();
    
    static String URL = "jdbc:mysql://127.0.0.1/hajs_sie_zgadza?user=root&password=";
    
    public static boolean checkUser(String getLog, String getPasswd) {
        
        boolean check = false;
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(URL);
            Class.forName("com.mysql.cj.jdbc.Driver");

            String sql = "SELECT * FROM LOGINDATA WHERE login=? and password=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, getLog);
            pst.setString(2, getPasswd);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                check = true;
            }else {
                check = false;                
            }
      
           conn.close();

        }catch(Exception e){
            System.out.println("cosik sie zdupcyło");
        }
        
        return check;
    }

    public static void connection(String query) {

        Connection conn = null;

        try {

            conn = DriverManager.getConnection(URL);

            Class.forName("com.mysql.cj.jdbc.Driver");

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
      
            while (rs.next()) {
             
                //user.add(new User(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4)));
              
                /*System.out.println(user.get(0).getName());
                System.out.println(user.get(0).getSurname());
                System.out.println(user.get(0).getCash());*/
                
                /*System.out.println(rs.getString(1));
                System.out.println(rs.getString(2));
                System.out.println(rs.getString(3));
                System.out.println(rs.getString(4));*/
            }
            
            //System.out.println(user.size());
            conn.close();

        }
        
        catch (ClassNotFoundException error) {
            System.out.println(error);
        } catch (SQLException error) {           
            System.out.println("SQLException: " + error.getMessage());
            System.out.println("SQLState: " + error.getSQLState());
            System.out.println("VendorError: " + error.getErrorCode());
        }

    }
}