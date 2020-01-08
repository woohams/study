/*
	수를 처리하는 것은 통계학에서 상당히 중요한 일이다. 통계학에서 N개의 수를 대표하는 기본 통계값에는 다음과 같은 것들이 있다. 단, N은 홀수라고 가정하자.

	1. 산술평균 : N개의 수들의 합을 N으로 나눈 값
	2. 중앙값 : N개의 수들을 증가하는 순서로 나열했을 경우 그 중앙에 위치하는 값
	3. 최빈값 : N개의 수들 중 가장 많이 나타나는 값
	4. 범위 : N개의 수들 중 최댓값과 최솟값의 차이
	N개의 수가 주어졌을 때, 네 가지 기본 통계값을 구하는 프로그램을 작성하시오.
	
	첫째 줄에 수의 개수 N(1 ≤ N ≤ 500,000)이 주어진다. 그 다음 N개의 줄에는 정수들이 주어진다. 입력되는 정수의 절댓값은 4,000을 넘지 않는다.
	
	첫째 줄에는 산술평균을 출력한다. 소수점 이하 첫째 자리에서 반올림한 값을 출력한다.
	둘째 줄에는 중앙값을 출력한다.
	셋째 줄에는 최빈값을 출력한다. 여러 개 있을 때에는 최빈값 중 두 번째로 작은 값을 출력한다.
	넷째 줄에는 범위를 출력한다.
	
	예제입력 : 	5		1		 5	
			1		4000	-1
			3				-2
			8				-3
			-2				-1
			2				-2
	예제출력 : 	2		4000	-2
			2		4000	-2
			1		4000	-1
			10		   0	 2
*/
package baekjoon.step14.Q2108;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int[] positiveArray = new int[4001]; // 입력값 양수 배열
        int[] negativeArray = new int[4001]; // 입력값 음수 배열
        int[] ascendingOrderArray = new int[N]; // 오름차순으로 배열된 입력값 배열
        
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int input = Integer.parseInt(st.nextToken());
            if(input >= 0) {
                positiveArray[input]++;
            }else {
                negativeArray[-input]++;
            }
            
        }
        
        int ascendingOrder = 0;
        int modeRoutine = 0; // 각 수들의 빈도 수(최빈값을 만들기 위해)
        List<Integer> modeList = new ArrayList<>(); // 최빈값이 들어갈 리스트
        double sum = 0.0;
        
        /* 계산 로직 상 음수 부분을 먼저 계산해주어야 전체 입력값이 오름차순으로 배열됨과 동시에 최빈값이 작은 수부터 순서대로 채워질 수 있다 */
        for(int j = negativeArray.length - 1; j > 0; j--) {
            
            
            if(negativeArray[j] != 0) { // 입력값이 들어간 부분만 계산
                
                
                if(modeRoutine == negativeArray[j]) {// 반복한 횟수(최빈값을 구하기 위해)
                    modeList.add(-j); // 이 경우 최빈값이 여러개 나왔을 때다.
                    
                }else if(modeRoutine < negativeArray[j]) {
                    modeRoutine = negativeArray[j];
                    modeList = new ArrayList<>(); // 빈도수가 더 많은 수가 나오면 기존의 리스트를 초기화한다.
                    modeList.add(-j);
                }
                
                while(negativeArray[j] != 0) {
                    sum -= j; // 총 합
                    ascendingOrderArray[ascendingOrder++] =- j; // 오름차순 정렬
                    negativeArray[j]--; 
                }
                
                
            }
            
        }
        
        for(int k=0; k<positiveArray.length; k++) {
            
            if(positiveArray[k] != 0) { // 입력값이 들어간 부분만 계산
                
                if(modeRoutine == positiveArray[k]) {// 반복한 횟수(최빈값을 구하기 위해)
                    modeList.add(k); // 이 경우 최빈값이 여러개 나왔을 때다.
                    
                }else if(modeRoutine < positiveArray[k]) {
                    modeRoutine = positiveArray[k];
                    modeList = new ArrayList<>(); // 빈도수가 더 많은 수가 나오면 기존의 리스트를 초기화한다.
                    modeList.add(k);
                    
                }
                
                while(positiveArray[k] != 0) {
                    sum += k; // 총 합
                    ascendingOrderArray[ascendingOrder++] = k; // 오름차순 정렬
                    positiveArray[k]--;
                }
                
            }
        }
        
        bw.write(String.valueOf(Math.round(sum / N)) + "\n"); // 문제 조건의 소수점자리 감안해서 계산
        bw.write(String.valueOf(ascendingOrderArray[(N - 1) / 2])+"\n");
        if(modeList.size() == 1) { // 최빈값이 하나 밖에 없다면 그것을 출력.
            bw.write(modeList.get(0)+"\n");
        }else { // 최빈값이 여러개일 경우, 두번째로 작은 값
            bw.write(modeList.get(1)+"\n");
        }
        bw.write(String.valueOf(ascendingOrderArray[N - 1] - ascendingOrderArray[0]));
        bw.flush();

	}

}
