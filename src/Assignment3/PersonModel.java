package Assignment3;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonModel {
    ArrayList<Student> studentList = new ArrayList<>();
    ArrayList<Employee> employeeList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);


    public void insertStudent() {
        System.out.println("Enter info of person:");
        studentList.add(new Student(sc.nextInt(),sc.next(),sc.nextInt()));
    }

    public void insertEmployee(){
        System.out.println("Enter info of person:");
        employeeList.add(new Employee(sc.nextInt(),sc.next(),sc.nextInt()));
    }

    public void display(){
            System.out.println(studentList);
            System.out.println(employeeList);
    }
}
