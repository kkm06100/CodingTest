class Solution {
    public int solution(String myString, String pat) {
        String answer = "";
        for(int i = 0;i<myString.length();i++){
            if(myString.charAt(i) == 'A'){
                answer += 'B';
            }
            else if(myString.charAt(i) == 'B'){
                answer += 'A';
            }
        }
        return (answer.contains(pat))?1:0;
    }
}