import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Integer N = Integer.parseInt(br.readLine());
        int[][] coordinate = new int[N][2];
        
        for(int i = 0; i < N; i++){
            String[] input = br.readLine().split(" ");
            coordinate[i][0] = Integer.parseInt(input[0]);
            coordinate[i][1] = Integer.parseInt(input[1]);
        }
        Arrays.sort(coordinate, (e1, e2) ->{
            if(e1[0] == e2[0]){
                return e1[1] - e2[1];
            }else{
                return e1[0] - e2[0];
            }
        });

        for(int i = 0; i < N; i++){
            bw.write(coordinate[i][0] + " " + coordinate[i][1] + "\n");
        }
        bw.flush();
        bw.close();
    }
        
}