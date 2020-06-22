import java.util.Arrays;

public class MergeSort
{
    public static void main(String [] args) {
        MergeSort m = new MergeSort();
        int [] arr = new int[]{9, 8, 7, 6, 5, 5, 4, 3, 2, 1, 0};
        System.out.println(Arrays.toString(m.mergesort(arr)));
    }

    public int[] mergesort(int[] arr) {
        if(arr.length == 1)
            return arr;

        int mid = (int) arr.length/2;
        int[] arrayOne = Arrays.copyOfRange(arr, 0, mid);
        int[] arrayTwo = Arrays.copyOfRange(arr, mid, arr.length);

        arrayOne = mergesort(arrayOne);
        arrayTwo = mergesort(arrayTwo);

        return merge(arrayOne, arrayTwo);
    }

    public int[] merge(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        int counter = 0, a_counter = 0, b_counter = 0;
        while(a_counter < a.length && b_counter < b.length) { 
            if(a[a_counter] < b[b_counter]) {
                c[counter] = a[a_counter];
                a_counter += 1;
            } else {
                c[counter] = b[b_counter];
                b_counter += 1;
            }
            counter += 1;
        }

        while(a_counter < a.length) {
            c[counter] = a[a_counter];
            a_counter += 1;
            counter += 1;
        }

        while(b_counter < b.length) {
            c[counter] = b[b_counter];
            b_counter += 1;
            counter += 1;
        }

        return c;
    }
}