import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n == 1){
            System.out.println(1);
            return;
        }
        int[] dp = new int[n+1];

        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2; i <= n; i++){
            dp[i] = (dp[i-2]*2 + dp[i-1])%10007;
        }
        System.out.println(dp[n]);
    }
}