package Practice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choose = 0;
        String name = null;
        String phone = null;
        PhoneBook phoneBook = new PhoneBook();
        do{
            System.out.println("Enter your choose: ");
            System.out.println("1. Insert contact ");
            System.out.println("2. Remove contact");
            System.out.println("3. Update contact");
            System.out.println("4. Search contact");
            System.out.println("5. Sort ");
            System.out.println("6. Exit");
            choose = sc.nextInt();
            switch (choose){
                case 1:
                    System.out.println("Enter name and after is phone number");
                    phoneBook.insertPhone(sc.next(), sc.next());
                    phoneBook.display();
                    break;
                case 2:
                    System.out.println("Enter name:");
                    name = sc.next();
                    phoneBook.removePhone(name);
                    phoneBook.display();
                    break;
                case 3:
                    System.out.println("Enter name:");
                    name = sc.next();
                    System.out.println("Enter phone number:");
                    phone = sc.next();
                    phoneBook.updatePhone(name, phone);
                    phoneBook.display();
                    break;
                case 4:
                    System.out.println("Enter name:");
                    name =  sc.next();
                    phoneBook.searchPhone(name);
                    break;
                case 5:
                    System.out.println(" Sort to alphabet: ");
                    phoneBook.sort();
                    phoneBook.display();
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Wrong command, choose again!");
            }
        }while ( choose !=6 );
    }
}
