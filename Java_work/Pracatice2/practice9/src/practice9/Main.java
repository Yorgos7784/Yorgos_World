package practice9;

public class Main implements Dog, Cat {

	public static void main(String[] args) {
		
		Main main = new Main();
		main.crying();
		main.one();
		main.two();
		

	}

	@Override
	public void crying() {
		
		System.out.println("월! 월!");
		
	}

	@Override
	public void two() {
		System.out.println("Two!");
	}

	@Override
	public void one() {
		System.out.println("One!");
	}

	

}
