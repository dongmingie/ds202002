import java.util.Scanner;

public class Main_9012 {

	public static boolean isValid(String pp) { // 문자열 쌍이 올바르면 true, 아니면 false
		
		char[] stack = new char[1024];
		int top = -1;
		
		// 반복문, 스택으로 처리
		for(int i=0; i<pp.length(); i++) {
			// 문자 하나 읽기
			char ch = pp.charAt(i);
			
			if(ch == '(') {
				stack[++top] = ch;
			}
			
			else if(ch == ')') {
				if(top == -1 || stack[top] != '(') return false;
				top--;								
			}
			
			else return false;
		}
		
		return top == -1;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		// for 루프를 돌면서 괄호쌍입력을 받고 결과를 출력
		for(int i = 1; i <= n; i++) {
			// 괄호쌍 입력을 받는다
			String pp = scan.next();
			
			if(isValid(pp)) System.out.println("Yes");
			else System.out.println("No");
		}
	}
}