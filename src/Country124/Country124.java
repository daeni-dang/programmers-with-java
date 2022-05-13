package Country124;

class Country124 {
    public String solution(int n) {
        String answer = "";
        String[] num = {"4", "1", "2"};

        while (n > 0) {
            answer = num[n % 3] + answer;
            n = (n - 1) / 3;
        }
        return answer;
    }
}

class Main {
    public static void main(String[] args) {
        Country124 c124 = new Country124();
        System.out.println(c124.solution(10));
    }
}