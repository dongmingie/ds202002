
public class HW3_2 {

	class Node<E> {
		public E value;	
		public Node<E> prev,next;
	}

	//Queue Ŭ����
	class Queue<E> {
		Node<E> head; // dummy ��带 ���۷����ϴ� ����
		// ������: ���� ��带 �����ϰ� ��ũ ����
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


	public class Main {
		public static void main(String[] args) {
			//	ť Ŭ������ �����մϴ�.
			Queue<String> que = new Queue();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
