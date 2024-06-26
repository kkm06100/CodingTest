class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];
        for(int i = 0;i<strArr.length;i++){
            if(i%2==0){//짝
                answer[i] = strArr[i].toLowerCase();
            }
            else{//홀
                answer[i] = strArr[i].toUpperCase();
            }
        }
        return answer;
    }
}
//String을 대문자로 바꾸는 법 : String형이름.toUpperCase();
//String을 소문자로 버꾸는 법 : string형이름.toLowerCase();
