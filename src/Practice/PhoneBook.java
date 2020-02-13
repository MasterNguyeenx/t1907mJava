package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PhoneBook extends Phone {
    ArrayList<PhoneName> phoneList = new ArrayList<>();
    PhoneName phoneName = null;

    @Override
    void insertPhone(String name, String phone) {
        int kt1 = 0, kt2 = 0;
        for(int i = 0 ; i < phoneList.size(); i++){
            PhoneName phoneName = phoneList.get(i);
            if(phoneName.getName().equals(name)){
                String [] listPhoneNumber = phoneName.getNumber().split("\\s:\\s");
                for(int j = 0; j<listPhoneNumber.length; j++){
                    kt1 = 0;
                    if(listPhoneNumber[j].equals(phone)){
                        kt1 = 1;
                        break;
                    }
                }
                kt2 = 1;
            }
        }
        if(kt1 == 1 && kt2 == 1){
            System.out.println("Name or number was duplicated");
        }else if(kt1 == 0 && kt2 == 0){
            this.phoneName = new PhoneName(name,phone);
            phoneList.add(phoneName);
        }else if(kt1 == 1 && kt2 == 0){
            phoneName.setNumber(phoneName.getNumber() + " : " + phone);
        }

    }

    @Override
    void removePhone(String name) {
        for(int i=0; i<phoneList.size(); i++){
            PhoneName phoneName = phoneList.get(i);
            if(phoneName.getName().equals(name)){
                phoneList.remove(i);
                System.out.println( phoneName.getName() + " was removed!");
            }
        }
    }

    @Override
    void updatePhone(String name, String phone) {
        for(int i=0; i<phoneList.size();i++){
            PhoneName phoneName = phoneList.get(i);
            if(phoneName.getName().equals(name)){
                phoneName.setNumber(phone);
                System.out.println( phoneName.getName() + " were updated!");
            }
        }
    }

    @Override
    void searchPhone(String name) {
        for(int i=0; i<phoneList.size(); i++){
            PhoneName phoneName = phoneList.get(i);
            if(phoneName.getName().equals(name)){
                System.out.println("Name: " +phoneName.getName()+"\nPhone: "+phoneName.getNumber());
            }
        }
    }

    @Override
    void sort() {
        Collections.sort(phoneList, new Comparator<PhoneName>() {
            @Override
            public int compare(PhoneName p1, PhoneName p2) {
                return p1.getName().compareTo(p2.getName());
            }
        });
    }

    void display(){
        System.out.println("You have "+phoneList.size()+ "contact in your list");
        for (int i=0; i<phoneList.size();i++){
            System.out.println("Name: " +phoneList.get(i).getName() +" Number: "+ phoneList.get(i).getNumber());
        }
    }
}
