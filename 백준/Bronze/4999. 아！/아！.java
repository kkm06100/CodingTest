import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maximum = scanner.nextLine().length();
        int request = scanner.nextLine().length();

        System.out.println((maximum < request)?"no":"go");
    }
}