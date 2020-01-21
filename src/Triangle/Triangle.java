package Triangle;

import java.util.Scanner;

public class Triangle {
    public double a;
    public double b;
    public double c;

    public Triangle() {
    }

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    public double getPerimeter(){
        return a+b+c;
    }
    public double getArea(){
        double p = (a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    public void display(){
        System.out.println(getPerimeter());
        System.out.println(getArea());
    }
    public void enterVariables(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        a = sc.nextDouble();
        System.out.println("Enter b: ");
        b = sc.nextDouble();
        System.out.println("Enter c: ");
        c = sc.nextDouble();
    }

    public boolean checkTriangle(){
        if(a+b>c && b+c>a && a+c>b){

            return true;
        }else {
            System.out.println("Wrong, enter again!");
            return false;

        }
    }
    public static void main(String[] args) {
        Triangle t = new Triangle();

        do{
            t.enterVariables();
        }while(!t.checkTriangle());
            t.display();
    }
}
