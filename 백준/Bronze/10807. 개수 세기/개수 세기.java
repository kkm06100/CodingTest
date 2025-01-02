import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String[] input = br.readLine().split(" ");
        int [] arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(input[i]);
        }
        int v = Integer.parseInt(br.readLine());
        int count = 0;
        for(int i = 0;i < N; i++){
            if(arr[i] == v){
                count++;
            }
        }
        System.out.println(count);
    }
}