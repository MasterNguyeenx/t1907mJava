package Lab6fix;

import Connector.Connector;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javafx.scene.control.TextField;


public class Form {
    public TextField txtName = new TextField();
    public TextField txtDes = new TextField();
    public TextField txtPrice = new TextField();
    public TextField txtAmount = new TextField();

    public void submit(){
//        Connector connector = Connector.getInstance(); //connector chỉ là tên ông giáo đặt thôi

        Connection connection = (Connection) Connector.getInstance();
        try{
            String name = txtName.getText();
            String desc = txtDes.getText();
            double price = Double.parseDouble(txtPrice.getText());
            int amount = Integer.parseInt(txtAmount.getText());

            String sql_text = "INSERT INTO products(name,description,price,amount) VALUES (?,?,?,?)";
            PreparedStatement prStm = connection.prepareStatement(sql_text);
            prStm.setString(1,name);
            prStm.setString(2,desc);
            prStm.setDouble(3,price);
            prStm.setInt(4,amount);
            if(!prStm.execute()){
                Parent form = FXMLLoader.load(getClass().getResource("List.fxml"));
                Main.mainStage.getScene().setRoot(form);
            }else{
                System.out.println("Error");
            }

        }catch (Exception e){

        }
    }
}
