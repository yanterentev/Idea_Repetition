import java.util.Scanner;

public class Anagrams {

    private static boolean isAnagram(String a, String b) {
        int arr[] = new int[256];
        a = a.toLowerCase();
        b = b.toLowerCase();
        for(int i = 0; i < a.length(); i++) {
            arr[a.charAt(i)]++;
        }
        for(int i = 0; i < b.length(); i++) {
            arr[b.charAt(i)]--;
        }
        for(int i = 0; i < 256; i++) {
            if(arr[i] != 0) {
                return false;
            }
        }
        return true;
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
