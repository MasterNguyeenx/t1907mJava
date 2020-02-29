package Lab4;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class Mobile <S,T,N> {
    private S brand;
    private T seri;
    private N year;

    public Mobile() {
    }

    public S getBrand() {
        return brand;
    }

    public void setBrand(S brand) {
        this.brand = brand;
    }

    public T getSeri() {
        return seri;
    }

    public void setSeri(T seri) {
        this.seri = seri;
    }

    public N getYear() {
        return year;
    }

    public void setYear(N year) {
        this.year = year;
    }

    public boolean checkGuarantee(){
//        LocalTime madeYear = LocalDate.of((Integer) Year,1,1);
        LocalDate now = LocalDate.now();
        if((Integer) year <(now.getYear()-5)){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        LocalDate lc = LocalDate.now();
        LocalDate lc2 = LocalDate.of(2020, 2, 29);
        LocalDate lc3 = lc2.minusYears(1);
        System.out.println(lc3);
        LocalDate lc4 = LocalDate.parse("2019-04-22");

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);
        LocalDateTime dt2 = LocalDateTime.of(2020, 1, 30, 12, 30, 45);
        LocalDateTime.parse("2020-02-28T11:17:56.908224400");

        //Kiem tra nam nhuan
        System.out.println("Nhap nam can kiem tra");
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        LocalDate kt = LocalDate.of(x,2,28);
        LocalDate nextDay = kt.plusDays(1);
        if(nextDay.getDayOfMonth()==29){
            System.out.println("Nam nhuan");
        }else{
            System.out.println("Khong phai nam nhuan");
        }

    }
}
