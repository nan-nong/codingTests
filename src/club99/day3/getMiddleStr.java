package club99.day3;

public class getMiddleStr {
    public static void main(String[] args) {
        System.out.println(solution("qwer"));
    }

    public static String solution(String s) {
        String answer = "";
        if(s.length() % 2 == 0 ) { // 짝수
            answer = s.substring(s.length()/2 - 1, s.length()/2 + 1);
        } else { // 홀수
            answer = s.substring(s.length() / 2, s.length() / 2 + 1);
        }
        return answer;
    }
}
