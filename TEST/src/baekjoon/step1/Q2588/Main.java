/*
	빈 칸에 들어갈 수는?
	
	(세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
	 	
		472	--(1)
	x	385 --(2)
	ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		2360 --(3)
	   3776  --(4)
	  1416   --(5)
	ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	  181720 --(6)
 */
package baekjoon.step1.Q2588;


import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int c = b % 10;
		int d = b % 100 / 10;
		int e = b / 100 ;
		sc.close();
		
		System.out.println(c * a);
		System.out.println(d * a);
		System.out.println(e * a);
		System.out.println((c * a) + (d * a * 10) + (e * a * 100));
	}
}
