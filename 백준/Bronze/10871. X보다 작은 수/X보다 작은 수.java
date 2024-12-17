import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int X = Integer.parseInt(input[1]);

        String [] arr = br.readLine().split(" ");

        for(int i = 0; i < N; i++){
            if(Integer.parseInt(arr[i]) < X){
                bw.write(arr[i] + " ");
            }
        }
        bw.flush();
        bw.close();
    }
}