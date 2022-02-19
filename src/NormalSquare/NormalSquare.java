package NormalSquare;

public class NormalSquare {
    public long solution(int w, int h) {
        long a = w, b = h;
        long answer = a * b - (a + b - gcd(a, b));
        return answer;
    }
    long gcd(long a, long b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}
class Main {
    public static void main(String[] args) {
        NormalSquare ns = new NormalSquare();
        int w = 8, h = 12;
        System.out.println(ns.solution(w, h));
    }
}