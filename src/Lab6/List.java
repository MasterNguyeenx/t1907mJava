package Lab6;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.sql.*;

public class List implements Initializable {
    public ListView<Products> lsView = new ListView();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try{
            Class.forName("com.mysql.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/t1907m";
            String username = "root";
            String password = "";

            Connection conn = DriverManager.getConnection(url,username,password);

            String sql_text  = "SELECT * FROM products";
            Statement stm = conn.createStatement();

            ResultSet rs = stm.executeQuery(sql_text);
            ObservableList ls = FXCollections.observableArrayList();

            while (rs.next()){
                Products pr = new Products(rs.getInt("id"),rs.getString("name"),rs.getString("description"),rs.getInt("price"),rs.getInt("amount"));
                ls.add(pr);
            }
            lsView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
            lsView.setItems(ls);
        }catch(Exception e ){

        }
    }
    public void form(){
        try{
            Parent form = FXMLLoader.load(getClass().getResource("addProduct.fxml"));
            Main.mainStage.getScene().setRoot(form);
        }catch (Exception e){

        }
    }

    public void addtoCart(){
        try{
            Parent form = FXMLLoader.load(getClass().getResource("cart.fxml"));
            Main.mainStage.getScene().setRoot(form);
        }catch (Exception e){

        }
    }
}
