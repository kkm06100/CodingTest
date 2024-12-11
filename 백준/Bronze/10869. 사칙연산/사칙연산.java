import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N1 = scanner.nextInt();
        int N2 = scanner.nextInt();

        System.out.println(N1 + N2);
        System.out.println(N1 - N2);
        System.out.println(N1 * N2);
        System.out.println(N1 / N2);
        System.out.println(N1 % N2);
    }
}