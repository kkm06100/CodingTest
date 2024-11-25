import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int subject = scanner.nextInt();
        int sum = 0;

        int max = 0;
        for(int i = 0; i < subject; i++){
            int number = scanner.nextInt();
            max = Math.max(max, number);
            sum+=number;
        }

        double average = (double) sum / subject;  
        double result = (average / max) * 100;  

        // 소수점 6자리까지 반올림하여 출력
        System.out.printf("%.6f\n", result);
    }
}