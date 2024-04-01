package club99.day1;

import java.util.Arrays;

public class reverseNumToArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(12345L)));
    }

    public static int[] solution(long n){

        // 1. long 타입의 숫자 문자열로 변경
        String str = Long.toString(n);
        
        // 2. StringBuilder로 객체 변환후 reverse() 메소드 사용
        StringBuilder sb = new StringBuilder(str);

        // 3. 변경된 reverse된 문자열을 다시 int로 변경 후 각 int[]에 대입
        String reverseNum = sb.reverse().toString();

        int[] answer = new int[reverseNum.length()];

        for(int i = 0 ; i < sb.length() ; i++){
            answer[i] = reverseNum.charAt(i) - '0'; // 문자로 변경된 숫자 값을 빼주기 위해
        }
        return answer;
    }
}
