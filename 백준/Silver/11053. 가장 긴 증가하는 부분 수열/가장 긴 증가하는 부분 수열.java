import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		int[] dp = new int[n];
		int length = 0;
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			int ele = Integer.parseInt(st.nextToken());
			arr[i] = ele;
			
			dp[i] = 1;
			for(int j = 0; j < i; j++) {
				if(arr[j] < ele) {
					dp[i] = Math.max(dp[j] + 1, dp[i]);
				}
			}
			
			length = Math.max(length, dp[i]);
		}
		
		System.out.println(length);
		br.close();
	}
}
