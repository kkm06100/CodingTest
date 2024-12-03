import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            String N = scanner.next();
            if(N.equals("0")){
                break;
            }
            cal(N);
        }
    }
    
    public static void cal(String N) {
        for (int i = 0, j = N.length() - 1; i < j; i++, j--) {
            if (N.charAt(i) != N.charAt(j)) {
                System.out.println("no");
                return;
            }
        }
        System.out.println("yes");
    }

}