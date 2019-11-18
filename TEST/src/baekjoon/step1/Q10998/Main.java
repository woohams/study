package baekjoon.step1.Q10998;

/*
 	두 정수 A와 B를 입력받은 다음, A×B를 출력하는 프로그램을 작성하시오.
 	
 	첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
 	
 	첫째 줄에 A×B를 출력한다.
 	
 	예제입력 : 1 2			2
 	예제출력 : 3 4			12 
*/

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
	     int a = sc.nextInt();
	     int b = sc.nextInt();
	     sc.close();
	     
	     System.out.println(a * b);
		
	}

}
