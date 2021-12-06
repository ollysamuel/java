
public class Main {

	public static void main(String[] args) {	
	
		Greeting greeting = new Greeting() {
			@Override
			public void welcome() {
				System.out.println("yoyoyo!");
			}
		};
		
		Greeting greeting2 = new Greeting();
		
		greeting.welcome();
		greeting2.welcome();
		
	}

}
