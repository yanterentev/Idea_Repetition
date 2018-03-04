import java.util.Scanner;

public class String_Tokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s = s.trim();
        if(s.equals("")) {
            System.out.println("0");
            return;
        }
        String[] res = s.split("[^a-zA-Z]+");
        System.out.println(res.length);
        for (String re : res) {
            System.out.println(re);
        }
        scan.close();
    }
}