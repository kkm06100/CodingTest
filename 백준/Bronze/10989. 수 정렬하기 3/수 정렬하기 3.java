import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        try {
            int N = Integer.parseInt(br.readLine()); // 예외 발생 가능
            int[] arr = new int[N];
            
            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(br.readLine()); // 예외 발생 가능
            }

            Arrays.sort(arr); // 정렬

            for (int i = 0; i < N; i++) {
                bw.write(arr[i] + "\n"); // 예외 발생 가능
            }
            bw.flush(); // 예외 발생 가능
        } catch (IOException e) {
            e.printStackTrace(); // 예외 처리
        }
    }
}
