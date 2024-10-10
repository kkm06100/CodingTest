import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] people = new int[n];
        int totalTime = 0;
        int exTime = 0;
        for(int i = 0; i < n; i++){
            people[i] = scanner.nextInt();
        }
        Arrays.sort(people);
        for(int i = 0; i < n; i++){
            totalTime += people[i]+exTime;
            exTime=people[i]+exTime;

        }
        System.out.println(totalTime);
    }
}