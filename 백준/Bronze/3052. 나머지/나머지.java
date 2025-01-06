import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int arr[] = new int[10];
        Arrays.fill(arr, -1);
        for(int i = 0; i < 10; i++){
            int number = scanner.nextInt() % 42;
            for(int j = 0; j < i+1; j++){
                if(arr[j] == number){
                    number = -1;
                    break;
                }
            }
            if(number != -1){
                arr[i] = number;
                count++;
            }
        }
        System.out.println((count == 0)?1:count);
    }
}