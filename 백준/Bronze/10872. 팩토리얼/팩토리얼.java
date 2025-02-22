import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int factorial = 1;
        for(int i = 1; i <= N; i++){
            factorial*=i;
        }
        System.out.println(factorial);
    }
}