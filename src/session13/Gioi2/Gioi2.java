package session13.Gioi2;

import java.util.LinkedList;

public class Gioi2 {
    private LinkedList<String> danhSachCho = new LinkedList<>();
    public void patientCheckIn(String name){
        danhSachCho.addLast(name);
        System.out.println("CheckIn "+ name);
    }
    public void emergencyCheckIn(String name){
        danhSachCho.addFirst(name);
        System.out.println("Emergency "+ name);
    }
    public void treatPatient(){
        if (danhSachCho.isEmpty()){
            System.out.println("Khong co benh nhan nao cho kham");
            return;
        }

        String benhNhan = danhSachCho.removeFirst();
        System.out.println("Dang cap cuu: "+ benhNhan);
    }

    static void main(String[] args) {
        Gioi2 benhNhan = new Gioi2();
        benhNhan.patientCheckIn("A");
        benhNhan.patientCheckIn("B");
        benhNhan.emergencyCheckIn("C");
        System.out.println("Dieu tri: ");
        benhNhan.treatPatient();

    }
}
