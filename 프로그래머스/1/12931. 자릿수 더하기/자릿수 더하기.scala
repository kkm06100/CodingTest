object Solution {
    
    def solution(n: Int): Int = {
        if(n < 10) n else n % 10 + solution(n/10)
    }
}