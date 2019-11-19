/*
	최댓값이 어디에 있는지 찾는 문제
	
	9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.
	예를 들어, 서로 다른 9개의 자연수
	3, 29, 38, 12, 57, 74, 40, 85, 61
	이 주어지면, 이들 중 최댓값은 85이고, 이 값은 8번째 수이다.

	첫 째 줄부터 아홉 번째 줄까지 한 줄에 하나의 자연수가 주어진다. 주어지는 자연수는 100 보다 작다.
	첫째 줄에 최댓값을 출력하고, 둘째 줄에 최댓값이 몇 번째 수인지를 출력한다.

	예제입력 : 	3
			29
			38
			12
			57
			74
			40
			85
			61
	예제출력 : 	85
			8
*/
package baekjoon.step5.Q2562;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[9];			
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();	
		}
		
		sc.close();
		
		int max = arr[0];			
		int index = 0 ;			
		
		for(int i = 1; i < arr.length; i++) {
			
			if(arr[i] > max) {							
				max = arr[i];
				index = i + 1;
			}
		}
		
		System.out.println(max);
		System.out.println(index);
	*/
		
		Scanner sc = new Scanner(System.in);
		
		int max = 0;
		int index = 0;
		
		for(int i = 1; i <= 9; i++) {
			int num = sc.nextInt();
			
			if(num > max) {
				max = num;
				index = i;
			}
			
		}
		sc.close();
		System.out.println(max);
		System.out.println(index);
		
	}

}





