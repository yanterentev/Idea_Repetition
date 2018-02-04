import java.util.Scanner;

public class Substring_compare {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);
        for(int i = 1; i < s.length() - k + 1; i++) {
            if(smallest.compareTo(s.substring(i, k + i)) > 0) {
                smallest = s.substring(i, k + i);
            }
        }
        for(int i = 1; i < s.length() - k + 1; i++) {
            if(largest.compareTo(s.substring(i, k + i)) < 0) {
                largest = s.substring(i, k + i);
            }
        }
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
