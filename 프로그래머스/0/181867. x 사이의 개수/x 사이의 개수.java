class Solution {
    public int[] solution(String myString) {
        int x = 0;
        for(int i = 0;i<myString.length();i++){
            if(myString.charAt(i) == 'x'){
                x++;
            }
        }
        int[] answer = new int[x+1];
        int index_answer = 0;
        for(int i = 0;i<myString.length();i++){
            if(myString.charAt(i) == 'x'){
                if(index_answer<=x){
                    index_answer ++;
                }
                
            }else{
                answer[index_answer] ++;
            }
        }
        return answer;
    }
}