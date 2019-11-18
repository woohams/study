package test01.sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
	Bubble Sort
	: 인접한 두 개의 원소를 비교하여 자리를 교환하는 방식이다.
	
	1. 첫 번째 원소부터 마지막 원소까지 반복하여 한 단계가 끝나면 가장 큰 원소가 마지막 자리로 정렬(Ascending이냐 Descending이냐에 따라 대소 비교는 다르게 적용하면 된다).
	2. 첫 번째 원소부터 인접한 원소끼리 계속 자리를 교환하면서, 맨 마지막 자 리로 이동하는 모습이 물속에서 물 위로 올라오는 물방울 모양과 같다고 하여 버블(Bubble) 정렬이라고 한다.

*/
public class bubbleSort {
	
	public static void BubbleSort(int[] arr) {
        final int length = arr.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - i; j++) {
                if (j + 1 < length && arr[j] > arr[j + 1]) {
                    arr[j] = arr[j] + arr[j + 1];
                    arr[j + 1] = arr[j] - arr[j + 1];
                    arr[j] = arr[j] - arr[j + 1];
                }
            }
        }
    }
	
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




