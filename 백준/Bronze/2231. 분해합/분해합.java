import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int answer = 0;
        
        for (int now = 1; now < N; now++) {
            String temp = Integer.toString(now); 
            int sum = now; 
            
            for (int i = 0; i < temp.length(); i++) {
                sum += temp.charAt(i) - '0';
            }
            
            if (sum == N) {
                answer = now;
                break;
            }
        }
        
        System.out.println(answer);
    }
}
