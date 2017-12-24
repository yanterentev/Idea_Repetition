import java.util.Scanner;

public class Java_Loops2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int res1 = a + b;
            System.out.print(res1 + " ");
            for(int j = 1; j < n; j++) {
                int res = 1;
                for(int q = 0; q < j; q++) {
                    res *= 2;
                }
                res1 += b * res;
                System.out.print(res1 + " ");
            }
            System.out.println();
        }
    }
}