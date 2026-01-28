package session04.kha2;

import java.util.Scanner;

public class kha2 {
    public  static  void trichXuatMa(String s){
        String key = "Ke:";
        if(s.contains(key)){
            int start = s.indexOf(key) + key.length();
            int end = s.indexOf(",",start);
            if(end == -1){
                end = s.length();
            }
            String maKe = s.substring(start, end).trim();
            String thayThe = s.replace(key, "Vi tri luu tru");
            System.out.printf("Vi tri tim thay: %s\n", maKe);
            System.out.printf("Mo ta moi: %s", thayThe);
        }else{
            System.out.printf("Khong the tim ma ke");
        }

    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap mo ta sach: ");
        String description = sc.nextLine();
        trichXuatMa(description);

    }
}
