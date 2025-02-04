import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] A = {2, 8, 4, 3, 1, 6, 3};
        System.out.println("Array before sorting: " + Arrays.toString(A));


        insertionSort(A);
        System.out.println("Array after sorting: " + Arrays.toString(A));
    }

    public static void insertionSort(int[] A) { // j = key
        for (int i = 1; i < A.length; i++) {
            int keyValue = A[i]; // placeholder, sends it out the array
            
            int j = i - 1;
            while (j >= 0 && A[j] > key) {
                A[j + 1] = A[j];
                j--;;
            }
            A[j + 1] = keyValue; // exits while loop
        } // end of for loop

    }
}
