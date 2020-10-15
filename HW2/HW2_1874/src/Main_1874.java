import java.util.Scanner;

class Node<E> {
	E value; // 값을 저장할 변수
	Node<E> next; // 다음 노드 변수

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
	Node<E> head; // 연결리스트 제일 위, 헤드 변수
	int size; // 연결리스트의 노드 개수 저장
	
	// 생성자
	StackL() {
		head = null;
		size = 0;
	}
	
	// push 함수
	public void push(E v) {
		Node<E> newNode = new Node(v);
		newNode.setNext(head);
		head = newNode;
		size++;
	}
	
	// pop 함수
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
		
		//여기서 수열의 유효성을 판단
	}
	
	//유효하면, for루프 돌려서 1부터 오름차순으로 push하고, 
	//수열 윗쪽부터 head가 수열 원소에 해당할 경우 순차적으로 pop 
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		StackL<Integer> stack = new StackL();
		for(int i = 1; i <= n; i++) {
			stack.push(i);
			System.out.println("+");
			
			if(stack.top() == i) stack.pop();
			System.out.println("-");
		
			// 유효하지 않으면 , System.out.println("No") 처리
		}

	}

}

// 스택 개념은 이해했는데, input을 받아야 하는 부분에서 막혀 버렸어요 ..!ㅠㅠ