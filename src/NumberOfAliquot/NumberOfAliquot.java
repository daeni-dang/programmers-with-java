// 약수의 개수와 덧셈
package NumberOfAliquot;

import java.util.ArrayList;

public class NumberOfAliquot {
    public int solution(int left, int right) {
        int answer = 0;
        for (int i=left; i<=right; i++) {
            ArrayList<Integer> aliquot = new ArrayList<>();
            for (int j=1; j<=i; j++) {
                if (i % j == 0) {
                    aliquot.add(j);
                }
            }
            if (aliquot.size() % 2 == 0) {
                answer += i;
            }
            else {
                answer -= i;
            }
        }
        return answer;
    }
}
class Main {
    public static void main(String[] args) {
        NumberOfAliquot na = new NumberOfAliquot();
        int left = 13, right = 17;
        System.out.println(na.solution(left, right));
    }
}