package session14.XuatSac1;

import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    static void main(String[] args) {
        TreeSet<Patient> queue = new TreeSet<>(
                Comparator.comparingInt((Patient p) -> p.severity)
                        .thenComparingInt((Patient p) -> p.arrivalTime)
        );
        queue.add(new Patient(3, "Benh nhan A", 800));
        queue.add(new Patient(1, "Benh nhan B", 815));
        queue.add(new Patient(1, "Benh nhan C", 805));
        System.out.println("Thu tu");
        queue.forEach(System.out::println);
    }
}
