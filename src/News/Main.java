package News;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choose = 0;
        News n= new News();
        do{
            System.out.println("Enter your choose:");
            System.out.println("1 : Insert news");
            System.out.println("2 : View news list");
            System.out.println("3 : Average Rate");
            System.out.println("4 : Exit");
            choose = sc.nextInt();
            switch (choose){
                case 1:
                    System.out.println("Enter new's title");
                    n.setTitle(sc.next());
                    System.out.println("Enter new's publish date");
                    n.setPublishDate(sc.next());
                    System.out.println("Enter new's content");
                    n.setContent(sc.next());
                    System.out.println("Enter new's author");
                    n.setAuthor(sc.next());
                    System.out.println("Enter new's rate list");
                    n.Calculate();
                    break;
                case 2:
                    n.display();
                    break;
                case 3:
                    n.getAverageRate();
                    System.out.println("Avg rate: "+n.getAverageRate());
                case 4:
                    break;
                default:
                    System.out.println("Fail, choose again");
            }
        }while(choose!=4);
    }
}
