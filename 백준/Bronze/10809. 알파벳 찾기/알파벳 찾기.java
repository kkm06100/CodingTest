import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String S = sc.nextLine();

        int[] arr = new int[26];
        Arrays.fill(arr, -1);
        for(int i = 0; i < S.length(); i++){
            int c = S.charAt(i) - 97;
            if(arr[c] == -1){
               arr[c] = i;
            }
        }
        for(int i = 0; i < 26; i++){
            bw.write(arr[i] + " ");
        }
        bw.flush();
        bw.close();
    }
}