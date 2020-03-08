package Lab6fix;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ResourceBundle;

public class Cart implements Initializable {
    public ListView<Products> cartlsView = new ListView<>();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try{
            cartlsView.setItems(Main.cart);
        }catch (Exception e){

        }
    }

    public void backHome(){
        try {
            Parent form = FXMLLoader.load(getClass().getResource("List.fxml"));
            Main.mainStage.getScene().setRoot(form);
        }catch (Exception e){

        }
    }
}
