import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int roop = scanner.nextInt();
        for(int i = 0; i < roop; i++){
            String string = scanner.next();
            int a = 0;
            for(int j = 0; j < string.length(); j++){

                if(string.charAt(j) == '('){
                    a++;
                }else if(string.charAt(j) == ')'){
                    a--;
                }
                if(a < 0){
                    System.out.println("NO");
                    break;
                }
            }
            if(a == 0){
                System.out.println("YES");
            }else if(a > 0){
                System.out.println("NO");
            }
        }
    }
}