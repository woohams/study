package test01.practice;

import java.util.Scanner;

/**********************************
 *
 * 
 * ASCII CODE -> INTEGER
 * 
 * @author JWH
 *
 *
 **********************************/


public class test06 {

	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("알파벳을 입력하세요. >> ");
        char c = sc.next().charAt(0);
        sc.close();
        System.out.println(Integer.valueOf(c));
    }

	
}
