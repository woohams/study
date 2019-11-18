package baekjoon.step1.Q1008;

/*
두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.

첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)

첫째 줄에 A/B를 출력한다. 실제 정답과 출력값의 절대오차 또는 상대오차가 10-9 이하이면 정답이다.

예제입력 : 1 3				4 5
예제출력 : 0.3333333333		0.8				

*/
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextInt();
		double b = sc.nextInt();
		sc.close();

		System.out.println(a / b);
	}
}
