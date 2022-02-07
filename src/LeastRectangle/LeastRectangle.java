package LeastRectangle;

import java.util.Arrays;

public class LeastRectangle {
    public int solution(int[][] sizes) {
        int answer = 0, maxW = 0, maxH = 0;
        for (int[] arr : sizes) {
            Arrays.sort(arr);
            if (arr[0] > maxW) { maxW = arr[0]; }
            if (arr[1] > maxH) { maxH = arr[1]; }
        }
        answer = maxW * maxH;
        return answer;
    }
}
class Main {
    public static void main(String[] args) {
        LeastRectangle lr = new LeastRectangle();
        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        System.out.println(lr.solution(sizes));
    }
}