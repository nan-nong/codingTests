package day4;

import java.util.Arrays;

/* 최대 빈도 값을 구하기 */
public class MaximumFrequency {
    public static void main(String[] args){
        int[] arr = new int[]{2, 4, 4, 4, 4, 1, 3, 7, 2, 1, 0, 7, 7, 7, 7, 7, 7, 7, 7, 8, 9, 1, 1, 1, 1, 1, 1, 1, 1};
        System.out.println(solution(arr));
    }

    public static int solution(int[] array){
        int answer = 0;
        int max = 0;
        int[] count = new int[Arrays.stream(array).max().getAsInt() + 1];

        // 1. [0, 1, 1, 3, 1] 이런식으로 인덱스에 들어있는 값을 세어서 count의 인덱스에 맞으면 값을 증가시킨다.
        for(int i = 0 ; i < array.length ; i++){
            count[array[i]]++;
        }
        // 2. 가장 높은 인덱스의 값이 가장 높은 빈도수이므로 그 인덱스를 반환한다. 그러나 동일한 값이 있다면 -1 return
        // count[i]와 count[i+1]이 같을 때 max 값과 같다면 -1을 리턴?
        for(int i = 0 ; i < count.length; i++){
            if(count[i] > max){
                max = count[i];
                System.out.println("max = " + max);
                answer = i;
                System.out.println("i = " + i);
            }
            System.out.println(Arrays.toString(count));
        }

        // 이 부분은 헷깔려서 풀이 봄
        int temp = 0;

        for(int j = 0; j < count.length ; j++){
            if(max == count[j]){
                temp++;
            }
            if(temp > 1){
                answer = -1;
            }
        }

        return answer;
    }
}
