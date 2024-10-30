import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        for(int i = 0; i < N; i++){
            A[i] = scanner.nextInt();
        }
        Arrays.sort(A);
        int M = scanner.nextInt();
        
        for(int j = 0; j < M; j++){
            int start = 0;
            int end = N-1;
            int target = scanner.nextInt();
            boolean found = false;
            
            while (start <= end) {
                int mid = (start + end) / 2;
                if (A[mid] == target) {
                    found = true;
                    break;
                } else if (A[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

            // 결과 출력
            System.out.println(found ? "1" : "0");

            // binarySearch(A, 0, N, target);

        }
    }

    // 재귀 구현(안됨)
    public static void binarySearch(int[] A, int start, int end, int target){
        int mid = (start+end)/2;
        if(start == end){
            System.out.println("0");
            return;
        }
        else if(target == A[mid]){
            System.out.println("1");
            return;
        }
        else if(target < A[mid]){
            binarySearch(A, start, mid-1, target);
        }else{
            binarySearch(A, mid+1, end, target);
        }

    }

}