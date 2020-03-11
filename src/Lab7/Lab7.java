package Lab7;

public class Lab7 extends Thread{
    public void run(){
        for(int i=10;i>0;i--){
            for(int j=60;j>=0;j--){
                if(j<0){
                    i--;
                }
                System.out.println(i+":"+j);
                try{
                    Thread.sleep(1000);
                }catch (Exception e){}
            }
        }
    }

    public static void main(String[] args) {
        Lab7 cou = new Lab7();
        cou.start();
    }
}
