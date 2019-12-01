package static_overiding;

public class ApplicationRunner {

	public static void main(String[] args) {
		Parent parent = new Parent();
		parent.staticMethod();
		Child child = new Child();
		child.staticMethod();
		Parent parent1 = new Child();
		parent1.staticMethod();
	}
}
