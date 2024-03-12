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
	
	public static void queueEnqueue(int item) {
		if(rear == capacity) {
			System.out.println("Queue ist voll.");
		}else {
			queue[rear]=item;
			rear++;
		}
	}
	
	public static int queueDequeue() {
		if(rear == front) {
			System.out.println("Queue ist leer");
		}else {
			int firstElement = queue[front];
			
		}
	}
	
}
