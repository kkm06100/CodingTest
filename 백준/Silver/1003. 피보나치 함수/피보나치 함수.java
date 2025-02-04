import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] zero = new int[41];
        int[] one = new int[41];
        zero[0] = 1;
        one[1] = 1;
        for(int i = 2; i <= 40; i++){
            zero[i] = zero[i-1]+zero[i-2];
            one[i] = one[i-1]+one[i-2];
        }
        int N = scanner.nextInt();
        for(int i = 0; i < N; i++){
            int n = scanner.nextInt();
            bw.write(""+zero[n]+" "+one[n]+"\n");
        }
        bw.flush();
        bw.close();
    }
}