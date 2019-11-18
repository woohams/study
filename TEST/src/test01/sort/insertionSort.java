package test01.sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
	Insertion Sort
	: 정렬되어 있는 부분집합에 정렬할 새로운 원소의 위치를 삽입하는 방법이다.
	정렬할 자료를 두 개의 부분집합 S와 U로 가정한다.

	1. 부분집합 S : 정렬된 앞 부분의 원소들
	2. 부분집합 U : 아직 정렬되지 않은 나머지 원소들
	3. 정렬되지 않은 부분집합 U의 원소를 하나씩 꺼내서 이미 정렬되어 있는 부분집합 S의 마지막 원소부터 비교하면서 위치를 찾아 삽입한다.
	4. 삽입 정렬을 반복하면서 부분집합 S의 원소는 하나씩 늘리고 부분집합 U의 원소는 하나씩 감소하게 된다.
	5. 부분집합 U가 공집합이 되면 정렬이 완성된다.
	
*/
public class insertionSort {
	
	 public static void InsertionSort(int[] arr) {
	        final int length = arr.length;
	        for (int i = 1; i < length; i++) {
	            final int key = arr[i];
	            int position = i;

	            while (position > 0 && key < arr[position - 1]) {
	                arr[position] = arr[position - 1];
	                position--;
	            }

	            arr[position] = key;
	        }
	    }
	
	static int[] InsertionSort(int testcases, int[] array) {
		for (int j = 1; j < testcases; j++) {
			int data = array[j]; // 기준
			int comparison = j - 1; // 비교 대상

			while (comparison >= 0 && data < array[comparison]) { // while문 들어오는 조건
				array[comparison + 1] = array[comparison]; // 더 큰 값 밀어넣기

				comparison--;
			}

			array[comparison + 1] = data;
		}

		return array;

	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int cases = Integer.parseInt(br.readLine());
		int[] array = new int[cases];

		for (int i = 0; i < cases; i++) {
			array[i] = Integer.parseInt(br.readLine());
		}

		for (int num : InsertionSort(cases, array)) {
			bw.write(String.valueOf(num));
			bw.newLine();
		}

		bw.flush();
		bw.close();
		br.close();

	}
}


