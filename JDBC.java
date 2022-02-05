
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.*;

public class JDBC {
    public static void main(String args[])
    {
    Connection con=null;
    try{
    
     Class.forName("com.mysql.jdbc.Driver");
      
      String DB_URL="jdbc:mysql://localhost:3306/testdb";
       String User="root";
        String password="";
       con= DriverManager.getConnection(DB_URL,User,password);
      JOptionPane.showMessageDialog(null, "connected");
      Statement stmt = con.createStatement();
       System.out.println("Inserting records into the table...");          
         String sql = "INSERT INTO Students VALUES (1, 'Zara', 'BSSE', 8)";
         stmt.executeUpdate(sql);
         System.out.println("Inserting records into the table...");          
         sql = "INSERT INTO Students VALUES (2, 'Hira', 'BSIT', 5)";
         stmt.executeUpdate(sql);

		      
   
}catch(HeadlessException | ClassNotFoundException | SQLException e)
{
    JOptionPane.showMessageDialog(null, e);
}
}
   }

    
     