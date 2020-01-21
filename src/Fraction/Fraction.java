package Fract;

import java.util.Scanner;

public class Fraction {
    public int Tu;
    public int Mau;

    public Fraction() {
    }

    public Fraction(int tu, int mau) {
        Tu = tu;
        Mau = mau;
    }

    public int getTu() {
        return Tu;
    }

    public void setTu(int tu) {
        Tu = tu;
    }

    public int getMau() {
        return Mau;
    }

    public void setMau(int mau) {
        Mau = mau;
    }

    public void nhapPhanSo(){
        Scanner sc = new Scanner(System.in);
        Tu = sc.nextInt();
        Mau = sc.nextInt();
    }

    public void inPhanSo(){
        System.out.println(+getTu()+"/"+getMau());
    }

    public int ucln(int a, int b){
        while (a!=b){
            if(a>b){
                a -= b;
            }else{
                b -= a;
            }
        }
        return a;
    }

    public void rutgon(){
        int i = ucln(getTu(),getMau());
        this.setTu(this.getTu()/i);
        this.setMau(this.getMau()/i);
    }

    public void cong(Fraction f){
        int ts = this.getTu() * f.getMau() + f.getTu() * this.getMau();
        int ms = this.getMau() *f.getMau();
        Fraction Tong = new Fraction(ts,ms);
        Tong.rutgon();
        System.out.println("Tong 2 phan so la: "+Tong.Tu+"/"+Tong.Mau);
    }

    public void tru(Fraction f){
        int ts = this.getTu() *f.getTu() - f.getTu() * this.getMau();
        int ms = this.getMau() *f.getMau();
        Fraction Hieu = new Fraction(ts,ms);
        Hieu.rutgon();
        System.out.println("Hieu 2 phan so la: "+Hieu.Tu+"/"+Hieu.Mau);
    }

    public void nhan(Fraction f){
        int ts = this.getTu() * f.getTu();
        int ms = this.getMau() * f.getMau();
        Fraction Tich = new Fraction(ts , ms);
        Tich.rutgon();
        System.out.println("Tich 2 phan so la: "+Tich.Tu+"/"+Tich.Mau);
    }

    public void chia(Fraction f){
        int ts = this.getTu() * f.getMau();
        int ms = this.getMau() * f.getTu();
        Fraction Thuong = new Fraction(ts , ms);
        Thuong.rutgon();
        System.out.println("Thuong 2 phan so la: "+Thuong.Tu+"/"+Thuong.Mau);
    }

    public static void main(String[] args) {
        Fraction f1 = new Fraction(16,3);
        Fraction f2 = new Fraction(4,8);

        f1.cong(f2);
        f1.tru(f2);
        f1.nhan(f2);
        f1.chia(f2);
        
    }
}