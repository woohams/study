package test01.practice;

import java.util.Scanner;

public class test01 {

	public static void main(String[] args) {
		
		String [][] words = {
				{"1", "a" ,"A"}, {"2", "b", "B"}, {"3", "c", "C"}, {"4", "d", "D"}, {"5", "e", "E"}, {"6", "f", "F"}, {"7", "g", "G"}, {"8", "h", "H"}, {"9", "i", "I"},
				{"10", "j", "J"}, {"11", "k", "K"}, {"12", "l", "L"}, {"13", "m", "M"}, {"14", "n", "N"}, {"15", "o", "O"}, {"16", "p", "P"}, {"17", "q", "Q"}, {"18", "r", "R"},
				{"19", "s", "S"}, {"20", "t", "T"}, {"21", "u", "U"}, {"22", "v", "V"}, {"23", "w", "W"}, {"24", "x", "X"}, {"25", "y", "Y"}, {"26", "z", "Z"}
		};
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 1; i <= words.length; i++) {
			System.out.printf("%d번째 알파벳은?", i);
			
			String temp = sc.nextLine();
			
			if(temp.equals(words[i-1][1])) {
				System.out.printf("맞았습니다.%n%n");
			} else {
				System.out.printf("틀렸습니다. 정답은 %s, %s입니다.%n%n", words[i-1][2], words[i-1][1]);
				break;
			}
		} 
		sc.close();
		System.out.println("앙 기모링");
		
	}
	
}
