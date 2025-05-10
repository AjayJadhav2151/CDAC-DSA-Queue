package arrayQueue;

import java.util.Scanner;

public class ClientQueueArray {

	public static void main(String[] args) {
		QueueArray q = new QueueArray();
		
		Scanner sc = new Scanner(System.in);
		
		int value = 0,option = 0;
		
		do {
			System.out.println("********MENU*****************");
			System.out.println("\n 1.initilize Queue"+
								"\n 2.ENQUEUE"+
								"\n 3.DEQUEUE"+
								"\n 4.display"+
								"\n 0.exit");
			System.out.println("Enter your Choice: ");
			option = sc.nextInt();
			
			switch (option) {
			case 1: {
				q.initQueue();
				System.out.println("New Queue Added...");
				break;
			}
			case 2 :{
				System.out.println("Enter values: ");
				value = sc.nextInt();
				
				q.Enqueue(value);
				break;
			}
			case 3:{
				value = q.Dequeue();
				if(value != -1) {
					System.out.println("Dequeu::"+value);
				}
				break;
			}
			case 4:{
				q.display();
				break;
			}

			case 0:{
				System.out.println("End........");
				System.exit(0);
			}
		}
		} while(option != 0);
	}

}
