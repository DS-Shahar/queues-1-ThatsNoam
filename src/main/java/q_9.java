
public class q_9 {
	// O(n^2) פעולה שמקבלת תור וממיינת אותו בסדר עולה בעזרת 2 תורי עזר
	public static void sortQueue(Queue<Integer> q) {
		Queue<Integer> q1 = new Queue<>();
		Queue<Integer> q2 = new Queue<>();
		while (!q.isEmpty()){
			int min = q.head();
			while (!q.isEmpty()) {
				if (q.head() < min) {
					min = q.head();
				}
				q1.insert(q.remove());
			}
			while (!q1.isEmpty()) {
				if (q1.head() != min) {
					q.insert(q1.remove());
				}
				else {
					q2.insert(q1.remove());
				}
			}
		}
		while (!q2.isEmpty()) {
			q.insert(q2.remove());
		}


	}
	
	public static void main(String[] args) {
		Queue<Integer> q1 = new Queue<>();
		q1.insert(7);
		q1.insert(4);
		q1.insert(8);
		q1.insert(8);
		q1.insert(2);
		System.out.println(q1);
		sortQueue(q1);
		System.out.println(q1);

	}

}
