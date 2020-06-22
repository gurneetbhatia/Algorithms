import java.util.Arrays;

public class BubbleSort 
{
    public static void main(String [] args) {
        int[] arr = new int[]{9, 8, 7, 6, 5, 5, 4, 3, 2, 1, 0};
        
        int counter = 1;
        for(int i=0;i<arr.length-1;i++) {
            for(int j=0;j<arr.length-counter;j++) {
                if(arr[j+1] < arr[j])
                    arr = swap(arr, j, j+1);
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