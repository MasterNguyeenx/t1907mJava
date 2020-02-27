package sample;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class Controller implements Initializable{
    @FXML
    private TextField tf1;
    @FXML
    private TextField tf2;
    @FXML
    private TextField tf3;
    @FXML
    private Button btn;
    ArrayList<Student> studentList = new ArrayList<>();

    @FXML
    public void Submit(ActionEvent event){
        for(Student s: studentList) {
            s.setName(tf1.getText());
            s.setAge(Integer.parseInt(tf2.getText()));
            s.setMark(Integer.parseInt(tf3.getText()));
            System.out.println(studentList);
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}