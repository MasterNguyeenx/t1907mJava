package Exam;

import java.util.ArrayList;

public class Controller implements IContact{
    ArrayList<Contact> contactList = new ArrayList<>();

    @Override
    public void addContact(String name, String company, String email, String number) {
//        contactList.add(new Contact(name,company,email,number));
        for(Contact c:contactList){
            if(c.name.equals(name)){
                System.out.println("Error");;
            }
            return;
        }
        contactList.add(new Contact(name,company,email,number));
    }

    @Override
    public void display() {
        System.out.println("You have "+contactList.size()+" in your list");
        for(Contact c:contactList){
            System.out.println(c.name + " - " + c.company +" - "+ c.mail+" - " +c.number);
        }
    }

    @Override
    public Contact findContact(String name) {
        for(Contact c : contactList){
            if(c.name.equals(name)){
                System.out.println(c);
            }
        }
        return null;
    }
}
