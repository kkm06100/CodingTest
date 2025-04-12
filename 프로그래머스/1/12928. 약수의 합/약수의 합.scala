object Solution {
    
    def getMeasure(s: LazyList[Int], n: Int): LazyList[Int] = {
        s.takeWhile(n >= _).filter(n % _ == 0)
    }
    
    def solution(n: Int): Int = {
        
        val s: LazyList[Int] = LazyList.from(1)
        
        return getMeasure(s, n).toList.sum
    }
}
