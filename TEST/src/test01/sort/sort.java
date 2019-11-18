package test01.sort;

/*
	정렬 장소에 따른 분류
	내부 정렬(internal sort)와 외부 정렬(external sort)가 있다.
	
	내부 정렬은 정렬할 자료를 메인 메모리에 올려서 정렬하는 방식이고 정렬 속도가 빠르지만 정렬할 수 있는 자료의 양이 메인 메모리의 용량에 따라서 제한된다.
	
	내부 정렬 방식에는 교환 방식(Selection, Bubble, Quick), 삽입 방식(Insertion, Shell), 병합 방식(2-way 병합, n-way 병합), 분배 방식(Radix), 선택 방식(Heap, Tree) 등이 있다.

	외부 정렬은 정렬할 자료를 보조 기억장치에서 정렬하는 방식이고 대용량의 보조 기억 장치를 사용하기 때문에 내부 정렬보다 속도는 떨어지지만 내부 정렬로 처리할 수 없는 대용량의 자료에 대한 정렬이 가능하다.

	외부 정렬 방식에는 병합 방식(2-way 병합, n-way 병합) 이 있다.


	알고리즘 성능
	일반적으로는 Quick Sort가 제일 빠르다고 알려져 있다. 최악의 경우 n²이 발생하는데 이는 피봇이 최소값, 최대값으로 잡히게 될 경우이다. 
	이를 피하기 위해서 피봇을 랜덤으로 잡거나 Media-Of-Three Partitioning이라는 기법을 사용한다. 평균적으로 가장 좋은 성능을 낸다.
	
	이미 정렬되어 있는 자료의 경우에는 Insertion Sort가 제일 빠르다. 이미 정렬되어 있는 경우 바로 앞자리 원소와 한 번만 비교하면 되기 때문이다.

	위에 설명된 알고리즘들의 시간 복잡도는 다음과 같다.

	O(n²) : Bubble Sort, Selection Sort, Insertion Sort, Shell Sort, Quick Sort
	O(n log n) : Heap Sort, Merge Sort
	O(kn) : Radix Sort (k는 자릿수, 자릿수가 적은 4바이트 정수에서나 제대로 된 성능을 낼 수 있다는 제약조건이 있다.)

*/
public class sort {

}
