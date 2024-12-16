import java.util.*;
import java.io.*;

class Main {
    static String B = "";
    static String D = "";

    static int N;
    static int[][] arr;
    static int[] visitedD;
    static int[] visitedB;

    // BFS 구현
    public static void BFS(int start) {
        Queue<Integer> queue = new LinkedList<>();
        visitedB[start] = 1;  // 시작 정점 방문 표시
        queue.add(start);

        while (!queue.isEmpty()) {  // 큐가 비어 있지 않으면 반복
            int number = queue.poll();
            B += number + " ";
            for (int i = 1; i <= N; i++) {  // 인덱스 1부터 N까지 확인
                if (arr[number][i] == 1 && visitedB[i] == 0) {  // 방문하지 않은 인접 노드만 큐에 추가
                    visitedB[i] = 1; 
                    queue.add(i);
                }
            }
        }
    }

    // DFS 구현
    public static void DFS(int start) {
        visitedD[start] = 1;  // 시작 정점 방문 표시
        D += start + " ";     // 방문한 정점 저장

        for (int i = 1; i <= N; i++) {  // 인덱스 1부터 N까지 확인
            if (arr[start][i] == 1 && visitedD[i] == 0) {  // 방문하지 않은 인접 노드에 대해 DFS 재귀 호출
                DFS(i);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]); // 정점 개수
        int M = Integer.parseInt(input[1]); // 간선 개수
        int V = Integer.parseInt(input[2]); // 시작 정점

        visitedD = new int[N+1];
        visitedB = new int[N+1];

        arr = new int[N+1][N+1]; // 인접 행렬
        for (int i = 0; i < M; i++) {
            String[] edge = br.readLine().split(" ");
            int u = Integer.parseInt(edge[0]);
            int v = Integer.parseInt(edge[1]);
            arr[u][v] = 1;  // 양방향 간선이라면 arr[v][u]도 1로 설정
            arr[v][u] = 1;
        }

        DFS(V);
        bw.write(D + "\n");  // DFS 결과 출력

        Arrays.fill(visitedB, 0);  // BFS를 위해 visitedB 배열 초기화
        B = "";  // BFS 결과 초기화
        BFS(V);
        bw.write(B + "\n");  // BFS 결과 출력

        bw.flush();
        bw.close();
    }
}
