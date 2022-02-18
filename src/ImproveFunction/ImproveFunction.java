package ImproveFunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ImproveFunction {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> answer = new ArrayList<>();
        Queue<Integer> rest = new LinkedList<>();
        for (int i=0; i<progresses.length; i++) {
            rest.add((int) Math.ceil((double) (100 - progresses[i]) / (double) speeds[i]));
        }
        while (!rest.isEmpty()) {
            int big = rest.poll();
            int num = 1;
            while (!rest.isEmpty()) {
                if (big >= rest.peek()) {
                    num++;
                    rest.poll();
                }
                else break;
            }
            answer.add(num);
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
class Main {
    public static void main(String[] args) {
        ImproveFunction imf = new ImproveFunction();
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};
        System.out.println(Arrays.toString(imf.solution(progresses, speeds)));
    }
}