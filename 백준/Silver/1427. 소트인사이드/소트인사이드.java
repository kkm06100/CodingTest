import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.next();
        Integer[] arr = new Integer[string.length()];
        for(int i = 0; i < string.length(); i++){
            arr[i] = Integer.parseInt("" + string.charAt(i));
        }
        Arrays.sort(arr, Collections.reverseOrder());

        for(int i = 0; i < arr.length; i ++){
            System.out.print(arr[i]);
        }
    }
}