/*
	A+B를 여러 번 출력하는 문제
	
	두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
	첫째 줄에 테스트 케이스의 개수 T가 주어진다.
	각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
	각 테스트 케이스마다 A+B를 출력한다.
	
	예제입력 : 5		예제출력 : 	2
			1 1				5
			2 3				7
			3 4				17
			9 8				7
			5 2

*/
package baekjoon.step3.Q10950;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int i = 0; i < t; i ++) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a + b);
		}
		
		sc.close();
	}

}
