/*
	평균은 넘겠지?
	
	대학생 새내기들의 90%는 자신이 반에서 평균은 넘는다고 생각한다. 당신은 그들에게 슬픈 진실을 알려줘야 한다.
	첫째 줄에는 테스트 케이스의 개수 C가 주어진다.
	둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고, 이어서 N명의 점수가 주어진다. 
	점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
	각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력한다.
	
	예제입력 : 	5
			5 50 50 70 80 100
			7 100 95 90 80 70 60 50
			3 70 90 80
			3 70 90 81
			9 100 99 98 97 96 95 94 93 91
	예제출력 : 	40.000%
			57.143%
			33.333%
			66.667%
			55.556%
*/
package baekjoon.step5.Q4344;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int n, sum, cnt;
        int score[] = new int[1000];
         
        for (int i = 0; i <= c; i++) {
            n = sc.nextInt();
            sum = 0;
            cnt = 0;
            for (int j = 0; j < n; j++) {
                score[j] = sc.nextInt();
                sum += score[j];
            }
            double avg = (double)sum / n;
             
            for (int j = 0; j <= n; j++) {
                if (score[j] > avg) {
                	cnt++;
                }
            }
            System.out.printf("\n%.3f", 100.0 * cnt / n);
            System.out.print("%");
        }
        sc.close();
    }
	
	/*	// 얘는 백준에서 정답처리 됨.. 위는 안됨.. 차이점 모르겠음..
		import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int n, total, count;
        double avg;
        int scores[] = new int[1000];
         
        for (int i = 0; i < c; ++i) {
            n = sc.nextInt();
            total = 0;
            count = 0;
            for (int j = 0; j < n; ++j) {
                scores[j] = sc.nextInt();
                total += scores[j];
            }
            avg = (double)total / n;
             
            for (int j = 0; j < n; ++j) {
                if (scores[j] > avg) {
                    count++;
                }
            }
            System.out.printf("%.3f", 100.0 * count / n);
            System.out.println("%");
        }
        sc.close();
    }
}
	*/

}
