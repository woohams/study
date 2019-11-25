/*
	달팽이의 움직임을 계산하는 문제
	
	땅 위에 달팽이가 있다. 이 달팽이는 높이가 V미터인 나무 막대를 올라갈 것이다.
	달팽이는 낮에 A미터 올라갈 수 있다. 하지만, 밤에 잠을 자는 동안 B미터 미끄러진다. 또, 정상에 올라간 후에는 미끄러지지 않는다.
	달팽이가 나무 막대를 모두 올라가려면, 며칠이 걸리는지 구하는 프로그램을 작성하시오.
	첫째 줄에 세 정수 A, B, V가 공백으로 구분되어서 주어진다. (1 ≤ B < A ≤ V ≤ 1,000,000,000)
	첫째 줄에 달팽이가 나무 막대를 모두 올라가는데 며칠이 걸리는지 출력한다.
	예제입력 : 	2	1	5
	예제출력 : 	4
*/
package baekjoon.step8.Q2869;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
/*
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int v = sc.nextInt();
		
		sc.close();
		
		int day = 0;
		int i = 0;
		
		while(i < v) {
			day++;
			i += a;
				
			if(i >= v) 
				break;
				
			i -= b;
		}
		
		System.out.println(day);*/
		
		
		/*Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int v = sc.nextInt();
		
		sc.close();
		
		int res = snail(a, b, v);
		System.out.println(res);
	}

	public static int snail(int A, int B, int V) {
		int sum = 0;
		
		sum = (V - B) / (A - B);
		if((V - B) % (A - B) != 0)
			sum++;
		
		return sum;*/
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
	    st = new StringTokenizer(br.readLine());

	    int a= Integer.parseInt(st.nextToken());
	    int b= Integer.parseInt(st.nextToken());
	    int v=Integer.parseInt(st.nextToken());

	    System.out.println(snail(a, b, v));
	    
	}

	   public static int snail(int A, int B, int V) {
		   
	      int sum = 0;

	      sum = (V - B) / (A - B);
	      if((V - B) % (A - B) != 0)
	    	  sum++;

	      return sum;

	   
	}
	
}




