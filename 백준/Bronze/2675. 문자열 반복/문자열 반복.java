import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = scanner.nextInt();
        for(int i = 0; i < T; i++){
            int roop = scanner.nextInt();
            String str = scanner.next();

            for(int j = 0; j < str.length(); j++){
                for(int k = 0; k < roop; k++){
                    bw.write(""+str.charAt(j));
                }
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}