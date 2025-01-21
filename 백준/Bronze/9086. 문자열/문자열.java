import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.*;
 
public class Main {
 
	public static void main(String[] args) throws IOException{
		Scanner scanner = new Scanner(System.in);
         BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = scanner.nextInt();
        String[] str = new String[N];
        for(int i = 0; i < N; i++){
            str[i] = scanner.next();
            bw.write(""+str[i].charAt(0) + str[i].charAt(str[i].length()-1)+"\n");
        }
        bw.flush();
        bw.close();
	}
 
}