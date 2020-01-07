/*
	단어의 순서를 정의하여 정렬하는 문제
	알파벳 소문자로 이루어진 N개의 단어가 들어오면 아래와 같은 조건에 따라 정렬하는 프로그램을 작성하시오.
	1. 길이가 짧은 것부터
	2. 길이가 같으면 사전 순으로
	첫째 줄에 단어의 개수 N이 주어진다. (1≤N≤20,000) 둘째 줄부터 N개의 줄에 걸쳐 알파벳 소문자로 이루어진 단어가 한 줄에 하나씩 주어진다. 주어지는 문자열의 길이는 50을 넘지 않는다.
	조건에 따라 정렬하여 단어들을 출력한다. 단, 같은 단어가 여러 번 입력된 경우에는 한 번씩만 출력한다.
	예제입력 : 	13
			but
			i
			wont
			hesitate
			no
			more
			no
			more
			it
			cannot
			wait
			im
			yours
	예제출력 : 	i
			im
			it
			no
			but
			more
			wait
			wont
			yours
			cannot
			hesitate
*/
package baekjoon.step14.Q1181;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < N; i++) {
			String tmp = br.readLine();
			if (!list.contains(tmp))
				list.add(tmp);
		}
		
		Comparator<String> myComparator = new Comparator<String>() {
			public int compare(String x, String y) {
				if (x.length() > y.length()) {
					return 1;
				} else if (x.length() == y.length()) {
					return x.compareTo(y);
				}
				return -1;
			}
		};
		
		Collections.sort(list, myComparator);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

	}

}
