package review.hack;

public class Chen {
    static void main(String[] args) {
        int[] arr = {1,3,5,7};
        int x = 4;
        int k = 2;
        int n = arr.length;
        int[] arrNew = new int[n+1];
        for(int i = 0 ; i< k; i++){
            arrNew[i] = arr[i];
        }
        arrNew[k] = x;

        for(int i = k ; i < n; i++){
            arrNew[i+1] = arr[i];
        }
        for(int num: arrNew){
            System.out.println(num + " ");
        }

    }
}
