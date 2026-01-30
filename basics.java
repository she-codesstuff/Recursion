package recursion;

public class basics {
    public static void main(String[] args) {
     print(0);
    }

    public static void print(int cnt) {
if(cnt == 3 ) return; // Base condition
System.out.println(cnt);

        print(cnt+1);
        /** stack overflow/stack space =  Base condition is missing, OR
        Recursive call never moves toward base condition */
        /* recurion tree = calling function diagram */
        // the condition used to stop is the base condition
    }
}
