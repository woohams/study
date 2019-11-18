package test01.sort;

/*
	Shell Sort
	: 일정한 간격(interval)으로 떨어져 있는 자료들끼리 부분집합을 구성하고 각 부분집합에 있는 원소들에 대해서 삽입 정렬을 수행하는 작업을 반복하면서 전체 원소들을 정렬하는 방법이다. 
	전체 원소에 대해서 삽입 정렬을 수행하는 것보다 부분집합으로 나누어 정렬하게 되면 비교 연산과 교환 연산이 감소할 수 있는 점에서 착안된 방법이다.
	
	1. 부분집합의 기준이 되는 간격을 변수 interval에 저장
	2. 한 단계가 수행될 때마다 interval의 값을 감소시키고 쉘 정렬을 순환 호출한다.
	3. interval가 1이 될 때까지 반복한다.
	
	※ 쉘 정렬의 성능은 interval의 값에 따라 달라진다. 
	정렬할 자료의 특성에 따라 interval 생성 함수를 사용하고 일반적으로 사용하는 interval의 값은 원소 개수의 1/2을 사용하고 한 단계 수행될 때마다 interval의 값을 반으로 감소시키면서 반복 수행한다.

*/
public class shellSort {
	
	public static void ShellSort(int[] arr) {
        final int length = arr.length;
        int interval = length / 2;

        while (interval >= 1) {
            for (int i = 0; i < length; i++) {
                intervalSort(arr, i, length - 1, interval);
            }

            interval /= 2;
        }
    }

    private static void intervalSort(int[] arr, int begin, int end, int interval) {
        for (int i = begin + interval; i <= end; i += interval) {
            final int key = arr[i];
            int position = i;

            while (position >= interval && key < arr[position - interval]) {
                arr[position] = arr[position - interval];
                position -= interval;
            }

            arr[position] = key;
        }
    }

}
