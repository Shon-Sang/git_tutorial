package dual_priority_queue;

public class DualPriorityQueueMain {

	public static void main(String[] args) {
		DualPriorityQueue dpq = new DualPriorityQueue();
		String[] strArr = {"I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"};
		int[] arr = dpq.solution(strArr);
		System.out.printf("[%d,%d]\n", arr[0], arr[1]);
	}

}
