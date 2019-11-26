/*
	소수 응용 문제 2
	1보다 큰 자연수 중에서  1과 자기 자신을 제외한 약수가 없는 자연수를 소수라고 한다.
	 예를 들어, 5는 1과 5를 제외한 약수가 없기 때문에 소수이다. 하지만, 6은 6 = 2 × 3 이기 때문에 소수가 아니다.
	골드바흐의 추측은 유명한 정수론의 미해결 문제로, 2보다 큰 모든 짝수는 두 소수의 합으로 나타낼 수 있다는 것이다. 이러한 수를 골드바흐 수라고 한다. 
	또, 짝수를 두 소수의 합으로 나타내는 표현을 그 수의 골드바흐 파티션이라고 한다. 
	예를 들면, 4 = 2 + 2, 6 = 3 + 3, 8 = 3 + 5, 10 = 5 + 5, 12 = 5 + 7, 14 = 3 + 11, 14 = 7 + 7이다. 
	10000보다 작거나 같은 모든 짝수 n에 대한 골드바흐 파티션은 존재한다.
	2보다 큰 짝수 n이 주어졌을 때, n의 골드바흐 파티션을 출력하는 프로그램을 작성하시오. 
	만약 가능한 n의 골드바흐 파티션이 여러 가지인 경우에는 두 소수의 차이가 가장 작은 것을 출력한다.
	첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고 짝수 n이 주어진다. (4 ≤ n ≤ 10,000)
	각 테스트 케이스에 대해서 주어진 n의 골드바흐 파티션을 출력한다. 출력하는 소수는 작은 것부터 먼저 출력하며, 공백으로 구분한다.
	
	예제입력 : 	3
			8
			10
			16
	예제출력 : 	3	5
			5	5
			5	11
*/
package baekjoon.step9.Q9020;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		while(T > 0) {
			int n2 = sc.nextInt();
			int min = n2 / 2;
			int max = n2 - min;
			
			if(n2 % 2 == 0) {
				boolean flag = true;
				while(flag) {
					int minChk = sosu(min);
					int maxChk = sosu(max);
					
					if(minChk == 0 && maxChk == 0) {
						flag = false;
						System.out.print(min);
						System.out.print(" " + max + "\n");
					}
					else {
						min -= 1;
						max += 1;
					}
				}
				T--;
			} else {
				System.out.println("짝수를 입력해주세요.");
			}
		}
		sc.close();
	}
	
	public static int sosu(int num) {
		int chk = 0;
		for(int i = 2; i < num; i++) {
			if(num % i == 0) {	// 소수가 아닐때
				chk = 1;	
				break;
			}
		}
		if(chk == 1)
			return 1;
		else
			return 0;
	}

}
