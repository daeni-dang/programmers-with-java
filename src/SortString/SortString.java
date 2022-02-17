// 문자열 내 마음대로 정렬하기
package SortString;

import java.util.Arrays;

public class SortString {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        for (int i=0; i<strings.length; i++) {
            strings[i] = strings[i].charAt(n) + strings[i];
        }
        Arrays.sort(strings);
        for (int i=0; i<strings.length; i++) {
            answer[i] = strings[i].substring(1, strings[i].length());
        }
        return answer;
    }
}
class Main {
    public static void main(String[] args) {
        SortString ss = new SortString();
        String[] strings = {"sun", "bed", "car"};
        int n = 1;
        System.out.println(Arrays.toString(ss.solution(strings, n)));
    }
}