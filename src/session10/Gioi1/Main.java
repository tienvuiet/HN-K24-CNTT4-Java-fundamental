package session10.Gioi1;

public class Main {
    static void main(String[] args) {
        RemoteControl smartLight = new RemoteControl() {
            @Override
            public void powerOn() {
                System.out.println("Den da bat");
            }
        };
        smartLight.checkBattery();
        smartLight.powerOn();
    }
}
