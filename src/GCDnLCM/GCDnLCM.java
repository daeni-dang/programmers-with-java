package GCDnLCM;

import java.util.Arrays;

public class GCDnLCM {
    public int[] solution(int n, int m) {
        return new int[]{gcd(n, m), lcm(n, m)};
    }
    static int gcd(int a, int b) {
        if (a % b == 0) { return b; }
        else { return gcd(b, a % b); }
    }
    static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}
class Main {
    public static void main(String[] args) {
        GCDnLCM gl = new GCDnLCM();
        int n = 3, m = 12;
        System.out.println(Arrays.toString(gl.solution(n, m)));
    }
}