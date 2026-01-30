package recursion;

import java.util.Scanner;

public class PrintNameNTimes {
    /*** first method */
//    public static void main(String[] args) {
//          Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the value of n");
//          int n = sc.nextInt();
//          print(n);
//    }
//    public static void print(int n) {
//      if(n==0) return;
//            System.out.println("geetha");
//
//        print(n-1);
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        print(1,n);
    }

    static void print(int i , int n) {
        if(i>n) return;
        System.out.println("geetha");
        print(1,n-1);

    }
}
