/*
	5와 3을 최소 횟수로 합하여 N을 만드는 문제
	상근이는 요즘 설탕공장에서 설탕을 배달하고 있다. 상근이는 지금 사탕가게에 설탕을 정확하게 N킬로그램을 배달해야 한다. 설탕공장에서 만드는 설탕은 봉지에 담겨져 있다. 봉지는 3킬로그램 봉지와 5킬로그램 봉지가 있다.
	상근이는 귀찮기 때문에, 최대한 적은 봉지를 들고 가려고 한다. 예를 들어, 18킬로그램 설탕을 배달해야 할 때, 3킬로그램 봉지 6개를 가져가도 되지만, 5킬로그램 3개와 3킬로그램 1개를 배달하면, 더 적은 개수의 봉지를 배달할 수 있다.
	상근이가 설탕을 정확하게 N킬로그램 배달해야 할 때, 봉지 몇 개를 가져가면 되는지 그 수를 구하는 프로그램을 작성하시오.
	첫째 줄에 N이 주어진다. (3 ≤ N ≤ 5000)
	상근이가 배달하는 봉지의 최소 개수를 출력한다. 만약, 정확하게 N킬로그램을 만들 수 없다면 -1을 출력한다.

	예제입력 : 	18		4		6		9		11
	예제출력 : 	4		-1		2		3		3
*/
package baekjoon.step8.Q2839;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		if (n % 5 == 0) {
			System.out.println(n / 5);
			return;
		} else {

			int n2 = n / 5;
			for (int i = n2; i > 0; i--) {
				int temp = n - (i * 5);
				if (temp % 3 == 0) {
					System.out.println(i + (temp / 3));
					return;
				}
			}
		}

		if (n % 3 == 0) {
			System.out.println(n / 3);
		} else {
			System.out.println(-1);
		}
		return;
	}
}
