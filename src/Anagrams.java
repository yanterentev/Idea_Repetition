import java.util.Scanner;

public class Anagrams {

    private static boolean isAnagram(String a, String b) {
        int arr[] = new int[256];

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
