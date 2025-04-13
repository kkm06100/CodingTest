object Solution {
    
    def solution(n: Int): Int = {
        var answer = 0
        if(n < 10) {
            n
        }else {
            n%10 + solution(n/10)
        }
    }
}