import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int first = 1;
        int second = 1;
        
        while(true){
            String [] input = br.readLine().split(" ");
            first = Integer.parseInt(input[0]);
            second = Integer.parseInt(input[1]);

            if(first == 0 && second == 0){
                break;
            }

            if(first>second){
                bw.write("Yes\n");
            }else{
                bw.write("No\n");
            }
            
        }
        bw.flush();
        bw.close();
    }
}