package practice5;

public class Class1 {

	public static void main(String[] args) {

		Node one = new Node(10, 20);
		Node two = new Node(30, 40);
		
		Node result = one.getCenter(two);
		System.out.println("X  : " + result.getX() + ", Y : " + result.getY());

	}

}
