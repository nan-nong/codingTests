package day6;

import java.util.Arrays;

public class PrintRepeatedString {

    public static void main(String[] args) {
        System.out.println(solution("hello", 3));
    }
    static public String solution(String my_string, int n) {
        // 문자 쪼개서 배열에 넣고 n번만큼 반복 후 다시 붙이기
        char[] chars = my_string.toCharArray();
        String[] repeat = new String[my_string.length()];
        String answer = "";

        for(int i = 0 ; i < chars.length ; i++){
            char aChar = chars[i];

            repeat[i] = String.valueOf(aChar).repeat(n);
            answer += repeat[i].toString();
        }
        return answer;
    }

    /* 다른 풀이 */
    static public String solution2(String my_string, int n) {
        StringBuilder sb = new StringBuilder();
        for(char c : my_string.toCharArray()){
            sb.append((c + "").repeat(n));
        }
        return sb.toString();
    }
}
