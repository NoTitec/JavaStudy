package chapter8;

public class DecThread extends Thread {

	public DecThread() {
		// TODO Auto-generated constructor stub
	}

	public DecThread(Runnable target) {
		super(target);
		// TODO Auto-generated constructor stub
	}

	public DecThread(String name) {
		setName(name);
		// TODO Auto-generated constructor stub
	}

	public DecThread(ThreadGroup group, Runnable target) {
		super(group, target);
		// TODO Auto-generated constructor stub
	}

	public DecThread(ThreadGroup group, String name) {
		super(group, name);
		// TODO Auto-generated constructor stub
	}

	public DecThread(Runnable target, String name) {
		super(target, name);
		// TODO Auto-generated constructor stub
	}

	public DecThread(ThreadGroup group, Runnable target, String name) {
		super(group, target, name);
		// TODO Auto-generated constructor stub
	}

	public DecThread(ThreadGroup group, Runnable target, String name, long stackSize) {
		super(group, target, name, stackSize);
		// TODO Auto-generated constructor stub
	}

	public DecThread(ThreadGroup group, Runnable target, String name, long stackSize, boolean inheritThreadLocals) {
		super(group, target, name, stackSize, inheritThreadLocals);
		// TODO Auto-generated constructor stub
	}
	
	public void run() {
		for(int i=1;i<5;i++) {
			try {
				sleep(1000);
				System.out.println(getName());
				System.out.println(activeCount());
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
}
