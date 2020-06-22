import java.util.Arrays;

public class InsertionSort
{
    public static void main(String [] args) {
        int[] arr = new int[]{9, 8, 7, 6, 5, 5, 4, 3, 2, 1, 0};
        
        for(int i=1;i<arr.length;i++) {
            int j = i;
            while(j > 0 && arr[j-1] > arr[j]) {
                arr = swap(arr, j, j-1);
                j -= 1;
            }
        }
        
        System.out.println(Arrays.toString(arr));
    }
    
    public static int[] swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
    }
}