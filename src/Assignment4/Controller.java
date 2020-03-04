package Assignment4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.sql.ResultSet;
import java.sql.Statement;


public class Controller {
    @FXML
    TextField txtID = new TextField();
    @FXML
    TextField txtName = new TextField();
    @FXML
    TextField txtAge = new TextField();
    @FXML
    TextField txtMark = new TextField();
    String sql_text = "INSERT INTO students(id,name,age,mark) VALUES ("+Integer.parseInt(txtID.getText())+""+txtName.getText()+""+Integer.parseInt(txtAge.getText()+""+Integer.parseInt(txtMark.getText()));

    public void Submit(ActionEvent e) throws Exception{
        String sql_text = "INSERT INTO students(id,name,age,mark) VALUES ("+Integer.parseInt(txtID.getText())+""+txtName.getText()+""+Integer.parseInt(txtAge.getText()+""+Integer.parseInt(txtMark.getText()));
    }
}
