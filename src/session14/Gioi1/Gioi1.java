package session14.Gioi1;

import java.util.HashSet;
import java.util.Set;

public class Gioi1 {
    static void main(String[] args) {
        Set<String> setA = new HashSet<>( Set.of("Aspirin", "Caffeine", "Paracetamol"));
        Set<String> setB = new HashSet<>(Set.of("Penicillin", "Aspirin"));

        Set<String> canhBao = new HashSet<>(setA);
        canhBao.retainAll(setB);
        System.out.println("Canh bao di ung: "+  canhBao);

        Set<String> anToan = new HashSet<>(setA);
        anToan.removeAll(setB);
        System.out.println("Thanh phan an toan: "+ anToan);
    }
}
