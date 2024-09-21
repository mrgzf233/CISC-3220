import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] A = {2, 8, 4, 3, 1, 6, 3};
        System.out.println("Array before sorting: " + Arrays.toString(A));


        insertionSort(A);
        System.out.println("Array after sorting: " + Arrays.toString(A));
    }

    public static void insertionSort(int[] A) { // j = key
        for (int j = 1; j < A.length; j++) {
            int key = A[j]; // placeholder, sends it out the array
            int i = j - 1;
            while (i >= 0 && A[i] < key) {
                A[i + 1] = A[i];
                i = i - 1;
            }
            A[i + 1] = key; // exits while loop
        } // end of for loop

    }
}