import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(scanner.nextLine());
        String[] arr = new String[N];

        for(int i = 0; i < N; i++){
            arr[i] = scanner.nextLine();
        }
        Arrays.sort(arr,(s1, s2)->{
            if(s1.length() == s2.length()){
                return s1.compareTo(s2);
            }
            return s1.length() - s2.length();
        });
        bw.write(arr[0]+"\n");
        for(int i = 1; i < N; i++){
            if(!arr[i].equals(arr[i-1])){
                bw.write(arr[i]+"\n");
            }
        }
        bw.flush();
        bw.close();
    }
}