package ClawMachineGame;

import java.util.ArrayList;

public class ClawMachineGame {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        ArrayList<Integer> basket = new ArrayList<>();
        for (int i = 0; i < moves.length; i++) {
            int idx = 0;
            while (idx < board.length) {
                if (board[idx][moves[i] - 1] != 0) {
                    basket.add(board[idx][moves[i] - 1]);
                    board[idx][moves[i] - 1] = 0;
                    break;
                }
                idx++;
            }
            if (basket.size() > 1 && (basket.get(basket.size() - 1) == basket.get(basket.size() - 2))) {
                basket.remove(basket.size() - 1);
                basket.remove(basket.size() - 1);
                answer += 2;
            }
        }
        return answer;
    }
}
class Main {
    public static void main(String[] args) {
        ClawMachineGame cmg = new ClawMachineGame();
        int[][] board = {{0,0,0,0,0}, {0,0,1,0,3}, {0,2,5,0,1}, {4,2,4,4,2}, {3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};
        System.out.println(cmg.solution(board, moves));
    }
}