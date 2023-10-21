package BlackJack;

import TurtleGraphics.StandardPen;

public class CardsMain 
{

	public static void main(String[] args) 
	{
		DrawCards object = new DrawCards();
		StandardPen pen = new StandardPen();
		pen.home();  //Only use this once
		
		
		object.DrawTheCard(pen);
		object.DrawClub(pen);
		object.CardNine(pen);
		
		object.DrawDiamond(pen);
		object.CardAce(pen);
		object.DrawSpade(pen);
		object.CardHeart(pen);
		object.DrawSix(pen);
		object.BackCard(pen);
		object.DrawCardTen(pen);
		object.DrawCard4(pen);
		object.DrawCrad2(pen);
		object.DrawCard3(pen);

	}
	
	

}