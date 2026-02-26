package review.hack;

public class ThuGon {
    static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 2};
        int n = arr.length;
        int newSize = 0;
        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < newSize; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                arr[newSize] = arr[i];
                newSize++;
            }
        }
        for (int i = 0; i < newSize; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nKich thuoc moi: " + newSize);
    }
}
