package session13.Kha2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Kha2 {
    public static  List<String> locVaXapXep(List<String> input){
        List<String> result = new ArrayList<>();
        for(String thuoc: input ){
            if(!result.contains(thuoc)){
                result.add(thuoc);
            }
        }
        result.sort(null);
        return result;
    };
    static void main(String[] args) {
        List<String> loaiThuoc = new ArrayList<>();
        loaiThuoc.add("Paracetamol");
        loaiThuoc.add( "Ibuprofen");
        loaiThuoc.add("Panadol");
        loaiThuoc.add( "Paracetamol");
        loaiThuoc.add("Aspirin");
        loaiThuoc.add("Ibuprofen");
        System.out.println("Input "+ loaiThuoc);
        List<String> result = locVaXapXep(loaiThuoc);
        System.out.println("Output "+ result);

    }
}
