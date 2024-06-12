class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String a1 = Integer.toString(a)+b;
        String b1 = Integer.toString(b)+a;
        
        int a2 = Integer.parseInt(a1);
        int b2 = Integer.parseInt(b1);
        
        return (a2>b2)? a2:b2;
    }
}