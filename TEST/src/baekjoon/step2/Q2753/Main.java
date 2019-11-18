/*
	연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력하는 프로그램을 작성하시오.
	윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때 이다.
	예를들어, 2012년은 4의 배수라서 윤년이지만, 1900년은 4의 배수이지만, 100의 배수이기 때문에 윤년이 아니다.
	하지만, 2000년은 400의 배수이기 때문에 윤년이다.
	
	첫째 줄에 연도가 주어진다. 연도는 1보다 크거나 같고, 4000보다 작거나 같은 자연수이다.
	
	첫째 줄에 윤년이면 1, 아니면 0을 출력한다.
	
	예제입력 : 2000
	예제출력 : 1
*/
package baekjoon.step2.Q2753;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		if(a % 400 == 0)
			System.out.println(1);
		else if(a % 100 == 0)
			System.out.println(0);
		else if(a % 4 == 0)
			System.out.println(1);
		else
			System.out.println(0);
		sc.close();
	}

}
