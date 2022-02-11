// 소수 찾기
package FindPrimeNumber;

public class FindPrimeNumber {
    public int solution(int n) {
        int answer = 0;
        int[] prime = new int[n+1];
        for (int i=2; i<=n; i++) {
            prime[i] = i;
        }
        for (int i=2; i*i<=n; i++) {
            if (prime[i] != 0) {
                for (int j=i*i; j<=n; j += i) {
                    prime[j] = 0;
                }
            }
        }
        for (int i=2; i<=n; i++) {
            if (prime[i] != 0) {
                answer++;
            }
        }
        return answer;
    }
}
class Main {
    public static void main(String[] args) {
        FindPrimeNumber fpn = new FindPrimeNumber();
        int n = 10;
        System.out.println(fpn.solution(n));
    }
}