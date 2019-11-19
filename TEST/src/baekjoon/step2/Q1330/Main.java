/*
	두 수를 비교한 결과를 출력하는 문제
	
	두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
	
	첫째 줄에 A와 B가 주어진다. A와 B는 공백 한 칸으로 구분되어져 있다.
	
	첫째 줄에 다음 세 가지 중 하나를 출력한다.
	- A가 B보다 큰 경우에는 '>'를 출력한다.
	- A가 B보다 작은 경우에는 '<'를 출력한다.
	- A와 B가 같은 경우에는 '=='를 출력한다.

	예제입력 : 1 2		10 2		5 5
	예제출력 : <		>			==
*/
package baekjoon.step2.Q1330;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a > b)
			System.out.println(">");
		else if(a < b)
			System.out.println("<");
		else if(a == b)
			System.out.println("==");
		sc.close();
	}

}
