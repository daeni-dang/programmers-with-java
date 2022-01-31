package NotComplete;

import java.util.HashMap;

public class NotComplete {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hm = new HashMap<>(); // 이름과 횟수를 저장할 해시맵(동명이인이 있기 때문)
        for (String s : participant) {
            hm.put(s, hm.getOrDefault(s, 0) + 1);
        }
        for (String s : completion) { hm.put(s, hm.get(s) - 1); }
        for (String s : participant) {
            if (hm.get(s) != 0) {
                answer = s;
            }
        }
        return answer;
    }
}
class Main {
    public static void main(String[] args) {
        NotComplete nc = new NotComplete();
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};
        System.out.println(nc.solution(participant, completion));
    }
}