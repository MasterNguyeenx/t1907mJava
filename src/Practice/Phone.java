package Practice;

public abstract class Phone {
        abstract void insertPhone(String name, String phone);
        abstract void removePhone(String name);
        abstract void updatePhone(String name, String phone);
        abstract PhoneName searchPhone(String name);
        abstract void sort();
}
