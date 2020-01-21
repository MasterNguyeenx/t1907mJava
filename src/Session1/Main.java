package Session1;

public class Main {
    public static void main(String[] args) {
        Human h = new Human(2);
        Human h2 = new Human("ggwp");
        System.out.println("Tuoi: "+h.age);
        Car c = new Car();
        System.out.println("\nNam: "+c.year);
        c.getInfo();

    }
}
