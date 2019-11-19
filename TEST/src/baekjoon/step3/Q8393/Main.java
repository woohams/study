/*
	n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
	첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.
	1부터 n까지 합을 출력한다.
	
	예제입력 : 3
	예제출력 : 6
*/
package baekjoon.step3.Q8393;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.close();
		
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			sum += i;
		}
		
		System.out.println(sum);
	}

}
