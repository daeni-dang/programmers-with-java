package MakePrime;

import java.util.Arrays;

public class MakePrime {
    public int solution(int[] nums) {
        int answer = 0;
        Arrays.sort(nums);
        // 세 개의 수를 더해 그 수가 소수인지 판별해야하므로, 생길 수 있는 가장 큰 수만큼의 공간 생성
        int primeLen = nums[nums.length - 1] + nums[nums.length - 2] + nums[nums.length - 3];

        // 에라토스테네스의 체를 통해 소수를 판별하기 위한 공간 생성
        int[] prime = new int[primeLen + 1];
        for (int i = 2; i <= primeLen; i++) {
            prime[i] = i;
        }
        for (int i = 2; i <= primeLen; i++) {
            // 이미 0인 숫자는 건너뜀
            if (prime[i] == 0) continue;
            // 자기 자신을 제외한 배수 자리에 0
            for (int j = i + i; j <= primeLen; j += i) {
                prime[j] = 0;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    // prime 배열에서 세 숫자를 더한 값이 0이 아니라면 소수이므로 answer 증가
                    if (prime[nums[i] + nums[j] + nums[k]] != 0) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}
class Main {
    public static void main(String[] args) {
        MakePrime mp = new MakePrime();
        int[] nums = {1, 2, 7, 6, 4};
        System.out.println(mp.solution(nums));
    }
}
