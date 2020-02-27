package Assignment3;

public class Main {
    public static void main(String[] args) {
        PersonModel p = new PersonModel();

        System.out.println("Enter 2 student");
        p.insertStudent();
        p.insertStudent();

        System.out.println("Enter 2 employee");
        p.insertEmployee();
        p.insertEmployee();
        p.display();
    }
}
