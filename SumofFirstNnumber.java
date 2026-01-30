package recursion;

import java.util.Scanner;
/** Parameterized way */
//public class SumofFirstNnumber {
//    static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        print(n, 0);
//
//    }
//    public static void print(int i ,int sum) {
//        if (i < 1){ System.out.println(sum);
//        return;
//    }
//     print(i-1,sum+i);
//    }

    /** functional way */
    public class SumofFirstNnumber {
        static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            System.out.println(print(n));

        }
        public static int print(int sum) {
            if (sum == 0) return 0;
            return sum+print(sum-1);

        }

}
