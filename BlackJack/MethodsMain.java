package BlackJack;
import TurtleGraphics.KeyboardReader;
public class MethodsMain {

	public static void main(String[] args) {
		KeyboardReader reader = new KeyboardReader();
		
		//linking to other class called method
		Methods object = new Methods();
		//call the method with the object
		object.PrintNumber();

	}

}