package session03.xuatsac2;

public class xuatsac2 {
    public static int[] mergeBooks(int[] a, int[] b) {
        int[] temp = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            int value;
            if (a[i] < b[j]) {
                value = a[i];
                i++;
            } else if (a[i] > b[j]) {
                value = b[j];
                j++;
            } else {
                value = a[i];
                i++;
                j++;
            }
            if (k == 0 || temp[k - 1] != value) {
                temp[k] = value;
                k++;
            }
        }
        while (i < a.length) {
            if (k == 0 || temp[k - 1] != a[i]) {
                temp[k++] = a[i];
            }
            i++;
        }
        while (j < b.length) {
            if (k == 0 || temp[k - 1] != b[j]) {
                temp[k++] = b[j];
            }
            j++;
        }
        int[] result = new int[k];
        for (int x = 0; x < k; x++) {
            result[x] = temp[x];
        }
        return result;
    }
    public static void displayBooks(int[] arr) {
        System.out.print("Danh sach sach hoan chinh: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arrayFirst  = {1, 3, 5, 7};
        int[] arraySecond = {2, 3, 6, 7, 8};
        int[] arrayMerge = mergeBooks(arrayFirst, arraySecond);
        displayBooks(arrayMerge);
    }
}
