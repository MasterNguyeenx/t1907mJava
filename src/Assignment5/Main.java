package Assignment5;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public static Stage mainStage;
    @Override
    public void start(Stage primaryStage) throws Exception{
        mainStage = primaryStage;
        try{
            Parent root = FXMLLoader.load(getClass().getResource("List.fxml"));
            primaryStage.setTitle("Student");
            primaryStage.setScene(new Scene(root,600,400));
            primaryStage.show();
        }catch (Exception e){

        }

    }
}
