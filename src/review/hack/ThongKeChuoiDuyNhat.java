package review.hack;

public class ThongKeChuoiDuyNhat {
    static void main(String[] args) {
        String chuoi = "statistics";
        for(int i = 0 ; i< chuoi.length(); i++){
            char ch = chuoi.charAt(i);
            int count = 0;
            for(int j = 0 ; j < chuoi.length(); j++){
                if(chuoi.charAt(j) == ch){
                    count++;
                }
            }
            if(count == 1){
                System.out.println(ch +" ");
            }
        }
    }
}
