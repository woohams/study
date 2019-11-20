/*
	어떤 양의 정수 X의 자리수가 등차수열을 이룬다면, 그 수를 한수라고 한다. 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다. N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오. 
	첫째 줄에 1,000보다 작거나 같은 자연수 N이 주어진다.
	첫째 줄에 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력한다.
		
	예제입력 : 	110		1		210		1000
	예제출력 : 	99		1		105		144
	
	=> 	100의자리 미만의 수는 전부 한수가 된다.
		등차수열은 각 항들이 일정한 차이를 보이는 수열 (ex - 123(공차1), 753(공차-2), 111(공차0)
	
*/
package baekjoon.step6.Q1065;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int [] arr = new int[3];
		int han = 0;
		
		for(int i = 1; i <= n; i++) {
			if(i > 0 && i < 100) {
				han = i;
			} else if(i == 1000) {
				break;
			} else {
				int a = 0;
				int b = i;
				
				while(b > 0) {
					arr[a] = b % 10;
					b = b / 10;
					a++;
				}
				if(arr[0] - arr[1] == arr[1] - arr[2]) {
					han++;
				}
					
			}
		}
		System.out.println(han);
		sc.close();
		
	}

}
