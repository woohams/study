/*
	주어진 단어에서 가장 많이 사용된 알파벳을 출력하는 문제
	알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.
	첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.
	첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.

	예제입력 : 	Mississipi		zZa		z		baaa
	예제출력 : 	?				Z		Z		A
	
	
*/
package baekjoon.step7.Q1157;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		int [] arr = new int[26];
		
		for(int i = 0; i < s.length(); i++) {
			int index = Character.toLowerCase(s.charAt(i)) - 'a';
			arr[index]++;
		}
	
		int max = 0;
		char print = ' ';
		
		for(int i = 0; i < 26; i++) {
			if(arr[i] > max) {
				max = arr[i];
				print = (char)(i+65);	// 소문자 -> 대문자 (+65)
			} else if(arr[i] == max) {
				print = '?';
			}
		}
		System.out.println(print);
		
	}

}
