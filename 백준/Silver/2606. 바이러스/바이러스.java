import java.util.*;
import java.io.*;

class Main {
    static int count = 0;
    static int computers;
    static int[][] arr;

    public static void DFS(int virus, boolean[] visited){
        visited[virus] = true;

        for(int i = 1; i <= computers; i++){
            if(arr[virus][i] == 1 && !visited[i]){
                count++;
                DFS(i, visited);
            }
        }
    }
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        computers = Integer.parseInt(br.readLine());  // 컴퓨터 수
        int N = Integer.parseInt(br.readLine());      // 연결된 컴퓨터 수

        arr = new int[computers + 1][computers + 1];
        for(int i = 0; i < N; i++){
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            arr[a][b] = 1;
            arr[b][a] = 1;  // 연결이 양방향이므로 두 군데를 모두 설정
        }

        boolean[] visited = new boolean[computers + 1];  // 방문 여부 체크
        DFS(1, visited);  // 1번 컴퓨터에서 DFS 시작
        System.out.println(count);
    }
}