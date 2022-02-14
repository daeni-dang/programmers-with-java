// 비밀지도
package SecretMap;

import java.util.Arrays;

public class SecretMap {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for (int i=0; i<n; i++) {
            answer[i] = String.format("%0"+n+"d", Long.parseLong(Integer.toBinaryString(arr1[i] | arr2[i])));
            answer[i] = answer[i].replaceAll("1", "#");
            answer[i] = answer[i].replaceAll("0", " ");
        }
        return answer;
    }
}
class Main {
    public static void main(String[] args) {
        SecretMap se = new SecretMap();
        int n = 5;
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};
        System.out.println(Arrays.toString(se.solution(n, arr1, arr2)));
    }
}