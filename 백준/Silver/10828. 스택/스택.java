import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    static Stack<Integer> stack = new Stack<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        for(int i = 0; i < size; i++){
            String order = scanner.next();
            if(Objects.equals(order, "push")){
                int number = scanner.nextInt();
                stack.push(number);
            }else if(Objects.equals(order, "pop")){
                if(stack.empty()){
                    System.out.println(-1);
                }else {
                    System.out.println(stack.pop());
                }
            }else if(Objects.equals(order, "size")){
                System.out.println(stack.size());
            }else if(Objects.equals(order, "empty")){
                System.out.println(stack.empty()?1:0);
            }else if(Objects.equals(order, "top")){
                if(stack.empty()){
                    System.out.println(-1);
                }else {
                    int temp = stack.pop();
                    System.out.println(temp);
                    stack.push(temp);
                }

            }
        }
    }



}
