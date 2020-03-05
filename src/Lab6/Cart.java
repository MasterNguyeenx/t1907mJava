package Lab6;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.ListView;

import java.awt.*;
import java.net.URL;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class Cart extends List implements Initializable {
    @FXML
    ListView<Products> cartlsView = new ListView<>();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ObservableList sl = FXCollections.observableArrayList();
        sl.add(lsView.getSelectionModel().getSelectedItems());
        cartlsView.setItems(sl);
    }

    public void backHome(){
        try{
            Parent form = FXMLLoader.load(getClass().getResource("product.fxml"));
            Main.mainStage.getScene().setRoot(form);
        }catch (Exception e){

        }
    }
}
