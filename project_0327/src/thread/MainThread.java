package thread;

class ThreadB extends ArrayStoreException implements Runnable{
	@Override
	public void run() {
		for(int i=0; i<1000; i++) {
			System.out.println("ThreadB : " + i);
		}
	}
}

class ThreadA extends Thread{
	@Override
	public void run() {
		for(int i=0; i<1000; i++) {
			System.out.println("ThreadA : " + i);
		}
	}
}

class ThreadC extends Thread{
	@Override
	public void run() {
		for(int i=0; i<1000; i++) {
			System.out.println("ThreadC : " + i);
		}
	}
}

public class MainThread {

	public static void main(String[] args) {
		ThreadA th = new ThreadA();
		Thread th2 = new Thread(new ThreadB());//아래와 같은 이유로 Thread를 그냥 생성 해준다.
		Thread th3 = new Thread(new ThreadC());
		//ThreadB th2 = new ThreadB(): 하고 th2.start(); 하여 ThreadB가 실행하고 싶은데
		//th2.start()를 사용할 수 없다. 왜냐하면 Thread는 Runable()를 구현했고 
		//Runable()은 start() 메서드가 없다 그래서 Runable()를 구현한 ThreadB를 사용한 것이다 
		th.start();//새로운 스레드로 시작해라는 것
		th2.start();//이제 사용이 가능해 졌다.
		th3.start();
		for(int i=0; i<1000; i++) {
			System.out.println("main :"+i);
		}
	}

}
