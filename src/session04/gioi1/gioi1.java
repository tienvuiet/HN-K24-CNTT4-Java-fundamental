package session04.gioi1;

import java.time.LocalDateTime;

public class gioi1 {
    public static String chuyenHoa(String[] arr){
        StringBuilder sb = new StringBuilder();
        sb.append("Thoi gian tao bao cao: ")
                .append(LocalDateTime.now())
                .append("\n");
        for(String a: arr){
            sb.append("Giao dich: ")
                    .append(a)
                    .append("\n");
        }
        return sb.toString();
    }

    public static String chuyenHoaString(String[] arr){
        String s = "";
        s += "Thoi gian tao bao cao: " + LocalDateTime.now() + "\n";

        for(String a : arr){
            s += "Giao dich: " + a + "\n";
        }
        return s;
    }

    static void main(String[] args) {
        String[] transactions = {"BK001-20/01","BK005-21/01","BK099-22/01"};
        long start1 = System.nanoTime();
        String r1 = chuyenHoa(transactions);
        long end1 = System.nanoTime();

        long start2 = System.nanoTime();
        String r2 = chuyenHoaString(transactions);
        long end2 = System.nanoTime();

        System.out.printf("%s", r1);
        System.out.println("StringBuilder: " + (end1 - start1) + " ns");
        System.out.println("String:        " + (end2 - start2) + " ns");
    }
}
