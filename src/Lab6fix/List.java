package Lab6fix;

import Connector.Connector;
import Session6.ProductDataAccessObject;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import java.sql.*;

public class List implements Initializable {
    public ListView<Products> lsView = new ListView<>();

    public static ObservableList<Products> listData = FXCollections.observableArrayList();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try{
            reloadData();
            lsView.setItems(listData);
        }catch (Exception e){

        }
    }

    public void form(){
        try {
            if(Main.formPage == null){
                Main.formPage = FXMLLoader.load(getClass().getResource("Form.fxml"));
            }
            Main.mainStage.getScene().setRoot(Main.formPage);
        }catch (Exception e){

        }
    }

    public void addtoCart(){
        try {
            if(Main.cartPage == null){
                Main.cartPage = FXMLLoader.load(getClass().getResource("cart.fxml"));
            }
            Products selected = lsView.getSelectionModel().getSelectedItem();
            Main.cart.add(selected);
            Main.mainStage.getScene().setRoot(Main.cartPage);
        }catch (Exception e){

        }
    }

    public static void reloadData() throws Exception{
//        String sql_text = "SELECT * FROM products";
//        Connector connector = Connector.getInstance();
//        ResultSet rs = connector.getQuery(sql_text);
//
//        ObservableList<Product> ls = FXCollections.observableArrayList();
//        while (rs.next()){
//            ls.add(new Product(rs.getInt("id"),rs.getString("name"),
//                    rs.getString("description"),rs.getDouble("price"),
//                    rs.getInt("quantity"))
//            );
//        }
        // su duing DAO Pattern
        ProductDataAccessObject pdao = ProductDataAccessObject.getInstance();
        ArrayList<Products> ls = pdao.list();
        listData.addAll(ls);
    }
}
