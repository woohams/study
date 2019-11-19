/*
	입력이 끝날 때까지 A+B를 출력하는 문제. EOF에 대해 알아 보세요.
	
	두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
	입력은 여러 개의 테스트 케이스로 이루어져 있다.
	각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
	각 테스트 케이스마다 A+B를 출력한다.
	
	예제입력 : 	1 1
			2 3
			3 4
			9 8
			5 2
	예제출력 : 	2
			5
			7
			17
			7
	
*/
package baekjoon.step4.Q10951;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.println(a + b);
		}
		
		sc.close();
		
	
		
	}

}
