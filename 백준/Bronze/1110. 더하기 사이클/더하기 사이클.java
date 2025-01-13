import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        
        int [] number = new int[2];

        number[0] = input/10;
        number[1] = input%10;
        int temp;
        int cycle = 0;
        do{
            temp = (number[0] + number[1]) % 10;
            number[0] = number[1];
            number[1] = temp;
            cycle++;
        }while(number[0]*10+number[1] != input);
        
        System.out.println(cycle);
    }
}