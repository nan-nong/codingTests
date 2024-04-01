package day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DislikeEvenNum {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(5)));
    }

    static int[] solution(int n) {
        int[] answer = {};
        int oddCount = 0;

        if(n % 2 == 0){
            answer = new int[n/2];
        } else {
            answer = new int[(n/2) + 1];
        }

        for(int i = 0 ; i <= n ; i++){
            if(i % 2 != 0){
                answer[oddCount] = i;
                System.out.println("answer[oddCount] = " + answer[oddCount]);
                oddCount++;
            }
        }
        return answer;
    }
}