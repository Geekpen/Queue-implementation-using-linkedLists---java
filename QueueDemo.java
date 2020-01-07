package QueueImplementationUsingLinkedList;

public class QueueDemo {

	public static void main(String[] args) {
		// First In First Out(FIFO)
		Queue myvals = new Queue();
		
		myvals.queueAdd(1);
		myvals.queueAdd(2);
		myvals.queueAdd(3);
		
		myvals.queuePrint();
		
		myvals.queueRemove();
		myvals.queuePrint();

	}

}
