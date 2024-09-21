public class Birthday {
    /*
    Write a piece of code that finds out at least how many individuals in a group are needed
     so that the probability of two people's sharing the same birthday is more than 69%.

     */
    public static void main(String[] args) {
        double percent = 0.25; // what we want
        double unique = 1.0; // unique birthdays
        int n = 0; // # of people

        while (unique > (1 - percent)) { // 1>0.31
            n++;
            unique = unique * (365.0 -n + 1) / 365.0;
        }
        System.out.println("The minimum number of people: " + n);
    }
}