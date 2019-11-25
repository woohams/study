/*
	소수를 찾는 문제 1
	주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.
	첫 줄에 수의 개수 N이 주어진다. N은 100이하이다. 다음으로 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다.
	주어진 수들 중 소수의 개수를 출력한다
	
	예제입력 : 	4
			1	3	5	7
	예제출력 : 	3
*/
package baekjoon.step9.Q1978;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int cnt = 0;
		boolean flag;
		
		for(int i = 0; i < n; i++) {	// 나눠지는 수
			int n2 = sc.nextInt();
			flag = false;
			
			for(int j = 2; j < n2; j++) {	// 나누는 수
				if(n2 % j == 0) {	// 소수가 아니라면
					flag = true;
					break;	
				}
			}
		
			if(!flag && n2 > 1)
				cnt++;
		}
		sc.close();
		System.out.println(cnt);
	}

}
