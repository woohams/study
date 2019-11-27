/*
	피타고라스의 정리에 대해 배우는 문제
	과거 이집트인들은 각 변들의 길이가 3, 4, 5인 삼각형이 직각 삼각형인것을 알아냈다. 주어진 세변의 길이로 삼각형이 직각인지 아닌지 구분하시오.
	입력은 여러개의 테스트케이스로 주어지며 마지막줄에는 0 0 0이 입력된다. 각 테스트케이스는 모두 30,000보다 작은 양의 정수로 주어지며, 각 입력은 변의 길이를 의미한다.
	각 입력에 대해 직각 삼각형이 맞다면 "right", 아니라면 "wrong"을 출력한다.
	
	예제입력 : 	6 8 10
			25 52 60
			5 12 13
			0 0 0
	예제출력 : 	right
			wrong
			right
			
*/
package baekjoon.step9.Q4153;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		boolean flag = true;

		while (flag) {
			
			ArrayList<Integer> list = new ArrayList<Integer>();	// 초기화를 위해서 while문 안쪽에 선언
			
			for (int i = 0; i < 3; i++) {
				int a = sc.nextInt();

				if (a >= 0 && a < 30000) {
					list.add(a);
				}

				Collections.sort(list);	// 정렬, 가장 큰 수 찾기위함

			}
			
			if (list.get(0) == 0 && list.get(1) == 0 && list.get(2) == 0) {
				flag = false;	// 수가 전부 0이면 멈춤
			} else if (list.get(0) * list.get(0) + list.get(1) * list.get(1) == list.get(2) * list.get(2)) {	// 정렬한 대로 피타고라스 정의 이용 [a제곱 + b제곱 = c제곱]
				System.out.println("right");
			} else {
				System.out.println("wrong");
			}

		}
		
		sc.close();
		
	}

}
