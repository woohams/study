package test01.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/*
Map : 인터페이스
Map 컬렉션에는 키(key)와 값(value)으로 구성된 Entry 객체를 저장하는 구조를 가지고 있다. 여기서 키와 값은 모두 객체이다. 

값은 중복 저장이 가능하지만 키는 중복 저장이 불가능하다. 
Set과 마찬가지로 Map 컬렉션에서는 키 값의 중복 저장이 허용되지 않는 데 만약 중복 저장 시 먼저 저장된 값은 저장되지 않은 상태가 된다. 
즉 기존 값은 없어지고 새로운 값으로 대체되는 것이다. 

HashSet에서처럼 프로그래머는 HashMap과 HashTable 모두 키로 사용할 객체에 대해 hashCode()와 equals() 메소드를 오버라이딩하여 같은 객체가 될 조건을 정의할 수 있다. 


HashMap
HashMap은 Map 인터페이스 구현을 위해 해시테이블을 사용한 클래스이다. 또한 중복을 허용하지 않고 순서를 보장하지 않는다.
중요한 점은 HashTable과 다르게 HashMap은 키와 값으로 null값이 허용된다는 것이다.


다음은 HashMap의 생성자를 전형화하여 나타낸것이다.
Map<K,V> map = new HashMap<K,V>(); 

HashMap에 대한 이론적인 설명은 여기까지하고 아래 코드로 설명을 덧붙이겠다. 

아래 예시는 자바 명품 프로그래밍 7장에 있는 Open Challenging문제를 풀이한 것이다. 

제네릭 해시맵(HashMap)을 이용하여 전화번호 관리 프로그램을 만들었다. 
Phone클래스는 전화번호 정보를 표현한 필드를 담은 클래스로 value에 해당한다.
따라서 value는 Phone 타입으로 들어갈 것이고 key값은 name 필드가 되겠다. 

이 코드에서는 HashMap에서 사용하는 주요 메소드를 대부분 담고있으므로 이 코드만으로 충분한 공부가 될 것이라 본다.
 */
class Phone{
    private String name;
    private String address;
    private String telephone;
 
    Phone(String name, String address, String telephone){
        this.name = name;
        this.address= address;
        this.telephone = telephone;
    }
    public String getName(){ return name; }
    public String getAddress(){ return address; }
    public String getTelephone(){ return telephone; }
}
 
 
 
public class map {
    //삽입
    public static void insert(HashMap<String, Phone> map){
        Phone p;
        String name, address, telephone;
        Scanner sc = new Scanner(System.in);
 
        System.out.print("이름 >> ");
        name = sc.nextLine();
        System.out.print("주소 >> ");
        address = sc.nextLine();
        System.out.print("전화번호 >> ");
        telephone = sc.nextLine();
 
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
        if(map.containsKey(searchname)) {
            System.out.println("이름 : " + searchname);
            System.out.println("주소 : " + map.get(searchname).getAddress());
        	System.out.println("전화번호 : " + map.get(searchname).getTelephone());
        }
        else System.out.println(searchname + "은 등록되지 않은 사람입니다. ");
    }
 
    //전체보기
    public static void printall(HashMap<String, Phone> map){
        Set<String> names = map.keySet();
        Iterator<String> it = names.iterator();
        
        while(it.hasNext()){
            String name = it.next();
            Phone student = map.get(name);
            System.out.println("이름: " + name + "\n" + "주소 : " + student.getAddress() + "\n" + "전화번호: " + student.getTelephone());
 
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
/*
 
 HashMap을 포함한 Map 컬렉션에서 Key값을 알고 싶다면 get() 메소드로 쉽게 구현하여 알아 낼 수 있다. 
 하지만 맵 안에 존재하는 value를 포함한 데이터 하나하나를 전부 얻어내 출력하고 싶다면 2가지 방법이 있다. 


첫번째는 위의 코드에서 구현한대로이다. 
//전체보기 줄부터 구현한 코드인데 Key를 Set 타입으로 뽑아서 그 Key들을 하나하나 iterator 시켜 그 Key 값을 통해 value를 얻어내는 방법이다.

두번째 방법은 entrySet을 통해 Entry 객체를 Set 타입으로 뽑아 Key와 value를 동시에 한번에 얻어낼 수 있는 방법이다. 
즉 위의 코드를 이렇게 바꾸어도 프로그램은 똑같이 문제없이 돌아간다. 

public static void printall(HashMap<String, Phone> map){
        Set<Map.Entry<String, Phone>> entries = map.entrySet();
        Iterator<Map.Entry<String, Phone>> it = entries.iterator();

        while(it.hasNext()){
                Map.Entry<String, Phone> mapEntry = it.next();
                System.out.println(mapEntry.getKey() + " " + mapEntry.getValue().getAddress() + " " + mapEntry.getValue().getTelephone());

        }
        
}	// set.java에서 확인 !!!

위의 코드는 DTO를 활용한 데이터 처리 방식을 채택하였다. 
일반적으로 대량 데이터를 효율적으로 관리하기 위해 DTO(Data Transfer Object) 클래스와 컬렉션 API를 함께 사용하는 데 DTO는 이 때 데이터의 교환을 위한 객체를 의미한다. 
즉  Phone 클래스는 DTO 클래스로 설계되었다 할 수 있다.

코드와 함께 보면 해시맵을 이해하는 데에 지장이 없을 것이다.
*/