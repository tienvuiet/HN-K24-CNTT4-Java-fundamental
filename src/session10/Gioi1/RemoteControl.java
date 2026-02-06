package session10.Gioi1;

public interface RemoteControl {
    void powerOn();
    default  void checkBattery(){
        System.out.println("Pin on dinh");
    }
}
