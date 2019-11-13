package test01.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/*
 
Java Collection Framework(JCF)
: Java에서 데이터를 저장하는 자료구조들을 한 곳에 모아 편리하게 관리하고 사용하기 위해 제공하는 것. 크게 List, Set, Map으로 구분할 수 있다.

List 인터페이스와 Set 인터페이스를 설명하기 이전에 알고 넘어가야할 점은  컬렉션은 기본 데이터형이 아닌  참조 데이터형만 저장이 가능하다는 것이다. 
따라서 Collection에서의 데이터는 Object 타입의 객체로서 저장이 되는 것인데 그렇다면 여기서 기본 데이터형은 어떻게 저장하고 관리할 수 있을까?

기본 데이터 형은 Wrapper 클래스를 이용하여 Boxing 시켜주거나  autoboxing으로 저장할 수 있다.
(Integer num = new Integer(5); 와 같은 코드로 구현할 수 있다. 기본 데이터형인 5를 Wrapper클래스의 Integer 타입 객체로 변환)
즉, 오토박싱을 통해 기본 데이터형을 컬렉션에 직접 대입하여 저장해도 컴파일러가 자동으로 Wrapper 클래스로 변환해준다(collection.add(11); ) 

저장된 값을 얻어올 때에도 객체화된 데이터를 기본 데이터형으로 바로 얻어올 수 있는 데, 이 경우 언박싱(unboxing)이라는 용어를 사용한다.(collection.get(n); ) 

List : 인터페이스
동일한 데이터의 중복을 허용한다.
데이터 저장 순서가 유지된다.
힙(heap) 영역 내에서 List는 객체를 일렬로 늘어놓은 구조를 하고 있다.
객체를 인덱스로 관리하기 때문에 객체를 저장하면 자동으로 인덱스가 부여되고 인덱스로 객체를 검색, 삭제할 수 있다. 이 때 List 컬렉션은 객체 자체를 저장하여 인덱스를 부여하는 게 아니라, 해당하는 인덱스에 객체의 주소값을 참조하여 저장한다.
List 컬렉션에서 공통적으로 사용가능한 추가, 검색, 삭제 메소드를 갖고있다. 

Arraylist
Arraylist는 List 인터페이스의 구현 클래스로 여기서의 객체는 인덱스로 관리된다. 
ArrayList에 객체를 추가하면 객체가 인덱스로 관리되는 것이다. 
이 점은 일반 배열과 별 다를바 없지만 자바에서 배열은 초기화 시 그 크기가 고정되어야하고 사용 중에 크기를 변경할 수 없다는 점에서 Arraylist는 가치가 있다. 
설정하고 싶은 초기 용량이 n이라고 했을 때에는 아래와 같이 선언한다.

List<T> list = new Arraylist<T>(n);


  예를 들어 설명해보자. 

*/
public class list {
	public static void main(String[] args){
        int size;
        List<String> list = new ArrayList<String>();
 
        
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");
        list.add("G");
        list.add("H");
        list.add("I");
        list.add(1, "J");
 
        size = list.size();
        System.out.println("저장된 객체 수 : "+ size);
 
        for(int i=0; i<size; i++){
            //데이터를 인덱스로 관리
            System.out.print(i + "번째 : " + list.get(i));
            System.out.println();
        }
 
        
        System.out.println();
        System.out.println("----------------변경 후----------------");
        System.out.println();
        
        
        list.remove(1);
        list.remove(1);
 
        size = list.size();
 
        for(int i=0; i<size; i++){
            System.out.print(i + "번째 : " + list.get(i));
            System.out.println();
        }
 
    }
}

/*
 arraylist를 이용한 간단한 데이터 저장과 삭제를 구현해보았다. 
List<String> list = new ArrayList<String>(); : 기본 생성자로 ArrayList 객체를 생성하면 내부에 10개의 객체를 저장할 수 있는 초기 용량을 가지게 된다. 
만약 위 코드에서 list.add("more"); 로 1개의 객체를 추가하면 저장 용량을 초과한 객체들이 들어오면 list가 참조하고 있는 ArrayList 컬렉션에는 10*2+2 = 22개의 객체를 저장할 수 있는 공간이 자동으로 생겨난다. 
하지만 배열과 마찬가지로 이 코드도 List<String> list = new ArrayList<String>(40); 처럼 용량을 초기화하여 원하는 만큼의 객체를 저장할 수 있다. 
또한 ArrayList list = new Arraylist(); 로 참조변수를 생성하여 ArrayList를 사용할 수도 있다. 

list.remove(1); : 이 코드를 두 번 실행하였으나 컴파일 도중 아무런 문제가 없었다. 
ArrayList는 중간에 위치한 객체를 삭제하여도 그 인덱스를 자동으로 업데이트 해주기 때문에 인덱스 1 이 처음 삭제된 후 뒤의 객체들이 앞으로 한 칸씩 이동하며 그 자리를 자동으로 메꾸는 형태가 된다. 

list.get(i) : 이렇게 얻어온 데이터를 바로 출력하는 것이 아니라 String 형의 변수에 다시 담는다고 생각해보자. 
위에서도 언급했듯이, list.add(); 로 저장되는 모든 데이터는 Object 타입의 객체이다. 
따라서 String 형 변수에 get해온 값을 담고 싶다면 String alphabet = (String)list.get(i) 와 같은 형변환을 반드시 해주어야 한다.
자신이 넣어준 데이터 타입으로 형변환해주는 것은 필수이다.

위에서 언급한 저장소의 용량 확장에는 ArrayList<E>의 단점이라 말할 수 있는 문제점이 있다. 
바로 저장소의 용량을 늘리는 과정에서 많은 시간이 소요된다는 점이다. 
저장 공간 부족으로 ArrayList의 용량을 늘리게 되는 경우 기존의 ArraList에 추가하는 것이 아닌 확장된 크기의 ArrayList를 새로 생성하고 그 새로 생성된 ArrayList에 기존의 ArrayList 값들을 복사해주는 과정을 거친다. 
그리고 기존의 ArrayList는 가비지 컬렉션에 의해 메모리에서 제거된다. 
따라서 ArrayList에서 용량을 늘린다는 것은 새로운 배열 인스턴스의 생성과 기존 데이터의 복사가 필요한 번거로운 작업이 되는 것이다. 

 저장된 객체 수 : 10
0번째 : A
1번째 : J
2번째 : B
3번째 : C
4번째 : D
5번째 : E
6번째 : F
7번째 : G
8번째 : H
9번째 : I

----------------변경 후----------------

0번째 : A
1번째 : C
2번째 : D
3번째 : E
4번째 : F
5번째 : G
6번째 : H
7번째 : I
 */









