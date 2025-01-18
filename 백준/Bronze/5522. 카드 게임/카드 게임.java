import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 5; i++){
            sum += scanner.nextInt();
        }
        System.out.println(sum);
    }
}