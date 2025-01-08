import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        for(int i = 0; i < N; i++){
            String s = br.readLine();
            int[] arr = new int[26];
            int now = 0;
            int ex = 0;
            for(int j = 0; j < s.length(); j++){
                now = s.charAt(j) - 97;
                if(arr[now] != 0 && now != ex){ // 현재 != 0 현재 != 전
                    arr[0] = 126;
                    break;
                }else{
                    arr[now] ++;
                }
                ex = now;
            }
            if(arr[0] != 126){
                count++;
            }
            
        }
        System.out.println(count);
    }
}