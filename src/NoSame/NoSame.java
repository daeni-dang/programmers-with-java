package NoSame;

import java.util.ArrayList;
import java.util.Arrays;

public class NoSame {
    public int[] solution(int []arr) {
        ArrayList<Integer> tmp = new ArrayList<>();
        int preNum = 10;
        for (int curNum : arr) {
            if (preNum != curNum)
                tmp.add(curNum);
            preNum = curNum;
        }
        int[] answer = new int[tmp.size()];
        for (int i=0; i<tmp.size(); i++) {
            answer[i] = tmp.get(i);
        }
        return answer;
    }
}
class Main {
    public static void main(String[] args) {
        NoSame ns = new NoSame();
        int[] arr = {1, 1, 3, 3, 0, 1, 1};
        System.out.println(Arrays.toString(ns.solution(arr)));
    }
}