
public class q_3 {
	public static boolean isExist(Queue<Integer> q, int num) {
		if (q.isEmpty())
			return false;

		int a = q.remove();
		boolean found = isExist(q,num);
		q.insert(a);
		return found ||(a == num);
	}
	public static Queue<Integer> reverseQueue(Queue<Integer> q){

		if (!q.isEmpty()) {
			int curr = q.remove();
			reverseQueue(q);
			q.insert(curr);
		}



		return q;
	}

	public static void main(String[] args) {
		Queue<Integer> q1 = new Queue<>();
		q1.insert(3);
		q1.insert(4);
		q1.insert(5);
		System.out.println(q1);
		System.out.println("4:" + isExist(q1,4));
		q1 = reverseQueue(q1);

		System.out.println(q1);


		System.out.println("6:" + isExist(q1,6));
		q1 = reverseQueue(q1);

		System.out.println(q1);
	}

}
