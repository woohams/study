package test01.sort;


/*
  	Selection Sort
	: 전체 원소들 중에서 기준 위치에 맞는 원소를 선택하여 자리를 교환하는 방식이다.

	1. 전체 원소 중에서 가장 작은 원소를 찾아 선택하여 첫 번째 원소와 자리를 교환한다.
	2. 그다음 두 번째로 작은 원소를 찾아서 선택하여 두 번째 원소와 자리를 교환한다.
	3. 그다음에는 세 번째로 작은 원소를 찾아 선택하여 세 번째 원소와 자리를 교환한다.
	4. 이  과정을 반복하면서 정렬이 완성된다.
  
 
 */
public class selectSort {
	
	public static void SelectionSort(int[] arr) {
        final int length = arr.length;
        for (int i = 0; i < length; i++) {
            int min = i;

            for (int j = i + 1; j < length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            if (min == i) {
                continue;
            }

            arr[min] = arr[min] + arr[i];
            arr[i] = arr[min] - arr[i];
            arr[min] = arr[min] - arr[i];
        }
    }

}
