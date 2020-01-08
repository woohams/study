/*
	배열을 정렬하는 것은 쉽다. 수가 주어지면, 그 수의 각 자리수를 내림차순으로 정렬해보자.
	첫째 줄에 정렬하고자하는 수 N이 주어진다. N은 1,000,000,000보다 작거나 같은 자연수이다.
	첫째 줄에 자리수를 내림차순으로 정렬한 수를 출력한다.
	예제입력 : 	2143
	예제출력 : 	4321
*/
package baekjoon.step14.Q1427;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		for(int i = 0; i < s.length(); i++) {
			list.add(s.charAt(i) - 48);
		}
		sc.close();
		Collections.sort(list);
		for(int i = s.length() - 1; i > -1; --i) {
			System.out.print(list.get(i));
		}
		
	}

}
