/*
	세 정수 중에 두 번째로 큰 정수를 찾는 문제
	
	세 정수 A, B, C가 주어진다. 이때, 두 번째로 큰 정수를 출력하는 프로그램을 작성하시오. 
	첫째 줄에 세 정수 A, B, C가 공백으로 구분되어 주어진다. (1 ≤ A, B, C ≤ 100)
	두 번째로 큰 정수를 출력한다.
	
	예제입력 : 20 30 10		30 30 10		40 40 40	20 10 10
	예제출력 : 20			30				40			10
	
*/

package baekjoon.step2.Q10817;

import java.util.Scanner;

public class Main {
	
	/*public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b= sc.nextInt();
		int c = sc.nextInt();
		
		if(a >= b && b >= c)
			System.out.println(b);
		else if(b >= a && a >= c)
			System.out.println(a);
		else if(c >= a && a>= b)
			System.out.println(a);
		sc.close();
	}*/
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] a = new int[3];
		int temp = 0;
		
		for(int i = 0; i < 3; i++) {
			a[i] = sc.nextInt();
		}
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			sc.close();
		}
		System.out.println(a[1]);
	}

	
}



