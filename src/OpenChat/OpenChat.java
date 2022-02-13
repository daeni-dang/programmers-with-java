package OpenChat;

import java.util.Arrays;
import java.util.HashMap;

public class OpenChat {
    public String[] solution(String[] record) {
        HashMap<String, String> uidName = new HashMap<>();
        int totalLen = record.length;
        for (String s : record) {
            String[] tmp = s.split(" ");
            if (s.charAt(0) == 'L') continue;
            else if (s.charAt(0) == 'C') totalLen--;
            uidName.put(tmp[1], tmp[2]);
        }
        String[] answer = new String[totalLen];
        int idx = 0;
        for (String s : record) {
            String[] tmp = s.split(" ");
            if (s.charAt(0) == 'E') {
                answer[idx++] = uidName.get(tmp[1]) + "님이 들어왔습니다.";
            } else if (s.charAt(0) == 'L') {
                answer[idx++] = uidName.get(tmp[1]) + "님이 나갔습니다.";
            }
        }
        return answer;
    }
}
class Main {
    public static void main(String[] args) {
        OpenChat oc = new OpenChat();
        String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo",
                           "Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
        System.out.println(Arrays.toString(oc.solution(record)));
    }
}