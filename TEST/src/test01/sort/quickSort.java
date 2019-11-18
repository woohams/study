package test01.sort;

/*
	Quick Sort
	: 정렬할 전체 원소에 대해서 정렬을 수행하지 않고, 기준 값을 중심으로 왼쪽 부분 집합과 오른쪽 부분 집합으로 분할하여 정렬하는 방법이다.

	1. 왼쪽 부분 집합에는 기준 값보다 작은 원소들을 이동시키고, 오른쪽 부분 집합에는 기준 값보다 큰 원소들을 이동시킨다.
	2. 기준 값 : 피봇 (pivot), 일반적으로 전체 원소 중에서 가운데에 위치한 원소를 선택한다.
	3. 분할(divide) : 정렬할 자료들을 기준 값을 중심으로 2개의 부분 집합으로 분할한다.
	4. 정복(conquer) : 부분집합의 원소들 중에서 기준 값보다 작은 원소들은 왼쪽 부분집합으로, 기준 값보다 큰 원소들은 오른쪽 부분집합으로 정렬한다. 
		부분집합의 크기가 1이하로 충분히 작지 않으면 순환 호출을 이용하여 다시 분할한다.

*/
public class quickSort {
	
	 public static void QuickSort(int[] arr) {
	        QuickSort(arr, 0, arr.length -1);
	    }

	    private static void QuickSort(int[] arr, int begin, int end) {
	        if (begin >= end) {
	            return;
	        }

	        int middle = begin + (end - begin) / 2;
	        int pivot = arr[middle];
	        int left = begin;
	        int right = end;

	        while (left <= right) {
	            while (arr[left] < pivot) {
	                left++;
	            }

	            while (arr[right] > pivot) {
	                right--;
	            }

	            if (left <= right) {
	                arr[left] = arr[left] + arr[right];
	                arr[right] = arr[left] - arr[right];
	                arr[left] = arr[left] - arr[right];

	                left++;
	                right--;
	            }
	        }

	        if (begin < right) {
	            QuickSort(arr, begin, right);
	        }

	        if (end > left) {
	            QuickSort(arr, left, end);
	        }
	    }
	}


