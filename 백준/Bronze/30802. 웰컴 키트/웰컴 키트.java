import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int countT = 0;
        int[] tshirts = new int[6];
        int N = Integer.parseInt(bf.readLine());

        String[] data = bf.readLine().split(" ");
        
        String[] countData = bf.readLine().split(" ");

        int T = Integer.parseInt(countData[0]);
        int P = Integer.parseInt(countData[1]);
        
        for(int i = 0; i < 6; i ++){
            tshirts[i] = Integer.parseInt(data[i]);
            countT += (tshirts[i] + T - 1) / T;
        }

        bw.write(countT + "\n");
        bw.write(N/P + " " + N % P);

        bw.flush();
    }
}