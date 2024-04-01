package day6;

import java.util.Scanner;

public class PrintTriangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();
        int n = sc.nextInt();

        for (int i = 1 ; i <= n ; i++){
            StringBuilder append = stringBuilder.append("*");
            System.out.println(append);
        }
    }

    public static void solution(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/* */
