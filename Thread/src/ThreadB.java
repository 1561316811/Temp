public class ThreadB extends Thread{
	
	
	public ThreadB(String name) {
		super(name);
	}

	@Override
	public void run() {
		synchronized(this){
			System.out.println(Thread.currentThread().getName()+ " call notify() ");
			notify();
		}
	}
	
}
