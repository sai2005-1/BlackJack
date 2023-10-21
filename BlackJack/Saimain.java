package BlackJack;

import TurtleGraphics.KeyboardReader;
import TurtleGraphics.StandardPen;

import java.awt.Color;
import java.util.Random;

public class Saimain {

	public void Game() {
		// TODO Auto-generated method stub
		
		Random generator = new Random();
		KeyboardReader reader = new KeyboardReader();
		StandardPen pen =new StandardPen();
		PlayerCards object = new PlayerCards();
		
		
		String name, none;
		char rules, ask;
		int playercard1=0, playercard2=0, playercard3=0, ptotal, pcard, tokens, hitCounter = 0, wager;
		int dealercard1=0, dealercard2=0, copydealer3, dtotal = 0;
		
		
		
		System.out.println("----WELCOME TO BLACKJACK----");
		System.out.println();
		
		System.out.println("Please enter you name");
		name=reader.readLine();
		System.out.println();
		
		System.out.print("Please enter the number of tokens you want: ");
		tokens=reader.readInt();
		System.out.println();
		
		System.out.print(name+", do you want to see Blackjack game rules (y/n): ");
		rules=reader.readChar();
		
		
		System.out.println();
			if((rules=='y')&&(rules!='n'))
			{
				System.out.println("*** BLACKJACK RULES ***");
				System.out.println("1. There are four suits in a deck. Each suit has cards number 2 through 10. There are\r\n" + 
						"also an Ace, Jack, Queen and King.");
				System.out.println("2. The player starts with two cards face up.\r\n" + 
						"Dealer on card face down, the other face up.");
				System.out.println("3. The player then goes with the option of a hit, which means another card. The\r\n" + 
						"player can continue hitting as long as they have less then 21");
				System.out.println("4. Once the player is done, the dealer will then hit automatically if their total is 16 or\r\n" + 
						"less. The dealer 'stays' on 17.");
				System.out.println("5. The person closest to 21, without going over, wins the hand.\r\n" + 
						"If you go over 21 you lose, unless the dealer is over as well, then it is a tie and\r\n" + 
						"nothing happens.");
				System.out.println("6. King, queen and jack all count as 10.\r\n" + 
						"Aces can count as 1 or 11; change automatically for the best hand\r\n" + 
						"A starting hand of 21 is an automatic win.");
				System.out.println();
			}
			else if((rules!='y')&&(rules=='n'))
			{
				
			}
			
			System.out.println("Press enter to continue...");
			none=reader.readLine();
			
			System.out.print("How many tokens do you want to wager?: ");
			wager=reader.readInt();
			
				while(wager>tokens)
				{
					System.out.println("Oops! You don't have enough tokens. You can only bet a max of "+tokens+" tokens");
					System.out.println();
					System.out.print("How many tokens do you want to wage(bet)?: ");
					wager=reader.readInt();
				}
				
				System.out.println();
				
				System.out.println("You have successfully bet "+wager+" tokens");
				
				System.out.println();
			
			playercard1=generator.nextInt(13)+1;
			playercard2=generator.nextInt(13)+1;
			ptotal=playercard1+playercard2+playercard3;
			
			
			
			object.Pcard1(playercard1, pen);
			pen.up();
			pen.setDirection(0);
			pen.move(170);
			pen.setDirection(270);
			pen.move(199);
			pen.down();
			object.Pcard2(playercard2, pen);
			
			System.out.println(name+"'s Cards:");
			System.out.println(playercard1+", "+playercard2);
			ptotal=playercard1+playercard2+playercard3;
			System.out.println(name+"'s total: "+ptotal);
			
			dealercard1=generator.nextInt(13)+1;
			dealercard2=generator.nextInt(13)+1;
			dtotal=dtotal+dealercard2;
			
		
			
			pen.up();
			pen.setDirection(180);
			pen.move(420);
			pen.setDirection(270);
			pen.move(280);
			pen.drawString("Dealer's Cards: ");
			pen.setDirection(0);
			pen.move(250);
			pen.setDirection(270);
			pen.move(220);
			pen.down();
			
			// back card
			pen.setColor(Color.blue);
			pen.down();
			pen.setDirection(90);
			pen.move(200);
			pen.setDirection(180);
			pen.move(150);
			pen.setDirection(270);
			pen.move(200);
			pen.setDirection(0);
			pen.move(150);
			pen.setDirection(90);
			pen.move(201);
			
			pen.setColor(Color.ORANGE);
			int count=1;
			while(count<=201)
			{
				pen.setDirection(270);
				pen.move(1);
				pen.setDirection(180);
				pen.move(150);
				pen.setDirection(0);
				pen.move(150);
				count++;	
			}
			
			pen.up();
			pen.setDirection(90);
			pen.move(155);
			pen.setDirection(180);
			pen.move(75);
			pen.down();
			pen.setColor(Color.blue);
			pen.setWidth(5);
			for(int count1=1; count1<360; count1++)
			{
				pen.move(1);
				pen.turn(1);
			}
			
			pen.up();
			pen.setDirection(270);
			pen.move(20);
			pen.setDirection(180);
			pen.move(1);
			pen.down();
			pen.setColor(Color.RED);
			for(int count1=1; count1<150; count1++)
			{
				pen.move(2);
				pen.turn(3);
			}
			pen.up();
			pen.setDirection(0);
			pen.move(60);
			pen.setDirection(90);
			pen.move(-4);
			
			pen.down();
			pen.setColor(Color.cyan);
			for(int count1=1; count1<150; count1++)
			{
				pen.move(2);
				pen.turn(5);
			}
			pen.up();
			pen.setDirection(90);
			pen.move(93);
			pen.setDirection(0);
			pen.move(54);
			pen.down();
			
			while((ptotal>21)&&(dtotal<=21))
			{
				pen.up();
				pen.setDirection(270);
				pen.move(200);
				pen.down();
				object.Dcard1(dealercard1, pen);
				
				pen.up();
				pen.setDirection(0);
				pen.move(170);
				pen.setDirection(270);
				pen.move(199);
				pen.down();
				
				object.Dcard2(dealercard2, pen);
				
				
				System.out.println("Dealer's total is "+dtotal);
				System.out.println();
				System.out.println("You went over 21");
				System.out.println("Dealer Wins");
	;
				
				System.out.println();
				System.out.println("You lost "+wager+" tokens");
				System.out.println("Now you have "+tokens+" tokens");
				
				
				System.out.print("Do you want to play again? (y/n): ");
				ask=reader.readChar();
			
				
					if((ask=='y')&&(ask!='n')&&(tokens>0))
					{
						
						//Saimain object2 = new Saimain();
						//object2.Game();
						//System.out.println();
						pen.setColor(Color.WHITE);
						pen.setWidth(999999999);
						pen.setDirection(180);
						pen.move(340);
						pen.setWidth(2);
						pen.setColor(Color.black);
						Saimain object2 = new Saimain();
						object2.Regame( name, tokens, pen, reader, generator);
						
					}
					else if((ask=='n')&&(ask!='y'))
					{
						Saimain object2 = new Saimain(); 
						object2.End();
					}
					else if(tokens==0)
					{
						System.out.println("Sorry, you can't play again. You have 0 tokens");
						System.out.println("game is over");
						Saimain object2 = new Saimain();
						object2.End();
					}
					
					System.exit (1);
					
			}
			

			
			pen.up();
			pen.setDirection(0);
			pen.move(170);
			pen.setDirection(270);
			pen.move(199);
			pen.down();
			
			object.Dcard2(dealercard2, pen);
			
		
			
			pen.up();
			pen.setDirection(90);
			pen.move(301);
			pen.setDirection(0);
			pen.move(2);
			pen.down();
			System.out.println();
			
			System.out.print("Do you want to hit? (y/n): ");
			ask=reader.readChar();
			int count1=3;
				while((ask=='y')&&(ask!='n')&&(count1<=5)&&(ptotal<21))
				{
					
					pen.up();
					pen.setDirection(0);
					pen.move(170);
					pen.setDirection(270);
					pen.move(199);
					pen.down();
					playercard3=generator.nextInt(13)+1;
					pcard=playercard3;
					object.Pcard3(playercard3, pen);
					object.Callnumber(playercard3);
					ptotal=ptotal+playercard3;
					System.out.println(name+"'s total is "+ptotal);
					System.out.println();
					hitCounter++;
					count1++;
						if(ptotal>=21)
						{
							break;
						}
					System.out.print("Do you want to hit? (y/n): ");
					ask=reader.readChar();
						
					
				}
				pen.up();
				pen.setDirection(180);
				pen.move(hitCounter*170+170);
				pen.setDirection(270);
				pen.move(505);
				pen.down();
				
				
				
				object.Dcard1(dealercard1, pen);
				dtotal=dealercard1+dtotal;
					
			pen.up();
			pen.setDirection(0);
			pen.move(170);
			pen.down();
				
				int dcardcount=3;
				int hitcount2=0;
				while((dtotal<=16)&&(dcardcount<=5))
				{
					pen.up();
					pen.setDirection(0);
					pen.move(170);
					pen.setDirection(270);
					pen.move(199);
					pen.down();
					
					int dealercard3=0;
					dealercard3=generator.nextInt(13)+1;
					copydealer3=dealercard3;
					object.Dcard3(copydealer3, pen);
					dtotal=dtotal+dealercard3;
					hitcount2++;
					
					dcardcount++;
				}
				System.out.println();
				System.out.println(name+"'s total: "+ptotal);
				System.out.println("dealer's total: "+dtotal);
				System.out.println();
				
					if((ptotal<dtotal)&&(dtotal<=21))
					{
						System.out.println("Dealer is close to 21");
						System.out.println("Dealer wins!!!");
						System.out.println();
						
						System.out.println("You lost "+wager+" tokens");
						tokens=tokens-wager;
						System.out.println("Now you have "+tokens+" tokens");
					}
					else if((ptotal==21)&&(dtotal==21))
					{
						System.out.println("You and the dealer got 21");
						System.out.println("It's a tie!!!");
						System.out.println();
						
						System.out.println("You don't lose or win any tokens");
						System.out.println("You still have "+tokens+" tokens");
						
					}
					else if((ptotal>21)&&(dtotal>21))
					{
						System.out.println("You and the dealer went over 21");
						System.out.println("It's a tie!!!");
						System.out.println();
						
						System.out.println("You don't lose or win any tokens");
						System.out.println("You still have "+tokens+" tokens");
					}
					else if((ptotal<21)&&(dtotal<21)&&(ptotal==dtotal))
					{
						System.out.println("You and the dealer got same total");
						System.out.println("It's a tie!!!");
						System.out.println();
						
						System.out.println("You don't lose or win any tokens");
						System.out.println("You still have "+tokens+" tokens");
					}
					else if((dtotal<=21)&&(ptotal>21))
					{
						System.out.println("You went over 21");
						System.out.println("Dealer wins!!!");
						System.out.println();
						
						System.out.println("You lost "+wager+" tokens");
						tokens=tokens-wager;
						System.out.println("Now you have "+tokens+" tokens");
					}
					else if((ptotal<21)&&(ptotal>dtotal))
					{
						System.out.println("You is close to 21");
						System.out.println(name+" wins!!!");
						System.out.println();
						
						System.out.println("You won "+wager+" tokens");
						tokens=tokens+wager;
						System.out.println("Now you have "+tokens+" tokens");
					}
					else if((ptotal==21)&&(dtotal>21))
					{
						System.out.println("You are lucky to get exactly 21");
						System.out.println(name+" wins!!!");
						System.out.println();
						
						System.out.println("You won "+wager+" tokens");
						tokens=tokens+wager;
						System.out.println("Now you have "+tokens+" tokens");
					}
					else if((ptotal<21)&&(dtotal>21))
					{
						System.out.println("Dealer went over 21");
						System.out.println(name+" wins!!!");
						System.out.println();
					
						System.out.println("You won "+wager+" tokens");
						tokens=tokens+wager;
						System.out.println("Now you have "+tokens+" tokens");
					}
					else if((ptotal==21)&&(dtotal<21))
					{
							System.out.println("You are lucky to get exactly 21");
							System.out.println(name+" wins!!!");
							System.out.println();
						
							System.out.println("You won "+wager+" tokens");
							tokens=tokens+wager;
							System.out.println("Now you have "+tokens+" tokens");
					}
					
					System.out.println();
					
					System.out.print("Do you want to play again? (y/n): ");
					ask=reader.readChar();
				
					
						if((ask=='y')&&(ask!='n')&&(tokens>0))
						{
							/*Saimain object2 = new Saimain();
							object2.Game();
							System.out.println();*/
							pen.setColor(Color.WHITE);
							pen.setWidth(999999999);
							pen.setDirection(180);
							pen.move(hitcount2*170+30);
							pen.setWidth(2);
							pen.setColor(Color.black);
							Saimain object2 = new Saimain();
							object2.Regame( name, tokens, pen, reader, generator);
						}
						else if((ask=='n')&&(ask!='y'))
						{
							Saimain object2 = new Saimain(); 
							object2.End();
						}
						else if(tokens==0)
						{
							System.out.println("Sorry, you can't play again. You have 0 tokens");
							System.out.println("game is over");
							Saimain object2 = new Saimain();
							object2.End();
						}
						
						System.exit(1);
						
						
				//pen.setDirection(180);
				//pen.move(hitCounter*170+340);
			
			
		
	}
	
	public void End() 
	{
		System.out.println();
		System.out.println("--Thanks For Playing BlackJack--");
		
		
	}
	public int Regame(String name2, int tokens2, StandardPen pen, KeyboardReader reader, Random generator)
	{
		PlayerCards object = new PlayerCards();
		Saimain object1 = new Saimain();
		String  none;
		char rules, ask;
		int playercard1=0, playercard2=0, playercard3=0, ptotal, pcard, hitCounter = 0, wager;
		int dealercard1=0, dealercard2=0, copydealer3, dtotal = 0;
		 
		
		System.out.println();
		System.out.println("--------------------------------------------------------");
		System.out.println();
		

			
			System.out.print("How many tokens do you want to wager?: ");
			wager=reader.readInt();
			
				while(wager>tokens2)
				{
					System.out.println("Oops! You don't have enough tokens. You can only bet a max of "+tokens2+" tokens");
					System.out.println();
					System.out.print("How many tokens do you want to wage(bet)?: ");
					wager=reader.readInt();
				}
				
				System.out.println();
				
				System.out.println("You have successfully bet "+wager+" tokens");
				
				System.out.println();
			
			playercard1=generator.nextInt(13)+1;
			playercard2=generator.nextInt(13)+1;
			ptotal=playercard1+playercard2+playercard3;
			
			
			
			object.Pcard1(playercard1, pen);
			pen.up();
			pen.setDirection(0);
			pen.move(170);
			pen.setDirection(270);
			pen.move(199);
			pen.down();
			object.Pcard2(playercard2, pen);
			
			System.out.println(name2+"'s Cards:");
			System.out.println(playercard1+", "+playercard2);
			ptotal=playercard1+playercard2+playercard3;
			System.out.println(name2+"'s total: "+ptotal);
			
			dealercard1=generator.nextInt(13)+1;
			dealercard2=generator.nextInt(13)+1;
			dtotal=dtotal+dealercard2;
			
		
			
			pen.up();
			pen.setDirection(180);
			pen.move(420);
			pen.setDirection(270);
			pen.move(280);
			pen.drawString("Dealer's Cards: ");
			pen.setDirection(0);
			pen.move(250);
			pen.setDirection(270);
			pen.move(220);
			pen.down();
			
			// back card
			pen.setColor(Color.blue);
			pen.down();
			pen.setDirection(90);
			pen.move(200);
			pen.setDirection(180);
			pen.move(150);
			pen.setDirection(270);
			pen.move(200);
			pen.setDirection(0);
			pen.move(150);
			pen.setDirection(90);
			pen.move(201);
			
			pen.setColor(Color.ORANGE);
			int count=1;
			while(count<=201)
			{
				pen.setDirection(270);
				pen.move(1);
				pen.setDirection(180);
				pen.move(150);
				pen.setDirection(0);
				pen.move(150);
				count++;	
			}
			
			pen.up();
			pen.setDirection(90);
			pen.move(155);
			pen.setDirection(180);
			pen.move(75);
			pen.down();
			pen.setColor(Color.blue);
			pen.setWidth(5);
			for(int count1=1; count1<360; count1++)
			{
				pen.move(1);
				pen.turn(1);
			}
			
			pen.up();
			pen.setDirection(270);
			pen.move(20);
			pen.setDirection(180);
			pen.move(1);
			pen.down();
			pen.setColor(Color.RED);
			for(int count1=1; count1<150; count1++)
			{
				pen.move(2);
				pen.turn(3);
			}
			pen.up();
			pen.setDirection(0);
			pen.move(60);
			pen.setDirection(90);
			pen.move(-4);
			
			pen.down();
			pen.setColor(Color.cyan);
			for(int count1=1; count1<150; count1++)
			{
				pen.move(2);
				pen.turn(5);
			}
			pen.up();
			pen.setDirection(90);
			pen.move(93);
			pen.setDirection(0);
			pen.move(54);
			pen.down();
			
			while((ptotal>21)&&(dtotal<=21))
			{
				pen.up();
				pen.setDirection(270);
				pen.move(200);
				pen.down();
				object.Dcard1(dealercard1, pen);
				
				pen.up();
				pen.setDirection(0);
				pen.move(170);
				pen.setDirection(270);
				pen.move(199);
				pen.down();
				
				object.Dcard2(dealercard2, pen);
				
				
				System.out.println("Dealer's total is "+dtotal);
				System.out.println();
				System.out.println("You went over 21");
				System.out.println("Dealer Wins");
				
			
				System.out.println();
				System.out.println("You lost "+wager+" tokens");
				System.out.println("Now you have "+tokens2+" tokens");
				
				
				System.out.print("Do you want to play again? (y/n): ");
				ask=reader.readChar();
				
				
					if((ask=='y')&&(ask!='n')&&(tokens2>0))
					{
						
						//Saimain object2 = new Saimain();
						//object2.Game();
						//System.out.println();
						pen.setColor(Color.WHITE);
						pen.setWidth(999999999);
						pen.setDirection(180);
						pen.move(340);
						pen.setWidth(2);
						pen.setColor(Color.black);
						Saimain object2 = new Saimain();
						object2.Regame( name2, tokens2, pen, reader, generator);
						
					}
					else if((ask=='n')&&(ask!='y'))
					{
						Saimain object2 = new Saimain(); 
						object2.End();
					}
					else if(tokens2==0)
					{
						System.out.println("Sorry, you can't play again. You have 0 tokens");
						System.out.println("game is over");
						Saimain object2 = new Saimain();
						object2.End();
					}
					
					System.exit (1);
					
			}
			

			
			pen.up();
			pen.setDirection(0);
			pen.move(170);
			pen.setDirection(270);
			pen.move(199);
			pen.down();
			
			object.Dcard2(dealercard2, pen);
			
		
			
			pen.up();
			pen.setDirection(90);
			pen.move(301);
			pen.setDirection(0);
			pen.move(2);
			pen.down();
			System.out.println();
			
			System.out.print("Do you want to hit? (y/n): ");
			ask=reader.readChar();
			int count1=3;
				while((ask=='y')&&(ask!='n')&&(count1<=5)&&(ptotal<21))
				{
					
					pen.up();
					pen.setDirection(0);
					pen.move(170);
					pen.setDirection(270);
					pen.move(199);
					pen.down();
					playercard3=generator.nextInt(13)+1;
					pcard=playercard3;
					object.Pcard3(playercard3, pen);
					object.Callnumber(playercard3);
					ptotal=ptotal+playercard3;
					System.out.println(name2+"'s total is "+ptotal);
					System.out.println();
					hitCounter++;
					count1++;
						if(ptotal>=21)
						{
							break;
						}
					System.out.print("Do you want to hit? (y/n): ");
					ask=reader.readChar();
						
					
				}
				pen.up();
				pen.setDirection(180);
				pen.move(hitCounter*170+170);
				pen.setDirection(270);
				pen.move(505);
				pen.down();
				
				
				
				object.Dcard1(dealercard1, pen);
				dtotal=dealercard1+dtotal;
					
			pen.up();
			pen.setDirection(0);
			pen.move(170);
			pen.down();
				
				int dcardcount=3;
				int hitcount2=0;
				while((dtotal<=16)&&(dcardcount<=5))
				{
					pen.up();
					pen.setDirection(0);
					pen.move(170);
					pen.setDirection(270);
					pen.move(199);
					pen.down();
					
					int dealercard3=0;
					dealercard3=generator.nextInt(13)+1;
					copydealer3=dealercard3;
					object.Dcard3(copydealer3, pen);
					dtotal=dtotal+dealercard3;
					hitcount2++;
					
					dcardcount++;
				}
				System.out.println();
				System.out.println(name2+"'s total: "+ptotal);
				System.out.println("dealer's total: "+dtotal);
				System.out.println();
				
					if((ptotal<dtotal)&&(dtotal<=21))
					{
						System.out.println("Dealer is close to 21");
						System.out.println("Dealer wins!!!");
						System.out.println();
						
						System.out.println("You lost "+wager+" tokens");
						tokens2=tokens2-wager;
						System.out.println("Now you have "+tokens2+" tokens");
					}
					else if((ptotal==21)&&(dtotal==21))
					{
						System.out.println("You and the dealer got 21");
						System.out.println("It's a tie!!!");
						System.out.println();
					
						System.out.println("You don't lose or win any tokens");
						System.out.println("You still have "+tokens2+" tokens");
						
					}
					else if((ptotal>21)&&(dtotal>21))
					{
						System.out.println("You and the dealer went over 21");
						System.out.println("It's a tie!!!");
						System.out.println();
						
						System.out.println("You don't lose or win any tokens");
						System.out.println("You still have "+tokens2+" tokens");
					}
					else if((ptotal<21)&&(dtotal<21)&&(ptotal==dtotal))
					{
						System.out.println("You and the dealer got same total");
						System.out.println("It's a tie!!!");
						System.out.println();
					
						System.out.println("You don't lose or win any tokens");
						System.out.println("You still have "+tokens2+" tokens");
					}
					else if((dtotal<=21)&&(ptotal>21))
					{
						System.out.println("You went over 21");
						System.out.println("Dealer wins!!!");
						System.out.println();
					
						System.out.println("You lost "+wager+" tokens");
						tokens2=tokens2-wager;
						System.out.println("Now you have "+tokens2+" tokens");
					}
					else if((ptotal<21)&&(ptotal>dtotal))
					{
						System.out.println("You is close to 21");
						System.out.println(name2+" wins!!!");
						System.out.println();
						
						System.out.println("You won "+wager+" tokens");
						tokens2=tokens2+wager;
						System.out.println("Now you have "+tokens2+" tokens");
					}
					else if((ptotal==21)&&(dtotal>21))
					{
						System.out.println("You are lucky to get exactly 21");
						System.out.println(name2+" wins!!!");
						System.out.println();
					
						System.out.println("You won "+wager+" tokens");
						tokens2=tokens2+wager;
						System.out.println("Now you have "+tokens2+" tokens");
					}
					else if((ptotal<21)&&(dtotal>21))
					{
						System.out.println("Dealer went over 21");
						System.out.println(name2+" wins!!!");
						System.out.println();
				
						System.out.println("You won "+wager+" tokens");
						tokens2=tokens2+wager;
						System.out.println("Now you have "+tokens2+" tokens");
					}
					else if((ptotal==21)&&(dtotal<21))
					{
							System.out.println("You are lucky to get exactly 21");
							System.out.println(name2+" wins!!!");
							System.out.println();
					
							System.out.println("You won "+wager+" tokens");
							tokens2=tokens2+wager;
							System.out.println("Now you have "+tokens2+" tokens");
					}
					
					System.out.println();
					
					System.out.print("Do you want to play again? (y/n): ");
					ask=reader.readChar();
		
					
						if((ask=='y')&&(ask!='n')&&(tokens2>0))
						{
							/*Saimain object2 = new Saimain();
							object2.Game();
							System.out.println();*/
							pen.setColor(Color.WHITE);
							pen.setWidth(999999999);
							pen.setDirection(180);
							pen.move(hitcount2*170+170);
							pen.setWidth(2);
							pen.setColor(Color.black);
							Saimain object2 = new Saimain();
							object2.Regame(name2, tokens2, pen, reader, generator);
						}
						else if((ask=='n')&&(ask!='y'))
						{
							Saimain object2 = new Saimain(); 
							object2.End();
						}
						else if(tokens2==0)
						{
							System.out.println("Sorry, you can't play again. You have 0 tokens");
							System.out.println("Game is over");
							Saimain object2 = new Saimain();
							object2.End();
						}
						
						System.exit(1);
						
		
		return tokens2;
	}


}