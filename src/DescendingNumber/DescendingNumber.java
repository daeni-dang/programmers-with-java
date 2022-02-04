package DescendingNumber;

import java.util.Arrays;
import java.util.Collections;

public class DescendingNumber {
    public long solution(long n) {
        long answer = 0;
        String stranswer = Long.toString(n);
        Integer[] tmp = new Integer[stranswer.length()];
        for (int i=0; i<stranswer.length(); i++) {
            tmp[i] = Character.getNumericValue(stranswer.charAt(i));
        }
        Arrays.sort(tmp, Collections.reverseOrder());
        StringBuilder tmpAns = new StringBuilder();
        for (Integer integer : tmp) {
            tmpAns.append(integer);
        }
        answer = Long.parseLong(tmpAns.toString());
        return answer;
    }
}
class Main {
    public static void main(String[] args) {
        DescendingNumber dn = new DescendingNumber();
        long n = 118372;
        System.out.println(dn.solution(n));
    }
}