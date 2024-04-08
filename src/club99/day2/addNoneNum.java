package club99.day2;

/*  numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return */
public class addNoneNum {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 6, 7, 8, 0};
        System.out.println(solution(numbers));
    }

    public static int solution(int[] numbers) {
        // numbers의 길이만큼 반복해서 numbers에 배열에 들어있는 숫자 빼기
        int totalNum = 0;
        for (int i = 0; i <= 9 ; i++) {
            totalNum += i;
        }
        for(int num : numbers){
            totalNum -= num;
        }
        return totalNum;
    }
}
