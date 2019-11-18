package test01.practice;


public class MineSweeper
{
    public static void main(String[] args)
    {
        boolean[][] board = new boolean[10][10];
        String[][] boardc = new String[10][10];
        int[][] boardi = new int[10][10];
        int i, j;
        
        for(i = 0; i < 10; i++)
        {
            for(j = 0; j < 10; j++)
            {
                if (Math.random() < 0.3)
                {
                    board[i][j] = true;
                }
            }
        }
        
        for(i = 0; i < 10; i++)
        {
            for(j = 0; j < 10; j++)
            {
                if (board[i][j])
                {
                    boardc[i][j] = "#";		// boardc에 문자 #을 저장
                    System.out.print("# ");
                }
                else
                {
                    System.out.print(". ");
                }
            }
        System.out.println();
        }
        
        for(i = 0; i < 10; i++)		// 내 위치
        {
          for(j = 0; j < 10; j++)
          {      
              if(boardc[i][j] == "#") 	// 현재 내 위치가 #(지뢰)일경우
              {
                  continue;
              }
              int count =0;		// 지뢰의 개수를 파악하기 위해 초기화
                  for(int k = i-1; k <= i+1; k++)  	// 주변위치
                  {
                      for(int h = j-1; h <= j+1; h++)
                      {
                          if(i==k && j==h)	 // 주변 위치로 탐색하여 내 위치를 알 때 
                          {
                              continue; 
                          }
                          if(k==-1 || k==10 || h==-1 || h==10) 	// 주변위치에서 범위 값이 넘어갔을 경우
                          {
                              continue; 
                          }
                          if(boardc[k][h] == "#") 	// 내 주변 위치에 #(지뢰)가 있을 경우
                          {
                              count++; 	// 지뢰 증가
                          }
                      }
                  }
                  boardi[i][j] = count;
              }
         }
 
        System.out.println();
        
        for(i = 0; i < 10; i++)
        {
            for(j = 0; j < 10; j++)
            {
                if (board[i][j])
                {
                    System.out.print(boardc[i][j] + " ");
                }
                else
                {
                    System.out.print(boardi[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}

