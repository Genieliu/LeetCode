public class LRUCache {
	class Node {
		public int key;
		public int value;
		public Node pre;
		public Node next;

		public Node(int k,int v) {
			key = k;
			value = v;
			pre = this;
			next = this;
		}

		public Node() {

			pre = this;
			next = this;
		}
	}

	public LRUCache(int capacity) {
		head = new Node();
		table = new HashMap<>();
		volume = capacity;
		indicate = 0;
		//	head.pre = head;
		//head.next = head;
	}

	public int get(int key) {
		Node i = table.get((Integer) key);
		if (i == null)
			return -1;
		refresh(i);
		return i.value;
	}

	public void set(int key, int value) {
		Node i = table.get((Integer) key);
		if (i != null) {
			i.value = value;
			refresh(i);
		} else {
			if (indicate == volume) {
				Node tmp = head.next;
				table.remove((Integer) head.next.key);
				delete(head.next);
			}
			Node newKey = new Node(key, value);
			table.put((Integer) key, newKey);
			insert(newKey);
		}

	}

	/*	private Node search(int k) {
			Node n = head.next;
			while (n != head) {
				if (n.key == k)
					return n;
				n = n.next;
			}
			return null;
		}
	*/
	private void refresh(Node i) {
		delete(i);
		insert(i);
	}

	private void insert(Node n) {
		Node tail = head.pre;
		tail.next = n;
		n.pre = tail;
		n.next = head;
		head.pre = n;
		indicate += 1;
	}

	private void delete(Node i) {
		Node a = i.pre;
		Node b = i.next;
		a.next = b;
		b.pre = a;
		indicate -= 1;
	}

	Node head;
	Map<Integer,Node> table;
	int volume;
	int indicate;
}