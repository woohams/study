/*
	주어진 문자열이 올바른 괄호열인지 판단하는 문제
	괄호 문자열(Parenthesis String, PS)은 두 개의 괄호 기호인 ‘(’ 와 ‘)’ 만으로 구성되어 있는 문자열이다. 
	그 중에서 괄호의 모양이 바르게 구성된 문자열을 올바른 괄호 문자열(Valid PS, VPS)이라고 부른다. 
	한 쌍의 괄호 기호로 된 “( )” 문자열은 기본 VPS 이라고 부른다. 만일 x 가 VPS 라면 이것을 하나의 괄호에 넣은 새로운 문자열 “(x)”도 VPS 가 된다. 
	그리고 두 VPS x 와 y를 접합(concatenation)시킨 새로운 문자열 xy도 VPS 가 된다. 
	예를 들어 “(())()”와 “((()))” 는 VPS 이지만 “(()(”, “(())()))” , 그리고 “(()” 는 모두 VPS 가 아닌 문자열이다. 
	여러분은 입력으로 주어진 괄호 문자열이 VPS 인지 아닌지를 판단해서 그 결과를 YES 와 NO 로 나타내어야 한다. 
	
	입력 데이터는 표준 입력을 사용한다. 입력은 T개의 테스트 데이터로 주어진다. 입력의 첫 번째 줄에는 입력 데이터의 수를 나타내는 정수 T가 주어진다. 
	각 테스트 데이터의 첫째 줄에는 괄호 문자열이 한 줄에 주어진다. 하나의 괄호 문자열의 길이는 2 이상 50 이하이다. 
	출력은 표준 출력을 사용한다. 만일 입력 괄호 문자열이 올바른 괄호 문자열(VPS)이면 “YES”, 아니면 “NO”를 한 줄에 하나씩 차례대로 출력해야 한다. 
	
	예제입력 : 	6
			(())())
			(((()())()
			(()())((()))
			((()()(()))(((())))()
			()()()()(()()())()
			(()((())()(
	예제출력 : 	NO
			NO
			YES
			NO
			YES
			NO	
	
*/
package baekjoon.step0.Q9012;

import java.io.*;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		
		while (n-- > 0) { // i > 0, i--;
			boolean isVPS = true;
			String input = br.readLine();

			Stack<Character> stack = new Stack<Character>();
			char temp;
			for (int i = 0; i < input.length(); i++) {
				temp = input.charAt(i);
				if (temp == '(') { // 여는 괄호는 스택에 push하여 담는다.
					stack.push(temp);
				} else if (temp == ')') { // 닫는 괄호가 나온경우 스택의 맨 위의 값이 여는괄호인지 비교한다.
					if (!stack.isEmpty()) { // 스택이 비어있지 않고 맨위값이 여는 괄호라면 스택의 맨 위값을 pop한다.
						stack.pop();
					} else {
						isVPS = false;
						break;
					}
				}
			}
			if (!stack.isEmpty())
				isVPS = false;
			if (isVPS) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}

}
