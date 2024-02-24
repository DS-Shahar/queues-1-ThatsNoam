
public class q_8 {
	//פעולה שמבטלת כפיליות בתור
	public static void removeDuplicates(Queue<Integer> q) {
		Queue<Integer> q1 = new Queue<>();
		Queue<Integer> q2 = new Queue<>();
		while (!q.isEmpty()) {
			int x = q.head();
			q2.insert(q.remove());
			while (!q.isEmpty()) {
				if (q.head() != x) {
					q1.insert(q.remove());
				}
				else {
					q.remove();
				}
			}
			while (!q1.isEmpty()) {
				q.insert(q1.remove());
			}
		}
		while (!q2.isEmpty()) {
			q.insert(q2.remove());
		}
		

	}

	public static void main(String[] args) {
		Queue<Integer> q1 = new Queue<>();
		q1.insert(7);
		q1.insert(7);
		q1.insert(8);
		q1.insert(8);
		q1.insert(8);
		System.out.println(q1);
		removeDuplicates(q1);
		System.out.println(q1);

	}

}
