import java.util.*;


class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 1;

        int[][] arr = new int[n][2];
        for(int i = 0; i < n; i++){
            arr[i][0] = scanner.nextInt();
            arr[i][1] = scanner.nextInt();
        }

        Arrays.sort(arr, Comparator.comparingInt(a -> a[0]));
        Arrays.sort(arr, Comparator.comparingInt(a -> a[1]));

        int ex = 0;
        for(int j = 1; j < n; j++){
            if(arr[ex][1] <= arr[j][0]){
                ex = j;
                count++;
            }
        }
        System.out.println(count);
    }
}