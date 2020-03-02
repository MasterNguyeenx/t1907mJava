package Session5;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        int x = 0;
        int y = 10;
        try {
            int z = x / y;
            System.out.println(z);
            //cho nay chua loi
            if(x<=0) throw new Exception("Loi roi , khong lam tiep duoc");
            System.out.println("In nguoc lai xem sao");
            z = y / x; // loi
            System.out.println(z);
        }catch(Exception e){
            System.out.println("Error");
        }finally {
            System.out.println("Luc nao cung chay qua");
        }
        // Luu tru trong tep tin
        try {
            File f = new File("C:\\Users\\Admin\\Desktop\\data.txt");
            String st = "";
            if (f.canRead()) {
                FileInputStream fis = new FileInputStream(f);
                DataInputStream dis = new DataInputStream(fis);
                st = dis.readLine();
                System.out.println(st);
                fis.close();
                dis.close();
            }
            if (f.canWrite()) {
                FileOutputStream fos = new FileOutputStream(f);
                DataOutputStream dos = new DataOutputStream(fos);
                dos.writeChars(st + "Hello, this is the first line\n");
                dos.close();
                fos.close();
            }
        }catch (Exception e){
            System.out.println("Khong tim thay file hoac khong the su dung");
        }
    }
}
