import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String [] input = br.readLine().split(" ");
        int [] sit = new int[101];
        int count = 0;
        
        for(int i = 0; i < N; i++){
            int order = Integer.parseInt(input[i]);
            if(sit[order] == 1){
                count++;
            }else{
                sit[order] = 1;
            }
        }

        System.out.println(count);
    }
}