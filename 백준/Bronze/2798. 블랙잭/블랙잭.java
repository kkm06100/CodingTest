import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] cards = new int[N];
        int biggestNumber = 0;
        for(int i = 0; i < N; i++){
            cards[i] = scanner.nextInt();
        }
        for(int i = 0; i < N; i++){
            for(int j = i+1; j < N; j++){
                for(int k = j+1; k < N; k++){
                    int sum = cards[i] + cards[j] + cards[k];
                    if(sum <= M){
                        if(biggestNumber < sum){
                            biggestNumber = sum;
                        }

                    }
                }
            }
        }
        System.out.println(biggestNumber);
    }
}