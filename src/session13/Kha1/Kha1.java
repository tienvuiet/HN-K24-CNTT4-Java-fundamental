package session13.Kha1;

import java.util.ArrayList;
import java.util.Iterator;

public class Kha1 {
    static void main(String[] args) {
        ArrayList<Double> thanNhiet= new ArrayList<>();
        thanNhiet.add(35.6);
        thanNhiet.add(40.2);
        thanNhiet.add(37.0);
        thanNhiet.add(12.5);
        thanNhiet.add(39.8);
        thanNhiet.add(99.9);
        thanNhiet.add(36.8);
        System.out.println("Danh sach ban dau: " + thanNhiet);
        Iterator<Double> iterator = thanNhiet.iterator();
        while (iterator.hasNext()){
            double temp = iterator.next();
            if (temp > 42.0 || temp < 34.0){
                iterator.remove();
            }
        }
        System.out.println("Danh sach sau khi loc: "+ thanNhiet);
        double sum  = 0 ;
        for (Double tn : thanNhiet){
            sum+= tn;
        }
         double nhietDoTrungBinh = sum/ thanNhiet.size();
        System.out.println("Nhiet do trung binh: "+ nhietDoTrungBinh);
    }
}
