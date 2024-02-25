public class page_151 {
	//2A - O(1)
	public static Time calcTimeDifference(Queue<Time> q) {
		Time first = q.head();
		Time last = q.head();
		Queue<Time> q1 = new Queue<>();
		while (!q.isEmpty()) {
			last = q.head();
			q1.insert(q.remove());
		}
		while (!q1.isEmpty()) {
			q.insert(q1.remove());
		}
		 int hoursDifference = last.getHour() - first.getHour();
	        int minutesDifference = last.getMinute() - first.getMinute();
	        int secondsDifference = last.getSecond() - first.getSecond();

	        if (secondsDifference < 0) {
	            secondsDifference += 60;  
	            minutesDifference -= 1;
	        }
	        if (minutesDifference < 0) {
	            minutesDifference += 60;  
	            hoursDifference -= 1;
	        }


	        return new Time(hoursDifference, minutesDifference, secondsDifference);
	    }
	//2B
	
	public static void findLowestDifference(Queue<Time> times) {
	    // Assuming at least two elements are present based on your confirmation
	    Time previousTime = times.remove();
	    int minDifference = Integer.MAX_VALUE;
	    int minDiffIndex = 0;
	    int currentIndex = 0;

	    while (!times.isEmpty()) {
	        Time currentTime = times.remove(); // Get and remove the head of the queue
	        int differenceInSeconds = calculateDifferenceInSeconds(previousTime, currentTime);

	        if (differenceInSeconds < minDifference) {
	            minDifference = differenceInSeconds;
	            minDiffIndex = currentIndex; // Store the index where we found the minimum difference
	        }

	        previousTime = currentTime; // Move to the next pair
	        currentIndex++; // Increment the current index for the next iteration
	    }

	    // Output the indexes with the minimum difference, adjusting for 1-based indexing
	    System.out.println((minDiffIndex + 1) + " & " + (minDiffIndex + 2));
	}

	public static int calculateDifferenceInSeconds(Time earlier, Time later) {
	    int earlierInSeconds = earlier.getHour() * 3600 + earlier.getMinute() * 60 + earlier.getSecond();
	    int laterInSeconds = later.getHour() * 3600 + later.getMinute() * 60 + later.getSecond();

	    return laterInSeconds - earlierInSeconds;
	}
	public static void main(String[] args) {
	Time t1 = new Time(10,55,44);
	Time t2 = new Time(11,56,46);
	Time t3 = new Time(11,57,56);
	Time t4 = new Time(11,59,46);

	Queue<Time> q = new Queue<>();
	q.insert(t1);
	q.insert(t2);
	q.insert(t3);
	q.insert(t4);

	findLowestDifference(q);


	}

}
