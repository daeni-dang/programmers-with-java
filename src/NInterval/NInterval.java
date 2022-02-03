package NInterval;

import java.util.Arrays;

public class NInterval {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        // x의 범위는 -1000만~1000만이므로 int 범위로 커버 불가능
        for (long i=0; i<n; i++) {
            answer[Long.valueOf(i).intValue()] = x * (i + 1);
        }
        return answer;
    }
}
class Main {
    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        NInterval ni = new NInterval();
        System.out.println(Arrays.toString(ni.solution(x, n)));
    }
}