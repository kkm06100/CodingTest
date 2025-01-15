import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Set<Integer> numbers = new HashSet<>();
        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++){
            numbers.add(Integer.parseInt(br.readLine()));
        }
        List<Integer> tempNumbers = new ArrayList<>(numbers);
        Collections.sort(tempNumbers);
        for(Integer number:tempNumbers){
            bw.write(number + "\n");
        }
        bw.flush();
        bw.close();
    }
}