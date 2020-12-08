import java.util.Scanner;
import java.util.Random;

public class HW3_1 {
	
	class Node<E> {
		public E value;	
		public Node<E> prev,next;
	}

	//Queue 클래스
	class Queue<E> {
		Node<E> head;
		Queue() {
			head = new Node();
			head.prev = head;
			head.next = head;
		}
		
		public void add(E v) {
			// 1. 새로운 노드 생성
			Node<E> newNode = new Node();
			newNode.value = v;
			// 2. 새로운 노드에 링크 연결
			newNode.prev = head;
			newNode.next = head.next;
			// 3. head 노드의 next 노드의 prev 링크를 newNode로 연결합니다.
			head.next.prev = newNode;
			// 4. head 노드의 next 링크를 newNode로 연결합니다.
			head.next = newNode;
		}
		// remove() : 큐에서 데이터 하나 삭제
		// head 노드의 prev 노드를 삭제
		public void remove() {
			// 1. head의 prev 노드를 임시 변수로 저장
			Node<E> tmp = head.prev;
			// 2. tmp 노드의 prev 노드의 next를 head로 설정
			tmp.prev.next = head;
			// 3. head노드의 prev값을 tmp의 prev로 설정
			head.prev = tmp.prev;
		}
		
		// peek(): 큐 맨 앞에 있는 데이터를 반환
		// head 노드의 prev 노드의 value를 반환한다.
		public E peek() {
			return head.prev.value;
		}
		
		// 큐가 비어있다면 true를, 그렇지 않다면 false를 반환한다.
		public boolean empty() {
			return head.prev == head;
		}
	}

	
	class Stack<E> {
		E[] data;
		int top;		
		// 생성자 제작
		Stack() {
			data = (E[])new Object[1024]; // 데이터 배열 생성
			top = -1; // top 변수 초기화
				
			}
		
		public void push(E v) {
			top++;
			data[top] = v;
		}
		
		public void pop() {
			data[top] = null;
			top--;
		}
		
		public E top() {
			return data[top];
		}
		
		public boolean empty() {
			return top == -1;
		
		
		
	}
	public static void main(String[] args) {

		Random rand = new Random(10000);
		Scanner scan = new Scanner(System.in);
		System.out.print("Input n: ");
		int n = scan.nextInt();

		//d) 큐에서 숫자 하나를 꺼냅니다.
		// e) 스택 최상위 숫자가 큐에서 꺼낸 숫자보다 작은 경우, 스택에서 숫자를 꺼내 큐에 넣습니다.
		// f) 스택이 비어있거나 스택 최상위 숫자가 큐에서 꺼낸 숫자보다 클때까지 e)를 반복합니다.
		// g) 스택에 큐에서 꺼낸 숫자를 넛습니다.
		// h) 큐가 비어있지 않다면 d)로 가서 수행을 계속합니다.
		// i) 스택에 있는데이터를 하나씩 꺼내면서 데이터를 출력합니다.

		
	}

}
