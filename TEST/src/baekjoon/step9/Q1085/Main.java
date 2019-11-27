/*
	직사각형과 점의 거리를 구하는 문제
	한수는 지금 (x, y)에 있다. 직사각형의 왼쪽 아래 꼭짓점은 (0, 0)에 있고, 오른쪽 위 꼭짓점은 (w, h)에 있다. 직사각형의 경계선까지 가는 거리의 최솟값을 구하는 프로그램을 작성하시오.
	첫째 줄에 x y w h가 주어진다. w와 h는 1,000보다 작거나 같은 자연수이고, x는 1보다 크거나 같고, w-1보다 작거나 같은 자연수이고, y는 1보다 크거나 같고, h-1보다 작거나 같은 자연수이다.
	첫째 줄에 문제의 정답을 출력한다.
	
	예제입력 : 	6	2	10	3
	예제출력 : 	1
*/
package baekjoon.step9.Q1085;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        sc.close();
        
        if (w >= h) {
            if (y > h / 2)
                System.out.println(h - y);
            else if (y == h/2)
                System.out.println(h / 2);
            else
                System.out.println(y);
        } else {
            if (x >= w / 2)
                System.out.println(w - x);
            else if (x == w / 2)
                System.out.println(w / 2);
            else
                System.out.println(x);
        }
*/
		Scanner sc = new Scanner(System.in);
		
        int min;
        int len[] = new int[4];

        for (int i = 0; i < len.length; i++) {
            len[i] = sc.nextInt();
        }
        sc.close();
        
        len[2] -= len[0];
        len[3] -= len[1];

        min = len[0];

        for (int i = 1; i < len.length; i++) {
            if (len[i] < min) {
                min = len[i];
            }
        }
        
        System.out.println(min);
    
	}

}
