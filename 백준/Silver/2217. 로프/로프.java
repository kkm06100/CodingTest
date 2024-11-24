import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    // w/k 만큼의 중량이 걸린다.
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Integer[] rope = new Integer[N];
        
        for(int i = 0; i < N; i++){
            rope[i] = scanner.nextInt();
        }
        Arrays.sort(rope, Collections.reverseOrder());

        int maxWeight = rope[0];

        for(int i = 0; i < N; i++){
            int weight = rope[i] * (i + 1);
            maxWeight = Math.max(maxWeight, weight); 
        }

        System.out.println(maxWeight);
    }
}