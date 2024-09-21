import java.util.Arrays;
import java.util.Random;

public class HiringProblem {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 1; i <= 5; i++) { // running it 5 times
            int[] A = new int[5];
            int total = 0;
            int best = Integer.MIN_VALUE;
            int interviewCost = 1; // always 1 dollar to interview

            for (int j = 0; j < A.length; j++) { //  values between 0-100, shows the lists and people
                A[j] = random.nextInt(101);
            }
            System.out.println(i + "st time running, Among the candidates:" + Arrays.toString(A));

            for (int j = 0; j < A.length; j++) {
                if (j == 0 || A[j] > best) {
                    int hiringCost;
                    if (j == 0) { // if it's the first person
                        hiringCost = A[j];
                    } else { // the cost difference
                        hiringCost = A[j] - best;
                    }
                    best = A[j];
                    total += hiringCost + interviewCost;
                    System.out.println("Candidate " + (j + 1) + " is hired, Hiring cost: $" + hiringCost + ", Interview cost: $" + interviewCost);
                } else {
                    total += interviewCost; // Only pay the interview cost if not hiring
                }
            }
            System.out.println("Total cost for this simulation: $" + total);
            System.out.println();
        }
    }
}