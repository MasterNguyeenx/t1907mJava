package Exam;

public interface IContact {
    void addContact(String name, String company, String email, String number);
    void display();
    Contact findContact(String name);


}
