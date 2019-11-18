package test01.sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class mergeSort {
	
	private static int[] Sorted;
	  
    public static void mergeSort(int[] arr) {
        Sorted = new int[arr.length];
        mergeSort(arr, 0, arr.length - 1);
    }

    private static void mergeSort(int[] arr, int begin, int end) {
        if (begin < end) {
            final int middle = (begin + end) / 2;
            mergeSort(arr, begin, middle);
            mergeSort(arr, middle + 1, end);
            merge(arr, begin, middle, end);
        }
    }

    private static void merge(int[] arr, int begin, int middle, int end) {
        int i = begin;
        int j = middle + 1;
        int k = begin;

        while (i <= middle && j <= end) {
            if (arr[i] <= arr[j]) {
            	Sorted[k] = arr[i++];
            } else {
            	Sorted[k] = arr[j++];
            }

            k++;
        }

        int t;
        if (i > middle) {
            for (t = j; t <= end; t++, k++) {
            	Sorted[k] = arr[t];
            }
        } else {
            for (t = i; t <= middle; t++, k++) {
            	Sorted[k] = arr[t];
            }
        }

        for (t = begin; t <= end; t++) {
            arr[t] = Sorted[t];
        }
    }
    
    /* ******************************************************************** */

	static int[] sorted = new int[100000000];

	static void MergeSort(int[] array, int first, int last) {
		if (first < last) {
			int mid = (first + last) / 2;
			MergeSort(array, first, mid);
			MergeSort(array, mid + 1, last);
			Merge(array, first, mid, last);
		}
	}

	static void Merge(int[] array, int first, int mid, int last) {
		// 만약 여기서 sorted를 생성한다면 이 함수가 호출될때마다 sorted가 생성-> 시간초과
		int midStart = mid + 1;
		int i = first;
		int start = first;

		while (first <= mid && midStart <= last) {

			if (array[first] > array[midStart]) {
				sorted[i] = array[midStart];
				midStart++;
				i++;
			} else {
				sorted[i] = array[first];
				first++;
				i++;
			}

		}

		// 잔여 데이터 처리
		if (first <= mid) {
			for (int j = first; j <= mid; j++, i++) {
				sorted[i] = array[j];
			}
		}

		else if (midStart <= last) {
			for (int k = midStart; k <= last; k++, i++) {
				sorted[i] = array[k];
			}
		}

		// 배열 옮겨주기
		for (int index = start; index < i; index++) {
			array[index] = sorted[index];
		}

	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int cases = Integer.parseInt(br.readLine());
		int[] array = new int[cases];

		for (int i = 0; i < cases; i++) {
			array[i] = Integer.parseInt(br.readLine());
		}

		MergeSort(array, 0, cases - 1);

		for (int num : array) {
			bw.write(String.valueOf(num));
			bw.newLine();
		}

		bw.flush();
		bw.close();
		br.close();

	}
}





