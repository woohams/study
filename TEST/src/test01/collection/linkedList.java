package test01.collection;

import java.util.LinkedList;
import java.util.ListIterator;

	/*
	Vector
	Vector는 Arraylist와 동일한 내부 구조를 가지고 있다. 
	Vector를 생성하기 위해서는 지정할 객체 타입을 타입 파라미터로 표기하고 기본 생성자를 호출하면 된다. 

	List<E> list = new Vector<E>(); 

	ArrayList와 다르게  Vector는 동기화된 메소드로 구성되어 있기 때문에 멀티 스레드가 동시에 이 메소드들을 실행할 수 없고 하나의 스레드가 실행을 완료해야만 다른 스레드가 실행을 할 수 있다. 
	따라서 멀티 스레드 환경에서 안전하게 객체를 추가 삭제할 수 있다. 

	LinkedList
	LinkedList는 List 구현 클래스이므로 ArrayList와 사용하는 메소드는 같지만 내부 구조는 완전 다르다. 
	ArrayList는 내부 배열 객체를 저장해서 인덱스로 관리하지만 LinkedList는 양방향 포인터 구조로 각각마다 인접하는 참조를 링크해서 체인처럼 관리한다.
	따라서 LinkedList는 특정 인덱스의 객체를 제거하거나 삽입하면 앞 뒤 링크만 변경되고 나머지 링크는 변경되지 않는다. 
	그러므로 중간 삽입/삭제가 빈번할 수록 LinkedList를 쓰는 것이 효율적이다. 
	반대로 순차적인 삽입/삭제가 빈번하다면 ArrayList를 사용하는 것이 효율적이다. 

	LinkedList를 생성할 때, 처음에는 어떠한 링크도 만들어지지 않기 때문에 내부적으로 비어있다. 아래와 같은 코드로 생성할 수 있다.

	List<E> list = new LinkedList<E>();
	자바에서 LinkedList 클래스는 스택과 큐를 구현하는 데에 자주 쓰인다. 
	그 중 큐는 자바에서 일반적으로 두가지 방법으로 구현된다. 
	배열을 사용하여 구현하거나 LinkedList나 ArrayList 클래스를 사용하는 데 지금은 LinkedList를 사용한 큐의 구현을 볼 것이다.

	LinkedList -> Queue 자료구조 구현
	이 코드를 구현하면서 흥미로웠던 점은 List<E> list = new LinkedList<E>(); 로 선언을 권장했던 기존 자료구조 코드들와는 달리 큐를 구현할 때 사용하는 메소드를 집어넣기 위해서는 반드시 LinkedList<E> list = new LinkedList<E>(); 라는 생성자를 사용해야한다는 점이였다. 
	그 말은 즉 offer(), poll(), peek() 와 같은 메소드가 List인터페이스에서 제공하지 않는 LinkedList클래스만의 메소드라는 말이 되겠다. 
	*/

	class QueueExample{
	    public void method(){
	        LinkedList<Integer> queue = new LinkedList<Integer>();
	 
	        //Queue에 삽입
	        queue.offer(11);
	        queue.offer(22);
	        queue.offer(33);
	        queue.offer(44);
	        queue.offer(55);
	 
	        System.out.println(queue);
	        System.out.println(queue.poll()); //Queue에서 맨 앞 요소 제거하며 읽기
	        System.out.println(queue);
	        System.out.println(queue.peek()); //Queue에서 제거하지 않고 맨 뒤 요소 읽기
	 
	        System.out.println();
	 
	        ListIterator<Integer> it = queue.listIterator();
	        if(it.hasNext()){
	            System.out.println(it.next());
	            System.out.println(it.next());
	            System.out.println(it.previous());
	            System.out.println(it.previous());
	        }
	 
	    }
	}
	 
	public class linkedList {
	    public static void main(String[] args){
	        QueueExample ex = new QueueExample();
	        ex.method();
	    }
	}

	/*
	----------------------------------print----------------------------------
	[11, 22, 33, 44, 55]
	11
	[22, 33, 44, 55]
	22

	22
	33
	33
	22
	-------------------------------------------------------------------------
	*/
	
	/*
	 
	 Queue는 알다시피 FIFO, 선입선출 방식을 채택한다. 
	 따라서 offer(); 메소드를 사용하여 Queue에 요소를 삽입하고 출력했을 땐 들어간 순서대로 출력이 된다. 
	 이 외에도 코드에서 보이듯 크게 두가지 메소드가 큐의 구현을 돕는다.
	 
	poll() : Queue에서 맨 처음 요소를 제거하며 출력
	peek() : Queue에서 제거하지 않고 맨 뒤 요소를 출력

	마지막 부분의 ListIterator는 Iterator의 기능을 포함하지만 좀 더 유용하게 쓰일 것 같아 삽입해보았다. 
	기존에 많이 활용하던 Iterator는 다음 데이터만을 검색할 수 있었고 dataset의 처음부터 끝까지 순차적으로 요소들을 검색하는 기능을 제공하였다. 
	하지만 ListIterator는 이전에 지나간 요소도 검색할 수 있는 기능을 포함하는 인터페이스이기 때문에 코드에서 previous() 메소드를 활용하여 이를 구현하였다. 

	이처럼 스택에 대한 코드도 LinkedList클래스를 활용하여 구현할 수 있지만 큐와 사용하는 메소드만 다를 뿐 전반적인 흐름은 같으니 자세한 설명은 생략하겠다. 
	모두 알다시피 Stack 자료구조를 위해서는 push(), pop(), peek() 메소드를 활용하면 충분히 쉽게 구현할 수 있다.  
	 
	 */