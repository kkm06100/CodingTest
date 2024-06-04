import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public String[] solution(String myString) {
        String[] splitArr = myString.split("x");//x를 기준으로 split하기
        ArrayList<String> resultList = new ArrayList<>();//String 형 ArrList선언
        
        for (String str : splitArr) {
            if (!str.isEmpty()) {//빈 부분을 제외 하고 리스트에 넣음
                resultList.add(str);
            }
        }
        
        String[] resultArr = resultList.toArray(new String[resultList.size()]);
        Arrays.sort(resultArr);//정렬
     
        return resultArr;
    }
}
