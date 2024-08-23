/*
A와 B배열에서 숫자 하나를 뽑아서 서로 곱한 것의 합이 가장 작은 자(단 같은 숫자는 X)

*/
import java.util.*;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        for(int i = 0; i < A.length; i++){
            answer += A[i] * B[B.length - i - 1];
        }

        return answer;
    }
}