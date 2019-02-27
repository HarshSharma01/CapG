
public class ThreadCreation extends Thread {

	public String name;
	ThreadCreation(String name){
		this.name=name;
	}
	
	public void run() {
		System.out.println("Thread execution");
	}

	public static void main(String[] args) {
		
		ThreadCreation tc0 = new ThreadCreation("Thread1");
		Thread tobj0 = new Thread(tc0);
		tobj0.start();
		
		ThreadCreation tc1 = new ThreadCreation("Thread2");
		Thread tobj1 = new Thread(tc1);
		tobj1.start();

	}

}
