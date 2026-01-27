package session03.gioi1;

public class gioi1 {
    static void main(String[] args) {
        String[] names = {
                "one piece",
                "Java",
                "C++",
                "Tien"
        };
        int[] quantities = {4, 2, 3,4};
        maxQuantityOfBooks(names, quantities);
        minQuantityOfBooks(names, quantities);
    }
    public static  void maxQuantityOfBooks(String[] names, int[] quantities){
        int max = quantities[0];
        for(int i = 0; i< quantities.length; i++){
            if (quantities[i]  > max ){
                max = quantities[i];
            }
        }
        System.out.printf("Sach co so luong nhieu nhat (%d): \n", max);
        for(int i = 0; i< quantities.length; i++){
            if(quantities[i] == max){
                System.out.printf("- %s\n", names[i]);
            }
        }
    }
    public static void minQuantityOfBooks(String[] names, int[] quantities){
        int min  = quantities[0];
        for(int i =0 ; i< quantities.length; i++){
            if(quantities[i] < min){
                min = quantities[i];
            }
        }
        System.out.printf("Sach co so luong it nhat (%d): \n", min);
        for(int i = 0; i< quantities.length; i++){
            if(quantities[i] == min){
                System.out.printf("- %s\n", names[i]);
            }
        }
    }
}
