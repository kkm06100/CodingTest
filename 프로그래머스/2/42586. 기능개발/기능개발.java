/*
<문제 이해>
1. 뒤에 있는 기능은 앞에 있는 기능이 배포될 때 함께 배포됨
*/
import java.util.*;
class Solution {
    public List<Integer> solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        List<Integer> days = new ArrayList<>();
        int dayStack = 1;
        int leftDays;
        for(int i = 0;i<progresses.length;i++){//걸리는 시간 계산
            
            days.add(((100-progresses[i])%speeds[i]==0)
            ?(100-progresses[i])/speeds[i]:(100-progresses[i])/speeds[i]+1);
        }
        for(int i = 1;i<days.size();i++){//answer 작성
            if(days.get(i)<=days.get(i-1)){
                days.set(i,days.get(i-1));
                dayStack ++;
            }else{
                answer.add(dayStack);
                dayStack = 1;
            }
        }
        answer.add(dayStack);
        
        return answer;
    }
}