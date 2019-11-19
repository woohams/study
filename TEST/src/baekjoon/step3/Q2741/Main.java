/*
	1부터 N까지 출력하는 문제
	
	자연수 N이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
	첫째 줄에 100,000보다 작거나 같은 자연수 N이 주어진다.
	첫째 줄부터 N번째 줄 까지 차례대로 출력한다.
	
	예제출력 : 5
	예제입력 : 	1
			2
			3
			4
			5

*/

package baekjoon.step3.Q2741;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		for(int i = 1; i <= n; i++) {
			System.out.println(i);
		}
		
	}

}
