import java.util.*;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        
        int[] number = new int[length+1];
        number[0] = 0;
        number[1] = 1;
        for(int i = 2; i <= length; i++){
            number[i] = number[i-1] + number[i-2];
        }
        System.out.println(number[length]);
    }
}