/*
	아스키 코드에 대해 알아보는 문제
	알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.
	알파벳 소문자, 대문자, 숫자 0-9 중 하나가 첫째 줄에 주어진다.
	입력으로 주어진 글자의 아스키 코드 값을 출력한다.
	
	입력예제 : 	A	C	0	9	a	z
	출력예제 : 	65	67	48	57	97	122
*/
package baekjoon.step7.Q11654;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        sc.close();
        
        System.out.println(Integer.valueOf(c));
    }

}
