package hajs_sie_zgadza;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class dataBase {
    
    public static List<User> user = new ArrayList<>();
    public static List<AppData> appData = new ArrayList<>();
    public static List<Integer> id = new ArrayList<>();   
    
    static String URL = "jdbc:mysql://127.0.0.1/hajs_sie_zgadza?user=root&password=";
    
    public static boolean checkUserData(String getUserData, String query) {
        
        boolean check = false;
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(URL);
            Class.forName("com.mysql.cj.jdbc.Driver");

            String sql = query;
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, getUserData);
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                check = true;
            }else {
                check = false;                
            }
      
           conn.close();

        }catch(Exception e){
            System.out.println("Error!");
        }
        
        return check;
        
    }
    
    public static void add(String query) {
        Connection conn = null;

        try {

            conn = DriverManager.getConnection(URL);

            Class.forName("com.mysql.cj.jdbc.Driver");

            Statement stmt = conn.createStatement();
            stmt.executeUpdate(query);
            conn.close();
        }
        catch (ClassNotFoundException wyjatek) {
            System.out.println("Problem ze sterownikiem");
        } catch (SQLException wyjatek) {
            System.out.println("Error");
        }
    }
    
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
            System.out.println("Error!");
        }
        
        return check;
    }

    public static void connection(String query, String table) {

        Connection conn = null;

        try {

            conn = DriverManager.getConnection(URL);

            Class.forName("com.mysql.cj.jdbc.Driver");

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
      
            while (rs.next()) {
             
                if(table.equals("USER")){
                    user.add(new User(rs.getInt(1),rs.getString(2),rs.getDouble(3)));
                }else if(table.equals("APPDATA")){
                    appData.add(new AppData(rs.getInt(1),rs.getString(2),rs.getDouble(3),rs.getString(4).charAt(0),rs.getInt(5), rs.getString(6))); 
                }else if(table.equals("id")){
                    id.add(rs.getInt(1));
                }
                
            }
            
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