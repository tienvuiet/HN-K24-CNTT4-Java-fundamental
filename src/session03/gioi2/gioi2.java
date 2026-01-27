package session03.gioi2;

public class gioi2 {

    public static void sortBooks(int[] arr){
        int n = arr.length;
        boolean flag;
        for(int i =0 ; i< n-1; i++){
            flag = false;
            for(int j = 0 ; j< n-1-i; j++ ){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if(!flag){
                break;
            }
        }
    }

    public static void displayBooks(int[] arr){
        for (int i = 0 ; i< arr.length; i++){
            System.out.print(arr[i]);
            if(i< arr.length -1){
                System.out.print(", ");
            }
        }
    }

    static void main(String[] args) {
        int[] idBooks = {5, 2, 9, 1, 3};
        System.out.printf("Truoc khi xap xep: \n");
        displayBooks(idBooks);
        sortBooks(idBooks);
        System.out.printf("\nSau khi xap xep: \n");
        displayBooks(idBooks);


    }
}
