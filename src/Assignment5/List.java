package Assignment5;

import JavaFx.Student;
import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ResourceBundle;
import java.sql.*;
//Step1 : Import java.sql.*
public class List implements Initializable {
    public ListView<Student> lsView = new ListView();


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try{
            // Step 2
            Class.forName("com.mysql.jdbc.Driver");
            // Step 3
            String url = "jdbc:mysql://localhost:3306/t1907m";
            String username = "root";
            String password = ""; // "root" neu dung mamp

            // Step 4
            Connection conn = DriverManager.getConnection(url,username,password);

            // Query SQL
            String sql_text = "SELECT * FROM students";
            Statement stm = conn.createStatement();

            ResultSet rs = stm.executeQuery(sql_text);
            ObservableList ls = FXCollections.observableArrayList();

            while(rs.next()){
                Student st = new Student(rs.getString("name"),rs.getInt("age"),rs.getInt("mark"));
                ls.add(st);
            }
            lsView.setItems(ls);
        }catch (Exception e){

        }
    }

    public void form(){
        // Switch screen
        try{
            Parent form = FXMLLoader.load(getClass().getResource("form.fxml"));
            Main.mainStage.getScene().setRoot(form);
        }catch (Exception e){

        }
    }
}
