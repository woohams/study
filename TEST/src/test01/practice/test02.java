package test01.practice;

import java.util.Scanner;
 
class Player{
    Scanner inputWord = new Scanner(System.in);
    public String name; 
    public String word;
    
    
    public String sayWord() { 
        word = inputWord.next(); 
        return word;
    }
    
    public boolean succeed(char lastChar) { 
        if (lastChar == word.charAt(0)) 
        	return true;
        else 
        	return false;
    }
}
 
 
public class test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = "시작단어 정해주기"; 
        
        System.out.println("게임에 참가하는 인원은 몇명입니까? >> ");
        int number = sc.nextInt();
        
        Player[] play = new Player[number];
        
        for(int i=0; i<number; i++) {
            System.out.println("참가자의 이름을 입력하세요 >> ");
            play[i] = new Player();
            play[i].name = sc.next();
        }
        System.out.println("'기'로 시작해주시기 바랍니다.");
        
        int i = 0;
        int j = 0;
        while(true) {
            j = i % number; 
            int lastIndex = word.length()-1;
            char lastChar = word.charAt(lastIndex); 
            
            System.out.println(play[j].name + " >> ");
            play[j].sayWord(); 
            boolean flag = play[j].succeed(lastChar);
            if(flag == false) {
                System.out.println(play[j].name + "이(가) 졌습니다.");
                break;
            }
            word = play[j].word;
            i++;
        }
    }
 
}