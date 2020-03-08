package Lab6fix;

import Connector.Connector;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ResourceBundle;

import java.sql.*;

public class List implements Initializable {
    public ListView<Products> lsView = new ListView<>();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try{
            String sql_text = "SELECT * FROM products";
            Connector connector = Connector.getInstance();
            ResultSet rs = connector.getQuery(sql_text);
            ObservableList<Products> ls = FXCollections.observableArrayList();
            while (rs.next()){
                ls.add(new Products(rs.getInt("id"),rs.getString("name"),rs.getString("description"),rs.getDouble("price"),rs.getInt("amount")));
            }
            lsView.setItems(ls);
        }catch (Exception e){

        }
    }

    public void form(){
        try {
            Parent form = FXMLLoader.load(getClass().getResource("Form.fxml"));
            Main.mainStage.getScene().setRoot(form);
        }catch (Exception e){

        }
    }

    public void addtoCart(){
        try {
            Products selected = lsView.getSelectionModel().getSelectedItem();
            Main.cart.add(selected);
            Parent form = FXMLLoader.load(getClass().getResource("cart.fxml"));
            Main.mainStage.getScene().setRoot(form);
        }catch (Exception e){

        }
    }
}
