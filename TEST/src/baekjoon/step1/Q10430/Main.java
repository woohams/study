/*
	네 개의 계산식을 계산하는 문제. 이 문제를 푼 다음에는 직접 입력을 만들어서 넣어 봅시다. 어떤 사실을 관찰할 수 있나요?
	
	(A+B)%C는 (A%C + B%C)%C 와 같을까?
	(A×B)%C는 (A%C × B%C)%C 와 같을까?
	세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.
	
	첫째 줄에 A, B, C가 순서대로 주어진다. (2 ≤ A, B, C ≤ 10000)
	
	첫째 줄에 (A+B)%C, 둘째 줄에 (A%C + B%C)%C, 셋째 줄에 (A×B)%C, 넷째 줄에 (A%C × B%C)%C를 출력한다.
	
	예제입력 : 5 8 4
	예제출력 : 	1 
			1 
			0 
			0

 */
package baekjoon.step1.Q10430;



import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		sc.close();
		
		System.out.println((a + b) % c);
		System.out.println((a % c + b % c) % c);
		System.out.println((a * b) % c);
		System.out.println((a % c * b % c) % c);
	}
}
