package tjjava.twentyOne;

public class VolatileVisibilityTest {
	private static volatile boolean initFlag = false;

	public static void main(String[] args) throws InterruptedException {
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("waiting data");
				while (!initFlag) {

				}
				System.out.println(" ------------  sucess");
			}
		}).start();

		Thread.sleep(2000);

		new Thread(new Runnable() {
			@Override
			public void run() {
				prepareData();
			}
		}).start();
	}

	public static void prepareData() {
		System.out.println("prepareing data ... ");
		initFlag = true;
		System.out.println("prepare data end ... ");
	}
}
