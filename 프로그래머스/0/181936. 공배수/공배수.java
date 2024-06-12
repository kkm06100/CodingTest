class Solution {
    public int solution(int number, int n, int m) {
        int answer = 0;
        for(int i = 1;i<100;i++){
            if(i%n == 0 && i%m == 0){
                answer = i;
                break;
            }
        }
        return (number%(answer) == 0)?1:0;
    }
}