package readdata;
import java.sql.*;
import java.util.*;

public class StoreSPT{
  
  String url = "jdbc:mysql://localhost:3306/buoy_data";
  String username = "root";
  String password = "";
  Connection connection = null; 
  Statement stmt=null;
  
  
  
  public StoreSPT(){
    try {
   System.out.println("Loading JDBC driver...");
   Class.forName("com.mysql.jdbc.Driver");
   System.out.println("JDBC driver successfully loaded!");
   connection = DriverManager.getConnection(url, username, password);
  
  } catch (ClassNotFoundException e) {
   throw new RuntimeException(e);
  } catch (SQLException e) {
   System.out.println(e.toString());
  }
  }
  
  public void writeRecord(DataSPT record_data){
    try {
   stmt = connection.createStatement();
  
   String sql = "INSERT INTO spt (date_time, Hs, Tz, Battery)" +
     "VALUES (1222,122.222,12.222,5)";
   stmt.executeUpdate(sql);
    } catch (SQLException e) {
   System.out.println(e.toString());
  }
  
}
}
