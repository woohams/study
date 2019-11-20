/*
	정수를 문자열로 입력받는 문제. Python처럼 정수 크기에 제한이 없다면 상관 없으나, 예제 3은 일반적인 정수 자료형에 담기에 너무 크다는 점에 주목합시다.
	
	N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
	첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.
	입력으로 주어진 숫자 N개의 합을 출력한다.
	
	예제입력 : 	1 1		5 54321		25 70000 ...0		11 10987654321
	예제출력 :	1		15			7					46
	
*/
package baekjoon.step7.Q11720;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;

		String nums = sc.next();
		
		for(int i = 0; i < num; i++) {            
            sum += nums.charAt(i) - '0';           // ASCII CODE 사용 
        }
		sc.close();
        System.out.println(sum);
	}

}
