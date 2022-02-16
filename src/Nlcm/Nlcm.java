package Nlcm;

public class Nlcm {
    public int solution(int[] arr) {
        int answer = arr[0];
        for (int i=1; i<arr.length; i++) {
            answer = lcm(answer, arr[i]);
        }
        return answer;
    }
    int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
    int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}
class Main {
    public static void main(String[] args) {
        Nlcm nl = new Nlcm();
        int[] arr = {2, 6, 8, 14};
        System.out.println(nl.solution(arr));
    }
}