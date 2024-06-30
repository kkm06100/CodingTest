class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        if(a == b){
            answer = (a*a + b*b + c*c) * (a+b+c);
            if(b==c){
                answer = (a*a*a + b*b*b + c*c*c)*(a*a + b*b + c*c)*(a+b+c);
            }
        }else if(b==c){
            answer = (a*a + b*b + c*c) * (a+b+c);
            if(a==c){
                answer = (a*a*a + b*b*b + c*c*c)*(a*a + b*b + c*c)*(a+b+c);                        }
        }else if(a==c){
            answer = (a*a + b*b + c*c) * (a+b+c);
            if(b==a){
            answer = (a*a*a + b*b*b + c*c*c)*(a*a + b*b + c*c)*(a+b+c);
            }
        }else{
            answer = a+b+c;
        }
        return answer;
    }
}