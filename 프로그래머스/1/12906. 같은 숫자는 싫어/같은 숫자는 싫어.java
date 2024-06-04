import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = new int[arr.length];
        
        int originalNumber;//원래 수
        int indexAnswer = 1;//answer의 인덱스 값
        int index = 0;
        answer[0] = arr[0];
        for(int i = 1;i<arr.length;i++){
            originalNumber = arr[i-1];
            if(originalNumber != arr[i]){
                answer[indexAnswer] = arr[i];
                indexAnswer ++;
                index ++;
            }
        }
        int[] Answer = new int[index+1];
        //원래 수
        indexAnswer = 1;//answer의 인덱스 값
        Answer[0] = arr[0];

        for(int i = 1;i<arr.length;i++){
            originalNumber = arr[i-1];
            if(originalNumber != arr[i]){
                Answer[indexAnswer] = arr[i];
                indexAnswer ++;
                index ++;
            }
        }      
        return Answer;
    }
}