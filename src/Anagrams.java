import java.util.Scanner;

public class Anagrams {

    private static boolean isAnagram(String a, String b) {
        if(a.length() != b.length()) {
            return false;
        }
        int size = a.length();
        int size1 = size;
        int size2 = size;
        int arr1[] = new int[size1];
        int arr2[] = new int[size2];
        int i = 0, curr1 = 0, curr2 = 0;
        while(i != size || size1 > 0 || size2 > 0) {
            int counter1 = 1;
            int counter2 = 1;
            for(int j = i + 1; j < size1; j++) {
                if (a.substring(i, i).toUpperCase().equals(a.substring(j, j).toUpperCase())) {
                    counter1++;
                    a = a.substring(0, j - 1) + a.substring(j + 1, size);
                }
            }
            for(int q = i + 1; q < size2; q++) {
                if(b.substring(i, i).toUpperCase().equals(b.substring(q, q).toUpperCase())) {
                    counter2++;
                    b = b.substring(0, q - 1) + b.substring(q + 1, size);
                }
            }
            arr1[i] = counter1;
            curr1++;
            arr2[i] = counter2;
            curr2++;
            size1 -= counter1;
            size2 -= counter2;
            a = a.substring(i + 1, size1);
            b = b.substring(i + 1, size2);
            i++;
        }
        if(curr1 != curr2) {
            return false;
        }
        else {
            for(int i1 = 0; i1 < curr1; i1++) {
                for(int j = i1 + 1; j < curr1; j++) {
                    if(arr1[i1] > arr1[j]) {
                        int temp = arr1[i];
                        arr1[i] = arr1[j];
                        arr1[j] = temp;
                    }
                    if(arr2[i1] > arr2[j]) {
                        int temp = arr2[i];
                        arr2[i] = arr2[j];
                        arr2[j] = temp;
                    }
                }
            }
            for(int i1 = 0; i1 < curr1; curr1++) {
                if(arr1[i] != arr2[i]) {
                    return false;
                }
            }
            return true;
        }
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
