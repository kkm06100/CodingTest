import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = scanner.nextInt();

        for(int i = 0; i < N; i++){
            for(int j = 0; j < i; j++){
                bw.write(" ");
            }
            for(int j = N; j > i; j --){
                bw.write("*");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
        
    }
}