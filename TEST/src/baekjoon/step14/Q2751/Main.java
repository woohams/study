/*
	시간 복잡도가 O(nlogn)인 정렬 알고리즘으로 풀 수 있습니다. 예를 들면 병합 정렬, 힙 정렬 등이 있지만, 어려운 알고리즘이므로 지금은 언어에 내장된 정렬 함수를 쓰는 것을 추천드립니다
	N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
	첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄부터 N개의 줄에는 숫자가 주어진다. 이 수는 절댓값이 1,000,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.
	첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.
	
	예제입력 : 	5
			5
			4
			3
			2
			1
	예제출력 : 	1
			2
			3
			4
			5

*/
package baekjoon.step14.Q2751;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		try { 
			int num = Integer.parseInt(br.readLine()); 
			ArrayList<Integer> data = new ArrayList<Integer>(); 
			for(int i = 0; i < num; i++) { 
				data.add(Integer.parseInt(br.readLine())); 
			} 
			Collections.sort(data);
			for(int i = 0; i < num; i++) { 
				System.out.println(data.get(i));
			} 
		} catch (Exception e) { 
			e.printStackTrace();
		}
	}


}
