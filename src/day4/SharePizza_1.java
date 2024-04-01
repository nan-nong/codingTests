package day4;

public class SharePizza_1 {
    public static void main(String[] args) {
        solution(15);
    }

    static public int solution(int n) {
        int answer = 0;
        answer = (int) Math.ceil((double) n / 7);
        System.out.println(answer);

        return answer;
    }
}

/* 1. 간단해 보이는 거.
class Solution {
    public int solution(int n) {
        return (n + 6) / 7;
    }
}*/
/* 2. 또는 삼항 연산자 사용
int answer = (n%7==0) ? n/7 : n/7 + 1;
*/