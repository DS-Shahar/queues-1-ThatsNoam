import java.util.*;

public class q_18 {
	//4
	public static Queue<Ball> fill(String[] a, int n){
		Queue<Ball> q = new Queue<>();
		boolean[] size = {true, false};
		for (int i = 0;i < n;i++) {
		int r = (int)(Math.random()*5);
		int s = (int)(Math.random()*2);
		Ball b = new Ball(a[r], size[s]);
		System.out.print(b + " ");
		q.insert(b);
		}
		return q;
	}
	//פעולה שמקבלת תור של כדורים ומיקום ומחזירה אם במיקום יש כדור זהב.
	public static boolean isGold(Queue<Ball> q1,int index) {
		q1.insert(null);
		boolean isGold = false;
		int i = 0;
		while (!(q1.head() == null)) {
			if (i == index && q1.head().getColor() == "gold") {
				isGold = true;
				}
			i++;
			q1.insert(q1.remove());
		}
		q1.remove();
		return isGold;
	}
	public static void main(String[] args) {
	Scanner reader = new Scanner (System.in);
	String[] colors = {"red","gold","yellow","blue","white"};
	Queue<Ball> q1 = fill(colors,100);
	int count = 1;
	boolean won = false;
	System.out.println();
	while (!won) {
		System.out.println("Where do you think is gold ? ");
		int guess = reader.nextInt();
		if (isGold(q1,guess)){
			System.out.println("You found gold in : " + count + " tries.");
			won = true;
		}
		count++;
	}
	}
	
}
