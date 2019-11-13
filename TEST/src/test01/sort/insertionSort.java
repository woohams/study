package test01.sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class insertionSort {
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


