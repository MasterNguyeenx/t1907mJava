package Exam;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choose = 0;
        Controller c1 = new Controller();
        do{
            System.out.println("Enter your choose ");
            System.out.println("1: Add a new contact");
            System.out.println("2: Find contact");
            System.out.println("3: Show contacts list");
            System.out.println("4: Exit");
            choose = sc.nextInt();
            switch (choose){
                case 1:
                    System.out.println("Enter name, company, email and number");
                    c1.addContact(sc.next(),sc.next(),sc.next(),sc.next());
                    c1.display();
                    break;
                case 2:
                    System.out.println("Enter name of contact you want to find");
                    c1.findContact(sc.next());
                    break;
                case 3:
                    c1.display();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Wrong command, choose again!");
            }
        }while (choose !=4);
    }
}
