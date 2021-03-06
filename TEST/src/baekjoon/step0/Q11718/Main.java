/*
	입력 받은 대로 출력하는 프로그램을 작성하시오.
	입력이 주어진다. 입력은 최대 100줄로 이루어져 있고, 알파벳 소문자, 대문자, 공백, 숫자로만 이루어져 있다. 
	각 줄은 100글자를 넘지 않으며, 빈 줄은 주어지지 않는다. 또, 각 줄은 공백으로 시작하지 않고, 공백으로 끝나지 않는다.
	입력받은 그대로 출력한다.
	예제입력 : Hello
			Baekjoon
			Online Judge
	예제출력 : 	Hello
			Baekjoon
			Online Judge
*/
package baekjoon.step0.Q11718;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<>();
         
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            if (s == null || s.isEmpty()) {
                break;
            }
            arr.add(s);
        }
        sc.close();
 
        for (int i = 0; i < arr.size(); ++i) {	
            System.out.println(arr.get(i));
        }
		/*
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()) {
			String s = sc.nextLine();
			System.out.print(s);
		}
		sc.close();
		*/
	}

}
