package Lottery;

import java.util.Arrays;

public class Lottery {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] score = {6, 6, 5, 4, 3, 2, 1};
        int[] answer = new int[2];
        int zeroCount = 0, ansCount = 0;
        for (int i=0; i<lottos.length; i++) {
            for (int j=0; j<lottos.length; j++) {
                if (lottos[j] == win_nums[i]) { ansCount++; }
            }
            if (lottos[i] == 0) { zeroCount++; }
        }
        answer[0] = score[ansCount + zeroCount];
        answer[1] = score[ansCount];
        return answer;
    }
}
class Main {
    public static void main(String[] args) {
        int[] lottos = {0, 0, 0, 0, 0, 0};
        int[] win_nums = {38, 19, 20, 40, 15, 25};
        Lottery lottery = new Lottery();
        int[] answer = lottery.solution(lottos, win_nums);
        System.out.println(Arrays.toString(answer));
    }
}

