import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int roop = scanner.nextInt();
        int totalMoney = scanner.nextInt();
        int rooped = 0;

        int[] money = new int[roop];
        for(int i = 0; i < roop; i++){
            money[i] = scanner.nextInt();
        }
        for(int j= roop-1; j >= 0; j--){
            if(totalMoney==0) break;

            rooped += totalMoney/money[j];
            totalMoney %= money[j];

        }
        System.out.println(rooped);
    }
}