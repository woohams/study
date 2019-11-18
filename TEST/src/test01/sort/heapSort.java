package test01.sort;

/*
 	Heap Sort
	: 최대 힙 트리나 최소 힙 트리를 구성해 정렬을 하는 방법으로 내림차순 정렬을 위해서는 최대 힙을 구성하고, 오름차순 정렬을 위해서는 최소 힙을 구성하면 된다.
	
	1. n 개의 노드에 대한 완전 이진 트리를 구성한다. 이때 루트 노드부터 부노드, 왼쪽 자노드, 오른쪽 자노드 순으로 구성한다.
	2. 최대 힙을 구성한다. 최대 힙이란 부노드가 자노드보다 큰 트리를 말하는데, 단말 노드를 자노드로 가진 부노드로부터 구성하며 아래부터 루트까지 올라오며 순차적으로 만들어 갈 수 있다.
	3. 가장 큰 수(루트에 위치)를 가장 작은 수와 교환한다.
	4. 2와 3의 과정을 반복한다.
  
 
 */
public class heapSort {
	
	public static void HeapSort(int[] arr) {
        final int length = arr.length;
        final Heap heap = new Heap(length);
        for  (int element : arr) {
            heap.insertHeap(element);
        }

        for (int i = length - 1; i >= 0; --i) {
            arr[i] = heap.deleteHeap();
        }
    }

    private static class Heap {
        private int heapSize;
        private final int[] items;

        private Heap(int count) {
            heapSize = 0;
            items = new int[count + 1];
        }

        private void insertHeap(int item) {
            int i = ++heapSize;
            while (i != 1 && item > items[i / 2]) {
                items[i] = items[i / 2];
                i /= 2;
            }

            items[i] = item;
        }

        private int deleteHeap() {
            int item = items[1];
            int temp = items[heapSize--];
            int parent = 1;
            int child = 2;

            while (child <= heapSize) {
                if (child < heapSize && items[child] < items[child + 1]) {
                    child++;
                }

                if (temp >= items[child]) {
                    break;
                }

                items[parent] = items[child];
                parent = child;
                child *= 2;
            }

            items[parent] = temp;
            return item;
        }
    }

}
