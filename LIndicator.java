
public class LIndicator extends Indicator {

	public LIndicator() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void display() throws InterruptedException {
		System.out.print("\033[32m<-\r" + "\033[0m");
		Thread.sleep(500);
		System.out.print("             \r");
		Thread.sleep(500);

	}

}
