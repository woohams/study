package test01.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*
	Set : 인터페이스
	데이터의 저장 순서를 유지하지 않는다.
	같은 데이터의 중복 저장을 허용하지 않는다. 따라서 null도 하나의 null만 저장할 수 있다.
	Set 컬렉션은 List 컬렉션처럼 인덱스로 객체를 검색해서 가져오는 메소드가 없다. 
	대신 전체 객체를 대상으로 한 번 씩 다 가져오는 반복자, Iterator을 제공한다. 
	
	Set<String> setExample = new...;
	Iterator<String> iterator = setExample.iterator();

	이 코드를 구현하여 iterator객체를 통해 사용할 수 있다.

	Set<String> setExample = new...;
	Iterator<String> iterator = setExample.iterator();
 
	while(iterator.hasNext()){
    	String getin = iterator.next();
	}

	보통 위 같은 방식으로, iterator 인터페이스에 선언된 hasNext()와 next() 메소드를 사용하여 구현한다.


	Set 인터페이스를 구현한 주요 클래스는 3개가 있다.

 	Class										특	징

 	HashSet					순서가 필요없는 데이터를 hash table에 저장. Set 중에 가장 성능이 좋음. 

	TreeSet			저장된 데이터의 값에 따라 정렬됨. red-black tree 타입으로 값이 저장됨. HashSet보다 성능이 느림. 

 LinkedHashSet 		연결된 목록 타입으로 구현된 hash table에 데이터 저장. 저장된 순서에 따라 값이 정렬되나 셋 중 가장 느림.


3개의 클래스의 성능 차이는 클래스 때문인데 셋 중 HashSet이 특히 큰 dataset에서 별도의 정렬작업이 없기 때문에 가장 빠르다.
 또한 JDK 1.2부터 제공된 HashSet 클래스는 해시 알고리즘을 사용하였기 때문에 매우 빠른 검색 속도를 가진다. 

이제 Set인터페이스를 구현한 HashSet에 대해서 좀 더 자세히 살펴보자.


HashSet
HashSet에 대한 코드를 살피기 전에 이 클래스에서 사용하는 해시 알고리즘에 대해 잠깐 설명해보겠다. 

해시 알고리즘 : hash algorithm
해시 알고리즘이란 해시 함수(hash function)를 사용하여 데이터를 해시 테이블에 저장하고 다시 그것을 검색하는 알고리즘이다.


자바에서 해시 알고리즘을 이용한 자료구조는 위의 그림과 같이 배열과 연결 리스트로 구현된다. 

저장할 key값과 value를 넣으면 해시함수는 int index = key.hashCode() % capacity 연산으로 배열의 인덱스를 구하여 해당 인덱스에 저장된 연결 리스트에 데이터를 저장하게 된다. 
예를 들어 key = 16이라면 hashCode() 메소드가 해당하는 int값을 그대로 반환하며 16크기의 배열이 존재하므로 이 key의 인덱스는 16%16 = 0 이 된다. 
따라서 첫번째 요소에 연결된 연결 리스트에서 검색을 시작한다. 


다시 본론으로 돌아와서, HashSet의 기본 생성자는 다음과 같다.
Set<E> set = new HashSet<E>(); 

HashSet에서는 순서 없이 동일한 객체의 중복 저장 없이 저장을 수행한다는 점을 언급했다. 
따라서 add() 메소드를 사용하여 해당 HashSet에 이미 존재하고 있는 요소를 추가하려하면 해당하는 요소를 바로 저장하지 않고 내부적으로 객체의 hashCode()메소드와 equals() 메소드를 호출하며 검사한다. 

이 때 사용하는 hashCode()와 equals() 코드는 자신이 정의한 클래스 인스턴스에 대해 프로그래머가 직접 오버라이딩하여 구현할 수 있는데 그 흐름을 이해하기 위해 먼저 String 클래스에서 오버라이딩된 두 메소드의 정의를 짚어보자.

문자열을 HashSet에 저장할 경우 같은 문자열을 갖는 String 객체는 동등한 객체로 다른 문자열을 갖는 String 객체는 다른 객체로 간주된다. 
그 이유는 String 클래스가 hashCode()와 equals()메소드를 오버라이딩하여 같은 문자열일 경우 hashCode()의 리턴값을 같게 equals()의 리턴값은 true로 나오도록 구현해놓았기 때문이다. 


*/
 
public class set {
    //삽입
    public static void insert(HashMap<String, Phone> map){
        Phone p;
        String name, address, telephone;
        Scanner sc = new Scanner(System.in);
 
        System.out.print("이름 >> ");
        name = sc.next();
        System.out.print("주소 >> ");
        address = sc.next();
        System.out.print("전화번호 >> ");
        telephone = sc.next();
 
        p = new Phone(name, address, telephone);
        map.put(p.getName(), p);
    }
 
    //삭제
    public static void delete(HashMap<String, Phone> map){
        String deletename;
        Scanner sc = new Scanner(System.in);
 
        System.out.print("이름>> ");
        deletename = sc.next();
        if(map.containsKey(deletename)){
            map.remove(deletename);
            System.out.println("삭제가 정상적으로 완료되었습니다.");
        }
        else System.out.println(deletename + "은 등록되지 않은 사람입니다.");
    }
 
    //찾기
    public static void search(HashMap<String, Phone> map){
        Scanner sc = new Scanner(System.in);
        String searchname;
 
        System.out.print("이름 >> ");
        searchname = sc.next();
        if(map.containsKey(searchname))
            System.out.println(searchname + "\t" + map.get(searchname).getAddress() + "\t"
                                                         + map.get(searchname).getTelephone());
 
        else System.out.println(searchname + "은 등록되지 않은 사람입니다. ");
    }
 
    //전체보기
    public static void printall(HashMap<String, Phone> map){
        Set<Map.Entry<String, Phone>> entries = map.entrySet();
        Iterator<Map.Entry<String, Phone>> it = entries.iterator();

        while(it.hasNext()){
                Map.Entry<String, Phone> mapEntry = it.next();
                System.out.println(mapEntry.getKey() + "\t" + mapEntry.getValue().getAddress() + "\t" + mapEntry.getValue().getTelephone());
                }
        }
 
 
 
    //main
    public static void main(String[] args){
        int menu;
        HashMap<String, Phone> map = new HashMap<String, Phone>();
        Scanner sc = new Scanner(System.in);
 
        System.out.println("----------------------------------------------------");
        System.out.println(" 전화번호 관리 프로그램을 시작합니다. ");
        System.out.println("----------------------------------------------------");
 
        while(true){
            System.out.print("삽입:0, 삭제:1, 찾기:2, 전체보기:3, 종료:4 >> ");
            menu = sc.nextInt();
 
            switch(menu){
                case 0:
                    insert(map);
                    break;
                case 1:
                    delete(map);
                    break;
                case 2:
                    search(map);
                    break;
                case 3:
                    printall(map);
                    break;
                case 4:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
            }
        }
    }
}
