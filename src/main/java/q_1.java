
public class q_1 {
	public static <T> boolean isExist(Queue<T> q, T x) {
	    Queue<T> temp = new Queue<T>();
	    boolean found = false;

	    while (!q.isEmpty()) {
	        T value = q.remove(); 
	        if (value.equals(x)) {
	            found = true; 
	        }
	        temp.insert(value); 
	    }

	    while (!temp.isEmpty()) {
	        q.insert(temp.remove());
	    }

	    return found; 
	}

	public static void main(String[] args) {
	Queue<Integer> q1 = new Queue<>();
	q1.insert(3);
	q1.insert(4);
	q1.insert(5);
	System.out.println(q1);
	System.out.println("4:" + isExist(q1,4));
	System.out.println("6:" + isExist(q1,6));
	System.out.println(q1);
	}

}
