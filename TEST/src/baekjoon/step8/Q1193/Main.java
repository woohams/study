/*
	분수의 순서에서 규칙을 찾는 문제
	
	무한히 큰 배열에 다음과 같이 분수들이 적혀있다.

	1/1	1/2	1/3	1/4	1/5	…
	2/1	2/2	2/3	2/4	…	…
	3/1	3/2	3/3	…	…	…
	4/1	4/2	…	…	…	…
	5/1	…	…	…	…	…
	…	…	…	…	…	…
	이와 같이 나열된 분수들을 1/1 -> 1/2 -> 2/1 -> 3/1 -> 2/2 -> … 과 같은 지그재그 순서로 차례대로 1번, 2번, 3번, 4번, 5번, … 분수라고 하자.
	X가 주어졌을 때, X번째 분수를 구하는 프로그램을 작성하시오.
	첫째 줄에 X(1 ≤ X ≤ 10,000,000)가 주어진다.
	첫째 줄에 분수를 출력한다.
	예제입력 : 	14
	예제출력 :	2/4
*/
package baekjoon.step8.Q1193;

import java.io.*;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int line = 0;
		int cnt = 0;
		while (cnt < n) {
			line++;
			cnt = line * (line + 1) / 2;
		}
		if (line % 2 != 0) {
			int top = 1 + (cnt - n);
			int bottom = line - (cnt - n);
			System.out.println(top + "/" + bottom);
		} else {
			int top = line - (cnt - n);
			int bottom = 1 + (cnt - n);	
			System.out.println(top + "/" + bottom);
		}

	}

}
