class Solution {
    public String solution(String s) {
        String answer = "";
        String numbers[] = s.split(" ");
        int min = 2147483647;
        int max = -2147483648;
        for(int i = 0;i<numbers.length;i++){
            if(min > Integer.parseInt(numbers[i])){
                min = Integer.parseInt(numbers[i]);
            }
            if(max < Integer.parseInt(numbers[i])){
                max = Integer.parseInt(numbers[i]);
            }
        }
        answer += min;
        answer += ' ';
        answer += max;
        return answer;
    }
}