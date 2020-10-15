import java.util.Scanner;

public class Main_9012 {

	public static boolean isValid(String pp) { // ���ڿ� ���� �ùٸ��� true, �ƴϸ� false
		
		char[] stack = new char[1024];
		int top = -1;
		
		// �ݺ���, �������� ó��
		for(int i=0; i<pp.length(); i++) {
			// ���� �ϳ� �б�
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
		
		// for ������ ���鼭 ��ȣ���Է��� �ް� ����� ���
		for(int i = 1; i <= n; i++) {
			// ��ȣ�� �Է��� �޴´�
			String pp = scan.next();
			
			if(isValid(pp)) System.out.println("Yes");
			else System.out.println("No");
		}
	}
}