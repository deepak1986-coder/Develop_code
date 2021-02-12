package desh.deepak;

public class RunnableByLembda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("From Child Thread");
			}
		};
		Thread t = new Thread(r);
		t.start();
		for(int j=10;j<20;j++)
		{
			System.out.println("From Main Thread");
		}
	}

}
