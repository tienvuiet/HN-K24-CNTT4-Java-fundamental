package session13.Gioi1;

import java.util.ArrayList;
import java.util.List;

public class Gioi1 {
    public static <T> List<T> benhNhanTrung(List<T> ListA, List<T> ListB){
        List<T> result = new ArrayList<>();
        for(T item: ListA){
            if(ListB.contains(item)){
                result.add(item);
            }
        }
        return result;
    };
    static void main(String[] args) {
       List<Integer> list1 = List.of(101,102,105);
       List<Integer> list2 = List.of(102,105,108);
       List<Integer> result1 = benhNhanTrung(list1,list2);
        System.out.println("Ket qua so: "+ result1);
       List<String> list3 = List.of("DN01", "DN02", "DN03");
       List<String> list4 = List.of("DN02", "DN04");
       List<String> result2 = benhNhanTrung(list4, list3);
        System.out.println("Ket qua String: "+ result2);
    }
}
