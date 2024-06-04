class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int num = 0;
        
        for(int i = 0;i<s.length();i++){
            if(num>0){
                answer = false;
                break;
            }
            else if(s.charAt(i)==')'){
                num++;
            }else if(s.charAt(i) == '('){
                num--;
            }
        }
        
        if(num != 0){
            answer = false;
        }
        return answer;
    }
}