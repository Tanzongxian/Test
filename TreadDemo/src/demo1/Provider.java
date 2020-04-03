package demo1;

public class Provider extends Thread {
	private ResourcePool pool;
	
	public Provider(ResourcePool pool) {
		this.pool = pool;
		
	}
	
	@Override
	public void run() {
		System.out.println(3);
		
	}
	
}
