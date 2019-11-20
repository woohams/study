/*
	조건에 맞는 문자열을 찾는 문제
	
	그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다. 
	예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고, kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만, 
	aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.
	단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.
	첫째 줄에 단어의 개수 N이 들어온다. N은 100보다 작거나 같은 자연수이다. 둘째 줄부터 N개의 줄에 단어가 들어온다. 
	단어는 알파벳 소문자로만 되어있고 중복되지 않으며, 길이는 최대 100이다.
	첫째 줄에 그룹 단어의 개수를 출력한다.
	
	예제입력 : 	3 happy new year	4 aba abab abcabc a
	예제출력 : 	3					1
*/
package baekjoon.step7.Q1316;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int flag = 0;
		int cnt = 0;
		
		String [] arr = new String[n];
		char[] c;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.next();
			c = arr[i].toCharArray();	// 짤라서 저장
			
			for(int j = 0; j < c.length; j++) {	// 첫번째 배열을
				for(int k = j + 1; k < c.length; k++) {	// 그 다음것들과 모두 비교
					if(c[j] == c[k] & c[j] != c[k - 1]) {	// 같은 경우 사이에 있는게 다르면
						flag = 1;	// flag를 1로 변경
					}
				}
			}
			if(flag == 0) {
				cnt++;	// flag가 0인 얘들 카운트(그룹 단어)
			}
			flag = 0;	// 다음 배열과 연결되는 얘 초기화 ex) abba a a -> flag초기화 안해주면 a는 그룹단어 x, 
		}
		sc.close();
		System.out.println(cnt);
	}

}
