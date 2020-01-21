package Session1;

public class Car {
    protected int year = 2015;
    protected String type = "AutoCar";
    protected String brand = "Auto";

    public Car(){

    }
    public Car(int year, String type, String brand) {
        this.year = year;
        this.type = type;
        this.brand = brand;
    }

    public void getInfo(){
        System.out.println("Brand :"+brand);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
