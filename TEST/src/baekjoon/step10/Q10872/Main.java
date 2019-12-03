/*
	팩토리얼은 단순 for문으로도 구할 수 있지만, 학습을 위해 재귀를 써 봅시다.
	
	0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.
	첫째 줄에 정수 N(0 ≤ N ≤ 12)가 주어진다.
	첫째 줄에 N!을 출력한다.
	
	예제입력 : 	10
	예제출력 : 	3628800
	
*/
package baekjoon.step10.Q10872;

import java.util.Scanner;

public class Main {
	
	public static void main(String args[]) {
		/*
		Scanner sc= new Scanner(System.in);
		
		int n = sc.nextInt();
        int temp = 1;
         
        for(int i = n; i > 0; i--) {
            temp = temp * i;
        }
        sc.close();
        System.out.println(temp);	*/
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println(loop(a));
		sc.close();
	}



	static int loop(int a) {

		int num = 1;
		
		for (int i = a; i >= 1; i--) {
			num *= i;
		}
		return num;

	}
		
	
}
