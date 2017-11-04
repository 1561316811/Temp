import java.util.concurrent.Callable;

public class TextThread {
	
	public static void main(String [] args) throws InterruptedException{
		ThreadB b = new ThreadB("b");
		int cpuNums = Runtime.getRuntime().availableProcessors();
		System.out.println("int cpuNums :" + cpuNums);
		System.out.println(Runtime.getRuntime().maxMemory()/1024/1024);
		synchronized(b){
			System.out.println(Thread.currentThread().getName()+" start b");
			 b.start();
			Thread.sleep(5000);
             // 主线程等待t1通过notify()唤醒。
             System.out.println(Thread.currentThread().getName()+" wait()");
             b.wait();
             
             System.out.println(Thread.currentThread().getName()+" continue");
		}
	}
	
}

