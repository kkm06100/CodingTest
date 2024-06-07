class Solution {
    public String solution(String rny_string) {
        String answer = rny_string;//java에서 문자열 초기화 하는법 : 대입식 뒤에 넣는다.
        //replace : 특정 문자를 다른 문자로 바꿀 때 주로 사용한다.
        //replace([기존문자],[바꿀문자])
        answer = answer.replace("m","rn");
        return answer;
    }
}