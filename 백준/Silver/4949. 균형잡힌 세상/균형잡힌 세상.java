import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String input;
        String str;
        
        while(true) {
            Stack<Character> stack = new Stack<>();
            str = "yes";
            input = sc.nextLine();
            if(input.equals(".")) {
                break;
            }
            
            for(int i = 0; i < input.length(); i++) {
                if(input.charAt(i) == '[' || input.charAt(i) == '(') {
                    stack.push(input.charAt(i));
                } else if(input.charAt(i) == ']') {
                    if(stack.isEmpty()) {
                        str = "no";
                        break;
                    } 
                    char now = stack.pop();
                    if(now != '[') {
                        str = "no";
                        break;
                    }
                } else if(input.charAt(i) == ')') {
                    if(stack.isEmpty()) {
                        str = "no";
                        break;
                    } 
                    char now = stack.pop();
                    if(now != '(') {
                        str = "no";
                        break;
                    }
                }
            }
            if(!stack.isEmpty()) {
                str = "no";
            }
            bw.write(str + "\n");
        }
        bw.flush();
        bw.close();
    }
}
