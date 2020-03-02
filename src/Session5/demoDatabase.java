package Session5;
// step 1 import package SQL
import java.sql.*;
public class demoDatabase {

    public static void main(String[] args) throws Exception{
        try{
            // Step 2 declare driver
            Class.forName("com.mysql.jdbc.Driver");
            // Step 3 Create URL database
            String url = "jdbc:mysql://localhost:3306/t1907m";
            String username = "root";
            String password = ""; // "root" neu dung mamp
            // Step 4 Connect DB
            Connection conn = DriverManager.getConnection(url,username,password);
            System.out.println("Connected to SQL!");
            //
            Statement stm = conn.createStatement();
            String sql_text = "SELECT * FROM students";
            ResultSet rs = stm.executeQuery(sql_text);
            while(rs.next()){
                String line  = rs.getInt("id")+ "-" +rs.getString("name");
                System.out.println(line);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}
