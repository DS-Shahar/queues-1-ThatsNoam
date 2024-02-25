
public class isConsecutivelyRepeated {
	//פעולה שמקבלת תור ומספר ומחזירה האם הוא מופיע יותר מפעמיים ברצף
	public static boolean isConsecutivelyRepeated(Queue<Integer> q,int number) {
		boolean flag = false;
		Queue<Integer> q1 = new Queue<>();
		while (!q.isEmpty()) {
			if (q.head() == number ) {
					if (q.head() == number) {
						flag = true;
					}				
			}
			q1.insert(q.remove());
			
		}
		while (!q1.isEmpty()) {
			q.insert(q1.remove());
		}
		return flag;
	}
	public static void main(String[] args) {
		Queue<Integer> q1 = new Queue<>();
		q1.insert(1);
		
		
		
		System.out.println(q1);
		boolean a = (isConsecutivelyRepeated(q1,1));
		System.out.println(a);
		System.out.println(q1);
		
	}

}
