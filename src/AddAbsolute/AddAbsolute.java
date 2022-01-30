package AddAbsolute;

public class AddAbsolute {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i=0; i<absolutes.length; i++) {
            if (signs[i]) {
                answer += absolutes[i];
            }
            else { answer -= absolutes[i]; }
        }
        return answer;
    }
}
class Main {
    public static void main(String[] args) {
        AddAbsolute aa = new AddAbsolute();
        int[] absolutes = {4, 7, 12};
        boolean[] signs = {true, false, true};
        System.out.println(aa.solution(absolutes, signs));
    }
}