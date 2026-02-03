package recursion;

import java.util.Scanner;

public class reversingelements {
    public static void main(String[] args) {
     int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++)
            arr[i]=sc.nextInt();
         sw(0,arr,n);

        for(int i = 0;i<n;i++) System.out.println(arr[i]);
    }
    public static void sw(int i, int [] arr,int n) {
   if(i>=n/2) return;
      int temp= arr[i];
      arr[i] = arr[n-i-1];
      arr[n-i-1] = temp;
      sw(i+1,arr,n);

    }
}
