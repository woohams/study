package test02.practice;

import java.util.Scanner;

public class test01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요.");
		int score = sc.nextInt();
		
		if(score>=90 && score<=100) {
			System.out.println("A");
		}
		
		
	}
	
}
