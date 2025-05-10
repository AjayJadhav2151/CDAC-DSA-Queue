package arrayQueue;

import java.util.Scanner;

public class QueueArray {
	private int front;
	private int rear;
	private int que[];
	private int size;

	Scanner sc = new Scanner(System.in);

	public QueueArray() {
		size = 0;
		que = new int[size];
		front = rear = -1;
	}

	public void initQueue() {
		System.out.println("Enter the size of Queue: ");
		size = sc.nextInt();
		que = new int[this.size];
		front = rear = -1;
	}

	public boolean isFull() {
		if (rear == size - 1) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isEmpty() {
		if (front == rear) {
			return true;
		} else {
			return false;
		}
	}

	public int Enqueue(int value) {
		if (!isFull()) {
			rear++;
			que[rear] = value;
		} else {
			System.out.println("Queue is overflow");
		}
		return value;
	}

	public int Dequeue() {
		int value = 0;
		if (!isEmpty()) {
			front++;
			value = que[front];
		} else {
			System.out.println("Queue is underflow");
		}
		return value;
	}

	public void display() {
		for (int i = front + 1; i <= rear; i++) {
			System.out.print(que[i] + " ");
		}
		System.out.println();
	}
}
