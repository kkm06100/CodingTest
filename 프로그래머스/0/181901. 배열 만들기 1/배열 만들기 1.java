class Solution {
    public int[] solution(int n, int k) {
        int[] answer = new int[n/k];
        int index_answer = 0;
        for(int i = k;i<=n;i+=k){
            answer[index_answer++] = i;
        }
        return answer;
    }
}