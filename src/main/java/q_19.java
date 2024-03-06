
public class q_19 {
	//6
	public static void removeJobs(Queue<Job> JobsQueue, int seconds) {
		Queue<Job> q2 = new Queue<>();
		int sum = 0;
		int temp = 0;
		while (!JobsQueue.isEmpty() && (seconds - sum) > 0) {
			if ((seconds - sum) >= JobsQueue.head().getSeconds()) {
				temp = JobsQueue.head().getSeconds();
				System.out.println(JobsQueue.head().getCode());
				q2.insert(JobsQueue.remove());
			}
			sum += temp;
		}	
		while (!JobsQueue.isEmpty()) {
			q2.insert(JobsQueue.remove());
		}
		while (!q2.isEmpty()) {
			JobsQueue.insert(q2.remove());
		}
	}
	//9
	public static String find(Queue<Wolter> q1, int cc) {
		Queue<Wolter> q2 = new Queue<>();
		String tempID = "Not Found";
		boolean found = false;
		while (!q1.isEmpty() && !found) {
			if (q1.head().getCc() >= cc) {
				tempID = q1.head().getID();
				q1.remove();
				found = true;
			}
			else {
				q2.insert(q1.remove());
			}
		}
		while (!q2.isEmpty()) {
			q1.insert(q2.remove());
		}
		return tempID;
	}
	public static void main(String[] args) {
	Queue<Job> QueueJobs = new Queue<>();
	Job Job1 = new Job(15,"a");
	Job Job2 = new Job(30,"b");
	Job Job3 = new Job(10,"c");
	Job Job4 = new Job(22,"d");
	Job Job5 = new Job(32,"e");
	Job Job6 = new Job(42,"f");
	Job Job7 = new Job(20,"g");
	Job Job8 = new Job(42,"h");
	QueueJobs.insert(Job1);
	QueueJobs.insert(Job2);
	QueueJobs.insert(Job3);
	QueueJobs.insert(Job4);
	QueueJobs.insert(Job5);
	QueueJobs.insert(Job6);
	QueueJobs.insert(Job7);
	QueueJobs.insert(Job8);
	removeJobs(QueueJobs,200);

	}

}
