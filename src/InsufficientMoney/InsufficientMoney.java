package InsufficientMoney;

public class InsufficientMoney {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long lmoney = money;
        for (int i=0; i<count; i++)
            lmoney -= (long)price * (i + 1);
        if (lmoney > 0) { answer = 0; }
        else { answer = -lmoney; }
        return answer;
    }
}
class Main {
    public static void main(String[] args) {
        InsufficientMoney im = new InsufficientMoney();
        int price = 3;
        int money = 20;
        int count = 4;
        System.out.println(im.solution(price, money, count));
    }
}