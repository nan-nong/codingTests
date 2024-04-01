package day5;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(solution(arr)));
    }

    // 배열 뒤집기
    static public int[] solution(int[] num_list) {
        int[] reverseArr = new int[num_list.length];

        for(int i = 0 ; i < num_list.length ; i++){
            if( i == num_list.length - 1){
                reverseArr[0] = num_list[num_list.length - 1];
            } else {
                reverseArr[num_list.length - i - 1] = num_list[i];
            }
        }

        return reverseArr;
    }
}
