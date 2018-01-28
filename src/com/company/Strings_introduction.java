package com.company;

import java.util.Scanner;

public class Strings_introduction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int res = A.length() + B.length();
        System.out.println(res);
        if(A.compareTo(B) <= 0) {
            System.out.println("No");
        }
        else {
            System.out.println("Yes");
        }

        final String newA = A.substring(0, 1).toUpperCase() + A.substring(1);
        final String newB = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.print(newA + " ");
        System.out.print(newB);
    }
}
