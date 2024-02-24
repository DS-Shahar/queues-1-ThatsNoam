public class q_2 {
	  public static <T> boolean isExist(Queue<T> q, T x) {

		    boolean ret = false;
		    q.insert(null);
		    while (q.head() != null) {
		      T a = q.remove();
		      q.insert(a);
		      if (a == x) {
		        ret = true;
		      }
		    }
		    q.remove();
		    return ret;
		  }  
 
	public static void main(String[] args) {
		Queue<Integer> q1 = new Queue<>();
		q1.insert(3);
		q1.insert(4);
		q1.insert(5);
		System.out.println(q1);
		System.out.println("4:" + isExist(q1,4));
		System.out.println(q1);

		System.out.println("6:" + isExist(q1,6));
		System.out.println(q1);
	}

}
