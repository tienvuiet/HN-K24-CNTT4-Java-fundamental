package session14.Gioi2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Gioi2 {
    static void main(String[] args) {
        List<String> cacCaBenh = new ArrayList<>(List.of("Cum A", "Sot xuat huyet", "Cum A", "Covid-19", "Cum A", "Sot xuat huyet"));
        TreeMap<String, Integer> thongKe = new TreeMap<>();
        for(String benh: cacCaBenh){
            if (thongKe.containsKey(benh)){
                thongKe.put(benh, thongKe.get(benh)+1);
            }else{
                thongKe.put(benh, 1);
            }
        }
        System.out.println("Bao cao: ");
        for(Map.Entry<String, Integer> entry : thongKe.entrySet()){
            System.out.println(entry.getKey()+ ": "+ entry.getValue());
        }

    }
}
