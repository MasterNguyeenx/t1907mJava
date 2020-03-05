package Lab6;

import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.control.TextField;

public class Form {
    public TextField txtID = new TextField();
    public TextField txtName = new TextField();
    public TextField txtDes = new TextField();
    public TextField txtPrice = new TextField();
    public TextField txtAmount = new TextField();

    public void addProduct(){
        try{
            Class.forName("com.mysql.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/t1907m";
            String username = "root";
            String password = "";

            Connection conn = DriverManager.getConnection(url,username,password);

            int id = Integer.parseInt(txtID.getText());
            String name = txtName.getText();
            String des = txtDes.getText();
            int price = Integer.parseInt(txtPrice.getText());
            int amount = Integer.parseInt(txtAmount.getText());

            Products pr = new Products();
            String sql_text = "INSERT INTO products(id,name,description,price,amount) VALUES ('"+id+"','"+name+"','"+des+"','"+price+"','"+amount+"')";

            Statement stm = conn.createStatement();
            int row_number = stm.executeUpdate(sql_text);
            if(row_number > 0 ){
                Parent list = FXMLLoader.load(getClass().getResource("product.fxml"));
                Main.mainStage.getScene().setRoot(list);
            }
        }catch (Exception e){

        }
    }
}
