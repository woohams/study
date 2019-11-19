/*
	최솟값과 최댓값을 찾는 문제
	
	N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
	첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 
	모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.
	첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.
	
	예제입력 : 	5
			20 10 35 30 7
	예제출력 : 	7
			35

*/
package baekjoon.step5.Q10818;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int max = -1000000;
		int min = 1000000;
		
		int[] arr = new int[n];
		for(int i : arr) {
			arr[i] = sc.nextInt();
			max = Math.max(max, arr[i]);
			min = Math.min(min, arr[i]);
		}
		sc.close();
		System.out.println(min + " " + max);
	}
}
