package ModOne;

public class ModOne {
    public int solution(int n) {
        int answer = 0;
        for (int i=1; i<n; i++) {
            if (n % i == 1) {
                answer = i;
                break;
            }
        }
        return answer;
    }
}
class Main {
    public static void main(String[] args) {
        ModOne mo = new ModOne();
        int n = 10;
        System.out.println(mo.solution(n));
    }
}
