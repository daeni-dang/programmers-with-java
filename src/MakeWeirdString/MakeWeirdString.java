// 이상한 문자 만들기
package MakeWeirdString;

public class MakeWeirdString {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        int index = 0;
        for (int i=0; i<s.length(); i++) {
            if (index % 2 == 0)
                answer.append(Character.toUpperCase(s.charAt(i)));
            else answer.append(Character.toLowerCase(s.charAt(i)));
            if (s.charAt(i) == ' ')
                index = 0;
            else index++;
        }
        return answer.toString();
    }
}
class Main {
    public static void main(String[] args) {
        MakeWeirdString mws = new MakeWeirdString();
        String s = "try hello world";
        System.out.println(mws.solution(s));
    }
}