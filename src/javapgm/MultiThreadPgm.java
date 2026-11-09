package javapgm;

//extends Thread or implement Runnable
//New statement -> Runnable statement -> start() -> When Thread is executing and waiting for scheduler
//Runnable statement -> Running statement -> run() -> When thread is running on the CPU then it is running state 
//Running statement -> Waiting statement -> sleep(), wait() Waiting
//Waiting state -> Runnable state notify() -> After wait if it come back it will go Runnable state and not Running state until Schedule is completed
//Running state -> Dead State stop() -> Don't use

/*
class T1 implements Runnable{
	public void run(){
		for (int i = 1; i < 100; i++) {
			System.out.println("Hi");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
*/

/*
class T2 implements Runnable{
	public void run(){
		for (int i = 1; i < 100; i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
*/

public class MultiThreadPgm {
	public static void main(String[] args) {
//		Runnable obj1 = new T1();
		Runnable obj1 = () ->
		{
			for (int i = 1; i < 100; i++) {
				System.out.println("Hi");
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
//		Runnable obj2 = new T2();
		Runnable obj2 = () ->
		{
			for (int i = 1; i < 100; i++) {
				System.out.println("Hello");
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		t1.start();
		t2.start();
	}	
}
