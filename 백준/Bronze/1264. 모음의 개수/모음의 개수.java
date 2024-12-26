import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char [] vowel = {'a', 'e', 'i', 'o', 'u','A','E','I','O','U'};
        while (true) {
            int count = 0;
            String line = br.readLine();
            if(line.charAt(0) == '#'){
                break;
            }
            for(int i = 0 ; i < line.length(); i++){
                for(int j = 0; j < vowel.length; j++){
                    if(line.charAt(i) == vowel[j]){
                        count++;
                    }
                }
            }
            bw.write(count + "\n");
        }
        bw.flush();
        bw.close();
    }
}