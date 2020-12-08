
public class HW3_2 {

	class Node<E> {
		public E value;	
		public Node<E> prev,next;
	}

	//Queue 클래스
	class Queue<E> {
		Node<E> head; // dummy 노드를 레퍼런스하는 변수
		// 생성자: 더미 노드를 생성하고 링크 연결
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


	public class Main {
		public static void main(String[] args) {
			//	큐 클래스를 생성합니다.
			Queue<String> que = new Queue();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
