import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        String second = scanner.next();

        for(int i = second.length()-1; i >= 0; i--){
            System.out.println(Integer.parseInt(String.valueOf(second.charAt(i)))*first);
        }
        System.out.println(Integer.parseInt(second)*first);
    }
}