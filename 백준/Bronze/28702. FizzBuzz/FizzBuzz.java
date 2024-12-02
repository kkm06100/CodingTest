import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String REGEX = "[0-9]+";
        
        String[] arr = new String[3];
        for(int i = 0; i < 3; i++){
            arr[i] = scanner.next();
        }
        for(int i=0; i<3; i++) {
			if(arr[i].matches(REGEX)) {
                int a = Integer.parseInt(arr[i]) + (3-i);
                if(a%3 == 0){
                    if(a%5 == 0){
                        System.out.println("FizzBuzz");
                        break;
                    }else{
                        System.out.println("Fizz");
                        break;
                    }
                }else if(a%5 == 0){
                    System.out.println("Buzz");
                    break;
                }else{
                    System.out.println(a);
                    break;
                }
			}
		}
    }
}
