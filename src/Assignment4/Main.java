package Assignment4;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main extends Application {

    public static void main(String[] args) throws Exception{
        launch(args);
        Controller c = new Controller();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/t1907m";
            String username = "root";
            String password = "";
            Connection conn = DriverManager.getConnection(url,username,password);
            System.out.println("Connected");

            Statement stm = conn.createStatement();
            String sql_text = "SELECT * FROM students";
            ResultSet rs2 = stm.executeQuery(sql_text);
            ResultSet rs = stm.executeQuery(c.sql_text);
            while (rs.next()){
                String line  = rs.getInt("id")+ "-" +rs.getString("name");
                System.out.println(line);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("form.fxml"));
        primaryStage.setTitle("Nhap thong tin sinh vien");
        primaryStage.setScene(new Scene(root,600,400));
        primaryStage.show();
    }
}
