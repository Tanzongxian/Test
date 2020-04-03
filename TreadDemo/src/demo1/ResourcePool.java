package demo1;

public class ResourcePool {
	
	
	private int  size = 10;
	
	private int num;
	
	public synchronized void add() throws InterruptedException {
		
		if (num<size) {
			num++;
			System.out.println(Thread.currentThread().getName()+"Pool has: "+num);
			notifyAll();
			
		}else{
			System.out.println("Poll has full");
			wait();
		}
		
	}
//为消费者提供方法，用来从资源消费对象
	public  synchronized void remove() throws InterruptedException {
		if(num>0) {
			num --;
			System.out.println(Thread.currentThread().getName());
			notifyAll();
		}else {
			System.out.println("pool 该死的又full啦");
			wait();
		}
	}
	
}
