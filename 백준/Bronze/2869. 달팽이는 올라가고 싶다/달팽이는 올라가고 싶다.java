import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String scan = bf.readLine();
        String [] strings = scan.split(" ");
        int [] numbers = new int[3];
        for(int i = 0; i < 3; i++){
            numbers[i] = Integer.parseInt(strings[i]);
        }
        
        int day = (numbers[2] - numbers[1] -1) / (numbers[0] - numbers[1]) + 1;
        System.out.println(day);

    }
}