package Session1;

public class Human {
    public int age = 10;

    public Human(){
        System.out.println("Khoi tao doi tuong Human");
    }

    public Human(String msg){
        System.out.println(msg);
    }

    public Human(int x){
        age = x;
        System.out.println("Set Age = "+x);
    }

    public void getInfo(){
        System.out.println("Age: "+age);
    }
}
