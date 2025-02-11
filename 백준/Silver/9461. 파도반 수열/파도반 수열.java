import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long[] dp = new long[101];
        int T = scanner.nextInt();

        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 1;
        for(int i = 4; i <= 100; i++){
            dp[i] = dp[i-2] + dp[i-3];
        }
        for(int i = 0; i < T; i++){
            bw.write(dp[scanner.nextInt()]+"\n");
        }
        bw.flush();
        bw.close();
    }
}