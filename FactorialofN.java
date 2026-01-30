package recursion;

import java.util.Scanner;

public class FactorialofN {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(print(n));
    }

    public static int print(int mul) {
        if (mul ==0) return 1;
        return mul * print(mul - 1);
    }
}
