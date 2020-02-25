package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PhoneBook extends Phone {
    ArrayList<PhoneName> phoneList = new ArrayList<>();
    PhoneName phoneName = null;

    @Override
    void insertPhone(String name, String phone) {
        for(PhoneName p: phoneList){
            if(p.name.equals(name)) {
                if (p.number.equals(phone)) {
                    return;
                }
                p.number = p.number + ":" + phone;
                return;
            }
        }
        phoneList.add(new PhoneName(name,phone));
    }

    @Override
    void removePhone(String name) {
        for(PhoneName p: phoneList){
            if(p.name.equals(name)){
                phoneList.remove(p);
                return;
            }
        }
    }

    @Override
    void updatePhone(String name, String phone) {
        for(PhoneName p: phoneList){
            if(p.name.equals(name)){
                p.number= phone;
                return;
            }
        }
    }

    @Override
    PhoneName searchPhone(String name) {
        for(PhoneName p: phoneList){
            if(p.name.equals(name)){
                return p;
            }
        }
        return null;
    }

    @Override
    void sort() {
        Collections.sort(phoneList, new Comparator<PhoneName>() {
            @Override
            public int compare(PhoneName p1, PhoneName p2) {
                return p1.name.compareTo(p2.name);
            }
        });
    }

    void display(){
        System.out.println("You have "+phoneList.size()+ "contact in your list");
        for (PhoneName p: phoneList){
            System.out.println("Name: " + p.name +" Number: "+ p.number);
        }
    }
}
