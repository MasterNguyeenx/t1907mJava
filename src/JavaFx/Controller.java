package JavaFx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    TextField txtName = new TextField();
    @FXML
    TextField txtAge = new TextField();
    @FXML
    TextField txtMark = new TextField();

    public void Submit(ActionEvent event) throws Exception {
        String name = txtName.getText();
        Integer age;
        Integer mark;
        try{
            age = Integer.parseInt(txtAge.getText());
            mark = Integer.parseInt(txtMark.getText());
        }catch(Exception e){
//            age = 18;
//            mark = 0;
            throw new Exception("Error");
        }
        Student s = new Student(name,age,mark);
        Main.students.add(s);
        Main.students.stream().forEach(e->{
            System.out.println(e.getName()+"-"+e.getAge()+"-"+e.getMark());
        });
    }
}
