import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        // HashMap 생성
        HashMap<String, Integer> map = new HashMap<>();
        
        // 참가자 목록에서 이름과 그 등장 횟수를 저장
        for (String p : participant) {
            map.put(p, map.getOrDefault(p, 0) + 1);
        }
        
        // 완료자 목록에서 등장 횟수를 하나씩 감소
        for (String c : completion) {
            map.put(c, map.get(c) - 1);
        }
        
        // 등장 횟수가 0이 아닌 사람이 완주하지 못한 사람
        for (String key : map.keySet()) {
            if (map.get(key) != 0) {
                return key;
            }
        }
        return null; // 모든 사람이 완주한 경우 (문제 가정상 일어나지 않음)
    }
}
