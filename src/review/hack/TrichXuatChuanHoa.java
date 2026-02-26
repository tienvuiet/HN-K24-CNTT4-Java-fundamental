package review.hack;

public class TrichXuatChuanHoa {
    static void main(String[] args) {
        String input = "123nguyen!! @van23 bA";
        String cleaned = input.replaceAll("[^a-zA-Z]"," ");
        String words[] = cleaned.trim().split("\\s+");
        StringBuilder result = new StringBuilder();
        for (String word : words){
            if(!word.isEmpty()){
                String formatted = word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase();
                result.append(formatted).append(" ");
            }
        }
        System.out.println(result.toString().trim());
    }
}
