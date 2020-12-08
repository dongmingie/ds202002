import java.util.Scanner;
import java.util.Random;

public class HW3_1 {
	
	class Node<E> {
		public E value;	
		public Node<E> prev,next;
	}

	//Queue Ŭ����
	class Queue<E> {
		Node<E> head;
		Queue() {
			head = new Node();
			head.prev = head;
			head.next = head;
		}
		
		public void add(E v) {
			// 1. ���ο� ��� ����
			Node<E> newNode = new Node();
			newNode.value = v;
			// 2. ���ο� ��忡 ��ũ ����
			newNode.prev = head;
			newNode.next = head.next;
			// 3. head ����� next ����� prev ��ũ�� newNode�� �����մϴ�.
			head.next.prev = newNode;
			// 4. head ����� next ��ũ�� newNode�� �����մϴ�.
			head.next = newNode;
		}
		// remove() : ť���� ������ �ϳ� ����
		// head ����� prev ��带 ����
		public void remove() {
			// 1. head�� prev ��带 �ӽ� ������ ����
			Node<E> tmp = head.prev;
			// 2. tmp ����� prev ����� next�� head�� ����
			tmp.prev.next = head;
			// 3. head����� prev���� tmp�� prev�� ����
			head.prev = tmp.prev;
		}
		
		// peek(): ť �� �տ� �ִ� �����͸� ��ȯ
		// head ����� prev ����� value�� ��ȯ�Ѵ�.
		public E peek() {
			return head.prev.value;
		}
		
		// ť�� ����ִٸ� true��, �׷��� �ʴٸ� false�� ��ȯ�Ѵ�.
		public boolean empty() {
			return head.prev == head;
		}
	}

	
	class Stack<E> {
		E[] data;
		int top;		
		// ������ ����
		Stack() {
			data = (E[])new Object[1024]; // ������ �迭 ����
			top = -1; // top ���� �ʱ�ȭ
				
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

		//d) ť���� ���� �ϳ��� �����ϴ�.
		// e) ���� �ֻ��� ���ڰ� ť���� ���� ���ں��� ���� ���, ���ÿ��� ���ڸ� ���� ť�� �ֽ��ϴ�.
		// f) ������ ����ְų� ���� �ֻ��� ���ڰ� ť���� ���� ���ں��� Ŭ������ e)�� �ݺ��մϴ�.
		// g) ���ÿ� ť���� ���� ���ڸ� �ӽ��ϴ�.
		// h) ť�� ������� �ʴٸ� d)�� ���� ������ ����մϴ�.
		// i) ���ÿ� �ִµ����͸� �ϳ��� �����鼭 �����͸� ����մϴ�.

		
	}

}
