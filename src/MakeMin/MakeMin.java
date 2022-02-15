package MakeMin;

import java.util.Arrays;

public class MakeMin {
    public int solution(int []A, int []B)
    {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        for (int i=0; i<A.length; i++) {
            answer += A[i] * B[B.length-1-i];
        }
        return answer;
    }
}
class Main {
    public static void main(String[] args) {
        int[] A = {1, 4, 2};
        int[] B = {5, 4, 4};
        MakeMin mm = new MakeMin();
        System.out.println(mm.solution(A, B));
    }
}