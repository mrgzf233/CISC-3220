import java.io.*;

public class HeapSort {
    public static void main(String args[]) {
        int A[] = {3, 6, 1, 8, 12, 4, 7};
        System.out.println("Unsorted:");
        printArray(A);
        HeapSort hs = new HeapSort();
        hs.sort(A);
        System.out.println("Sorted:");
        printArray(A);
    }
    public static void printArray(int A[]) {
        for (int i = 0; i < A.length; ++i)
            System.out.print(A[i] + " ");
        System.out.println();
    }
    public void sort(int A[]) {
        int n = A.length;
        // Build max heap
        for (int i = n / 2 - 1; i >= 0; i--)
            maxHeapify(A, n, i);

        for (int i = n - 1; i >= 0; i--) {
            int temp = A[0];
            A[0] = A[i];
            A[i] = temp;
            maxHeapify(A, i, 0);
        }
    }
    public static void maxHeapify(int A[], int n, int i) {
        int largest = i;
        int left = 2 * i + 1; // left = 2*i + 1
        int right = 2 * i + 2; // right = 2*i + 2

        // If left child is larger than root
        if (left < n && A[left] > A[largest])
            largest = left;

        // If right child is larger than largest so far
        if (right < n && A[right] > A[largest])
            largest = right;

        // If largest is not root
        if (largest != i) {
            int swap = A[i];
            A[i] = A[largest];
            A[largest] = swap;

            maxHeapify(A, n, largest);
        }
    }
}