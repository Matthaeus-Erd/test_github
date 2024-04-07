package queue;

public class ArrayQueue {

	private static int front;
	private static int rear;
	private static int capacity;
	private static int[] queue;
	
	public ArrayQueue(int size) {
		front = 0;
		rear = 0;
		capacity = size;
		queue = new int[size];
	}
	
	/*
	 * Adds and item into the queue
	 */
	public static void queueEnqueue(int item) {
		if(rear == capacity) {
			System.out.println("Queue ist voll.");
		}else {
			queue[rear]=item;
			rear++;
		}
	}
	
	/*
	 * Removes an item with an ID form the queue
	 */
	public static int queueDequeue() {
		int firstElement = 0;
		if(rear == front) {
			System.out.println("Queue ist leer");
		}else {
			firstElement = queue[front];
			for(int i = 0; i < (rear-1); i++) {
				queue[i] = queue[i+1];
			}
			if(rear < capacity) {
				queue[rear] = 0;
			}
			rear--;
			
		}
		return firstElement;
	}
	
	/*
	 * Prints all the items in the queue
	 */
	public static void queueDisplay() {
		if(front == rear) {
			System.out.println("Queue is empty!");
		}else {
			for(int i = front; i < rear; i++) {
				System.out.println(i);
			}
		}
	}
	
	/*
	 * Returns the first element in the queue
	 */
	public static int queueFront() {
		int firstElement = 0;
		if(rear == front) {
			System.out.println("Queue is empty!");
		}else {
			firstElement = queue[front];
		}
		return firstElement;
	}
	
}
