import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int result = 0;
        if(x>0){
            if(y > 0){
                result = 1;
            }else{
                result = 4;
            }
        }else{
            if(y > 0){
                result = 2;
            }else{
                result = 3;
            }
        }
        System.out.println(result);
    }
}