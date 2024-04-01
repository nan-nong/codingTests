package day6;

import java.util.Arrays;

public class CountOddEven {

    public static void main(String[] args) {
        int[] arr = {1,3,5,7};
        System.out.println(Arrays.toString(solution(arr)));
    }

    static public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        for (int num : num_list) {
            if(num % 2 == 0){
                answer[0]++;
            } else {
                answer[1]++;
            }
        }
        return answer;
    }

    static public int[] solution2(int[] num_list) {
        int[] answer = new int[2];

        for(int i = 0; i < num_list.length; i++)
            answer[num_list[i] % 2]++;

        return answer;
    }
}
