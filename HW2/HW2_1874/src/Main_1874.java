import java.util.Scanner;

class Node<E> {
	E value; // ���� ������ ����
	Node<E> next; // ���� ��� ����

	Node(E v) {
		value = v;
		next = null;
	}

	public void setNext(Node<E> n) {
		next = n;
	}
	
	public Node<E> getNext() { return next; }
	public E getValue() { return value; }
	
}


class StackL<E> {
	Node<E> head; // ���Ḯ��Ʈ ���� ��, ��� ����
	int size; // ���Ḯ��Ʈ�� ��� ���� ����
	
	// ������
	StackL() {
		head = null;
		size = 0;
	}
	
	// push �Լ�
	public void push(E v) {
		Node<E> newNode = new Node(v);
		newNode.setNext(head);
		head = newNode;
		size++;
	}
	
	// pop �Լ�
	public void pop() {
		head = head.getNext();
		size--;
	}
	
	public E top() {
		return head.getValue();		
	}
	
	public boolean empty() {
		return head == null;
	}
	
	public int size() { return size; }
}
	
public class Main_1874 {
	public static boolean isValid() {
		
		//���⼭ ������ ��ȿ���� �Ǵ�
	}
	
	//��ȿ�ϸ�, for���� ������ 1���� ������������ push�ϰ�, 
	//���� ���ʺ��� head�� ���� ���ҿ� �ش��� ��� ���������� pop 
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		StackL<Integer> stack = new StackL();
		for(int i = 1; i <= n; i++) {
			stack.push(i);
			System.out.println("+");
			
			if(stack.top() == i) stack.pop();
			System.out.println("-");
		
			// ��ȿ���� ������ , System.out.println("No") ó��
		}

	}

}

// ���� ������ �����ߴµ�, input�� �޾ƾ� �ϴ� �κп��� ���� ���Ⱦ�� ..!�Ф�