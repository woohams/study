/*
	재귀적인 패턴을 재귀함수로 찍는 문제 1
	예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.
	첫째 줄에 N이 주어진다. N은 항상 3의 제곱꼴인 수이다. (3, 9, 27, ...) (N=3k, 1 ≤ k < 8)
	첫째 줄부터 N번째 줄까지 별을 출력한다.
	예제입력 : 27
	예제출력 : 	***************************
			* ** ** ** ** ** ** ** ** *
			***************************
			***   ******   ******   ***
			* *   * ** *   * ** *   * *
			***   ******   ******   ***
			***************************
			* ** ** ** ** ** ** ** ** *
			***************************
			*********         *********
			* ** ** *         * ** ** *
			*********         *********
			***   ***         ***   ***
			* *   * *         * *   * *
			***   ***         ***   ***
			*********         *********
			* ** ** *         * ** ** *
			*********         *********
			***************************
			* ** ** ** ** ** ** ** ** *
			***************************
			***   ******   ******   ***
			* *   * ** *   * ** *   * *
			***   ******   ******   ***
			***************************
			* ** ** ** ** ** ** ** ** *
			***************************
*/
package baekjoon.step10.Q2447;

import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		starPrn(Integer.parseInt(br.readLine()));
	}

	protected static void starPrn(int n) {
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				
				int x = i;
				int y = j;
				
				while (x > 0) {
					if (x % 3 == 1 && y % 3 == 1) {
						break;
					}

					x /= 3;
					y /= 3;
				}
				
				sb.append(x == 0 ? '*' : ' ');	// 나머지가 1인것들만 자기숫자로 출력, 아니면 0 
			}
			
			sb.append('\n');
		}
		
		System.out.println(sb);
	}
	
}


