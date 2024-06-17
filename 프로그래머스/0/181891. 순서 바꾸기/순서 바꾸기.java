class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        int index_answer = 0;
        for(int i = n;i<num_list.length;i++){
            answer[index_answer++] = num_list[i];
        }
        for(int i  = 0;i<n;i++){
            answer[index_answer++] = num_list[i];
        }
        return answer;
    }
}