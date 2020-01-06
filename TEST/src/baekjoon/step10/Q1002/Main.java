/*
	조규현과 백승환은 터렛에 근무하는 직원이다. 하지만 워낙 존재감이 없어서 인구수는 차지하지 않는다. 다음은 조규현과 백승환의 사진이다.
	[대충 터렛 사진]
	이석원은 조규현과 백승환에게 상대편 마린(류재명)의 위치를 계산하라는 명령을 내렸다. 조규현과 백승환은 각각 자신의 터렛 위치에서 현재 적까지의 거리를 계산했다.
	조규현의 좌표 (x1, y1)와 백승환의 좌표 (x2, y2)가 주어지고, 조규현이 계산한 류재명과의 거리 r1과 백승환이 계산한 류재명과의 거리 r2가 주어졌을 때, 류재명이 있을 수 있는 좌표의 수를 출력하는 프로그램을 작성하시오.
	첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 다음과 같이 이루어져 있다.
	한 줄에 x1, y1, r1, x2, y2, r2가 주어진다. x1, y1, x2, y2는 -10,000보다 크거나 같고, 10,000보다 작거나 같은 정수이고, r1, r2는 10,000보다 작거나 같은 자연수이다.
	각 테스트 케이스마다 류재명이 있을 수 있는 위치의 수를 출력한다. 만약 류재명이 있을 수 있는 위치의 개수가 무한대일 경우에는 -1을 출력한다.
	
	예제입력 : 	3
			0 0 13 40 0 37
			0 0 3 0 7 4
			1 1 1 1 1 5
	예제출력 : 	2
			1
			0
*/
package baekjoon.step10.Q1002;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int res[] = new int[T];
        for (int i = 0 ; i < T ; i++)
        {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int r1 = sc.nextInt();

            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int r2 = sc.nextInt();
            res[i] = solve(x1, y1, r1, x2, y2, r2);
        }
        for (int i = 0 ; i < T ; i++)
            System.out.println(res[i]);

        sc.close();
    }

    public static int solve(int x1, int y1, int r1, int x2, int y2, int r2)
    {
        double r = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        // 두 원이 똑같이 겹쳐서 교점이 무한일 때
        if (x1 == x2 && y1 == y2 && r1 == r2)
            return -1;
        // 한 원이 다른 원의 안에서 중심은 다르지만 교점이 없을 때,
     	// 한 원이 다른 원의 안에서 중심은 같지만 교점이 없을 때,
     	// 두 원이 너무 멀어서 서로 겹치지 않을 때
        else if (r > r1 + r2 || x1 == x2 && y1 == y2 && r1 != r2 ||  r < Math.abs(r1 - r2))
            return 0;
    	// 한 원이 다른 원의 안에서 교점이 하나일 때
     	// 두 원이 닿아서 교점이 하나일 때
        else if (r == r1 + r2 || Math.abs(r1 - r2) == r)
            return 1;
        // 두 원이 닿아서 교점이 두개일 때
        return 2;
		
		/*
		Scanner sc = new Scanner(System.in);
		double d, r;
		int tc, x1, x2, y1, y2, r1, r2;
		tc = sc.nextInt();
		int[] arr = new int[tc];
		
		for(int i = 0; i < tc; i++) {
			
			x1 = sc.nextInt();
			y1 = sc.nextInt();
			r1 = sc.nextInt();
			x2 = sc.nextInt();
			y2 = sc.nextInt();
			r2 = sc.nextInt();
			
			d = Math.pow((x2 - x1), 2) +  Math.pow((y2 - y1), 2);
			r = Math.sqrt(d);
			
			// 두 원이 똑같이 겹쳐서 교점이 무한일 때
			if(x1 == x2 && y1 == y2 && r1 == r2) {
				arr[i] = -1;
			} 
			// 한 원이 다른 원의 안에서 중심은 다르지만 교점이 없을 때,
			// 한 원이 다른 원의 안에서 중심은 같지만 교점이 없을 때,
			// 두 원이 너무 멀어서 서로 겹치지 않을 때
			else if((x1 == x2 && y1 == y2 && r1 != r2) || (r > r1 + r2) || (r < Math.abs(r1 - r2))) {
				arr[i] = 0;
			}
			// 한 원이 다른 원의 안에서 교점이 하나일 때
			// 두 원이 닿아서 교점이 하나일 때
			else if((r == r1 + r2) || Math.abs(r1 - r2) == r) {
				arr[i] = 1;
			}
			// 두 원이 닿아서 교점이 두개일 때
			else {
				arr[i] = 2;
			}
		}
		sc.close();
		for(int i = 0; i < tc; i++) {
			System.out.println(arr[i]);
		}
		*/
		
	}

}



