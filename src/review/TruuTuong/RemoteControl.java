package review.TruuTuong;

public interface RemoteControl {
    void powerOn();
    default void checkBattery(){
        System.out.println("Pin on dinh");
    }
}
