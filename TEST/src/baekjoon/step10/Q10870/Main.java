/*
	피보나치 수 역시 단순 for문으로도 구할 수 있지만, 학습을 위해 재귀를 써 봅시다.
	
	피보나치 수는 0과 1로 시작한다. 0번째 피보나치 수는 0이고, 1번째 피보나치 수는 1이다. 그 다음 2번째 부터는 바로 앞 두 피보나치 수의 합이 된다.
	이를 식으로 써보면 Fn = Fn-1 + Fn-2 (n>=2)가 된다.
	n=17일때 까지 피보나치 수를 써보면 다음과 같다.
	0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597
	n이 주어졌을 때, n번째 피보나치 수를 구하는 프로그램을 작성하시오.
	첫째 줄에 n이 주어진다. n은 20보다 작거나 같은 자연수 또는 0이다.
	첫째 줄에 n번째 피보나치 수를 출력한다.
	
	예제입력 : 	10
	예제출력 : 	55
*/
package baekjoon.step10.Q10870;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[25];
		
		arr[1] = 1;
		for(int i = 2; i <= 20; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
		}
		
		System.out.println(arr[n]);
		sc.close();
	}

}
