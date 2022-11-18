package com.bridgelabz.stackandqueue;



public class QueueMain {
	public static void main(String[] args) {

		Queue queue = new Queue();
		System.out.println("Queue Operation - EnQueue");
		queue.enQueue(56);
		queue.display();
		queue.enQueue(30);
		queue.display();
		queue.enQueue(70);
		queue.display();
		System.out.println("Queue Operation - DeQueue");
		queue.display();
		queue.deQueue();
		queue.display();
		queue.deQueue();
		queue.display();
		queue.deQueue();
		queue.display();
	}

}

