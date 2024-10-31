import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] X = new int[N];
        for(int i = 0; i < N; i++){
            X[i] = scanner.nextInt();
        }
        Arrays.sort(X);
        int teams = 0;
        for(int i = 0; i < N; i++){
                i+=X[i]-1;
                teams++;

        }
        System.out.println(teams);
    }

}