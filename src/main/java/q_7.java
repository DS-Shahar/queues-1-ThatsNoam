
public class q_7 {
	//O(n^2)
    public static boolean hasDuplicates(Queue<String> q) {
        Queue<String> tempQueue = new Queue<>();
        String current;
        while (!q.isEmpty()) {
            current = q.remove();
            if (isExist(q, current)) {
                // אם המחרוזת קיימת כבר בתור, יש חזרה
                // מחזירים את כל האלמנטים לתור המקורי
                while (!tempQueue.isEmpty()) {
                    q.insert(tempQueue.remove());
                }
                q.insert(current); // אל תשכח להחזיר גם את המחרוזת הנוכחית
                return true;
            } else {
                // אם המחרוזת לא קיימת בתור, מכניסים אותה לתור העזר
                tempQueue.insert(current);
            }
        }

        // אם הגענו לכאן, אין חזרות
        // מחזירים את כל האלמנטים לתור המקורי
        while (!tempQueue.isEmpty()) {
            q.insert(tempQueue.remove());
        }

        return false;
    }
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
        Queue<String> stringsQueue = new Queue<>();
        stringsQueue.insert("apple");
        stringsQueue.insert("orange");
        stringsQueue.insert("cherry");
        stringsQueue.insert("date");
        stringsQueue.insert("banana"); 

        System.out.println(hasDuplicates(stringsQueue)); 
    }
    

}
