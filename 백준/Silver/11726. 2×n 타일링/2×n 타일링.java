import java.util.*;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

/*
2 * n
<1>
1

<2>
2

<3>
3

<4>
5
*/
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] memo = new int[1001];
        memo[0] = 0;
        memo[1] = 1;
        memo[2] = 2;
        for(int i = 3; i <= n; i++){
            memo[i] = (memo[i-1] + memo[i-2]) % 10007;
        }
        System.out.println(memo[n]);
    }
}