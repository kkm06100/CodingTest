import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int S = Integer.parseInt(bf.readLine());

        String stringA = bf.readLine();
        String[] stringArrayA = stringA.split(" ");
        Integer[] A = new Integer[stringArrayA.length];
        for (int i = 0; i < stringArrayA.length; i++) {
            A[i] = Integer.parseInt(stringArrayA[i]);
        }
        String stringB = bf.readLine();
        String[] stringArrayB = stringB.split(" ");
        Integer[] B = new Integer[stringArrayB.length];
        for (int i = 0; i < stringArrayB.length; i++) {
            B[i] = Integer.parseInt(stringArrayB[i]);
        }

        Arrays.sort(A, Collections.reverseOrder());
        Arrays.sort(B, Collections.reverseOrder());

        int sum = 0;
        int indexB = S-1;
        for(int i = 0; i < S; i ++){
            sum += A[i]*B[indexB--];
        }
        System.out.println(sum);
    }
}
