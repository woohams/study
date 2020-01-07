/*
	시간 복잡도가 O(n²)인 정렬 알고리즘으로 풀 수 있습니다. 예를 들면 삽입 정렬, 거품 정렬 등이 있습니다.
	N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
	첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000)이 주어진다. 둘째 줄부터 N개의 줄에는 숫자가 주어진다. 이 수는 절댓값이 1,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.
	첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.
	예제입력 : 	5
			5
			2
			3
			4
			1
	예제출력 : 	1
			2
			3
			4
			5
			
*/
package baekjoon.step14.Q2750;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		
		for(int i = 0; i < cnt; i++) {
			int num = sc.nextInt();
			list.add(num);
		}
		sc.close();
		Collections.sort(list);
		for(int i : list) {
			System.out.println(i);
		}
		
	}

}
