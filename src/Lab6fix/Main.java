package Lab6fix;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static Stage mainStage;

    public static ObservableList<Products> cart = FXCollections.observableArrayList();

    public static void main(String[] args) {
        launch(args);
    }

    public static Parent listPage;
    public static Parent formPage;
    public static Parent cartPage;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Main.mainStage = primaryStage;
        try {
            if(listPage == null){
                Parent root = FXMLLoader.load(getClass().getResource("List.fxml"));
                listPage = root;
            }

            primaryStage.setTitle("Manage Product");
            primaryStage.setScene(new Scene(listPage,600,400));
            primaryStage.show();
        }catch (Exception e){
            System.out.println("Error");
        }
    }

}
