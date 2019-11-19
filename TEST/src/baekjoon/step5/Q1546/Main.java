/*
	평균을 조작하는 문제
	
	세준이는 기말고사를 망쳤다. 세준이는 점수를 조작해서 집에 가져가기로 했다. 일단 세준이는 자기 점수 중에 최댓값을 골랐다. 이 값을 M이라고 한다. 그리고 나서 모든 점수를 점수/M*100으로 고쳤다.
	예를 들어, 세준이의 최고점이 70이고, 수학점수가 50이었으면 수학점수는 50/70*100이 되어 71.43점이 된다.
	세준이의 성적을 위의 방법대로 새로 계산했을 때, 새로운 평균을 구하는 프로그램을 작성하시오.
	
	첫째 줄에 시험 본 과목의 개수 N이 주어진다. 이 값은 1000보다 작거나 같다. 둘째 줄에 세준이의 현재 성적이 주어진다. 이 값은 100보다 작거나 같은 음이 아닌 정수이고, 적어도 하나의 값은 0보다 크다.
	첫째 줄에 새로운 평균을 출력한다. 정답과의 절대/상대 오차는 10-2까지 허용한다.
	
	예제입력 : 	3			3				4					5						2
			40 80 60	10	20	30		1	100	100	100		1	2	4	8	16		3	10
	예제출력 :	75.00		66.666667		75.25				38.75					65.00
*/
package baekjoon.step5.Q1546;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int sum = 0;
		int m = 0;
		int score = 0;
		double avg = 0;
		
        for(int i = 0; i < n; i++) {
        	score = sc.nextInt();
        	sum += score;
        	
        	if(score > m) 
        		m = score;
        }
        sc.close();
        
        avg = 100.0 * sum / m / n;
        System.out.printf("%.2f", avg);
	}
	// 나머지가 안떨어지면 %.6f까지 출력하고 나누어 떨어지면 .2f까지 출력하는 방법??
}
