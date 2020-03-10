package Assignment8;

import Connector.Connector;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import Assignment8.Student;

public class PDAO implements DAOC <Student> {

    private static PDAO instance;
    private PDAO(){}
    public static PDAO getInstance(){
        if(instance == null){
            instance = new PDAO();
        }
        return instance;
    }

    @Override
    public ArrayList list() {
        try{
            Connector conn = Connector.getInstance();
            ResultSet rs = conn.getQuery("SELECT * FROM students");
            ArrayList<Student> stu = new ArrayList<>();
            while(rs.next()){
                stu.add(new Student(rs.getInt("id"),rs.getString("name"),rs.getInt("age"),rs.getInt("mark")));
            }
            return stu;
        }catch (Exception e){}
        return null;
    }

    @Override
    public Boolean add(Student student) {
        try{
            Connector conn = Connector.getInstance();
            String sql_text = "INSERT INTO students(name,age,mark) VALUES ("+student.getName()+","+student.getAge()+","+student.getMark()+")";
            return conn.excuteUpdate(sql_text);
        }catch (Exception e){}
        return false;
    }

    @Override
    public Boolean remove(Student student) {
        try {
            Connector conn = Connector.getInstance();
            String sql_text = "DELETE FROM students WHERE id ="+student.getId();
            return conn.excuteUpdate(sql_text);
        }catch (Exception e){}
        return false;
    }

    @Override
    public Boolean update(Student student) {
        try{
            Connector conn = Connector.getInstance();
            String sql_text = "UPDATE students SET name = "+student.getName()+
                    "age = "+student.getAge() +
                    "mark = " +student.getMark()+
                    "WHERE id ="+student.getId();
            return conn.excuteUpdate(sql_text);
        }catch (Exception e){}
        return false;
    }
}
