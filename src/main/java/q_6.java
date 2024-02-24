
public class q_6 {
	// O(n)פעולה המקבלת תור של תווים ומחזירה תור שלמים שהם גדלי הרצפים בקלט
	public static Queue<Integer> sequenceLengths(Queue<Character> input) {
        Queue<Integer> lengths = new Queue<>();
        if (input.isEmpty()) {
            return lengths;
        }

        // מתחילים לספור עם התו הראשון
        char currentChar = input.remove();
        int count = 1;

        while (!input.isEmpty()) {
            char nextChar = input.remove();
            if (nextChar == currentChar) {
                // תו זהה לקודם, נמשיך לספור
                count++;
            } else {
                // תו שונה, נכניס את הספירה לתור ונתחיל ספירה חדשה
                lengths.insert(count);
                currentChar = nextChar;
                count = 1;
            }
        }
        // מוסיפים את הספירה האחרונה
        lengths.insert(count);

        return lengths;
    }

    public static void main(String[] args) {
        Queue<Character> input = new Queue<>();
        input.insert('c');
        input.insert('c');
        input.insert('a');
        input.insert('c');

        Queue<Integer> output = sequenceLengths(input);
        System.out.println(output); 
    }

}
