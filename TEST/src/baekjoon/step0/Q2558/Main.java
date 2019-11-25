/*
	두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
	첫째 줄에 A, 둘째 줄에 B가 주어진다. (0 < A, B < 10)
	첫째 줄에 A+B를 출력한다.
	
	예제입력 : 	1
			2
	예제출력 : 	3
	
*/
package baekjoon.step0.Q2558;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		sc.close();
		
		System.out.println(A + B);
		
	}
	
}
