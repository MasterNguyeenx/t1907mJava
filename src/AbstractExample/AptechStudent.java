package AbstractExample;

public class AptechStudent extends Student implements StudentInterface{
    @Override
    public void showInfo() {
        System.out.println("Hello Student");
    }

    @Override
    public void study() {

    }

    @Override
    public void playGame() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void run() {

    }

    @Override
    public int getAge() {
        return 0;
    }
}
