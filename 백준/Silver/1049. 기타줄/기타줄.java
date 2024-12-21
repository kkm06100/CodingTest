import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] input = br.readLine().split(" ");
        // 끊어진 기타줄의 개수
        int N = Integer.parseInt(input[0]);
        // 기타줄 브랜드 개수
        int M = Integer.parseInt(input[1]);

        int min6 = 500000;
        int min1 = 500000;
        for(int i = 0; i < M; i++){
            String[] guitarString = br.readLine().split(" ");
            int packageId = Integer.parseInt(guitarString[0]);
            int each = Integer.parseInt(guitarString[1]);

            if(packageId < min6){
                min6 = packageId;
            }
            if(each < min1){
                min1 = each;
            }
        }
        if((6*min1) <= min6){
            System.out.println(N*min1);
        }else{
            System.out.println((N/6 * min6 + N % 6 * min1 < N/6 * min6 + min6)? N/6 * min6 + N % 6 * min1 :  N/6 * min6 + min6);
        }
    }
}