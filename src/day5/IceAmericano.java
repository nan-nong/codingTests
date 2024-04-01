package day5;

import java.util.Arrays;

public class IceAmericano {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(15000)));
    }

    static int[] solution(int money) {
        int[] answer = new int[2];
        int coffee = 5500;
        
        // 가지고 있는 금액 / 커피금액 = 살 수 있는 커피 개수
        answer[0] = money / coffee;
        answer[1] = money - (coffee * answer[0]);

        return answer;
    }
}
