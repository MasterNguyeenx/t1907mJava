package Assignment5;

import JavaFx.Student;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.control.TextField;

import java.awt.*;
import java.sql.*;

public class Form {
    public TextField txtName = new TextField();
    public TextField txtAge = new TextField();
    public TextField txtMark = new TextField();

    public void submitStudent() throws Exception{
        try{
            Class.forName("com.mysql.jdbc.Driver");
            // Step 3
            String url = "jdbc:mysql://localhost:3306/t1907m";
            String username = "root";
            String password = ""; // "root" neu dung mamp

            // Step 4
            Connection conn = DriverManager.getConnection(url,username,password);

            String name = txtName.getText();
            int age = Integer.parseInt(txtAge.getText());
            int mark = Integer.parseInt(txtMark.getText());

            Student s = new Student();
            String sql_text = "INSERT INTO students(name,age,mark) VALUES('"+name+"','"+age+"','"+mark+"')";

            Statement stm = conn.createStatement();
            int row_number = stm.executeUpdate(sql_text);
            if(row_number>0){
                Parent list = FXMLLoader.load(getClass().getResource("list.fxml"));
                Main.mainStage.getScene().setRoot(list);
            }
        }catch (Exception e){

        }
    }
}
