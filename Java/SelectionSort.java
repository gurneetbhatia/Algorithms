import java.util.Arrays;

public class SelectionSort
{
    public static void main(String [] args) {
        int[] arr = new int[]{2, 8, 5, 3, 9, 4, 1};

        for(int i=0; i<arr.length;i++) {
            // i refers to the current index of the minimum known element
            for(int j=i+1;j<arr.length;j++) {
                // j refers to the index of the element we are currently comparing the known min to
                if(arr[j] < arr[i])
                    arr = swap(arr, i, j);
            }
        }
        
        System.out.println(Arrays.toString(arr));
    }

    public static int[] swap(int[] arr, int idx0, int idx1) {
        int temp = arr[idx0];
        arr[idx0] = arr[idx1];
        arr[idx1] = temp;

        return arr;
    }
}
