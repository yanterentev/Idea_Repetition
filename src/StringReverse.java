import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        String A = sc.next();
        int i = 0;
        while(i != (A.length() / 2)) {
            if(A.charAt(i) == A.charAt(A.length() - 1 - i)) {
                i++;
            }
            else {
                System.out.println("No");
                break;
            }
        }
        if(i == A.length() / 2) {
            System.out.println("Yes");
        }
    }
}
