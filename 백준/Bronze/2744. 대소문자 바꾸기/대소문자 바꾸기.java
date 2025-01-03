import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String answer = "";
        char b;
        for(int i=0; i<a.length(); i++){
            b = a.charAt(i);
            
            if(Character.isUpperCase(b)){
                answer += Character.toLowerCase(b);
            } else {
                answer += Character.toUpperCase(b);
            }
            
        }
        System.out.println(answer);
    }
}