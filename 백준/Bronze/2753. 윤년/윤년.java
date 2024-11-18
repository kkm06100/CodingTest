import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

        System.out.println((((year%4 == 0) && !(year % 100 == 0))||(year%400 == 0))?"1":"0");
    }
}