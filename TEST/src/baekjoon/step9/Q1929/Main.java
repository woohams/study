/*
	에라토스테네스의 체로 풀어 봅시다.
	M이상 N이하의 소수를 모두 출력하는 프로그램을 작성하시오.
	첫째 줄에 자연수 M과 N이 빈 칸을 사이에 두고 주어진다. (1 ≤ M ≤ N ≤ 1,000,000)
	한 줄에 하나씩, 증가하는 순서대로 소수를 출력한다.
	
	예제입력 : 	3
			16
	예제출력 : 	3
			5
			7
			11
			13
			
*/
package baekjoon.step9.Q1929;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int n2 = sc.nextInt();
		int cnt = 0;
		
		sc.close();
		
		for(int i = n; i <= n2; i++) {
			if(i == 1) {
				cnt = 1;
			}
			int max = (int)Math.sqrt(i) + 1;	// 에라토스테네스의 체
			for(int j = 2; j < max; j++) {
				if(i % j == 0) {
					cnt = 1;
					break;
				}
			}
			
			if(cnt == 0) 
				System.out.println(i);
			cnt = 0;
		}
		
	}

}
