/*
	스택의 개념을 익히고 실습하는 문제
	정수를 저장하는 스택을 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.

	명령은 총 다섯 가지이다.
	push X: 정수 X를 스택에 넣는 연산이다.
	pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
	size: 스택에 들어있는 정수의 개수를 출력한다.
	empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
	top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
	
	첫째 줄에 주어지는 명령의 수 N (1 ≤ N ≤ 10,000)이 주어진다. 둘째 줄부터 N개의 줄에는 명령이 하나씩 주어진다. 주어지는 정수는 1보다 크거나 같고, 100,000보다 작거나 같다. 문제에 나와있지 않은 명령이 주어지는 경우는 없다.
	출력해야하는 명령이 주어질 때마다, 한 줄에 하나씩 출력한다.
	
	예제입력 : 	14				예제출력 : 	2
			push 1					2
			push 2					0
			top						2
			size					1
			empty					-1
			pop						0
			pop						1
			pop						-1
			size					0
			empty					3
			pop
			push 3
			empty
			top
			
	예제입력 : 	7				예제출력 : 	-1
			pop						-1
			top						123
			push 123				123
			top						-1
			pop						-1
			top
			pop
*/

/*
	1) for문을 돌리기위한 횟수 스캐너 int n과
	명령문을 받기위한 String 스캐너
	
	2)
	push X: 정수 X를 스택에 넣는 연산이다.
	-> 배열 생성 후 넣을때마다 포인터를 ++ (시작을 -1로잡으면 0번째부터 들어가게 가능)
	
	pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 
	만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
	-> 포인터가 -1일경우 -1출력, 그 외에경우 배열의 포인터가 가르키는 위치출력 후 포인터--
	
	size: 스택에 들어있는 정수의 개수를 출력한다.
	-> 포인터 +1하면 크기(size)
	
	empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
	-> 마찬가지로 포인터가 if -1이면 1출력 else 0출력
	
	top: 스택의 가장 위에 있는 정수를 출력한다. 
	만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
	-> 포인터가 -1이면 -1출력 아니면 포인터출력	// 포인터? 탑?
*/
package baekjoon.step0.Q10828;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int [] arr = new int[n];
		int top = -1;
		String input = " ";
		
		for(int i = 0; i < n; i++) {
			input = sc.next();
			
			if(input.equals("push")) {
				top++;
				arr[top] = sc.nextInt();
			} else if(input.equals("pop")) {
				if(top == -1) {
					System.out.println("-1");
				} else {
					System.out.println(arr[top]);
					top--;
				}
			} else if(input.equals("size")) {
				System.out.println(top + 1);
			} else if(input.equals("empty")) {
				if(top == -1) {
					System.out.println("1");
				} else {
					System.out.println("0");
				}
			} else if(input.equals("top")) {
				if(top == -1) {
					System.out.println("-1");
				} else {
					System.out.println(arr[top]);
				}
			}
			
		}
		
		sc.close();
	}

}
