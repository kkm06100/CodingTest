import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
/*
0: x -> 1
1: 1 -> 1
2: 1,1 2 -> 2
3: 1,1,1 1,2 2,1 3 -> 4
4 -> 7
5 -> 13
*/
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int [] dp = new int[12];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;

        for(int i = 3; i < 12; i++){
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
        }

        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++){
            bw.write(dp[Integer.parseInt(br.readLine())]+"\n");
        }
        bw.flush();
        bw.close();
    }
}