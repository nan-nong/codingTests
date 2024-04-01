package day6;

public class ReverseString {

    public static void main(String[] args) {
        solution("jaron");
    }

    static public String solution(String my_string) {
        // 문자열을 하나씩 array에 담아서 거꾸로 돌리기
        char[] chars = my_string.toCharArray();
        char[] reverseChars = new char[my_string.length()];

        for (int i = 0 ; i < chars.length ; i++){
            reverseChars[i] = chars[chars.length - 1 - i];
        }
        String answer = String.valueOf(reverseChars);
        return answer;
    }
}
