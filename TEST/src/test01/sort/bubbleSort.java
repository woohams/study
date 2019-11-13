package test01.sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class bubbleSort {
	static int[] BubbleSort(int testcases, int[] array) {
		for (int i = 0; i < testcases; i++) {
			for (int j = 0; j < testcases - 1; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j + 1];
					array[j + 1] = array[j];
					array[j] = temp;
				}
			}
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

		for (int num : BubbleSort(cases, array)) {
			bw.write(String.valueOf(num));
			bw.newLine();
		}

		bw.flush();
		bw.close();
		br.close();

	}
}




