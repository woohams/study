package test01.sort;

import java.util.LinkedList;

/*
	RadixSort
	: 원소의 키값을 나타내는 기수를 이용한 정렬 방법이다. 
	정렬할 원소의 키값에 해당하는 버킷(bucket)에 원소를 분배하였다가 버킷의 순서대로 원소는 꺼내는 방법을 반복하면서 정렬한다.
	
	※ 원소의 키를 표현하는 기수만큼의 버킷을 사용. 
	ex) 10진수로 표현된 키값을 가진 원소들을 정렬할 때에는 0부터 9까지의 10개의 버킷 사용

	1. 키값의 일의 자리에 대해서 기수 정렬을 수행한다.
	2. 다음 단계에서는 키값의 십의 자리에 대해서 정렬을 수행한다.
	3. 그리고 그다음 단계에서는 백의 자리에 대해서 정렬을 수행한다.
	4. 1, 2, 3에서 진행되었던 것처럼 자릿수만큼 반복하여 정렬을 수행한다.


*/
public class radixSort {
	
	 @SuppressWarnings("unchecked")
	    private static LinkedList<Integer>[] counter = new LinkedList[] {
	            new LinkedList<>(), new LinkedList<>(),
	            new LinkedList<>(), new LinkedList<>(),
	            new LinkedList<>(), new LinkedList<>(),
	            new LinkedList<>(), new LinkedList<>(),
	            new LinkedList<>(), new LinkedList<>() };

	    public static void radixSort(int[] arr) {
	        int max = Integer.MIN_VALUE;
	        for (int element : arr) {
	            if (element > max) {
	                max = element;
	            }
	        }

	        final int maxDigit = String.valueOf(max).length();
	        radixSort(arr, maxDigit);
	    }

	    private static void radixSort(int[] arr, int digitCount) {
	        int mod = 10;
	        int div = 1;

	        for (int i = 0; i < digitCount; i++, div *= 10, mod *= 10) {
	            for (final int element : arr) {
	                final int bucket = element % mod / div;
	                counter[bucket].add(element);
	            }

	            int pos = 0;
	            for (final LinkedList<Integer> element : counter) {
	                Integer value;
	                while ((value = element.poll()) != null) {
	                    arr[pos++] = value;
	                }
	            }
	        }
	    }

}
