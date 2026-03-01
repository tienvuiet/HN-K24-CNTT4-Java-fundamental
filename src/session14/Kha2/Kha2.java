package session14.Kha2;

import java.util.Calendar;
import java.util.Map;
import java.util.Scanner;

public class Kha2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String,String> danhSachThuoc = Map.of("T01","Paracetamol", "T02", "Ibuprofen");
        System.out.println("Nhap ma thuoc: ");
        String maThuoc = sc.nextLine();
        System.out.println("Ten thuoc: "+ danhSachThuoc.get(maThuoc));

    }
}
