import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt() - 1;
        int passedCount = 1;
        int now = 6;
        while (N > 0) {
            N -= now;
            now += 6;
            passedCount++;
        }
        System.out.println(passedCount);
    }
}