package Session4;

public class Generic <K,V>{
    //tham so hoa kieu du lieu ( Generic )
    public <E> void showMessage(E msg){
        System.out.println(msg);
    }
    public K name;
    public V phone;

    public K getName() {
        return name;
    }

    public V getPhone(){
        return phone;
    }
    public void setName(K name){
        this.name = name;
    }
    public void setPhone(V phone){
        this.phone = phone;
    }
}


