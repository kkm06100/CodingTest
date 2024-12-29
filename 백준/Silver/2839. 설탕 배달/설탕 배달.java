import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int bag = 0;
        
        while(N % 5 != 0){
            bag++;
            N-=3;
            if(N<0){
                System.out.println("-1");
                return;
            }
        }
        bag += N/5;
        System.out.println(bag);
    }
}