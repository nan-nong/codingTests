package club99.day1;

public class sortStrDesc {

    public static void main(String[] args) {
        System.out.println(solution("Zbcdefg"));
    }

    /* 문자를 큰것부터 작은 순으로 정렬해주는 메소드 */
    private static String solution(String str) {
        char[] chars = str.toCharArray();

        for(int i = 0; i < chars.length; i++){
            for(int j = i+1 ; j < chars.length ; j++){
                if(chars[i] < chars[j]){
                    char temp;
                    temp = chars[i];
                    chars[i] = chars[j];
                    chars[j] = temp;
                }
            }
        }

        return String.valueOf(chars);
    }
}
