package test01;

import java.util.Scanner;
import java.util.Random;

public class test03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			Random r = new Random();
			int k = r.nextInt(100);
			System.out.println("수를 결정하였습니다. 맞추어보세요");
			System.out.println("0-99");
			int i = 1;
			while (true) {

				System.out.println(i + ">>");
				int input = sc.nextInt();

				while (input != k) {
					if (input < k) {
						System.out.println("더 크게!!!");
					} else if (input > k) {
						System.out.println("더 작게!!!");
					}
					i++;
					break;
				}

				if (input == k) {
					System.out.printf("%d번만에 맞추셨습니다. 숫자 맞추기를 종료합니다.\n", i);
					System.out.println("계속하시려면 n을 제외한 아무키나 3회 눌러주십시오. >>");

					if (sc.next().equals("n") && sc.next().equals("N") && sc.next().equals("ㅜ")) {
						System.out.printf("숫자 맞추기를 종료합니다.");
						System.exit(0);
						
					} else
						break; 
				}
				
				if (i >= 8) {
					System.out.printf("당신은 %d번의 횟수제한을 넘겨 패배하셨습니다.\n", i);
					System.out.println("랜덤 숫자는 " + Integer.valueOf(k) +"입니다.");
					System.out.println("종료하시려면 n을 눌러주시고 계속하시려면 n을 제외한 아무키나 3회 눌러주십시오. >>");

					if (sc.next().equals("n") && sc.next().equals("N") && sc.next().equals("ㅜ")) {
						System.out.printf("숫자 맞추기를 종료합니다.");
						System.exit(0);
					} else
						break; 
				}
			}
		}
	}
}