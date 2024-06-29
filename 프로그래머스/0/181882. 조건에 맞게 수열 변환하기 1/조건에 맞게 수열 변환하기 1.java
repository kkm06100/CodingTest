class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length];
        for(int i = 0;i<arr.length;i++){
            if(arr[i] >= 50 && arr[i] % 2 == 0){//짝 & 50이상
                answer[i] = arr[i]/2;
            }
            else if(arr[i] < 50 && arr[i] % 2 != 0){//홀 & 50미만
                answer[i] = arr[i]*2;
            }else{
                answer[i] = arr[i];
            }
        }
        return answer;
    }
}