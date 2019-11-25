/*
	에라토스테네스의 체로 풀어 봅시다.
	M이상 N이하의 소수를 모두 출력하는 프로그램을 작성하시오.
	첫째 줄에 자연수 M과 N이 빈 칸을 사이에 두고 주어진다. (1 ≤ M ≤ N ≤ 1,000,000)
	한 줄에 하나씩, 증가하는 순서대로 소수를 출력한다.
	
	예제입력 : 	3
			16
	예제출력 : 	3
			5
			7
			11
			13
			
*/
package baekjoon.step9.Q1929;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int n2 = sc.nextInt();
		int cnt = 0;
		
		sc.close();
		
		for(int i = n; i <= n2; i++) {
			if(i == 1) {
				cnt = 1;
			}
			int max = (int)Math.sqrt(i) + 1;	// 에라토스테네스의 체
			for(int j = 2; j < max; j++) {
				if(i % j == 0) {
					cnt = 1;
					break;
				}
			}
			
			if(cnt == 0) 
				System.out.println(i);
			cnt = 0;
		}
		
	}
	/*
	
	//	JAVA로 에라토스테네스의 체 구현, 2 ~ N 까지 소수출력 { .. , .. , ...} 
	//	ArrayList로 구현

	public static void main(String[] args) {
		ArrayList<Boolean> primeList;
	
		// 사용자로부터의 콘솔 입력
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
	
		// n <= 1 일 때 종료
		if(n <= 1) return;
	
		// n+1만큼 할당
		primeList = new ArrayList<Boolean>(n+1);
		// 0번째와 1번째를 소수 아님으로 처리
		primeList.add(false);
		primeList.add(false);
		// 2~ n 까지 소수로 설정
		for(int i=2; i<=n; i++ )
			primeList.add(i, true);
	
		// 2 부터  ~ i*i <= n
		// 각각의 배수들을 지워간다.
		for(int i=2; (i*i)<=n; i++){
			if(primeList.get(i)){
				for(int j = i*2; j<=n; j+=i) primeList.set(j, false);
				//i*i 미만은 이미 처리되었으므로 j의 시작값은 i*i로 최적화할 수 있다.
			}
		}
		StringBuffer sb = new StringBuffer();
		sb.append("{");
		for(int i=0; i<=n; i++){
			if(primeList.get(i) == true){
				sb.append(i);
				sb.append(",");
			}
		}
		sb.setCharAt(sb.length()-1, '}');
	
		System.out.println(sb.toString());
	
	}*/
}
