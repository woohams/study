/*
	직사각형을 완성하는 문제
	세 점이 주어졌을 때, 축에 평행한 직사각형을 만들기 위해서 필요한 네 번째 점을 찾는 프로그램을 작성하시오.
	세 점의 좌표가 한 줄에 하나씩 주어진다. 좌표는 1보다 크거나 같고, 1000보다 작거나 같은 정수이다.
	직사각형의 네 번째 점의 좌표를 출력한다.
	
	예제입력 : 	30 20
			10 10
			10 20
	예제출력 : 	30 10
*/
package baekjoon.step9.Q3009;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int [] x = new int[1001];
		int [] y = new int[1001];
		
		for(int i = 0; i <= 2; i++) {
			x[sc.nextInt()]++;
			y[sc.nextInt()]++;
		}
		
		sc.close();
		
		for(int i = 1; i < 1001; i++) {
			if(x[i] % 2 == 1) {
				System.out.print(i);
			}
		}
		
		for(int i = 1; i < 1001; i++) {
			if(y[i] % 2 == 1) {
				System.out.print(" " + i);
			}
		}
		
	}

}
