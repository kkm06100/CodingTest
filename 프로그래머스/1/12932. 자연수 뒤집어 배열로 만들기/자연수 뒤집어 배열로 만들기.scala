object Solution {
    def solution(n: Long): Vector[Int] = {
         return n.toString.reverse.map(_.asDigit).toVector
    }
}