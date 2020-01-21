package ss1demo;
import Session1.Car;

public class Toyota extends Car{
    protected int price;
    public Toyota(int year, String type, String brand,int price){
        super(year,type,brand);
        this.price = price;
    }
    public void showInfo(){
        System.out.println("Year: "+year);
        System.out.println("Type: "+type);
    }
}
