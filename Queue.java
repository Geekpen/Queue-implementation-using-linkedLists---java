package QueueImplementationUsingLinkedList;
import java.util.LinkedList;

public class Queue {
	//assuming the queue will contain int values only
	LinkedList<Integer> numbers = new LinkedList<Integer>();
	
	
	public void queueAdd(int data) {
		numbers.add(data);
	}
	
	public void queueRemove() {
		if(numbers.size() == 0) {
			System.out.println("Queue is empty");
		}else {
			numbers.removeFirst();
		}
	}
	
	public void queuePrint() {
		for(int data:numbers) {
			System.out.print(data+ " ");
		}
		System.out.println();
	}

}
