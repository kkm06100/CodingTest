import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        
        Set<String> set = new HashSet<>();
        List<String> dbj = new ArrayList<>();
        
        for (int i = 0; i < N; i++) {
            set.add(br.readLine());
        }

        for (int i = 0; i < M; i++) {
            String name = br.readLine();
            if (set.contains(name)) {
                dbj.add(name);
                set.remove(name);
            }
        }

        Collections.sort(dbj);
        
        bw.write(dbj.size() + "\n");
        for (String name : dbj) {
            bw.write(name + "\n");
        }
        
        bw.flush();
        bw.close();
    }
}
