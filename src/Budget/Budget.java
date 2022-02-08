package Budget;

import java.util.Arrays;

public class Budget {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        int sum = 0;
        for (int j : d) {
            sum += j;
            if (sum > budget) {
                break;
            }
            answer++;
        }
        return answer;
    }
}
class Main {
    public static void main(String[] args) {
        Budget b = new Budget();
        int[] d = {1, 3, 2, 5, 4};
        int budget = 9;
        System.out.println(b.solution(d, budget));
    }
}