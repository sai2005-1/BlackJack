package BlackJack;

import TurtleGraphics.StandardPen;

public class CardsMain2 {

	public static void main(String[] args) {
		DrawCards object = new DrawCards();
		StandardPen pen = new StandardPen();
		
		object.DrawCard5(pen);
		object.DrawCardJ(pen);
		object.DrawCardQ(pen);
		object.DrawCardK(pen);
	}

}
