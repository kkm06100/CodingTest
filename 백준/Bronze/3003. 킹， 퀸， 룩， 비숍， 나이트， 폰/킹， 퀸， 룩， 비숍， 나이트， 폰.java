import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String [] input = br.readLine().split(" ");
        int [] num = new int[input.length];

        int [] need = new int[input.length];
        need[0] = 1;
        need[1] = 1;
        need[2] = 2;
        need[3] = 2;
        need[4] = 2;
        need[5] = 8;
        
        for(int i = 0; i < input.length; i++){
            num[i] = Integer.parseInt(input[i]);
            need[i] -= num[i];
            bw.write(need[i] + " ");
        }
        bw.flush();
        bw.close();
    }
}