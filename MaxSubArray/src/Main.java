public class Main {

    public static void main(String[] args) {
        int[] A = {1, -2, 5, -3, 4, 5};
        int[] result = FMSA(A, 0, A.length - 1);
        System.out.println("Maximum subarray found between indexes " + result[0] + " and " + result[1] + " with a sum of " + result[2]);
    }

    public static int[] FMSA(int[] A, int low, int high) {
        if (low == high) {
            return new int[]{low, high, A[low]};
        } else {
            int mid = (low + high) / 2;
            int[] left = FMSA(A, low, mid);
            int[] right = FMSA(A, mid + 1, high);
            int[] cross = FMCSA(A, low, mid, high);
            if (left[2] >= right[2] && left[2] >= cross[2]) {
                return left;
            } else if (right[2] > left[2] && right[2] >= cross[2]) {
                return right;
            } else {
                return cross;
            }
        }
    }

    public static int[] FMCSA(int[] A, int low, int mid, int high) {
        int leftSum = Integer.MIN_VALUE;
        int sum = 0;
        int maxLeft = -1;
        for (int i = mid; i >= low; i--) {
            sum = sum + A[i];
            if (sum > leftSum) {
                leftSum = sum;
                maxLeft = i;
            }
        }
        int rightSum = Integer.MIN_VALUE;
        sum = 0;
        int maxRight = -1;
        for (int j = mid + 1; j <= high; j++) {
            sum = sum + A[j];
            if (sum > rightSum) {
                rightSum = sum;
                maxRight = j;
            }
        }
        return new int[]{maxLeft, maxRight, leftSum + rightSum};
    }
}