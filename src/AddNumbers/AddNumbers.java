package AddNumbers;

public class AddNumbers {
    public int solution(int[] numbers) {
        int answer = 0;
        int[] isIn = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int number : numbers) {
            isIn[number] = 0;
        }
        for (int j : isIn) {
            answer += j;
        }
        return answer;
    }
}
class Main {
    public static void main(String[] args) {
        AddNumbers an = new AddNumbers();
        int[] numbers = {1,2,3,4,6,7,8,0};
        System.out.println(an.solution(numbers));
    }
}