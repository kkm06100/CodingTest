import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextInt()){
            int chicken = 0;
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            chicken += n;
            while(n>=k){
                chicken += n/k;
                n= n/k + n%k;
            }
            System.out.println(chicken);
        }
    }
}