import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for(int i = 0; i < N; i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            System.out.println(a+b);
        }
    }
}