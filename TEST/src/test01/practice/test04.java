package test01.practice;

import java.util.Scanner;

interface AboutCalculate {
	public void setValue(int a, int b);

	public int calculate();
}

class Add implements AboutCalculate {
	int a;
	int b;

	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int calculate() {
		int result = a + b;
		return result;
	}
}

class Sub implements AboutCalculate {
	int a;
	int b;

	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int calculate() {
		int result = a - b;
		return result;
	}
}

class Mul implements AboutCalculate {
	int a;
	int b;

	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int calculate() {
		int result = a * b;
		return result;
	}
}

class Div implements AboutCalculate {
	int a;
	int b;

	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int calculate() {
		System.out.println("모든 나눗셈 연산은 몫만 출력되어, 정수로 나타납니다.");
		int result = a / b;
		return result;
	}
}

public class test04 {
	public static void main(String[] args) {
		System.out.println("두 정수와 연산자를 입력하시오.(ex >> 16 5 *) >> ");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		char op = sc.next().charAt(0);

		switch (op) {
		case '+':
			Add add = new Add();
			add.setValue(num1, num2);
			int addresult = add.calculate();
			System.out.println(addresult);
			break;

		case '-':
			if (num1 >= num2) {
				Sub sub = new Sub();
				sub.setValue(num1, num2);
				int subresult = sub.calculate();
				System.out.println(subresult);
				break;
			} else {
				System.out.println("첫번째 정수가 두번째 정수보다 크거나 같아야합니다. 프로그램을 종료합니다.");
				break;
			}

		case '*':
			Mul mul = new Mul();
			mul.setValue(num1, num2);
			int mulvalue = mul.calculate();
			System.out.println(mulvalue);
			break;

		case '/':
			if (num1 >= num2) {
				Div div = new Div();
				div.setValue(num1, num2);
				int divvalue = div.calculate();
				System.out.println(divvalue);
			} else {
				System.out.println("첫번째 정수가 두번째 정수보다 크거나 같아야합니다. 프로그램을 종료합니다.");
				break;

			}
		}
	}

}
