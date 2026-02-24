package review.TruuTuong;

public class Main  {
    static void main(String[] args) {
     RemoteControl smartLight = new RemoteControl() {
         @Override
         public void powerOn() {
             System.out.println("Den da bat");
         }

         @Override
         public void checkBattery() {
             RemoteControl.super.checkBattery();
             System.out.println("Pin yeu");
         }
     };
     smartLight.checkBattery();
     smartLight.powerOn();
    }
}
