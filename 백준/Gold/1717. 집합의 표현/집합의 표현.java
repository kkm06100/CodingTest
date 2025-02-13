import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    static int[] arr;
    static int[] rank;
    
    public static int find(int x){
        if(arr[x] == x){
            return x;
        }else{
            return arr[x] = find(arr[x]);
        }
    }
    public static void union(int x, int y){
        x = find(x);
        y = find(y);
        // 더 작은 쪽이 큰쪽으로
        if(rank[x] < rank[y]){
            arr[x] = y;
        }else{
            arr[y] = x;
            if(rank[x] == rank[y]){
                rank[x]++;
            }
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] get = br.readLine().split(" ");

        int N = Integer.parseInt(get[0]);
        int M = Integer.parseInt(get[1]);

        arr = new int[N+1];
        rank = new int[N+1];
        
        for(int i = 0; i <= N; i++){
            arr[i] = i;
        }
        for(int i = 0; i < M; i++){
            String[] input = br.readLine().split(" ");
            int order = Integer.parseInt(input[0]);
            int a = Integer.parseInt(input[1]);
            int b = Integer.parseInt(input[2]);

            if(order == 0){
                union(a,b);
            }
            else if(order == 1){
                if(find(a) == find(b)){
                    bw.write("YES\n");
                }else{
                    bw.write("NO\n");
                }
            }
        }
        bw.flush();
        bw.close();
    }
}