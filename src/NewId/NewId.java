package NewId;

public class NewId {
    public String solution(String new_id) {
        String answer = "";
        // step 1 : 모든 대문자를 소문자로 치환
        new_id = new_id.toLowerCase();
        // step 2 : 알파벳 소문자, 숫자, -, _, .을 제외한 모든 문자 제거
        // -> 아이디가 될 수 있는 문자만 answer에 추가
        for (int i=0; i<new_id.length(); i++) {
            if (new_id.charAt(i) == '-' || new_id.charAt(i) == '_' || new_id.charAt(i) == '.' ||
                    (new_id.charAt(i) >= '0' && new_id.charAt(i) <= '9') ||
                    (new_id.charAt(i) >= 'a' && new_id.charAt(i) <= 'z')) {
                answer += new_id.charAt(i);
            }
        }
        // answer을 규칙에 맞도록 수정
        // step 3 : 마침표(.)가 2번 이상 연속하여 나온다면 하나로 치환
        answer = answer.replaceAll("\\.+", ".");
        // step 4 : 마침표가 처음이나 끝에 위치한다면 제거
        if (answer.charAt(0) == '.') { answer = answer.substring(1, answer.length()); }
        if (answer.length() > 0 && answer.charAt(answer.length() - 1) == '.') { answer = answer.substring(0, answer.length() - 1); }

        // step 5 : 빈 문자열이라면 "a" 대입
        if (answer.equals("")) {
            answer += 'a';
        }
        // step 6 : 길이가 16자 이상이라면 16번째 문자부터 제거 (제거 후 마지막 문자가 "."라면 제거)
        if (answer.length() >= 16) {
            answer = answer.substring(0, 15);
            if (answer.charAt(answer.length() - 1) == '.') {
                answer = answer.substring(0, answer.length() - 1);
            }
        }
        // step 7 : 길이가 2자 이하라면 마지막 문자를 길이가 3이 될 때까지 반복하여 추가
        else if (answer.length() <= 2) {
            while (answer.length() < 3) {
                answer += answer.charAt(answer.length() - 1);
            }
        }
        return answer;
    }
}
class Main {
    public static void main(String[] args) {
        String new_id = "...!@BaT#*..y.abcdefghijklm";
        NewId newId = new NewId();
        System.out.println(newId.solution(new_id));
    }
}