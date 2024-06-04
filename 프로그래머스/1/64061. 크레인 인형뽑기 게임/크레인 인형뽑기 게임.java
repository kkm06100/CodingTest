import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> baskit = new Stack<>();
        int y = 0;
        baskit.push(0);
        for(int i = 0;i<moves.length;i++){
            y = 0;
            while(board[y][moves[i]-1] == 0 && y< board.length-1 ){//값이 0일 때 내려오기
                y++;
            }
            
            if(board[y][moves[i]-1] != 0){
                System.out.println(board[y][moves[i]-1]);
                if(baskit.peek() == board[y][moves[i]-1] && baskit.empty()==false){
                    baskit.pop();
                    answer+=2;
                }else{
                    
                    baskit.push(board[y][moves[i]-1]);
                    
                }
                board[y][moves[i]-1] = 0;
            }
            
            
        }
        return answer;
    }
}