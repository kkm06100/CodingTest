import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int N, M;
        int count;
        for(int i = 0; i < n; i ++){
            N=scanner.nextInt();
            M=scanner.nextInt();
            count = 0;
            if(N==0)count++;
            for(int j = N; j <= M; j++){
                int num = j;
                while(num>9){
                    if(num%10 == 0){
                        count++;
                    }
                    num/=10;
                }
            }
            System.out.println(count);
        }
    }
}