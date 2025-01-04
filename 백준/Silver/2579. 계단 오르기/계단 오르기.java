import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] stair = new int[N];
        for(int i = 0; i < N; i++){
            stair[i] = Integer.parseInt(br.readLine());
        }
        int[] dp = new int[N];
        dp[0] = stair[0];
        if(N == 1){
            System.out.println(dp[0]);
            return;
        }
        dp[1] = Math.max(stair[0] + stair[1], stair[1]);
        if(N == 2){
            System.out.println(dp[1]);
            return;
        }
        dp[2] = Math.max(stair[0] + stair[2], stair[1] + stair[2]);
        
        for (int i = 3; i < N; i++) {
            dp[i] = Math.max(dp[i - 2] + stair[i], stair[i - 1] + stair[i] + dp[i - 3]);
        }

        System.out.println(dp[N-1]);
    }
}