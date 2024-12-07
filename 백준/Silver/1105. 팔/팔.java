import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String L = scanner.next();
        String R = scanner.next();
        int count = 0;
        
        if(L.length() != R.length()){
            System.out.println(0);
        }else{
            for(int i = 0; i < L.length(); i++){
                if(L.charAt(i) == R.charAt(i)){
                    if(L.charAt(i) == '8'){
                        count ++;
                    }
                }else{
                    break;
                }
            }
            System.out.println(count);

        }
    }
}