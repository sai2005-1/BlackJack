package BlackJack;

import TurtleGraphics.KeyboardReader;
import TurtleGraphics.StandardPen;

import java.awt.Color;
import java.util.Random;
public class PlayerCards {
	
	
	
	
	public int Pcard1(int playercard11, StandardPen pen)
	{
		KeyboardReader reader = new KeyboardReader();
		
		Random generator = new Random();
		pen.setWidth(2);
		pen.setColor(Color.black);
		pen.up();
		pen.setDirection(180);
		pen.move(370);
		pen.setDirection(90);
		pen.move(270);
		pen.down();
		pen.drawString("Player's Cards:");
		//outside of card
		pen.up();
		pen.setDirection(270);
		pen.move(220);
		pen.setDirection(0);
		pen.move(250);
		pen.down();
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
		
		pen.setColor(Color.orange);
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
		
		 if(playercard11==1)
    	 {
    		 pen.setColor(Color.black);
 			pen.up();
 			pen.setDirection(180);
 			pen.move(30);
 			pen.setDirection(90);
 			pen.move(8);
 			pen.down();
 			pen.setDirection(70);
 			pen.move(30);
 			pen.setDirection(290);
 			pen.move(30);
 			pen.setDirection(110);
 			pen.move(15);
 			pen.setDirection(180);
 			pen.move(9);
 			pen.up();
			pen.setColor(Color.black);
			pen.setDirection(90);
			pen.move(69);
			pen.setDirection(180);
			pen.move(72);
			pen.down();
			for(int count1=1;count1<=360;count1++)
			{
				pen.move(20);
				pen.turn(180);
				pen.move(20);
				pen.turn(1);
			}
			
			pen.up();
			pen.setColor(Color.black);
			pen.setDirection(0);
			pen.move(40);
			pen.down();
			for(int count1=1;count1<=360;count1++)
			{
				pen.move(20);
				pen.turn(180);
				pen.move(20);
				pen.turn(1);
			}
			pen.up();
			pen.setDirection(0);	
			pen.move(17);
			pen.setDirection(90);
			pen.move(7);
			pen.down();
			pen.setWidth(7);
			pen.setDirection(125);
			pen.move(60);
			pen.setDirection(230);
			pen.move(60);
			pen.setDirection(0);
			pen.move(65);
			pen.setDirection(125);
			pen.move(45);
			pen.setDirection(230);
			pen.move(40);
			pen.setDirection(0);
			pen.move(41);
			pen.setDirection(125);
			pen.move(30);
			pen.setDirection(230);
			pen.move(25);
			pen.setDirection(0);
			pen.move(25);
			pen.setDirection(130);
			pen.move(15);
			pen.setDirection(263);
			pen.move(15);
			pen.setDirection(125);
			pen.move(15);
			
			//stem for spade
			pen.up();
			pen.setWidth(4);
			pen.setDirection(270);
			pen.move(35);
			pen.setDirection(0);
			pen.move(9);
			pen.down();
			pen.setDirection(260);
			pen.move(40);
			pen.setDirection(0);
			pen.move(15);
			pen.setDirection(100);
			pen.move(40);
			pen.setDirection(270);
			pen.move(37);
			pen.setDirection(180);
			pen.move(5);
			pen.setDirection(80);
			pen.move(35);
			pen.setDirection(265);
			pen.move(35);
			pen.setDirection(0);
			pen.move(6);
			pen.setDirection(100);
			pen.move(35);
			pen.setDirection(95);
			pen.move(50);
			
			//ace on top
			pen.up();
			pen.setDirection(180);
			pen.move(100);
			pen.setDirection(90);
			pen.move(100);
			pen.down();
			
			pen.setWidth(2);
			pen.setColor(Color.black);
			pen.up();
			pen.setDirection(0);
			pen.move(40);
			pen.setDirection(270);
			pen.move(70);
			pen.down();
			pen.setDirection(70);
			pen.move(30);
			pen.setDirection(290);
			pen.move(30);
			pen.setDirection(110);
			pen.move(15);
			pen.setDirection(180);
			pen.move(9);
			pen.up();
			pen.setDirection(90);
			pen.move(22);
			pen.setDirection(0);
			pen.move(136);
			pen.down();
    	 }
    	 else if(playercard11==2)
    	 {
    			pen.up();
    			pen.setDirection(90);
    			pen.move(32);
    			pen.setDirection(180);
    			pen.move(35);
    			pen.down();
    			pen.setDirection(200);
    			pen.move(0);
    			
    			// draw 2 bottom
    			pen.setColor(Color.black);
    			for (int count1=1; count1<=20; count1++)
    			{
    				pen.move(-1);
    				pen.turn(-5);
    			}
    			pen.setDirection(235);
    			pen.move(20);
    			pen.setDirection(0);
    			pen.move(20);
    			pen.up();
    			pen.setDirection(90);
    			pen.move(110);
    			pen.setDirection(180);
    			pen.move(85);
    			pen.down();
    			
    			//draw heart
    			pen.setColor(Color.RED);
    			for(int count1=1;count1<=360;count1++)
    			{
    				pen.move(20);
    				pen.turn(180);
    				pen.move(20);
    				pen.turn(1);
    			}
    			pen.up();
    			pen.setDirection(0);
    			pen.move(40);
    			pen.down();
    			for(int count1=1;count1<=360;count1++)
    			{
    				pen.move(20);
    				pen.turn(180);
    				pen.move(20);
    				pen.turn(1);
    			}
    			pen.up();
    			pen.setDirection(0);
    			pen.move(21);
    			pen.setDirection(270);
    			pen.move(3);
    			pen.down();
    			pen.setDirection(240);
    			pen.move(75);
    			pen.setDirection(125);
    			pen.move(75);
    			pen.setDirection(0);
    			pen.move(7);
    			pen.setWidth(6);
    			pen.setDirection(270);
    			pen.move(5);
    			pen.setDirection(305);
    			pen.move(62);
    			pen.setDirection(60);
    			pen.move(60);
    			pen.setDirection(180);
    			pen.move(60);
    			pen.setDirection(305);
    			pen.move(52);
    			pen.setDirection(60);
    			pen.move(52);
    			pen.setDirection(180);
    			pen.move(52);
    			pen.setDirection(305);
    			pen.move(44);
    			pen.setDirection(60);
    			pen.move(42);
    			pen.setDirection(180);
    			pen.move(43);
    			pen.setDirection(305);
    			pen.move(42);
    			pen.setDirection(60);
    			pen.move(42);
    			pen.setDirection(180);
    			pen.move(40);
    			pen.setDirection(305);
    			pen.move(32);
    			pen.setDirection(60);
    			pen.move(32);
    			pen.setWidth(15);
    			pen.setDirection(180);
    			pen.move(24);
    			pen.setDirection(300);
    			pen.move(15);
    			pen.setDirection(40);
    			pen.move(2);
    			pen.up();
    			
    			//draw 2 top
    			pen.setDirection(90);
    			pen.move(90);
    			pen.setDirection(180);
    			pen.move(65);
    			pen.setDirection(200);
    			pen.move(0);
    			pen.down();
    			pen.setColor(Color.black);
    			pen.setWidth(2);
    			for (int count1=1; count1<=20; count1++)
    			{
    				pen.move(-1);
    				pen.turn(-5);
    			}
    			pen.setDirection(235);
    			pen.move(20);
    			pen.setDirection(0);
    			pen.move(20);
    			pen.up();
    			pen.setDirection(90);
    			pen.move(33);
    			pen.setDirection(0);
    			pen.move(112);
    			pen.down();
    	 }
    	 else if(playercard11==3)
    	 {
    		 pen.up();
 			pen.setDirection(90);
 			pen.move(39);
 			pen.setDirection(180);
 			pen.move(30);
 			pen.setDirection(220);
 			pen.move(0);
 			pen.down();
 			//draw 3 on bottom
 			pen.setColor(Color.black);
 			for (int count1=1; count1<=40; count1++)
 			{
 				pen.move(-1);
 				pen.turn(-6);
 			}
 			pen.setDirection(220);
 			pen.move(0);
 			for (int count1=1; count1<=45; count1++)
 			{
 				pen.move(-1);
 				pen.turn(-6);
 			}
 			pen.up();
 			pen.setDirection(90);
 			pen.move(80);
 			pen.setDirection(180);
 			pen.move(68);
 			
 			//draw spade
 			pen.down();
 			for(int count1=1;count1<=360;count1++)
 			{
 				pen.move(20);
 				pen.turn(180);
 				pen.move(20);
 				pen.turn(1);
 			}
 			
 			pen.up();
 			pen.setColor(Color.black);
 			pen.setDirection(0);
 			pen.move(40);
 			pen.down();
 			for(int count1=1;count1<=360;count1++)
 			{
 				pen.move(20);
 				pen.turn(180);
 				pen.move(20);
 				pen.turn(1);
 			}
 			pen.up();
 			pen.setDirection(0);
 			pen.move(17);
 			pen.setDirection(90);
 			pen.move(7);
 			pen.down();
 			pen.setWidth(7);
 			pen.setDirection(125);
 			pen.move(60);
 			pen.setDirection(230);
 			pen.move(60);
 			pen.setDirection(0);
 			pen.move(65);
 			pen.setDirection(125);
 			pen.move(45);
 			pen.setDirection(230);
 			pen.move(40);
 			pen.setDirection(0);
 			pen.move(41);
 			pen.setDirection(125);
 			pen.move(30);
 			pen.setDirection(230);
 			pen.move(25);
 			pen.setDirection(0);
 			pen.move(25);
 			pen.setDirection(130);
 			pen.move(15);
 			pen.setDirection(263);
 			pen.move(15);
 			pen.setDirection(125);
 			pen.move(15);
 			
 			//stem for spade
 			pen.up();
 			pen.setWidth(4);
 			pen.setDirection(270);
 			pen.move(35);
 			pen.setDirection(0);
 			pen.move(9);
 			pen.down();
 			pen.setDirection(260);
 			pen.move(40);
 			pen.setDirection(0);
 			pen.move(15);
 			pen.setDirection(100);
 			pen.move(40);
 			pen.setDirection(270);
 			pen.move(37);
 			pen.setDirection(180);
 			pen.move(5);
 			pen.setDirection(80);
 			pen.move(35);
 			pen.setDirection(265);
 			pen.move(35);
 			pen.setDirection(0);
 			pen.move(6);
 			pen.setDirection(100);
 			pen.move(35);
 			pen.setDirection(95);
 			pen.move(50);
 			pen.up();
 			pen.setDirection(90);
 			pen.move(55);
 			pen.setDirection(180);
 			pen.move(55);
 			pen.setDirection(220);
 			pen.move(0);
 			pen.down();
 			pen.setWidth(2);
 			
 			//draw 3 top
 			pen.setColor(Color.black);
 			for (int count1=1; count1<=40; count1++)
 			{
 				pen.move(-1);
 				pen.turn(-6);
 			}
 			pen.setDirection(220);
 			pen.move(0);
 			for (int count1=1; count1<=45; count1++)
 			{
 				pen.move(-1);
 				pen.turn(-6);
 			}
 			pen.up();
 			pen.setDirection(90);
 			pen.move(42);
 			pen.setDirection(0);
 			pen.move(132);
 			pen.down();
    	 }
    	 else if(playercard11==4)
 			{
    		//draw 4 bottom
 			pen.up();
 			pen.setDirection(90);
 			pen.move(35);
 			pen.setDirection(180);
 			pen.move(25);
 			pen.down();
 			pen.setColor(Color.black);
 			pen.setDirection(270);
 			pen.move(20);
 			pen.setDirection(0);
 			pen.move(20);
 			pen.setDirection(180);
 			pen.move(10);
 			pen.setDirection(270);
 			pen.move(10);
 			pen.setDirection(90);
 			pen.move(20);
 			
 			// draw diamond
 			pen.up();
 			pen.setDirection(180);
 			pen.move(60);
 			pen.setDirection(90);
 			pen.move(125);
 			pen.setWidth(2);
 			pen.setColor(Color.red);
 			pen.down();
 			pen.setDirection(290);
 			pen.move(60);
 			pen.setDirection(250);
 			pen.move(60);
 			pen.setDirection(110);
 			pen.move(60);
 			pen.setDirection(70);
 			pen.move(60);
 			
 			//fill in
 			pen.up();
 			pen.setDirection(270);
 			pen.move(3);
 			pen.down();
 			pen.setWidth(3);
 			pen.setDirection(290);
 			pen.move(59);
 			pen.setDirection(250);
 			pen.move(57);
 			pen.setDirection(110);
 			pen.move(58);
 			pen.setDirection(70);
 			pen.move(55);
 			
 			pen.setDirection(290);
 			pen.move(55);
 			pen.setDirection(250);
 			pen.move(51);
 			pen.setDirection(110);
 			pen.move(55);
 			pen.setDirection(70);
 			pen.move(49);
 			
 			pen.setWidth(5);
 			pen.setDirection(290);
 			pen.move(55);
 			pen.setDirection(250);
 			pen.move(51);
 			pen.setDirection(110);
 			pen.move(55);
 			pen.setDirection(70);
 			pen.move(53);
 		
 			
 			pen.setDirection(270);
 			pen.move(92);
 			pen.setDirection(0);
 			pen.move(3);
 			pen.setDirection(90);
 			pen.move(83);
 			pen.setDirection(300);
 			pen.move(4);
 			pen.setDirection(270);
 			pen.move(75);
 			pen.setDirection(75);
 			pen.move(4);
 			pen.setDirection(90);
 			pen.move(65);
 			pen.setDirection(272);
 			pen.move(7);
 			pen.setWidth(10);
 			pen.setDirection(270);
 			pen.move(50);
 			pen.setDirection(65);
 			pen.move(11);
 			pen.setDirection(90);
 			pen.move(20);
 			pen.setDirection(180);
 			pen.move(23);
 			pen.setDirection(70);
 			pen.move(29);
 			pen.setDirection(270);
 			pen.move(62);
 			pen.setDirection(105);
 			pen.move(30);
 			pen.up();
 			
 			
 			//draw 4 top
 			pen.setWidth(2);
 			pen.setDirection(180);
 			pen.move(31);
 			pen.setDirection(90);
 			pen.move(65);
 			pen.up();
 			pen.setDirection(90);
 			pen.move(35);
 			pen.setDirection(180);
 			pen.move(25);
 			pen.down();
 			pen.setColor(Color.black);
 			pen.setDirection(270);
 			pen.move(20);
 			pen.setDirection(0);
 			pen.move(20);
 			pen.setDirection(180);
 			pen.move(10);
 			pen.setDirection(270);
 			pen.move(10);
 			pen.setDirection(90);
 			pen.move(20);
 			pen.up();
 			pen.setDirection(90);
 			pen.move(17);
 			pen.setDirection(0);
 			pen.move(131);
 			pen.down();
 			
 		}
    	 else if(playercard11==5)
    	 {
    			pen.up();
    			pen.setDirection(90);
    			pen.move(35);
    			pen.setDirection(180);
    			pen.move(10);
    			pen.down();
    			
    			//draw 5 bottom
    			pen.setColor(Color.black);
    			pen.setDirection(180);
    			pen.move(15);
    			pen.setDirection(270);
    			pen.move(12);
    			pen.setDirection(220);
    			pen.move(0);
    			for (int count1=1; count1<=45; count1++)
    			{
    				pen.move(-1);
    				pen.turn(-6);
    			}
    			pen.up();
    			pen.setDirection(90);
    			pen.move(110);
    			pen.setDirection(180);
    			pen.move(70);
    			
    			//draw heart
    			pen.down();
    			pen.setColor(Color.RED);
    			for(int count1=1;count1<=360;count1++)
    			{
    				pen.move(20);
    				pen.turn(180);
    				pen.move(20);
    				pen.turn(1);
    			}
    			pen.up();
    			pen.setDirection(0);
    			pen.move(40);
    			pen.down();
    			for(int count1=1;count1<=360;count1++)
    			{
    				pen.move(20);
    				pen.turn(180);
    				pen.move(20);
    				pen.turn(1);
    			}
    			pen.up();
    			pen.setDirection(0);
    			pen.move(21);
    			pen.setDirection(270);
    			pen.move(3);
    			pen.down();
    			pen.setDirection(240);
    			pen.move(75);
    			pen.setDirection(125);
    			pen.move(75);
    			pen.setDirection(0);
    			pen.move(7);
    			pen.setWidth(6);
    			pen.setDirection(270);
    			pen.move(5);
    			pen.setDirection(305);
    			pen.move(62);
    			pen.setDirection(60);
    			pen.move(60);
    			pen.setDirection(180);
    			pen.move(60);
    			pen.setDirection(305);
    			pen.move(52);
    			pen.setDirection(60);
    			pen.move(52);
    			pen.setDirection(180);
    			pen.move(52);
    			pen.setDirection(305);
    			pen.move(44);
    			pen.setDirection(60);
    			pen.move(42);
    			pen.setDirection(180);
    			pen.move(43);
    			pen.setDirection(305);
    			pen.move(42);
    			pen.setDirection(60);
    			pen.move(42);
    			pen.setDirection(180);
    			pen.move(40);
    			pen.setDirection(305);
    			pen.move(32);
    			pen.setDirection(60);
    			pen.move(32);
    			pen.setWidth(15);
    			pen.setDirection(180);
    			pen.move(24);
    			pen.setDirection(300);
    			pen.move(15);
    			pen.setDirection(40);
    			pen.move(2);
    			
    			//Draw 5 top
    			pen.up();
    			pen.setDirection(90);
    			pen.move(85);
    			pen.setDirection(180);
    			pen.move(50);
    			pen.setWidth(2);
    			pen.down();
    			pen.setColor(Color.black);
    			pen.setDirection(180);
    			pen.move(15);
    			pen.setDirection(270);
    			pen.move(12);
    			pen.setDirection(220);
    			pen.move(0);
    			for (int count1=1; count1<=45; count1++)
    			{
    				pen.move(-1);
    				pen.turn(-6);
    			}
    			pen.up();
    			pen.setDirection(90);
    			pen.move(36);
    			pen.setDirection(0);
    			pen.move(136);
    			pen.down();
    	 }
    	 else if(playercard11==6)
    	 {
    		//6 on bottom
 			pen.up();
 			pen.setColor(Color.black);
 			pen.setWidth(2);
 			
 			pen.setDirection(180);
 			pen.move(100);
 			pen.setDirection(250);
 			pen.move(0);
 			
 			pen.up();
 			pen.setDirection(0);
 			pen.move(78);
 			pen.setDirection(90);
 			pen.move(48);
 			pen.setDirection(250);
 			pen.move(0);
 			pen.down();
 			
 			for(int count1=1; count1<7; count1++)
 			{
 				pen.move(5);
 				pen.turn(2);
 			}
 			
 			for(int count1=1; count1<100; count1++)
 			{
 				pen.move(1);
 				pen.turn(7);
 			}
 			
 			pen.up();
 			pen.setColor(Color.black);
 			pen.setDirection(90);
 			pen.move(69);
 			pen.setDirection(180);
 			pen.move(67);
 			pen.down();
 			for(int count1=1;count1<=360;count1++)
 			{
 				pen.move(20);
 				pen.turn(180);
 				pen.move(20);
 				pen.turn(1);
 			}
 			
 			pen.up();
 			pen.setColor(Color.black);
 			pen.setDirection(0);
 			pen.move(40);
 			pen.down();
 			for(int count1=1;count1<=360;count1++)
 			{
 				pen.move(20);
 				pen.turn(180);
 				pen.move(20);
 				pen.turn(1);
 			}
 			pen.up();
 			pen.setDirection(0);
 			pen.move(17);
 			pen.setDirection(90);
 			pen.move(7);
 			pen.down();
 			pen.setWidth(7);
 			pen.setDirection(125);
 			pen.move(60);
 			pen.setDirection(230);
 			pen.move(60);
 			pen.setDirection(0);
 			pen.move(65);
 			pen.setDirection(125);
 			pen.move(45);
 			pen.setDirection(230);
 			pen.move(40);
 			pen.setDirection(0);
 			pen.move(41);
 			pen.setDirection(125);
 			pen.move(30);
 			pen.setDirection(230);
 			pen.move(25);
 			pen.setDirection(0);
 			pen.move(25);
 			pen.setDirection(130);
 			pen.move(15);
 			pen.setDirection(263);
 			pen.move(15);
 			pen.setDirection(125);
 			pen.move(15);
 			
 			//stem for spade
 			pen.up();
 			pen.setWidth(4);
 			pen.setDirection(270);
 			pen.move(35);
 			pen.setDirection(0);
 			pen.move(9);
 			pen.down();
 			pen.setDirection(260);
 			pen.move(40);
 			pen.setDirection(0);
 			pen.move(15);
 			pen.setDirection(100);
 			pen.move(40);
 			pen.setDirection(270);
 			pen.move(37);
 			pen.setDirection(180);
 			pen.move(5);
 			pen.setDirection(80);
 			pen.move(35);
 			pen.setDirection(265);
 			pen.move(35);
 			pen.setDirection(0);
 			pen.move(6);
 			pen.setDirection(100);
 			pen.move(35);
 			pen.setDirection(95);
 			pen.move(50);
 			
 			//6 on top
 			
 			pen.up();
 			pen.setColor(Color.black);
 			pen.setWidth(2);
 			
 			pen.setDirection(180);
 			pen.move(125);
 			pen.setDirection(250);
 			pen.move(0);
 			
 			pen.up();
 			pen.setDirection(0);
 			pen.move(78);
 			pen.setDirection(90);
 			pen.move(55);
 			pen.setDirection(250);
 			pen.move(0);
 			pen.down();
 			
 			for(int count1=1; count1<7; count1++)
 			{
 				pen.move(5);
 				pen.turn(2);
 			}
 			
 			for(int count1=1; count1<100; count1++)
 			{
 				pen.move(1);
 				pen.turn(7);
 			}
 			pen.up();
 			pen.setDirection(90);
 			pen.move(37);
 			pen.setDirection(0);
 			pen.move(134);
 			pen.down();
 		
    	 }
    	 else if(playercard11==7)
    	 {
    		//bottom number 7
 			
 			pen.setColor(Color.black);
 			pen.up();
 			pen.setDirection(90);
 			pen.move(40);
 			pen.setDirection(180);
 			pen.move(30);
 			pen.down();
 			pen.setDirection(0);
 			pen.move(15);
 			pen.setDirection(270);
 			pen.move(30);

 			
 			
 			
 			//heart
 			pen.up();
 			pen.setDirection(180);
 			pen.move(80);
 			pen.setDirection(90);
 			pen.move(107);
 			pen.setColor(Color.RED);
 			pen.down();
 			for(int count1=1;count1<=360;count1++)
 			{
 				pen.move(20);
 				pen.turn(180);
 				pen.move(20);
 				pen.turn(1);
 			}
 			pen.up();
 			pen.setDirection(0);
 			pen.move(40);
 			pen.down();
 			for(int count1=1;count1<=360;count1++)
 			{
 				pen.move(20);
 				pen.turn(180);
 				pen.move(20);
 				pen.turn(1);
 			}
 			pen.up();
 			pen.setDirection(0);
 			pen.move(21);
 			pen.setDirection(270);
 			pen.move(3);
 			pen.down();
 			pen.setDirection(240);
 			pen.move(75);
 			pen.setDirection(125);
 			pen.move(75);
 			pen.setDirection(0);
 			pen.move(7);
 			pen.setWidth(6);
 			pen.setDirection(270);
 			pen.move(5);
 			pen.setDirection(305);
 			pen.move(62);
 			pen.setDirection(60);
 			pen.move(60);
 			pen.setDirection(180);
 			pen.move(60);
 			pen.setDirection(305);
 			pen.move(52);
 			pen.setDirection(60);
 			pen.move(52);
 			pen.setDirection(180);
 			pen.move(52);
 			pen.setDirection(305);
 			pen.move(44);
 			pen.setDirection(60);
 			pen.move(42);
 			pen.setDirection(180);
 			pen.move(43);
 			pen.setDirection(305);
 			pen.move(42);
 			pen.setDirection(60);
 			pen.move(42);
 			pen.setDirection(180);
 			pen.move(40);
 			pen.setDirection(305);
 			pen.move(32);
 			pen.setDirection(60);
 			pen.move(32);
 			pen.setWidth(15);
 			pen.setDirection(180);
 			pen.move(24);
 			pen.setDirection(300);
 			pen.move(15);
 			pen.setDirection(40);
 			pen.move(2);
 			
 			//top 7 number
 			pen.setWidth(2);
 			pen.setColor(Color.black);
 			pen.up();
 			pen.setDirection(90);
 			pen.move(85);
 			pen.setDirection(180);
 			pen.move(70);
 			pen.down();
 			pen.setDirection(0);
 			pen.move(15);
 			pen.setDirection(270);
 			pen.move(30);
 			pen.up();
 			pen.setDirection(90);
 			pen.move(43);
 			pen.setDirection(0);
 			pen.move(125);
 			pen.down();
 			 
    	 }
    	 else if(playercard11==8)
    	 {
    		//draw number 8
    		 pen.up();
    			pen.setDirection(145);
    			pen.move(20);
    			pen.setColor(Color.black);
    			pen.setWidth(2);
    			pen.setDirection(45);
    			pen.move(10);
    			pen.setDirection(270);
    			pen.move(5);
    			pen.setDirection(180);
    			pen.move(5);
    			pen.setDirection(90);
    			pen.move(3);
    			pen.down();
    			
    			
    			
    			for(int count1=1; count1<100; count1++)
    			{
    				pen.move(1);
    				pen.turn(7);
    			}
    			
    			pen.up();
    			pen.setDirection(90);
    			pen.move(20);
    			pen.down();
    			for(int count1=1; count1<100; count1++)
    			{
    				pen.move(1);
    				pen.turn(7);
    			}
    			pen.setColor(Color.black);
    			pen.up();
    			pen.setDirection(0);
    			pen.setDirection(90);
    			pen.move(100);
    			pen.setDirection(270);
    			pen.move(65);
    			pen.setDirection(90);
    			pen.move(35);
    			pen.setDirection(180);
    			pen.move(37.5);
    			pen.down();
    			for(int count1=1;count1<=360;count1++)
    			{
    				pen.move(20);
    				pen.turn(180);
    				pen.move(20);
    				pen.turn(1);
    			}
    			
    			pen.up();
    			pen.setColor(Color.black);
    			pen.setDirection(180);
    			pen.move(40);
    			
    			
    			pen.down();
    			for(int count1=1;count1<=360;count1++)
    			{
    				pen.move(20);
    				pen.turn(180);
    				pen.move(20);
    				pen.turn(1);
    			}
    			pen.up();
    			pen.setColor(Color.black);
    			pen.setDirection(90);
    			pen.move(30);
    			pen.setDirection(0);
    			pen.move(20);
    			pen.down();
    			for(int count1=1;count1<=360;count1++)
    			{
    				pen.move(20);
    				pen.turn(180);
    				pen.move(20);
    				pen.turn(1);
    			}
    			//steam
    			
    			pen.up();
    			pen.setDirection(270);
    			pen.move(38);
    			pen.down();
    			pen.setColor(Color.black);
    			pen.setDirection(255);
    			pen.move(35);
    			pen.setDirection(0);
    			pen.move(20);
    			pen.setDirection(107);
    			pen.move(35);
    			pen.setWidth(5);
    			pen.setDirection(180);
    			pen.move(3);
    			pen.setDirection(287);
    			pen.move(33);
    			pen.setDirection(180);
    			pen.move(15);
    			pen.setDirection(75);
    			pen.move(30);
    			pen.setDirection(0);
    			pen.move(1);
    			pen.setDirection(270);
    			pen.move(3);
    			pen.setDirection(255);
    			pen.move(22);
    			pen.setWidth(7);
    			pen.setDirection(0);
    			pen.move(10);
    			pen.setDirection(135);
    			pen.move(5);
    			pen.setDirection(90);
    			pen.move(3);
    			pen.setDirection(315);
    			pen.move(4);
    			
    			//top number
    			pen.up();
    			pen.setDirection(90);
    			pen.move(94);
    			pen.setDirection(180);
    			pen.move(50);
    			pen.setColor(Color.black);
    			pen.setWidth(2);
    			pen.setDirection(45);
    			pen.move(10);
    			pen.setDirection(270);
    			pen.move(5);
    			pen.setDirection(180);
    			pen.move(5);
    			pen.setDirection(90);
    			pen.move(3);
    			pen.down();
    			
    			
    			
    			for(int count1=1; count1<100; count1++)
    			{
    				pen.move(1);
    				pen.turn(7);
    			}
    			
    			pen.up();
    			pen.setDirection(90);
    			pen.move(20);
    			pen.down();
    			for(int count1=1; count1<100; count1++)
    			{
    				pen.move(1);
    				pen.turn(7);
    			}
    			pen.up();
    			pen.setDirection(90);
    			pen.move(20);
    			pen.setDirection(0);
    			pen.move(120);
    			pen.down();
    	 }
    	 else if(playercard11==9)
    	 {
    			pen.setDirection(180);
    			pen.move(75);
    			pen.setDirection(90);
    			pen.move(150);
    			pen.setWidth(2);
    			pen.setColor(Color.red);
    			pen.down();
    			pen.setDirection(290);
    			pen.move(60);
    			pen.setDirection(250);
    			pen.move(60);
    			pen.setDirection(110);
    			pen.move(60);
    			pen.setDirection(70);
    			pen.move(60);
    			
    			//fill in
    			pen.up();
    			pen.setDirection(270);
    			pen.move(3);
    			pen.down();
    			pen.setWidth(3);
    			pen.setDirection(290);
    			pen.move(59);
    			pen.setDirection(250);
    			pen.move(57);
    			pen.setDirection(110);
    			pen.move(58);
    			pen.setDirection(70);
    			pen.move(55);
    			
    			pen.setDirection(290);
    			pen.move(55);
    			pen.setDirection(250);
    			pen.move(51);
    			pen.setDirection(110);
    			pen.move(55);
    			pen.setDirection(70);
    			pen.move(49);
    			
    			pen.setWidth(5);
    			pen.setDirection(290);
    			pen.move(55);
    			pen.setDirection(250);
    			pen.move(51);
    			pen.setDirection(110);
    			pen.move(55);
    			pen.setDirection(70);
    			pen.move(53);
    		
    			
    			pen.setDirection(270);
    			pen.move(92);
    			pen.setDirection(0);
    			pen.move(3);
    			pen.setDirection(90);
    			pen.move(83);
    			pen.setDirection(300);
    			pen.move(4);
    			pen.setDirection(270);
    			pen.move(75);
    			pen.setDirection(75);
    			pen.move(4);
    			pen.setDirection(90);
    			pen.move(65);
    			pen.setDirection(272);
    			pen.move(7);
    			pen.setWidth(10);
    			pen.setDirection(270);
    			pen.move(50);
    			pen.setDirection(65);
    			pen.move(11);
    			pen.setDirection(90);
    			pen.move(20);
    			pen.setDirection(180);
    			pen.move(23);
    			pen.setDirection(70);
    			pen.move(29);
    			pen.setDirection(270);
    			pen.move(62);
    			pen.setDirection(105);
    			pen.move(30);
    			
    			//nine number on bottom
    			pen.up();
    			pen.setDirection(270);
    			pen.move(72);
    			pen.setDirection(0);
    			pen.move(65);
    			
    			pen.setColor(Color.black);
    			pen.setWidth(2);
    			pen.down();
    			for(int count1=1; count1<100; count1++)
    			{
    				pen.move(1);
    				pen.turn(7);
    			}
    			pen.setDirection(0);
    			pen.move(12);
    			pen.setDirection(90);
    			pen.move(2);
    			pen.setDirection(270);
    			pen.move(17);
    			
    			//9 on top
    			pen.up();
    			pen.setDirection(90);
    			pen.move(185);
    			pen.setDirection(180);
    			pen.move(120);
    			
    			pen.setColor(Color.black);
    			pen.setWidth(2);
    			pen.down();
    			for(int count1=1; count1<100; count1++)
    			{
    				pen.move(1);
    				pen.turn(7);
    			}
    			pen.up();
    			pen.setDirection(0);
    			pen.move(4);
    			pen.setDirection(270);
    			pen.move(12);
    			pen.down();
    			pen.setDirection(270);
    			pen.move(17);
    			pen.up();
    			pen.setDirection(90);
    			pen.move(38);
    			pen.setDirection(0);
    			pen.move(124);
    			pen.down();
    	 }
    	 else if(playercard11==10)
    	 {
    		//draw 10 bottom
 			pen.up();
 			pen.setColor(Color.black);
 			pen.setWidth(2);
 			pen.setDirection(90);
 			pen.move(30);
 			pen.setDirection(180);
 			pen.move(35);
 			pen.down();
 			pen.setDirection(270);
 			pen.move(25);
 			pen.up();
 			pen.setDirection(90);
 			pen.move(0);
 			pen.setDirection(0);
 			pen.move(18);
 			
 			pen.down();
 			for(int count1=1; count1<100; count1++)
 			{
 				pen.move(1);
 				pen.turn(4.5);
 			}
 			pen.up();
 			pen.setDirection(90);
 			pen.move(110);
 			pen.setDirection(180);
 			pen.move(50);
 			
 			pen.setColor(Color.black);
 			pen.up();
 			pen.setDirection(0);
 			pen.setDirection(270);
 			pen.move(65);
 			pen.setDirection(90);
 			pen.move(35);
 			pen.setDirection(180);
 			pen.move(2);
 			pen.down();
 			for(int count1=1;count1<=360;count1++)
 			{
 				pen.move(20);
 				pen.turn(180);
 				pen.move(20);
 				pen.turn(1);
 			}
 			
 			pen.up();
 			pen.setColor(Color.black);
 			pen.setDirection(180);
 			pen.move(40);
 			
 			
 			pen.down();
 			for(int count1=1;count1<=360;count1++)
 			{
 				pen.move(20);
 				pen.turn(180);
 				pen.move(20);
 				pen.turn(1);
 			}
 			pen.up();
 			pen.setColor(Color.black);
 			pen.setDirection(90);
 			pen.move(30);
 			pen.setDirection(0);
 			pen.move(20);
 			pen.down();
 			for(int count1=1;count1<=360;count1++)
 			{
 				pen.move(20);
 				pen.turn(180);
 				pen.move(20);
 				pen.turn(1);
 			}
 			//steam
 			
 			pen.up();
 			pen.setDirection(270);
 			pen.move(38);
 			pen.down();
 			pen.setColor(Color.black);
 			pen.setDirection(255);
 			pen.move(35);
 			pen.setDirection(0);
 			pen.move(20);
 			pen.setDirection(107);
 			pen.move(35);
 			pen.setWidth(5);
 			pen.setDirection(180);
 			pen.move(3);
 			pen.setDirection(287);
 			pen.move(33);
 			pen.setDirection(180);
 			pen.move(15);
 			pen.setDirection(75);
 			pen.move(30);
 			pen.setDirection(0);
 			pen.move(1);
 			pen.setDirection(270);
 			pen.move(3);
 			pen.setDirection(255);
 			pen.move(22);
 			pen.setWidth(7);
 			pen.setDirection(0);
 			pen.move(10);
 			pen.setDirection(135);
 			pen.move(5);
 			pen.setDirection(90);
 			pen.move(3);
 			pen.setDirection(315);
 			pen.move(4);
 			
 			//draw 10 on top
 			pen.up();
 			pen.setDirection(90);
 			pen.move(125);
 			pen.setDirection(180);
 			pen.move(70);
 			pen.down();
 			pen.setWidth(2);
 			pen.setDirection(270);
 			pen.move(25);
 			pen.up();
 			pen.setDirection(90);
 			pen.move(0);
 			pen.setDirection(0);
 			pen.move(17);
 			
 			pen.down();
 			for(int count1=1; count1<100; count1++)
 			{
 				pen.move(1);
 				pen.turn(4.5);
 			}
 			pen.up();
 			pen.setDirection(90);
 			pen.move(25);
 			pen.setDirection(0);
 			pen.move(110);
 			pen.down();
    	 }
 			else if(playercard11==11)
 			{
 				pen.up();
 				pen.setDirection(90);
 				pen.move(40);
 				pen.setDirection(180);
 				pen.move(15);
 				pen.down();
 				
 				//draw j on bottom
 				pen.setColor(Color.black);
 				pen.setDirection(180);
 				pen.move(10);
 				pen.setDirection(0);
 				pen.move(20);
 				pen.setDirection(180);
 				pen.move(10);
 				pen.setDirection(270);
 				pen.move(25);
 				pen.setDirection(90);
 				pen.move(0);
 				for (int count1=1; count1<=25; count1++)
 				{
 					pen.move(-1);
 					pen.turn(-8);
 				}
 				pen.up();
 				pen.setDirection(90);
 				pen.move(100);
 				pen.setDirection(180);
 				pen.move(67);
 				
 				//draw heart
 				pen.setColor(Color.RED);
 				pen.down();
 				for(int count1=1;count1<=360;count1++)
 				{
 					pen.move(20);
 					pen.turn(180);
 					pen.move(20);
 					pen.turn(1);
 				}
 				pen.up();
 				pen.setDirection(0);
 				pen.move(40);
 				pen.down();
 				for(int count1=1;count1<=360;count1++)
 				{
 					pen.move(20);
 					pen.turn(180);
 					pen.move(20);
 					pen.turn(1);
 				}
 				pen.up();
 				pen.setDirection(0);
 				pen.move(21);
 				pen.setDirection(270);
 				pen.move(3);
 				pen.down();
 				pen.setDirection(240);
 				pen.move(75);
 				pen.setDirection(125);
 				pen.move(75);
 				pen.setDirection(0);
 				pen.move(7);
 				pen.setWidth(6);
 				pen.setDirection(270);
 				pen.move(5);
 				pen.setDirection(305);
 				pen.move(62);
 				pen.setDirection(60);
 				pen.move(60);
 				pen.setDirection(180);
 				pen.move(60);
 				pen.setDirection(305);
 				pen.move(52);
 				pen.setDirection(60);
 				pen.move(52);
 				pen.setDirection(180);
 				pen.move(52);
 				pen.setDirection(305);
 				pen.move(44);
 				pen.setDirection(60);
 				pen.move(42);
 				pen.setDirection(180);
 				pen.move(43);
 				pen.setDirection(305);
 				pen.move(42);
 				pen.setDirection(60);
 				pen.move(42);
 				pen.setDirection(180);
 				pen.move(40);
 				pen.setDirection(305);
 				pen.move(32);
 				pen.setDirection(60);
 				pen.move(32);
 				pen.setWidth(15);
 				pen.setDirection(180);
 				pen.move(24);
 				pen.setDirection(300);
 				pen.move(15);
 				pen.setDirection(40);
 				pen.move(2);
 				pen.up();
 				pen.setDirection(90);
 				pen.move(88);
 				pen.setDirection(180);
 				pen.move(53);
 				
 				// draw j on top
 				pen.down();
 				pen.setWidth(2);
 				pen.setColor(Color.black);
 				pen.setDirection(180);
 				pen.move(10);
 				pen.setDirection(0);
 				pen.move(20);
 				pen.setDirection(180);
 				pen.move(10);
 				pen.setDirection(270);
 				pen.move(25);
 				pen.setDirection(90);
 				pen.move(0);
 				for (int count1=1; count1<=25; count1++)
 				{
 					pen.move(-1);
 					pen.turn(-8);
 				}
 				pen.up();
 				pen.setDirection(90);
 				pen.move(35);
 				pen.setDirection(0);
 				pen.move(139);
 				pen.down();
 			}
 			else if(playercard11==12)
 			{
 				pen.up();
 				pen.setDirection(90);
 				pen.move(35);
 				pen.setDirection(180);
 				pen.move(30);
 				pen.down();
 				
 				// draw Q bottom
 				pen.setColor(Color.black);
 				for (int count1=1; count1<=150; count1++)
 				{
 					pen.move(1);
 					pen.turn(4);
 				}
 				pen.setDirection(325);
 				pen.move(10);
 				pen.setDirection(145);
 				pen.move(20);
 				pen.up();
 				pen.setDirection(90);
 				pen.move(75);
 				pen.setDirection(180);
 				pen.move(30);
 				
 				//draw club
 				
 				pen.setColor(Color.black);
 				pen.down();
 				for(int count1=1;count1<=360;count1++)
 				{
 					pen.move(20);
 					pen.turn(180);
 					pen.move(20);
 					pen.turn(1);
 				}
 				
 				pen.up();
 				pen.setColor(Color.black);
 				pen.setDirection(180);
 				pen.move(40);
 				
 				
 				pen.down();
 				for(int count1=1;count1<=360;count1++)
 				{
 					pen.move(20);
 					pen.turn(180);
 					pen.move(20);
 					pen.turn(1);
 				}
 				pen.up();
 				pen.setColor(Color.black);
 				pen.setDirection(90);
 				pen.move(30);
 				pen.setDirection(0);
 				pen.move(20);
 				pen.down();
 				for(int count1=1;count1<=360;count1++)
 				{
 					pen.move(20);
 					pen.turn(180);
 					pen.move(20);
 					pen.turn(1);
 				}
 				//steam
 				
 				pen.up();
 				pen.setDirection(270);
 				pen.move(38);
 				pen.down();
 				pen.setColor(Color.black);
 				pen.setDirection(255);
 				pen.move(35);
 				pen.setDirection(0);
 				pen.move(20);
 				pen.setDirection(107);
 				pen.move(35);
 				pen.setWidth(5);
 				pen.setDirection(180);
 				pen.move(3);
 				pen.setDirection(287);
 				pen.move(33);
 				pen.setDirection(180);
 				pen.move(15);
 				pen.setDirection(75);
 				pen.move(30);
 				pen.setDirection(0);
 				pen.move(1);
 				pen.setDirection(270);
 				pen.move(3);
 				pen.setDirection(255);
 				pen.move(22);
 				pen.setWidth(7);
 				pen.setDirection(0);
 				pen.move(10);
 				pen.setDirection(135);
 				pen.move(5);
 				pen.setDirection(90);
 				pen.move(3);
 				pen.setDirection(315);
 				pen.move(4);
 				
 				pen.up();
 				pen.setDirection(90);
 				pen.move(130);
 				pen.setDirection(180);
 				pen.move(55);
 				
 				//Draw Q top
 				pen.down();
 				pen.setColor(Color.black);
 				pen.setWidth(2);
 				for (int count1=1; count1<=150; count1++)
 				{
 					pen.move(1);
 					pen.turn(4);
 				}
 				pen.setDirection(325);
 				pen.move(10);
 				pen.setDirection(145);
 				pen.move(20);
 				pen.up();
 				pen.setDirection(90);
 				pen.move(23);
 				pen.setDirection(0);
 				pen.move(123);
 				pen.down();
 			}
 			else if(playercard11==13)
 			{
 				pen.up();
 				pen.setDirection(90);
 				pen.move(35);
 				pen.setDirection(180);
 				pen.move(23);
 				pen.down();
 				
 				//Draw K bottom
 				pen.setColor(Color.black);
 				pen.setDirection(270);
 				pen.move(30);
 				pen.up();
 				pen.setDirection(0);
 				pen.move(15);
 				pen.down();
 				pen.setDirection(135);
 				pen.move(20);
 				pen.setDirection(45);
 				pen.move(20);
 				pen.up();
 				pen.setDirection(90);
 				pen.move(120);
 				pen.setDirection(180);
 				pen.move(65);
 				pen.down();
 				
 				//draw diamond
 				pen.setColor(Color.red);
 				pen.setDirection(290);
 				pen.move(60);
 				pen.setDirection(250);
 				pen.move(60);
 				pen.setDirection(110);
 				pen.move(60);
 				pen.setDirection(70);
 				pen.move(60);
 				
 				//fill in
 				pen.up();
 				pen.setDirection(270);
 				pen.move(3);
 				pen.down();
 				pen.setWidth(3);
 				pen.setDirection(290);
 				pen.move(59);
 				pen.setDirection(250);
 				pen.move(57);
 				pen.setDirection(110);
 				pen.move(58);
 				pen.setDirection(70);
 				pen.move(55);
 				
 				pen.setDirection(290);
 				pen.move(55);
 				pen.setDirection(250);
 				pen.move(51);
 				pen.setDirection(110);
 				pen.move(55);
 				pen.setDirection(70);
 				pen.move(49);
 				
 				pen.setWidth(5);
 				pen.setDirection(290);
 				pen.move(55);
 				pen.setDirection(250);
 				pen.move(51);
 				pen.setDirection(110);
 				pen.move(55);
 				pen.setDirection(70);
 				pen.move(53);
 			
 				
 				pen.setDirection(270);
 				pen.move(92);
 				pen.setDirection(0);
 				pen.move(3);
 				pen.setDirection(90);
 				pen.move(83);
 				pen.setDirection(300);
 				pen.move(4);
 				pen.setDirection(270);
 				pen.move(75);
 				pen.setDirection(75);
 				pen.move(4);
 				pen.setDirection(90);
 				pen.move(65);
 				pen.setDirection(272);
 				pen.move(7);
 				pen.setWidth(10);
 				pen.setDirection(270);
 				pen.move(50);
 				pen.setDirection(65);
 				pen.move(11);
 				pen.setDirection(90);
 				pen.move(20);
 				pen.setDirection(180);
 				pen.move(23);
 				pen.setDirection(70);
 				pen.move(29);
 				pen.setDirection(270);
 				pen.move(62);
 				pen.setDirection(105);
 				pen.move(30);
 				pen.up();
 				pen.setDirection(90);
 				pen.move(95);
 				pen.setDirection(180);
 				pen.move(55);
 				
 				//Draw K top
 				pen.down();
 				pen.setWidth(2);
 				pen.setColor(Color.black);
 				pen.setDirection(270);
 				pen.move(30);
 				pen.up();
 				pen.setDirection(0);
 				pen.move(15);
 				pen.down();
 				pen.setDirection(135);
 				pen.move(20);
 				pen.setDirection(45);
 				pen.move(20);
 				pen.up();
 				pen.setDirection(90);
 				pen.move(10);
 				pen.setDirection(0);
 				pen.move(123);
 				pen.down();
 			}
		return playercard11;
		
		
	}

	public int Pcard2(int playercard21, StandardPen pen)
	{
		
		KeyboardReader reader = new KeyboardReader();
		
		Random generator = new Random();
		
		//outside of card
		pen.setWidth(2);
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
		
		pen.setColor(Color.orange);
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
		
		 if(playercard21==1)
    	 {
    		 pen.setColor(Color.black);
 			pen.up();
 			pen.setDirection(180);
 			pen.move(30);
 			pen.setDirection(90);
 			pen.move(8);
 			pen.down();
 			pen.setDirection(70);
 			pen.move(30);
 			pen.setDirection(290);
 			pen.move(30);
 			pen.setDirection(110);
 			pen.move(15);
 			pen.setDirection(180);
 			pen.move(9);
 			pen.up();
			pen.setColor(Color.black);
			pen.setDirection(90);
			pen.move(69);
			pen.setDirection(180);
			pen.move(72);
			pen.down();
			for(int count1=1;count1<=360;count1++)
			{
				pen.move(20);
				pen.turn(180);
				pen.move(20);
				pen.turn(1);
			}
			
			pen.up();
			pen.setColor(Color.black);
			pen.setDirection(0);
			pen.move(40);
			pen.down();
			for(int count1=1;count1<=360;count1++)
			{
				pen.move(20);
				pen.turn(180);
				pen.move(20);
				pen.turn(1);
			}
			pen.up();
			pen.setDirection(0);	
			pen.move(17);
			pen.setDirection(90);
			pen.move(7);
			pen.down();
			pen.setWidth(7);
			pen.setDirection(125);
			pen.move(60);
			pen.setDirection(230);
			pen.move(60);
			pen.setDirection(0);
			pen.move(65);
			pen.setDirection(125);
			pen.move(45);
			pen.setDirection(230);
			pen.move(40);
			pen.setDirection(0);
			pen.move(41);
			pen.setDirection(125);
			pen.move(30);
			pen.setDirection(230);
			pen.move(25);
			pen.setDirection(0);
			pen.move(25);
			pen.setDirection(130);
			pen.move(15);
			pen.setDirection(263);
			pen.move(15);
			pen.setDirection(125);
			pen.move(15);
			
			//stem for spade
			pen.up();
			pen.setWidth(4);
			pen.setDirection(270);
			pen.move(35);
			pen.setDirection(0);
			pen.move(9);
			pen.down();
			pen.setDirection(260);
			pen.move(40);
			pen.setDirection(0);
			pen.move(15);
			pen.setDirection(100);
			pen.move(40);
			pen.setDirection(270);
			pen.move(37);
			pen.setDirection(180);
			pen.move(5);
			pen.setDirection(80);
			pen.move(35);
			pen.setDirection(265);
			pen.move(35);
			pen.setDirection(0);
			pen.move(6);
			pen.setDirection(100);
			pen.move(35);
			pen.setDirection(95);
			pen.move(50);
			
			//ace on top
			pen.up();
			pen.setDirection(180);
			pen.move(100);
			pen.setDirection(90);
			pen.move(100);
			pen.down();
			
			pen.setWidth(2);
			pen.setColor(Color.black);
			pen.up();
			pen.setDirection(0);
			pen.move(40);
			pen.setDirection(270);
			pen.move(70);
			pen.down();
			pen.setDirection(70);
			pen.move(30);
			pen.setDirection(290);
			pen.move(30);
			pen.setDirection(110);
			pen.move(15);
			pen.setDirection(180);
			pen.move(9);
			pen.up();
			pen.setDirection(90);
			pen.move(22);
			pen.setDirection(0);
			pen.move(136);
			pen.down();
    	 }
    	 else if(playercard21==2)
    	 {
    			pen.up();
    			pen.setDirection(90);
    			pen.move(32);
    			pen.setDirection(180);
    			pen.move(35);
    			pen.down();
    			pen.setDirection(200);
    			pen.move(0);
    			
    			// draw 2 bottom
    			pen.setColor(Color.black);
    			for (int count1=1; count1<=20; count1++)
    			{
    				pen.move(-1);
    				pen.turn(-5);
    			}
    			pen.setDirection(235);
    			pen.move(20);
    			pen.setDirection(0);
    			pen.move(20);
    			pen.up();
    			pen.setDirection(90);
    			pen.move(110);
    			pen.setDirection(180);
    			pen.move(85);
    			pen.down();
    			
    			//draw heart
    			pen.setColor(Color.RED);
    			for(int count1=1;count1<=360;count1++)
    			{
    				pen.move(20);
    				pen.turn(180);
    				pen.move(20);
    				pen.turn(1);
    			}
    			pen.up();
    			pen.setDirection(0);
    			pen.move(40);
    			pen.down();
    			for(int count1=1;count1<=360;count1++)
    			{
    				pen.move(20);
    				pen.turn(180);
    				pen.move(20);
    				pen.turn(1);
    			}
    			pen.up();
    			pen.setDirection(0);
    			pen.move(21);
    			pen.setDirection(270);
    			pen.move(3);
    			pen.down();
    			pen.setDirection(240);
    			pen.move(75);
    			pen.setDirection(125);
    			pen.move(75);
    			pen.setDirection(0);
    			pen.move(7);
    			pen.setWidth(6);
    			pen.setDirection(270);
    			pen.move(5);
    			pen.setDirection(305);
    			pen.move(62);
    			pen.setDirection(60);
    			pen.move(60);
    			pen.setDirection(180);
    			pen.move(60);
    			pen.setDirection(305);
    			pen.move(52);
    			pen.setDirection(60);
    			pen.move(52);
    			pen.setDirection(180);
    			pen.move(52);
    			pen.setDirection(305);
    			pen.move(44);
    			pen.setDirection(60);
    			pen.move(42);
    			pen.setDirection(180);
    			pen.move(43);
    			pen.setDirection(305);
    			pen.move(42);
    			pen.setDirection(60);
    			pen.move(42);
    			pen.setDirection(180);
    			pen.move(40);
    			pen.setDirection(305);
    			pen.move(32);
    			pen.setDirection(60);
    			pen.move(32);
    			pen.setWidth(15);
    			pen.setDirection(180);
    			pen.move(24);
    			pen.setDirection(300);
    			pen.move(15);
    			pen.setDirection(40);
    			pen.move(2);
    			pen.up();
    			
    			//draw 2 top
    			pen.setDirection(90);
    			pen.move(90);
    			pen.setDirection(180);
    			pen.move(65);
    			pen.setDirection(200);
    			pen.move(0);
    			pen.down();
    			pen.setColor(Color.black);
    			pen.setWidth(2);
    			for (int count1=1; count1<=20; count1++)
    			{
    				pen.move(-1);
    				pen.turn(-5);
    			}
    			pen.setDirection(235);
    			pen.move(20);
    			pen.setDirection(0);
    			pen.move(20);
    			pen.up();
    			pen.setDirection(90);
    			pen.move(33);
    			pen.setDirection(0);
    			pen.move(112);
    			pen.down();
    	 }
    	 else if(playercard21==3)
    	 {
    		 pen.up();
 			pen.setDirection(90);
 			pen.move(39);
 			pen.setDirection(180);
 			pen.move(30);
 			pen.setDirection(220);
 			pen.move(0);
 			pen.down();
 			//draw 3 on bottom
 			pen.setColor(Color.black);
 			for (int count1=1; count1<=40; count1++)
 			{
 				pen.move(-1);
 				pen.turn(-6);
 			}
 			pen.setDirection(220);
 			pen.move(0);
 			for (int count1=1; count1<=45; count1++)
 			{
 				pen.move(-1);
 				pen.turn(-6);
 			}
 			pen.up();
 			pen.setDirection(90);
 			pen.move(80);
 			pen.setDirection(180);
 			pen.move(68);
 			
 			//draw spade
 			pen.down();
 			for(int count1=1;count1<=360;count1++)
 			{
 				pen.move(20);
 				pen.turn(180);
 				pen.move(20);
 				pen.turn(1);
 			}
 			
 			pen.up();
 			pen.setColor(Color.black);
 			pen.setDirection(0);
 			pen.move(40);
 			pen.down();
 			for(int count1=1;count1<=360;count1++)
 			{
 				pen.move(20);
 				pen.turn(180);
 				pen.move(20);
 				pen.turn(1);
 			}
 			pen.up();
 			pen.setDirection(0);
 			pen.move(17);
 			pen.setDirection(90);
 			pen.move(7);
 			pen.down();
 			pen.setWidth(7);
 			pen.setDirection(125);
 			pen.move(60);
 			pen.setDirection(230);
 			pen.move(60);
 			pen.setDirection(0);
 			pen.move(65);
 			pen.setDirection(125);
 			pen.move(45);
 			pen.setDirection(230);
 			pen.move(40);
 			pen.setDirection(0);
 			pen.move(41);
 			pen.setDirection(125);
 			pen.move(30);
 			pen.setDirection(230);
 			pen.move(25);
 			pen.setDirection(0);
 			pen.move(25);
 			pen.setDirection(130);
 			pen.move(15);
 			pen.setDirection(263);
 			pen.move(15);
 			pen.setDirection(125);
 			pen.move(15);
 			
 			//stem for spade
 			pen.up();
 			pen.setWidth(4);
 			pen.setDirection(270);
 			pen.move(35);
 			pen.setDirection(0);
 			pen.move(9);
 			pen.down();
 			pen.setDirection(260);
 			pen.move(40);
 			pen.setDirection(0);
 			pen.move(15);
 			pen.setDirection(100);
 			pen.move(40);
 			pen.setDirection(270);
 			pen.move(37);
 			pen.setDirection(180);
 			pen.move(5);
 			pen.setDirection(80);
 			pen.move(35);
 			pen.setDirection(265);
 			pen.move(35);
 			pen.setDirection(0);
 			pen.move(6);
 			pen.setDirection(100);
 			pen.move(35);
 			pen.setDirection(95);
 			pen.move(50);
 			pen.up();
 			pen.setDirection(90);
 			pen.move(55);
 			pen.setDirection(180);
 			pen.move(55);
 			pen.setDirection(220);
 			pen.move(0);
 			pen.down();
 			pen.setWidth(2);
 			
 			//draw 3 top
 			pen.setColor(Color.black);
 			for (int count1=1; count1<=40; count1++)
 			{
 				pen.move(-1);
 				pen.turn(-6);
 			}
 			pen.setDirection(220);
 			pen.move(0);
 			for (int count1=1; count1<=45; count1++)
 			{
 				pen.move(-1);
 				pen.turn(-6);
 			}
 			pen.up();
 			pen.setDirection(90);
 			pen.move(42);
 			pen.setDirection(0);
 			pen.move(132);
 			pen.down();
    	 }
    	 else if(playercard21==4)
 			{
    		//draw 4 bottom
 			pen.up();
 			pen.setDirection(90);
 			pen.move(35);
 			pen.setDirection(180);
 			pen.move(25);
 			pen.down();
 			pen.setColor(Color.black);
 			pen.setDirection(270);
 			pen.move(20);
 			pen.setDirection(0);
 			pen.move(20);
 			pen.setDirection(180);
 			pen.move(10);
 			pen.setDirection(270);
 			pen.move(10);
 			pen.setDirection(90);
 			pen.move(20);
 			
 			// draw diamond
 			pen.up();
 			pen.setDirection(180);
 			pen.move(60);
 			pen.setDirection(90);
 			pen.move(125);
 			pen.setWidth(2);
 			pen.setColor(Color.red);
 			pen.down();
 			pen.setDirection(290);
 			pen.move(60);
 			pen.setDirection(250);
 			pen.move(60);
 			pen.setDirection(110);
 			pen.move(60);
 			pen.setDirection(70);
 			pen.move(60);
 			
 			//fill in
 			pen.up();
 			pen.setDirection(270);
 			pen.move(3);
 			pen.down();
 			pen.setWidth(3);
 			pen.setDirection(290);
 			pen.move(59);
 			pen.setDirection(250);
 			pen.move(57);
 			pen.setDirection(110);
 			pen.move(58);
 			pen.setDirection(70);
 			pen.move(55);
 			
 			pen.setDirection(290);
 			pen.move(55);
 			pen.setDirection(250);
 			pen.move(51);
 			pen.setDirection(110);
 			pen.move(55);
 			pen.setDirection(70);
 			pen.move(49);
 			
 			pen.setWidth(5);
 			pen.setDirection(290);
 			pen.move(55);
 			pen.setDirection(250);
 			pen.move(51);
 			pen.setDirection(110);
 			pen.move(55);
 			pen.setDirection(70);
 			pen.move(53);
 		
 			
 			pen.setDirection(270);
 			pen.move(92);
 			pen.setDirection(0);
 			pen.move(3);
 			pen.setDirection(90);
 			pen.move(83);
 			pen.setDirection(300);
 			pen.move(4);
 			pen.setDirection(270);
 			pen.move(75);
 			pen.setDirection(75);
 			pen.move(4);
 			pen.setDirection(90);
 			pen.move(65);
 			pen.setDirection(272);
 			pen.move(7);
 			pen.setWidth(10);
 			pen.setDirection(270);
 			pen.move(50);
 			pen.setDirection(65);
 			pen.move(11);
 			pen.setDirection(90);
 			pen.move(20);
 			pen.setDirection(180);
 			pen.move(23);
 			pen.setDirection(70);
 			pen.move(29);
 			pen.setDirection(270);
 			pen.move(62);
 			pen.setDirection(105);
 			pen.move(30);
 			pen.up();
 			
 			
 			//draw 4 top
 			pen.setWidth(2);
 			pen.setDirection(180);
 			pen.move(31);
 			pen.setDirection(90);
 			pen.move(65);
 			pen.up();
 			pen.setDirection(90);
 			pen.move(35);
 			pen.setDirection(180);
 			pen.move(25);
 			pen.down();
 			pen.setColor(Color.black);
 			pen.setDirection(270);
 			pen.move(20);
 			pen.setDirection(0);
 			pen.move(20);
 			pen.setDirection(180);
 			pen.move(10);
 			pen.setDirection(270);
 			pen.move(10);
 			pen.setDirection(90);
 			pen.move(20);
 			pen.up();
 			pen.setDirection(90);
 			pen.move(17);
 			pen.setDirection(0);
 			pen.move(131);
 			pen.down();
 			
 		}
    	 else if(playercard21==5)
    	 {
    			pen.up();
    			pen.setDirection(90);
    			pen.move(35);
    			pen.setDirection(180);
    			pen.move(10);
    			pen.down();
    			
    			//draw 5 bottom
    			pen.setColor(Color.black);
    			pen.setDirection(180);
    			pen.move(15);
    			pen.setDirection(270);
    			pen.move(12);
    			pen.setDirection(220);
    			pen.move(0);
    			for (int count1=1; count1<=45; count1++)
    			{
    				pen.move(-1);
    				pen.turn(-6);
    			}
    			pen.up();
    			pen.setDirection(90);
    			pen.move(110);
    			pen.setDirection(180);
    			pen.move(70);
    			
    			//draw heart
    			pen.down();
    			pen.setColor(Color.RED);
    			for(int count1=1;count1<=360;count1++)
    			{
    				pen.move(20);
    				pen.turn(180);
    				pen.move(20);
    				pen.turn(1);
    			}
    			pen.up();
    			pen.setDirection(0);
    			pen.move(40);
    			pen.down();
    			for(int count1=1;count1<=360;count1++)
    			{
    				pen.move(20);
    				pen.turn(180);
    				pen.move(20);
    				pen.turn(1);
    			}
    			pen.up();
    			pen.setDirection(0);
    			pen.move(21);
    			pen.setDirection(270);
    			pen.move(3);
    			pen.down();
    			pen.setDirection(240);
    			pen.move(75);
    			pen.setDirection(125);
    			pen.move(75);
    			pen.setDirection(0);
    			pen.move(7);
    			pen.setWidth(6);
    			pen.setDirection(270);
    			pen.move(5);
    			pen.setDirection(305);
    			pen.move(62);
    			pen.setDirection(60);
    			pen.move(60);
    			pen.setDirection(180);
    			pen.move(60);
    			pen.setDirection(305);
    			pen.move(52);
    			pen.setDirection(60);
    			pen.move(52);
    			pen.setDirection(180);
    			pen.move(52);
    			pen.setDirection(305);
    			pen.move(44);
    			pen.setDirection(60);
    			pen.move(42);
    			pen.setDirection(180);
    			pen.move(43);
    			pen.setDirection(305);
    			pen.move(42);
    			pen.setDirection(60);
    			pen.move(42);
    			pen.setDirection(180);
    			pen.move(40);
    			pen.setDirection(305);
    			pen.move(32);
    			pen.setDirection(60);
    			pen.move(32);
    			pen.setWidth(15);
    			pen.setDirection(180);
    			pen.move(24);
    			pen.setDirection(300);
    			pen.move(15);
    			pen.setDirection(40);
    			pen.move(2);
    			
    			//Draw 5 top
    			pen.up();
    			pen.setDirection(90);
    			pen.move(85);
    			pen.setDirection(180);
    			pen.move(50);
    			pen.setWidth(2);
    			pen.down();
    			pen.setColor(Color.black);
    			pen.setDirection(180);
    			pen.move(15);
    			pen.setDirection(270);
    			pen.move(12);
    			pen.setDirection(220);
    			pen.move(0);
    			for (int count1=1; count1<=45; count1++)
    			{
    				pen.move(-1);
    				pen.turn(-6);
    			}
    			pen.up();
    			pen.setDirection(90);
    			pen.move(36);
    			pen.setDirection(0);
    			pen.move(136);
    			pen.down();
    	 }
    	 else if(playercard21==6)
    	 {
    		//6 on bottom
 			pen.up();
 			pen.setColor(Color.black);
 			pen.setWidth(2);
 			
 			pen.setDirection(180);
 			pen.move(100);
 			pen.setDirection(250);
 			pen.move(0);
 			
 			pen.up();
 			pen.setDirection(0);
 			pen.move(78);
 			pen.setDirection(90);
 			pen.move(48);
 			pen.setDirection(250);
 			pen.move(0);
 			pen.down();
 			
 			for(int count1=1; count1<7; count1++)
 			{
 				pen.move(5);
 				pen.turn(2);
 			}
 			
 			for(int count1=1; count1<100; count1++)
 			{
 				pen.move(1);
 				pen.turn(7);
 			}
 			
 			pen.up();
 			pen.setColor(Color.black);
 			pen.setDirection(90);
 			pen.move(69);
 			pen.setDirection(180);
 			pen.move(67);
 			pen.down();
 			for(int count1=1;count1<=360;count1++)
 			{
 				pen.move(20);
 				pen.turn(180);
 				pen.move(20);
 				pen.turn(1);
 			}
 			
 			pen.up();
 			pen.setColor(Color.black);
 			pen.setDirection(0);
 			pen.move(40);
 			pen.down();
 			for(int count1=1;count1<=360;count1++)
 			{
 				pen.move(20);
 				pen.turn(180);
 				pen.move(20);
 				pen.turn(1);
 			}
 			pen.up();
 			pen.setDirection(0);
 			pen.move(17);
 			pen.setDirection(90);
 			pen.move(7);
 			pen.down();
 			pen.setWidth(7);
 			pen.setDirection(125);
 			pen.move(60);
 			pen.setDirection(230);
 			pen.move(60);
 			pen.setDirection(0);
 			pen.move(65);
 			pen.setDirection(125);
 			pen.move(45);
 			pen.setDirection(230);
 			pen.move(40);
 			pen.setDirection(0);
 			pen.move(41);
 			pen.setDirection(125);
 			pen.move(30);
 			pen.setDirection(230);
 			pen.move(25);
 			pen.setDirection(0);
 			pen.move(25);
 			pen.setDirection(130);
 			pen.move(15);
 			pen.setDirection(263);
 			pen.move(15);
 			pen.setDirection(125);
 			pen.move(15);
 			
 			//stem for spade
 			pen.up();
 			pen.setWidth(4);
 			pen.setDirection(270);
 			pen.move(35);
 			pen.setDirection(0);
 			pen.move(9);
 			pen.down();
 			pen.setDirection(260);
 			pen.move(40);
 			pen.setDirection(0);
 			pen.move(15);
 			pen.setDirection(100);
 			pen.move(40);
 			pen.setDirection(270);
 			pen.move(37);
 			pen.setDirection(180);
 			pen.move(5);
 			pen.setDirection(80);
 			pen.move(35);
 			pen.setDirection(265);
 			pen.move(35);
 			pen.setDirection(0);
 			pen.move(6);
 			pen.setDirection(100);
 			pen.move(35);
 			pen.setDirection(95);
 			pen.move(50);
 			
 			//6 on top
 			
 			pen.up();
 			pen.setColor(Color.black);
 			pen.setWidth(2);
 			
 			pen.setDirection(180);
 			pen.move(125);
 			pen.setDirection(250);
 			pen.move(0);
 			
 			pen.up();
 			pen.setDirection(0);
 			pen.move(78);
 			pen.setDirection(90);
 			pen.move(55);
 			pen.setDirection(250);
 			pen.move(0);
 			pen.down();
 			
 			for(int count1=1; count1<7; count1++)
 			{
 				pen.move(5);
 				pen.turn(2);
 			}
 			
 			for(int count1=1; count1<100; count1++)
 			{
 				pen.move(1);
 				pen.turn(7);
 			}
 			pen.up();
 			pen.setDirection(90);
 			pen.move(37);
 			pen.setDirection(0);
 			pen.move(134);
 			pen.down();
 		
    	 }
    	 else if(playercard21==7)
    	 {
    		//bottom number 7
 			
 			pen.setColor(Color.black);
 			pen.up();
 			pen.setDirection(90);
 			pen.move(40);
 			pen.setDirection(180);
 			pen.move(30);
 			pen.down();
 			pen.setDirection(0);
 			pen.move(15);
 			pen.setDirection(270);
 			pen.move(30);

 			
 			
 			
 			//heart
 			pen.up();
 			pen.setDirection(180);
 			pen.move(80);
 			pen.setDirection(90);
 			pen.move(107);
 			pen.setColor(Color.RED);
 			pen.down();
 			for(int count1=1;count1<=360;count1++)
 			{
 				pen.move(20);
 				pen.turn(180);
 				pen.move(20);
 				pen.turn(1);
 			}
 			pen.up();
 			pen.setDirection(0);
 			pen.move(40);
 			pen.down();
 			for(int count1=1;count1<=360;count1++)
 			{
 				pen.move(20);
 				pen.turn(180);
 				pen.move(20);
 				pen.turn(1);
 			}
 			pen.up();
 			pen.setDirection(0);
 			pen.move(21);
 			pen.setDirection(270);
 			pen.move(3);
 			pen.down();
 			pen.setDirection(240);
 			pen.move(75);
 			pen.setDirection(125);
 			pen.move(75);
 			pen.setDirection(0);
 			pen.move(7);
 			pen.setWidth(6);
 			pen.setDirection(270);
 			pen.move(5);
 			pen.setDirection(305);
 			pen.move(62);
 			pen.setDirection(60);
 			pen.move(60);
 			pen.setDirection(180);
 			pen.move(60);
 			pen.setDirection(305);
 			pen.move(52);
 			pen.setDirection(60);
 			pen.move(52);
 			pen.setDirection(180);
 			pen.move(52);
 			pen.setDirection(305);
 			pen.move(44);
 			pen.setDirection(60);
 			pen.move(42);
 			pen.setDirection(180);
 			pen.move(43);
 			pen.setDirection(305);
 			pen.move(42);
 			pen.setDirection(60);
 			pen.move(42);
 			pen.setDirection(180);
 			pen.move(40);
 			pen.setDirection(305);
 			pen.move(32);
 			pen.setDirection(60);
 			pen.move(32);
 			pen.setWidth(15);
 			pen.setDirection(180);
 			pen.move(24);
 			pen.setDirection(300);
 			pen.move(15);
 			pen.setDirection(40);
 			pen.move(2);
 			
 			//top 7 number
 			pen.setWidth(2);
 			pen.setColor(Color.black);
 			pen.up();
 			pen.setDirection(90);
 			pen.move(85);
 			pen.setDirection(180);
 			pen.move(70);
 			pen.down();
 			pen.setDirection(0);
 			pen.move(15);
 			pen.setDirection(270);
 			pen.move(30);
 			pen.up();
 			pen.setDirection(90);
 			pen.move(43);
 			pen.setDirection(0);
 			pen.move(125);
 			pen.down();
 			 
    	 }
    	 else if(playercard21==8)
    	 {
    		//draw number 8
    		 pen.up();
    			pen.setDirection(145);
    			pen.move(20);
    			pen.setColor(Color.black);
    			pen.setWidth(2);
    			pen.setDirection(45);
    			pen.move(10);
    			pen.setDirection(270);
    			pen.move(5);
    			pen.setDirection(180);
    			pen.move(5);
    			pen.setDirection(90);
    			pen.move(3);
    			pen.down();
    			
    			
    			
    			for(int count1=1; count1<100; count1++)
    			{
    				pen.move(1);
    				pen.turn(7);
    			}
    			
    			pen.up();
    			pen.setDirection(90);
    			pen.move(20);
    			pen.down();
    			for(int count1=1; count1<100; count1++)
    			{
    				pen.move(1);
    				pen.turn(7);
    			}
    			pen.setColor(Color.black);
    			pen.up();
    			pen.setDirection(0);
    			pen.setDirection(90);
    			pen.move(100);
    			pen.setDirection(270);
    			pen.move(65);
    			pen.setDirection(90);
    			pen.move(35);
    			pen.setDirection(180);
    			pen.move(37.5);
    			pen.down();
    			for(int count1=1;count1<=360;count1++)
    			{
    				pen.move(20);
    				pen.turn(180);
    				pen.move(20);
    				pen.turn(1);
    			}
    			
    			pen.up();
    			pen.setColor(Color.black);
    			pen.setDirection(180);
    			pen.move(40);
    			
    			
    			pen.down();
    			for(int count1=1;count1<=360;count1++)
    			{
    				pen.move(20);
    				pen.turn(180);
    				pen.move(20);
    				pen.turn(1);
    			}
    			pen.up();
    			pen.setColor(Color.black);
    			pen.setDirection(90);
    			pen.move(30);
    			pen.setDirection(0);
    			pen.move(20);
    			pen.down();
    			for(int count1=1;count1<=360;count1++)
    			{
    				pen.move(20);
    				pen.turn(180);
    				pen.move(20);
    				pen.turn(1);
    			}
    			//steam
    			
    			pen.up();
    			pen.setDirection(270);
    			pen.move(38);
    			pen.down();
    			pen.setColor(Color.black);
    			pen.setDirection(255);
    			pen.move(35);
    			pen.setDirection(0);
    			pen.move(20);
    			pen.setDirection(107);
    			pen.move(35);
    			pen.setWidth(5);
    			pen.setDirection(180);
    			pen.move(3);
    			pen.setDirection(287);
    			pen.move(33);
    			pen.setDirection(180);
    			pen.move(15);
    			pen.setDirection(75);
    			pen.move(30);
    			pen.setDirection(0);
    			pen.move(1);
    			pen.setDirection(270);
    			pen.move(3);
    			pen.setDirection(255);
    			pen.move(22);
    			pen.setWidth(7);
    			pen.setDirection(0);
    			pen.move(10);
    			pen.setDirection(135);
    			pen.move(5);
    			pen.setDirection(90);
    			pen.move(3);
    			pen.setDirection(315);
    			pen.move(4);
    			
    			//top number
    			pen.up();
    			pen.setDirection(90);
    			pen.move(94);
    			pen.setDirection(180);
    			pen.move(50);
    			pen.setColor(Color.black);
    			pen.setWidth(2);
    			pen.setDirection(45);
    			pen.move(10);
    			pen.setDirection(270);
    			pen.move(5);
    			pen.setDirection(180);
    			pen.move(5);
    			pen.setDirection(90);
    			pen.move(3);
    			pen.down();
    			
    			
    			
    			for(int count1=1; count1<100; count1++)
    			{
    				pen.move(1);
    				pen.turn(7);
    			}
    			
    			pen.up();
    			pen.setDirection(90);
    			pen.move(20);
    			pen.down();
    			for(int count1=1; count1<100; count1++)
    			{
    				pen.move(1);
    				pen.turn(7);
    			}
    			pen.up();
    			pen.setDirection(90);
    			pen.move(20);
    			pen.setDirection(0);
    			pen.move(120);
    			pen.down();
    	 }
    	 else if(playercard21==9)
    	 {
    			pen.setDirection(180);
    			pen.move(75);
    			pen.setDirection(90);
    			pen.move(150);
    			pen.setWidth(2);
    			pen.setColor(Color.red);
    			pen.down();
    			pen.setDirection(290);
    			pen.move(60);
    			pen.setDirection(250);
    			pen.move(60);
    			pen.setDirection(110);
    			pen.move(60);
    			pen.setDirection(70);
    			pen.move(60);
    			
    			//fill in
    			pen.up();
    			pen.setDirection(270);
    			pen.move(3);
    			pen.down();
    			pen.setWidth(3);
    			pen.setDirection(290);
    			pen.move(59);
    			pen.setDirection(250);
    			pen.move(57);
    			pen.setDirection(110);
    			pen.move(58);
    			pen.setDirection(70);
    			pen.move(55);
    			
    			pen.setDirection(290);
    			pen.move(55);
    			pen.setDirection(250);
    			pen.move(51);
    			pen.setDirection(110);
    			pen.move(55);
    			pen.setDirection(70);
    			pen.move(49);
    			
    			pen.setWidth(5);
    			pen.setDirection(290);
    			pen.move(55);
    			pen.setDirection(250);
    			pen.move(51);
    			pen.setDirection(110);
    			pen.move(55);
    			pen.setDirection(70);
    			pen.move(53);
    		
    			
    			pen.setDirection(270);
    			pen.move(92);
    			pen.setDirection(0);
    			pen.move(3);
    			pen.setDirection(90);
    			pen.move(83);
    			pen.setDirection(300);
    			pen.move(4);
    			pen.setDirection(270);
    			pen.move(75);
    			pen.setDirection(75);
    			pen.move(4);
    			pen.setDirection(90);
    			pen.move(65);
    			pen.setDirection(272);
    			pen.move(7);
    			pen.setWidth(10);
    			pen.setDirection(270);
    			pen.move(50);
    			pen.setDirection(65);
    			pen.move(11);
    			pen.setDirection(90);
    			pen.move(20);
    			pen.setDirection(180);
    			pen.move(23);
    			pen.setDirection(70);
    			pen.move(29);
    			pen.setDirection(270);
    			pen.move(62);
    			pen.setDirection(105);
    			pen.move(30);
    			
    			//nine number on bottom
    			pen.up();
    			pen.setDirection(270);
    			pen.move(72);
    			pen.setDirection(0);
    			pen.move(65);
    			
    			pen.setColor(Color.black);
    			pen.setWidth(2);
    			pen.down();
    			for(int count1=1; count1<100; count1++)
    			{
    				pen.move(1);
    				pen.turn(7);
    			}
    			pen.setDirection(0);
    			pen.move(12);
    			pen.setDirection(90);
    			pen.move(2);
    			pen.setDirection(270);
    			pen.move(17);
    			
    			//9 on top
    			pen.up();
    			pen.setDirection(90);
    			pen.move(185);
    			pen.setDirection(180);
    			pen.move(120);
    			
    			pen.setColor(Color.black);
    			pen.setWidth(2);
    			pen.down();
    			for(int count1=1; count1<100; count1++)
    			{
    				pen.move(1);
    				pen.turn(7);
    			}
    			pen.up();
    			pen.setDirection(0);
    			pen.move(4);
    			pen.setDirection(270);
    			pen.move(12);
    			pen.down();
    			pen.setDirection(270);
    			pen.move(17);
    			pen.up();
    			pen.setDirection(90);
    			pen.move(38);
    			pen.setDirection(0);
    			pen.move(124);
    			pen.down();
    	 }
    	 else if(playercard21==10)
    	 {
    		//draw 10 bottom
 			pen.up();
 			pen.setColor(Color.black);
 			pen.setWidth(2);
 			pen.setDirection(90);
 			pen.move(30);
 			pen.setDirection(180);
 			pen.move(35);
 			pen.down();
 			pen.setDirection(270);
 			pen.move(25);
 			pen.up();
 			pen.setDirection(90);
 			pen.move(0);
 			pen.setDirection(0);
 			pen.move(18);
 			
 			pen.down();
 			for(int count1=1; count1<100; count1++)
 			{
 				pen.move(1);
 				pen.turn(4.5);
 			}
 			pen.up();
 			pen.setDirection(90);
 			pen.move(110);
 			pen.setDirection(180);
 			pen.move(50);
 			
 			pen.setColor(Color.black);
 			pen.up();
 			pen.setDirection(0);
 			pen.setDirection(270);
 			pen.move(65);
 			pen.setDirection(90);
 			pen.move(35);
 			pen.setDirection(180);
 			pen.move(2);
 			pen.down();
 			for(int count1=1;count1<=360;count1++)
 			{
 				pen.move(20);
 				pen.turn(180);
 				pen.move(20);
 				pen.turn(1);
 			}
 			
 			pen.up();
 			pen.setColor(Color.black);
 			pen.setDirection(180);
 			pen.move(40);
 			
 			
 			pen.down();
 			for(int count1=1;count1<=360;count1++)
 			{
 				pen.move(20);
 				pen.turn(180);
 				pen.move(20);
 				pen.turn(1);
 			}
 			pen.up();
 			pen.setColor(Color.black);
 			pen.setDirection(90);
 			pen.move(30);
 			pen.setDirection(0);
 			pen.move(20);
 			pen.down();
 			for(int count1=1;count1<=360;count1++)
 			{
 				pen.move(20);
 				pen.turn(180);
 				pen.move(20);
 				pen.turn(1);
 			}
 			//steam
 			
 			pen.up();
 			pen.setDirection(270);
 			pen.move(38);
 			pen.down();
 			pen.setColor(Color.black);
 			pen.setDirection(255);
 			pen.move(35);
 			pen.setDirection(0);
 			pen.move(20);
 			pen.setDirection(107);
 			pen.move(35);
 			pen.setWidth(5);
 			pen.setDirection(180);
 			pen.move(3);
 			pen.setDirection(287);
 			pen.move(33);
 			pen.setDirection(180);
 			pen.move(15);
 			pen.setDirection(75);
 			pen.move(30);
 			pen.setDirection(0);
 			pen.move(1);
 			pen.setDirection(270);
 			pen.move(3);
 			pen.setDirection(255);
 			pen.move(22);
 			pen.setWidth(7);
 			pen.setDirection(0);
 			pen.move(10);
 			pen.setDirection(135);
 			pen.move(5);
 			pen.setDirection(90);
 			pen.move(3);
 			pen.setDirection(315);
 			pen.move(4);
 			
 			//draw 10 on top
 			pen.up();
 			pen.setDirection(90);
 			pen.move(125);
 			pen.setDirection(180);
 			pen.move(70);
 			pen.down();
 			pen.setWidth(2);
 			pen.setDirection(270);
 			pen.move(25);
 			pen.up();
 			pen.setDirection(90);
 			pen.move(0);
 			pen.setDirection(0);
 			pen.move(17);
 			
 			pen.down();
 			for(int count1=1; count1<100; count1++)
 			{
 				pen.move(1);
 				pen.turn(4.5);
 			}
 			pen.up();
 			pen.setDirection(90);
 			pen.move(25);
 			pen.setDirection(0);
 			pen.move(110);
 			pen.down();
    	 }
 			else if(playercard21==11)
 			{
 				pen.up();
 				pen.setDirection(90);
 				pen.move(40);
 				pen.setDirection(180);
 				pen.move(15);
 				pen.down();
 				
 				//draw j on bottom
 				pen.setColor(Color.black);
 				pen.setDirection(180);
 				pen.move(10);
 				pen.setDirection(0);
 				pen.move(20);
 				pen.setDirection(180);
 				pen.move(10);
 				pen.setDirection(270);
 				pen.move(25);
 				pen.setDirection(90);
 				pen.move(0);
 				for (int count1=1; count1<=25; count1++)
 				{
 					pen.move(-1);
 					pen.turn(-8);
 				}
 				pen.up();
 				pen.setDirection(90);
 				pen.move(100);
 				pen.setDirection(180);
 				pen.move(67);
 				
 				//draw heart
 				pen.setColor(Color.RED);
 				pen.down();
 				for(int count1=1;count1<=360;count1++)
 				{
 					pen.move(20);
 					pen.turn(180);
 					pen.move(20);
 					pen.turn(1);
 				}
 				pen.up();
 				pen.setDirection(0);
 				pen.move(40);
 				pen.down();
 				for(int count1=1;count1<=360;count1++)
 				{
 					pen.move(20);
 					pen.turn(180);
 					pen.move(20);
 					pen.turn(1);
 				}
 				pen.up();
 				pen.setDirection(0);
 				pen.move(21);
 				pen.setDirection(270);
 				pen.move(3);
 				pen.down();
 				pen.setDirection(240);
 				pen.move(75);
 				pen.setDirection(125);
 				pen.move(75);
 				pen.setDirection(0);
 				pen.move(7);
 				pen.setWidth(6);
 				pen.setDirection(270);
 				pen.move(5);
 				pen.setDirection(305);
 				pen.move(62);
 				pen.setDirection(60);
 				pen.move(60);
 				pen.setDirection(180);
 				pen.move(60);
 				pen.setDirection(305);
 				pen.move(52);
 				pen.setDirection(60);
 				pen.move(52);
 				pen.setDirection(180);
 				pen.move(52);
 				pen.setDirection(305);
 				pen.move(44);
 				pen.setDirection(60);
 				pen.move(42);
 				pen.setDirection(180);
 				pen.move(43);
 				pen.setDirection(305);
 				pen.move(42);
 				pen.setDirection(60);
 				pen.move(42);
 				pen.setDirection(180);
 				pen.move(40);
 				pen.setDirection(305);
 				pen.move(32);
 				pen.setDirection(60);
 				pen.move(32);
 				pen.setWidth(15);
 				pen.setDirection(180);
 				pen.move(24);
 				pen.setDirection(300);
 				pen.move(15);
 				pen.setDirection(40);
 				pen.move(2);
 				pen.up();
 				pen.setDirection(90);
 				pen.move(88);
 				pen.setDirection(180);
 				pen.move(53);
 				
 				// draw j on top
 				pen.down();
 				pen.setWidth(2);
 				pen.setColor(Color.black);
 				pen.setDirection(180);
 				pen.move(10);
 				pen.setDirection(0);
 				pen.move(20);
 				pen.setDirection(180);
 				pen.move(10);
 				pen.setDirection(270);
 				pen.move(25);
 				pen.setDirection(90);
 				pen.move(0);
 				for (int count1=1; count1<=25; count1++)
 				{
 					pen.move(-1);
 					pen.turn(-8);
 				}
 				pen.up();
 				pen.setDirection(90);
 				pen.move(35);
 				pen.setDirection(0);
 				pen.move(139);
 				pen.down();
 			}
 			else if(playercard21==12)
 			{
 				pen.up();
 				pen.setDirection(90);
 				pen.move(35);
 				pen.setDirection(180);
 				pen.move(30);
 				pen.down();
 				
 				// draw Q bottom
 				pen.setColor(Color.black);
 				for (int count1=1; count1<=150; count1++)
 				{
 					pen.move(1);
 					pen.turn(4);
 				}
 				pen.setDirection(325);
 				pen.move(10);
 				pen.setDirection(145);
 				pen.move(20);
 				pen.up();
 				pen.setDirection(90);
 				pen.move(75);
 				pen.setDirection(180);
 				pen.move(30);
 				
 				//draw club
 				
 				pen.setColor(Color.black);
 				pen.down();
 				for(int count1=1;count1<=360;count1++)
 				{
 					pen.move(20);
 					pen.turn(180);
 					pen.move(20);
 					pen.turn(1);
 				}
 				
 				pen.up();
 				pen.setColor(Color.black);
 				pen.setDirection(180);
 				pen.move(40);
 				
 				
 				pen.down();
 				for(int count1=1;count1<=360;count1++)
 				{
 					pen.move(20);
 					pen.turn(180);
 					pen.move(20);
 					pen.turn(1);
 				}
 				pen.up();
 				pen.setColor(Color.black);
 				pen.setDirection(90);
 				pen.move(30);
 				pen.setDirection(0);
 				pen.move(20);
 				pen.down();
 				for(int count1=1;count1<=360;count1++)
 				{
 					pen.move(20);
 					pen.turn(180);
 					pen.move(20);
 					pen.turn(1);
 				}
 				//steam
 				
 				pen.up();
 				pen.setDirection(270);
 				pen.move(38);
 				pen.down();
 				pen.setColor(Color.black);
 				pen.setDirection(255);
 				pen.move(35);
 				pen.setDirection(0);
 				pen.move(20);
 				pen.setDirection(107);
 				pen.move(35);
 				pen.setWidth(5);
 				pen.setDirection(180);
 				pen.move(3);
 				pen.setDirection(287);
 				pen.move(33);
 				pen.setDirection(180);
 				pen.move(15);
 				pen.setDirection(75);
 				pen.move(30);
 				pen.setDirection(0);
 				pen.move(1);
 				pen.setDirection(270);
 				pen.move(3);
 				pen.setDirection(255);
 				pen.move(22);
 				pen.setWidth(7);
 				pen.setDirection(0);
 				pen.move(10);
 				pen.setDirection(135);
 				pen.move(5);
 				pen.setDirection(90);
 				pen.move(3);
 				pen.setDirection(315);
 				pen.move(4);
 				
 				pen.up();
 				pen.setDirection(90);
 				pen.move(130);
 				pen.setDirection(180);
 				pen.move(55);
 				
 				//Draw Q top
 				pen.down();
 				pen.setColor(Color.black);
 				pen.setWidth(2);
 				for (int count1=1; count1<=150; count1++)
 				{
 					pen.move(1);
 					pen.turn(4);
 				}
 				pen.setDirection(325);
 				pen.move(10);
 				pen.setDirection(145);
 				pen.move(20);
 				pen.up();
 				pen.setDirection(90);
 				pen.move(23);
 				pen.setDirection(0);
 				pen.move(123);
 				pen.down();
 			}
 			else if(playercard21==13)
 			{
 				pen.up();
 				pen.setDirection(90);
 				pen.move(35);
 				pen.setDirection(180);
 				pen.move(23);
 				pen.down();
 				
 				//Draw K bottom
 				pen.setColor(Color.black);
 				pen.setDirection(270);
 				pen.move(30);
 				pen.up();
 				pen.setDirection(0);
 				pen.move(15);
 				pen.down();
 				pen.setDirection(135);
 				pen.move(20);
 				pen.setDirection(45);
 				pen.move(20);
 				pen.up();
 				pen.setDirection(90);
 				pen.move(120);
 				pen.setDirection(180);
 				pen.move(65);
 				pen.down();
 				
 				//draw diamond
 				pen.setColor(Color.red);
 				pen.setDirection(290);
 				pen.move(60);
 				pen.setDirection(250);
 				pen.move(60);
 				pen.setDirection(110);
 				pen.move(60);
 				pen.setDirection(70);
 				pen.move(60);
 				
 				//fill in
 				pen.up();
 				pen.setDirection(270);
 				pen.move(3);
 				pen.down();
 				pen.setWidth(3);
 				pen.setDirection(290);
 				pen.move(59);
 				pen.setDirection(250);
 				pen.move(57);
 				pen.setDirection(110);
 				pen.move(58);
 				pen.setDirection(70);
 				pen.move(55);
 				
 				pen.setDirection(290);
 				pen.move(55);
 				pen.setDirection(250);
 				pen.move(51);
 				pen.setDirection(110);
 				pen.move(55);
 				pen.setDirection(70);
 				pen.move(49);
 				
 				pen.setWidth(5);
 				pen.setDirection(290);
 				pen.move(55);
 				pen.setDirection(250);
 				pen.move(51);
 				pen.setDirection(110);
 				pen.move(55);
 				pen.setDirection(70);
 				pen.move(53);
 			
 				
 				pen.setDirection(270);
 				pen.move(92);
 				pen.setDirection(0);
 				pen.move(3);
 				pen.setDirection(90);
 				pen.move(83);
 				pen.setDirection(300);
 				pen.move(4);
 				pen.setDirection(270);
 				pen.move(75);
 				pen.setDirection(75);
 				pen.move(4);
 				pen.setDirection(90);
 				pen.move(65);
 				pen.setDirection(272);
 				pen.move(7);
 				pen.setWidth(10);
 				pen.setDirection(270);
 				pen.move(50);
 				pen.setDirection(65);
 				pen.move(11);
 				pen.setDirection(90);
 				pen.move(20);
 				pen.setDirection(180);
 				pen.move(23);
 				pen.setDirection(70);
 				pen.move(29);
 				pen.setDirection(270);
 				pen.move(62);
 				pen.setDirection(105);
 				pen.move(30);
 				pen.up();
 				pen.setDirection(90);
 				pen.move(95);
 				pen.setDirection(180);
 				pen.move(55);
 				
 				//Draw K top
 				pen.down();
 				pen.setWidth(2);
 				pen.setColor(Color.black);
 				pen.setDirection(270);
 				pen.move(30);
 				pen.up();
 				pen.setDirection(0);
 				pen.move(15);
 				pen.down();
 				pen.setDirection(135);
 				pen.move(20);
 				pen.setDirection(45);
 				pen.move(20);
 				pen.up();
 				pen.setDirection(90);
 				pen.move(10);
 				pen.setDirection(0);
 				pen.move(123);
 				pen.down();
 			}
		return playercard21;
		
		
	}
	
	public int Pcard3(int playercard31, StandardPen pen)
	{
		//outside of card
				pen.setWidth(2);
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
				
				pen.setColor(Color.orange);
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
				
				 if(playercard31==1)
		    	 {
		    		 pen.setColor(Color.black);
		 			pen.up();
		 			pen.setDirection(180);
		 			pen.move(30);
		 			pen.setDirection(90);
		 			pen.move(8);
		 			pen.down();
		 			pen.setDirection(70);
		 			pen.move(30);
		 			pen.setDirection(290);
		 			pen.move(30);
		 			pen.setDirection(110);
		 			pen.move(15);
		 			pen.setDirection(180);
		 			pen.move(9);
		 			pen.up();
					pen.setColor(Color.black);
					pen.setDirection(90);
					pen.move(69);
					pen.setDirection(180);
					pen.move(72);
					pen.down();
					for(int count1=1;count1<=360;count1++)
					{
						pen.move(20);
						pen.turn(180);
						pen.move(20);
						pen.turn(1);
					}
					
					pen.up();
					pen.setColor(Color.black);
					pen.setDirection(0);
					pen.move(40);
					pen.down();
					for(int count1=1;count1<=360;count1++)
					{
						pen.move(20);
						pen.turn(180);
						pen.move(20);
						pen.turn(1);
					}
					pen.up();
					pen.setDirection(0);	
					pen.move(17);
					pen.setDirection(90);
					pen.move(7);
					pen.down();
					pen.setWidth(7);
					pen.setDirection(125);
					pen.move(60);
					pen.setDirection(230);
					pen.move(60);
					pen.setDirection(0);
					pen.move(65);
					pen.setDirection(125);
					pen.move(45);
					pen.setDirection(230);
					pen.move(40);
					pen.setDirection(0);
					pen.move(41);
					pen.setDirection(125);
					pen.move(30);
					pen.setDirection(230);
					pen.move(25);
					pen.setDirection(0);
					pen.move(25);
					pen.setDirection(130);
					pen.move(15);
					pen.setDirection(263);
					pen.move(15);
					pen.setDirection(125);
					pen.move(15);
					
					//stem for spade
					pen.up();
					pen.setWidth(4);
					pen.setDirection(270);
					pen.move(35);
					pen.setDirection(0);
					pen.move(9);
					pen.down();
					pen.setDirection(260);
					pen.move(40);
					pen.setDirection(0);
					pen.move(15);
					pen.setDirection(100);
					pen.move(40);
					pen.setDirection(270);
					pen.move(37);
					pen.setDirection(180);
					pen.move(5);
					pen.setDirection(80);
					pen.move(35);
					pen.setDirection(265);
					pen.move(35);
					pen.setDirection(0);
					pen.move(6);
					pen.setDirection(100);
					pen.move(35);
					pen.setDirection(95);
					pen.move(50);
					
					//ace on top
					pen.up();
					pen.setDirection(180);
					pen.move(100);
					pen.setDirection(90);
					pen.move(100);
					pen.down();
					
					pen.setWidth(2);
					pen.setColor(Color.black);
					pen.up();
					pen.setDirection(0);
					pen.move(40);
					pen.setDirection(270);
					pen.move(70);
					pen.down();
					pen.setDirection(70);
					pen.move(30);
					pen.setDirection(290);
					pen.move(30);
					pen.setDirection(110);
					pen.move(15);
					pen.setDirection(180);
					pen.move(9);
					pen.up();
					pen.setDirection(90);
					pen.move(22);
					pen.setDirection(0);
					pen.move(136);
					pen.down();
		    	 }
		    	 else if(playercard31==2)
		    	 {
		    			pen.up();
		    			pen.setDirection(90);
		    			pen.move(32);
		    			pen.setDirection(180);
		    			pen.move(35);
		    			pen.down();
		    			pen.setDirection(200);
		    			pen.move(0);
		    			
		    			// draw 2 bottom
		    			pen.setColor(Color.black);
		    			for (int count1=1; count1<=20; count1++)
		    			{
		    				pen.move(-1);
		    				pen.turn(-5);
		    			}
		    			pen.setDirection(235);
		    			pen.move(20);
		    			pen.setDirection(0);
		    			pen.move(20);
		    			pen.up();
		    			pen.setDirection(90);
		    			pen.move(110);
		    			pen.setDirection(180);
		    			pen.move(85);
		    			pen.down();
		    			
		    			//draw heart
		    			pen.setColor(Color.RED);
		    			for(int count1=1;count1<=360;count1++)
		    			{
		    				pen.move(20);
		    				pen.turn(180);
		    				pen.move(20);
		    				pen.turn(1);
		    			}
		    			pen.up();
		    			pen.setDirection(0);
		    			pen.move(40);
		    			pen.down();
		    			for(int count1=1;count1<=360;count1++)
		    			{
		    				pen.move(20);
		    				pen.turn(180);
		    				pen.move(20);
		    				pen.turn(1);
		    			}
		    			pen.up();
		    			pen.setDirection(0);
		    			pen.move(21);
		    			pen.setDirection(270);
		    			pen.move(3);
		    			pen.down();
		    			pen.setDirection(240);
		    			pen.move(75);
		    			pen.setDirection(125);
		    			pen.move(75);
		    			pen.setDirection(0);
		    			pen.move(7);
		    			pen.setWidth(6);
		    			pen.setDirection(270);
		    			pen.move(5);
		    			pen.setDirection(305);
		    			pen.move(62);
		    			pen.setDirection(60);
		    			pen.move(60);
		    			pen.setDirection(180);
		    			pen.move(60);
		    			pen.setDirection(305);
		    			pen.move(52);
		    			pen.setDirection(60);
		    			pen.move(52);
		    			pen.setDirection(180);
		    			pen.move(52);
		    			pen.setDirection(305);
		    			pen.move(44);
		    			pen.setDirection(60);
		    			pen.move(42);
		    			pen.setDirection(180);
		    			pen.move(43);
		    			pen.setDirection(305);
		    			pen.move(42);
		    			pen.setDirection(60);
		    			pen.move(42);
		    			pen.setDirection(180);
		    			pen.move(40);
		    			pen.setDirection(305);
		    			pen.move(32);
		    			pen.setDirection(60);
		    			pen.move(32);
		    			pen.setWidth(15);
		    			pen.setDirection(180);
		    			pen.move(24);
		    			pen.setDirection(300);
		    			pen.move(15);
		    			pen.setDirection(40);
		    			pen.move(2);
		    			pen.up();
		    			
		    			//draw 2 top
		    			pen.setDirection(90);
		    			pen.move(90);
		    			pen.setDirection(180);
		    			pen.move(65);
		    			pen.setDirection(200);
		    			pen.move(0);
		    			pen.down();
		    			pen.setColor(Color.black);
		    			pen.setWidth(2);
		    			for (int count1=1; count1<=20; count1++)
		    			{
		    				pen.move(-1);
		    				pen.turn(-5);
		    			}
		    			pen.setDirection(235);
		    			pen.move(20);
		    			pen.setDirection(0);
		    			pen.move(20);
		    			pen.up();
		    			pen.setDirection(90);
		    			pen.move(33);
		    			pen.setDirection(0);
		    			pen.move(112);
		    			pen.down();
		    	 }
		    	 else if(playercard31==3)
		    	 {
		    		 pen.up();
		 			pen.setDirection(90);
		 			pen.move(39);
		 			pen.setDirection(180);
		 			pen.move(30);
		 			pen.setDirection(220);
		 			pen.move(0);
		 			pen.down();
		 			//draw 3 on bottom
		 			pen.setColor(Color.black);
		 			for (int count1=1; count1<=40; count1++)
		 			{
		 				pen.move(-1);
		 				pen.turn(-6);
		 			}
		 			pen.setDirection(220);
		 			pen.move(0);
		 			for (int count1=1; count1<=45; count1++)
		 			{
		 				pen.move(-1);
		 				pen.turn(-6);
		 			}
		 			pen.up();
		 			pen.setDirection(90);
		 			pen.move(80);
		 			pen.setDirection(180);
		 			pen.move(68);
		 			
		 			//draw spade
		 			pen.down();
		 			for(int count1=1;count1<=360;count1++)
		 			{
		 				pen.move(20);
		 				pen.turn(180);
		 				pen.move(20);
		 				pen.turn(1);
		 			}
		 			
		 			pen.up();
		 			pen.setColor(Color.black);
		 			pen.setDirection(0);
		 			pen.move(40);
		 			pen.down();
		 			for(int count1=1;count1<=360;count1++)
		 			{
		 				pen.move(20);
		 				pen.turn(180);
		 				pen.move(20);
		 				pen.turn(1);
		 			}
		 			pen.up();
		 			pen.setDirection(0);
		 			pen.move(17);
		 			pen.setDirection(90);
		 			pen.move(7);
		 			pen.down();
		 			pen.setWidth(7);
		 			pen.setDirection(125);
		 			pen.move(60);
		 			pen.setDirection(230);
		 			pen.move(60);
		 			pen.setDirection(0);
		 			pen.move(65);
		 			pen.setDirection(125);
		 			pen.move(45);
		 			pen.setDirection(230);
		 			pen.move(40);
		 			pen.setDirection(0);
		 			pen.move(41);
		 			pen.setDirection(125);
		 			pen.move(30);
		 			pen.setDirection(230);
		 			pen.move(25);
		 			pen.setDirection(0);
		 			pen.move(25);
		 			pen.setDirection(130);
		 			pen.move(15);
		 			pen.setDirection(263);
		 			pen.move(15);
		 			pen.setDirection(125);
		 			pen.move(15);
		 			
		 			//stem for spade
		 			pen.up();
		 			pen.setWidth(4);
		 			pen.setDirection(270);
		 			pen.move(35);
		 			pen.setDirection(0);
		 			pen.move(9);
		 			pen.down();
		 			pen.setDirection(260);
		 			pen.move(40);
		 			pen.setDirection(0);
		 			pen.move(15);
		 			pen.setDirection(100);
		 			pen.move(40);
		 			pen.setDirection(270);
		 			pen.move(37);
		 			pen.setDirection(180);
		 			pen.move(5);
		 			pen.setDirection(80);
		 			pen.move(35);
		 			pen.setDirection(265);
		 			pen.move(35);
		 			pen.setDirection(0);
		 			pen.move(6);
		 			pen.setDirection(100);
		 			pen.move(35);
		 			pen.setDirection(95);
		 			pen.move(50);
		 			pen.up();
		 			pen.setDirection(90);
		 			pen.move(55);
		 			pen.setDirection(180);
		 			pen.move(55);
		 			pen.setDirection(220);
		 			pen.move(0);
		 			pen.down();
		 			pen.setWidth(2);
		 			
		 			//draw 3 top
		 			pen.setColor(Color.black);
		 			for (int count1=1; count1<=40; count1++)
		 			{
		 				pen.move(-1);
		 				pen.turn(-6);
		 			}
		 			pen.setDirection(220);
		 			pen.move(0);
		 			for (int count1=1; count1<=45; count1++)
		 			{
		 				pen.move(-1);
		 				pen.turn(-6);
		 			}
		 			pen.up();
		 			pen.setDirection(90);
		 			pen.move(42);
		 			pen.setDirection(0);
		 			pen.move(132);
		 			pen.down();
		    	 }
		    	 else if(playercard31==4)
		 			{
		    		//draw 4 bottom
		 			pen.up();
		 			pen.setDirection(90);
		 			pen.move(35);
		 			pen.setDirection(180);
		 			pen.move(25);
		 			pen.down();
		 			pen.setColor(Color.black);
		 			pen.setDirection(270);
		 			pen.move(20);
		 			pen.setDirection(0);
		 			pen.move(20);
		 			pen.setDirection(180);
		 			pen.move(10);
		 			pen.setDirection(270);
		 			pen.move(10);
		 			pen.setDirection(90);
		 			pen.move(20);
		 			
		 			// draw diamond
		 			pen.up();
		 			pen.setDirection(180);
		 			pen.move(60);
		 			pen.setDirection(90);
		 			pen.move(125);
		 			pen.setWidth(2);
		 			pen.setColor(Color.red);
		 			pen.down();
		 			pen.setDirection(290);
		 			pen.move(60);
		 			pen.setDirection(250);
		 			pen.move(60);
		 			pen.setDirection(110);
		 			pen.move(60);
		 			pen.setDirection(70);
		 			pen.move(60);
		 			
		 			//fill in
		 			pen.up();
		 			pen.setDirection(270);
		 			pen.move(3);
		 			pen.down();
		 			pen.setWidth(3);
		 			pen.setDirection(290);
		 			pen.move(59);
		 			pen.setDirection(250);
		 			pen.move(57);
		 			pen.setDirection(110);
		 			pen.move(58);
		 			pen.setDirection(70);
		 			pen.move(55);
		 			
		 			pen.setDirection(290);
		 			pen.move(55);
		 			pen.setDirection(250);
		 			pen.move(51);
		 			pen.setDirection(110);
		 			pen.move(55);
		 			pen.setDirection(70);
		 			pen.move(49);
		 			
		 			pen.setWidth(5);
		 			pen.setDirection(290);
		 			pen.move(55);
		 			pen.setDirection(250);
		 			pen.move(51);
		 			pen.setDirection(110);
		 			pen.move(55);
		 			pen.setDirection(70);
		 			pen.move(53);
		 		
		 			
		 			pen.setDirection(270);
		 			pen.move(92);
		 			pen.setDirection(0);
		 			pen.move(3);
		 			pen.setDirection(90);
		 			pen.move(83);
		 			pen.setDirection(300);
		 			pen.move(4);
		 			pen.setDirection(270);
		 			pen.move(75);
		 			pen.setDirection(75);
		 			pen.move(4);
		 			pen.setDirection(90);
		 			pen.move(65);
		 			pen.setDirection(272);
		 			pen.move(7);
		 			pen.setWidth(10);
		 			pen.setDirection(270);
		 			pen.move(50);
		 			pen.setDirection(65);
		 			pen.move(11);
		 			pen.setDirection(90);
		 			pen.move(20);
		 			pen.setDirection(180);
		 			pen.move(23);
		 			pen.setDirection(70);
		 			pen.move(29);
		 			pen.setDirection(270);
		 			pen.move(62);
		 			pen.setDirection(105);
		 			pen.move(30);
		 			pen.up();
		 			
		 			
		 			//draw 4 top
		 			pen.setWidth(2);
		 			pen.setDirection(180);
		 			pen.move(31);
		 			pen.setDirection(90);
		 			pen.move(65);
		 			pen.up();
		 			pen.setDirection(90);
		 			pen.move(35);
		 			pen.setDirection(180);
		 			pen.move(25);
		 			pen.down();
		 			pen.setColor(Color.black);
		 			pen.setDirection(270);
		 			pen.move(20);
		 			pen.setDirection(0);
		 			pen.move(20);
		 			pen.setDirection(180);
		 			pen.move(10);
		 			pen.setDirection(270);
		 			pen.move(10);
		 			pen.setDirection(90);
		 			pen.move(20);
		 			pen.up();
		 			pen.setDirection(90);
		 			pen.move(17);
		 			pen.setDirection(0);
		 			pen.move(131);
		 			pen.down();
		 			
		 		}
		    	 else if(playercard31==5)
		    	 {
		    			pen.up();
		    			pen.setDirection(90);
		    			pen.move(35);
		    			pen.setDirection(180);
		    			pen.move(10);
		    			pen.down();
		    			
		    			//draw 5 bottom
		    			pen.setColor(Color.black);
		    			pen.setDirection(180);
		    			pen.move(15);
		    			pen.setDirection(270);
		    			pen.move(12);
		    			pen.setDirection(220);
		    			pen.move(0);
		    			for (int count1=1; count1<=45; count1++)
		    			{
		    				pen.move(-1);
		    				pen.turn(-6);
		    			}
		    			pen.up();
		    			pen.setDirection(90);
		    			pen.move(110);
		    			pen.setDirection(180);
		    			pen.move(70);
		    			
		    			//draw heart
		    			pen.down();
		    			pen.setColor(Color.RED);
		    			for(int count1=1;count1<=360;count1++)
		    			{
		    				pen.move(20);
		    				pen.turn(180);
		    				pen.move(20);
		    				pen.turn(1);
		    			}
		    			pen.up();
		    			pen.setDirection(0);
		    			pen.move(40);
		    			pen.down();
		    			for(int count1=1;count1<=360;count1++)
		    			{
		    				pen.move(20);
		    				pen.turn(180);
		    				pen.move(20);
		    				pen.turn(1);
		    			}
		    			pen.up();
		    			pen.setDirection(0);
		    			pen.move(21);
		    			pen.setDirection(270);
		    			pen.move(3);
		    			pen.down();
		    			pen.setDirection(240);
		    			pen.move(75);
		    			pen.setDirection(125);
		    			pen.move(75);
		    			pen.setDirection(0);
		    			pen.move(7);
		    			pen.setWidth(6);
		    			pen.setDirection(270);
		    			pen.move(5);
		    			pen.setDirection(305);
		    			pen.move(62);
		    			pen.setDirection(60);
		    			pen.move(60);
		    			pen.setDirection(180);
		    			pen.move(60);
		    			pen.setDirection(305);
		    			pen.move(52);
		    			pen.setDirection(60);
		    			pen.move(52);
		    			pen.setDirection(180);
		    			pen.move(52);
		    			pen.setDirection(305);
		    			pen.move(44);
		    			pen.setDirection(60);
		    			pen.move(42);
		    			pen.setDirection(180);
		    			pen.move(43);
		    			pen.setDirection(305);
		    			pen.move(42);
		    			pen.setDirection(60);
		    			pen.move(42);
		    			pen.setDirection(180);
		    			pen.move(40);
		    			pen.setDirection(305);
		    			pen.move(32);
		    			pen.setDirection(60);
		    			pen.move(32);
		    			pen.setWidth(15);
		    			pen.setDirection(180);
		    			pen.move(24);
		    			pen.setDirection(300);
		    			pen.move(15);
		    			pen.setDirection(40);
		    			pen.move(2);
		    			
		    			//Draw 5 top
		    			pen.up();
		    			pen.setDirection(90);
		    			pen.move(85);
		    			pen.setDirection(180);
		    			pen.move(50);
		    			pen.setWidth(2);
		    			pen.down();
		    			pen.setColor(Color.black);
		    			pen.setDirection(180);
		    			pen.move(15);
		    			pen.setDirection(270);
		    			pen.move(12);
		    			pen.setDirection(220);
		    			pen.move(0);
		    			for (int count1=1; count1<=45; count1++)
		    			{
		    				pen.move(-1);
		    				pen.turn(-6);
		    			}
		    			pen.up();
		    			pen.setDirection(90);
		    			pen.move(36);
		    			pen.setDirection(0);
		    			pen.move(136);
		    			pen.down();
		    	 }
		    	 else if(playercard31==6)
		    	 {
		    		//6 on bottom
		 			pen.up();
		 			pen.setColor(Color.black);
		 			pen.setWidth(2);
		 			
		 			pen.setDirection(180);
		 			pen.move(100);
		 			pen.setDirection(250);
		 			pen.move(0);
		 			
		 			pen.up();
		 			pen.setDirection(0);
		 			pen.move(78);
		 			pen.setDirection(90);
		 			pen.move(48);
		 			pen.setDirection(250);
		 			pen.move(0);
		 			pen.down();
		 			
		 			for(int count1=1; count1<7; count1++)
		 			{
		 				pen.move(5);
		 				pen.turn(2);
		 			}
		 			
		 			for(int count1=1; count1<100; count1++)
		 			{
		 				pen.move(1);
		 				pen.turn(7);
		 			}
		 			
		 			pen.up();
		 			pen.setColor(Color.black);
		 			pen.setDirection(90);
		 			pen.move(69);
		 			pen.setDirection(180);
		 			pen.move(67);
		 			pen.down();
		 			for(int count1=1;count1<=360;count1++)
		 			{
		 				pen.move(20);
		 				pen.turn(180);
		 				pen.move(20);
		 				pen.turn(1);
		 			}
		 			
		 			pen.up();
		 			pen.setColor(Color.black);
		 			pen.setDirection(0);
		 			pen.move(40);
		 			pen.down();
		 			for(int count1=1;count1<=360;count1++)
		 			{
		 				pen.move(20);
		 				pen.turn(180);
		 				pen.move(20);
		 				pen.turn(1);
		 			}
		 			pen.up();
		 			pen.setDirection(0);
		 			pen.move(17);
		 			pen.setDirection(90);
		 			pen.move(7);
		 			pen.down();
		 			pen.setWidth(7);
		 			pen.setDirection(125);
		 			pen.move(60);
		 			pen.setDirection(230);
		 			pen.move(60);
		 			pen.setDirection(0);
		 			pen.move(65);
		 			pen.setDirection(125);
		 			pen.move(45);
		 			pen.setDirection(230);
		 			pen.move(40);
		 			pen.setDirection(0);
		 			pen.move(41);
		 			pen.setDirection(125);
		 			pen.move(30);
		 			pen.setDirection(230);
		 			pen.move(25);
		 			pen.setDirection(0);
		 			pen.move(25);
		 			pen.setDirection(130);
		 			pen.move(15);
		 			pen.setDirection(263);
		 			pen.move(15);
		 			pen.setDirection(125);
		 			pen.move(15);
		 			
		 			//stem for spade
		 			pen.up();
		 			pen.setWidth(4);
		 			pen.setDirection(270);
		 			pen.move(35);
		 			pen.setDirection(0);
		 			pen.move(9);
		 			pen.down();
		 			pen.setDirection(260);
		 			pen.move(40);
		 			pen.setDirection(0);
		 			pen.move(15);
		 			pen.setDirection(100);
		 			pen.move(40);
		 			pen.setDirection(270);
		 			pen.move(37);
		 			pen.setDirection(180);
		 			pen.move(5);
		 			pen.setDirection(80);
		 			pen.move(35);
		 			pen.setDirection(265);
		 			pen.move(35);
		 			pen.setDirection(0);
		 			pen.move(6);
		 			pen.setDirection(100);
		 			pen.move(35);
		 			pen.setDirection(95);
		 			pen.move(50);
		 			
		 			//6 on top
		 			
		 			pen.up();
		 			pen.setColor(Color.black);
		 			pen.setWidth(2);
		 			
		 			pen.setDirection(180);
		 			pen.move(125);
		 			pen.setDirection(250);
		 			pen.move(0);
		 			
		 			pen.up();
		 			pen.setDirection(0);
		 			pen.move(78);
		 			pen.setDirection(90);
		 			pen.move(55);
		 			pen.setDirection(250);
		 			pen.move(0);
		 			pen.down();
		 			
		 			for(int count1=1; count1<7; count1++)
		 			{
		 				pen.move(5);
		 				pen.turn(2);
		 			}
		 			
		 			for(int count1=1; count1<100; count1++)
		 			{
		 				pen.move(1);
		 				pen.turn(7);
		 			}
		 			pen.up();
		 			pen.setDirection(90);
		 			pen.move(37);
		 			pen.setDirection(0);
		 			pen.move(134);
		 			pen.down();
		 		
		    	 }
		    	 else if(playercard31==7)
		    	 {
		    		//bottom number 7
		 			
		 			pen.setColor(Color.black);
		 			pen.up();
		 			pen.setDirection(90);
		 			pen.move(40);
		 			pen.setDirection(180);
		 			pen.move(30);
		 			pen.down();
		 			pen.setDirection(0);
		 			pen.move(15);
		 			pen.setDirection(270);
		 			pen.move(30);

		 			
		 			
		 			
		 			//heart
		 			pen.up();
		 			pen.setDirection(180);
		 			pen.move(80);
		 			pen.setDirection(90);
		 			pen.move(107);
		 			pen.setColor(Color.RED);
		 			pen.down();
		 			for(int count1=1;count1<=360;count1++)
		 			{
		 				pen.move(20);
		 				pen.turn(180);
		 				pen.move(20);
		 				pen.turn(1);
		 			}
		 			pen.up();
		 			pen.setDirection(0);
		 			pen.move(40);
		 			pen.down();
		 			for(int count1=1;count1<=360;count1++)
		 			{
		 				pen.move(20);
		 				pen.turn(180);
		 				pen.move(20);
		 				pen.turn(1);
		 			}
		 			pen.up();
		 			pen.setDirection(0);
		 			pen.move(21);
		 			pen.setDirection(270);
		 			pen.move(3);
		 			pen.down();
		 			pen.setDirection(240);
		 			pen.move(75);
		 			pen.setDirection(125);
		 			pen.move(75);
		 			pen.setDirection(0);
		 			pen.move(7);
		 			pen.setWidth(6);
		 			pen.setDirection(270);
		 			pen.move(5);
		 			pen.setDirection(305);
		 			pen.move(62);
		 			pen.setDirection(60);
		 			pen.move(60);
		 			pen.setDirection(180);
		 			pen.move(60);
		 			pen.setDirection(305);
		 			pen.move(52);
		 			pen.setDirection(60);
		 			pen.move(52);
		 			pen.setDirection(180);
		 			pen.move(52);
		 			pen.setDirection(305);
		 			pen.move(44);
		 			pen.setDirection(60);
		 			pen.move(42);
		 			pen.setDirection(180);
		 			pen.move(43);
		 			pen.setDirection(305);
		 			pen.move(42);
		 			pen.setDirection(60);
		 			pen.move(42);
		 			pen.setDirection(180);
		 			pen.move(40);
		 			pen.setDirection(305);
		 			pen.move(32);
		 			pen.setDirection(60);
		 			pen.move(32);
		 			pen.setWidth(15);
		 			pen.setDirection(180);
		 			pen.move(24);
		 			pen.setDirection(300);
		 			pen.move(15);
		 			pen.setDirection(40);
		 			pen.move(2);
		 			
		 			//top 7 number
		 			pen.setWidth(2);
		 			pen.setColor(Color.black);
		 			pen.up();
		 			pen.setDirection(90);
		 			pen.move(85);
		 			pen.setDirection(180);
		 			pen.move(70);
		 			pen.down();
		 			pen.setDirection(0);
		 			pen.move(15);
		 			pen.setDirection(270);
		 			pen.move(30);
		 			pen.up();
		 			pen.setDirection(90);
		 			pen.move(43);
		 			pen.setDirection(0);
		 			pen.move(125);
		 			pen.down();
		 			 
		    	 }
		    	 else if(playercard31==8)
		    	 {
		    		//draw number 8
		    		 pen.up();
		    			pen.setDirection(145);
		    			pen.move(20);
		    			pen.setColor(Color.black);
		    			pen.setWidth(2);
		    			pen.setDirection(45);
		    			pen.move(10);
		    			pen.setDirection(270);
		    			pen.move(5);
		    			pen.setDirection(180);
		    			pen.move(5);
		    			pen.setDirection(90);
		    			pen.move(3);
		    			pen.down();
		    			
		    			
		    			
		    			for(int count1=1; count1<100; count1++)
		    			{
		    				pen.move(1);
		    				pen.turn(7);
		    			}
		    			
		    			pen.up();
		    			pen.setDirection(90);
		    			pen.move(20);
		    			pen.down();
		    			for(int count1=1; count1<100; count1++)
		    			{
		    				pen.move(1);
		    				pen.turn(7);
		    			}
		    			pen.setColor(Color.black);
		    			pen.up();
		    			pen.setDirection(0);
		    			pen.setDirection(90);
		    			pen.move(100);
		    			pen.setDirection(270);
		    			pen.move(65);
		    			pen.setDirection(90);
		    			pen.move(35);
		    			pen.setDirection(180);
		    			pen.move(37.5);
		    			pen.down();
		    			for(int count1=1;count1<=360;count1++)
		    			{
		    				pen.move(20);
		    				pen.turn(180);
		    				pen.move(20);
		    				pen.turn(1);
		    			}
		    			
		    			pen.up();
		    			pen.setColor(Color.black);
		    			pen.setDirection(180);
		    			pen.move(40);
		    			
		    			
		    			pen.down();
		    			for(int count1=1;count1<=360;count1++)
		    			{
		    				pen.move(20);
		    				pen.turn(180);
		    				pen.move(20);
		    				pen.turn(1);
		    			}
		    			pen.up();
		    			pen.setColor(Color.black);
		    			pen.setDirection(90);
		    			pen.move(30);
		    			pen.setDirection(0);
		    			pen.move(20);
		    			pen.down();
		    			for(int count1=1;count1<=360;count1++)
		    			{
		    				pen.move(20);
		    				pen.turn(180);
		    				pen.move(20);
		    				pen.turn(1);
		    			}
		    			//steam
		    			
		    			pen.up();
		    			pen.setDirection(270);
		    			pen.move(38);
		    			pen.down();
		    			pen.setColor(Color.black);
		    			pen.setDirection(255);
		    			pen.move(35);
		    			pen.setDirection(0);
		    			pen.move(20);
		    			pen.setDirection(107);
		    			pen.move(35);
		    			pen.setWidth(5);
		    			pen.setDirection(180);
		    			pen.move(3);
		    			pen.setDirection(287);
		    			pen.move(33);
		    			pen.setDirection(180);
		    			pen.move(15);
		    			pen.setDirection(75);
		    			pen.move(30);
		    			pen.setDirection(0);
		    			pen.move(1);
		    			pen.setDirection(270);
		    			pen.move(3);
		    			pen.setDirection(255);
		    			pen.move(22);
		    			pen.setWidth(7);
		    			pen.setDirection(0);
		    			pen.move(10);
		    			pen.setDirection(135);
		    			pen.move(5);
		    			pen.setDirection(90);
		    			pen.move(3);
		    			pen.setDirection(315);
		    			pen.move(4);
		    			
		    			//top number
		    			pen.up();
		    			pen.setDirection(90);
		    			pen.move(94);
		    			pen.setDirection(180);
		    			pen.move(50);
		    			pen.setColor(Color.black);
		    			pen.setWidth(2);
		    			pen.setDirection(45);
		    			pen.move(10);
		    			pen.setDirection(270);
		    			pen.move(5);
		    			pen.setDirection(180);
		    			pen.move(5);
		    			pen.setDirection(90);
		    			pen.move(3);
		    			pen.down();
		    			
		    			
		    			
		    			for(int count1=1; count1<100; count1++)
		    			{
		    				pen.move(1);
		    				pen.turn(7);
		    			}
		    			
		    			pen.up();
		    			pen.setDirection(90);
		    			pen.move(20);
		    			pen.down();
		    			for(int count1=1; count1<100; count1++)
		    			{
		    				pen.move(1);
		    				pen.turn(7);
		    			}
		    			pen.up();
		    			pen.setDirection(90);
		    			pen.move(20);
		    			pen.setDirection(0);
		    			pen.move(120);
		    			pen.down();
		    	 }
		    	 else if(playercard31==9)
		    	 {
		    			pen.setDirection(180);
		    			pen.move(75);
		    			pen.setDirection(90);
		    			pen.move(150);
		    			pen.setWidth(2);
		    			pen.setColor(Color.red);
		    			pen.down();
		    			pen.setDirection(290);
		    			pen.move(60);
		    			pen.setDirection(250);
		    			pen.move(60);
		    			pen.setDirection(110);
		    			pen.move(60);
		    			pen.setDirection(70);
		    			pen.move(60);
		    			
		    			//fill in
		    			pen.up();
		    			pen.setDirection(270);
		    			pen.move(3);
		    			pen.down();
		    			pen.setWidth(3);
		    			pen.setDirection(290);
		    			pen.move(59);
		    			pen.setDirection(250);
		    			pen.move(57);
		    			pen.setDirection(110);
		    			pen.move(58);
		    			pen.setDirection(70);
		    			pen.move(55);
		    			
		    			pen.setDirection(290);
		    			pen.move(55);
		    			pen.setDirection(250);
		    			pen.move(51);
		    			pen.setDirection(110);
		    			pen.move(55);
		    			pen.setDirection(70);
		    			pen.move(49);
		    			
		    			pen.setWidth(5);
		    			pen.setDirection(290);
		    			pen.move(55);
		    			pen.setDirection(250);
		    			pen.move(51);
		    			pen.setDirection(110);
		    			pen.move(55);
		    			pen.setDirection(70);
		    			pen.move(53);
		    		
		    			
		    			pen.setDirection(270);
		    			pen.move(92);
		    			pen.setDirection(0);
		    			pen.move(3);
		    			pen.setDirection(90);
		    			pen.move(83);
		    			pen.setDirection(300);
		    			pen.move(4);
		    			pen.setDirection(270);
		    			pen.move(75);
		    			pen.setDirection(75);
		    			pen.move(4);
		    			pen.setDirection(90);
		    			pen.move(65);
		    			pen.setDirection(272);
		    			pen.move(7);
		    			pen.setWidth(10);
		    			pen.setDirection(270);
		    			pen.move(50);
		    			pen.setDirection(65);
		    			pen.move(11);
		    			pen.setDirection(90);
		    			pen.move(20);
		    			pen.setDirection(180);
		    			pen.move(23);
		    			pen.setDirection(70);
		    			pen.move(29);
		    			pen.setDirection(270);
		    			pen.move(62);
		    			pen.setDirection(105);
		    			pen.move(30);
		    			
		    			//nine number on bottom
		    			pen.up();
		    			pen.setDirection(270);
		    			pen.move(72);
		    			pen.setDirection(0);
		    			pen.move(65);
		    			
		    			pen.setColor(Color.black);
		    			pen.setWidth(2);
		    			pen.down();
		    			for(int count1=1; count1<100; count1++)
		    			{
		    				pen.move(1);
		    				pen.turn(7);
		    			}
		    			pen.setDirection(0);
		    			pen.move(12);
		    			pen.setDirection(90);
		    			pen.move(2);
		    			pen.setDirection(270);
		    			pen.move(17);
		    			
		    			//9 on top
		    			pen.up();
		    			pen.setDirection(90);
		    			pen.move(185);
		    			pen.setDirection(180);
		    			pen.move(120);
		    			
		    			pen.setColor(Color.black);
		    			pen.setWidth(2);
		    			pen.down();
		    			for(int count1=1; count1<100; count1++)
		    			{
		    				pen.move(1);
		    				pen.turn(7);
		    			}
		    			pen.up();
		    			pen.setDirection(0);
		    			pen.move(4);
		    			pen.setDirection(270);
		    			pen.move(12);
		    			pen.down();
		    			pen.setDirection(270);
		    			pen.move(17);
		    			pen.up();
		    			pen.setDirection(90);
		    			pen.move(38);
		    			pen.setDirection(0);
		    			pen.move(124);
		    			pen.down();
		    	 }
		    	 else if(playercard31==10)
		    	 {
		    		//draw 10 bottom
		 			pen.up();
		 			pen.setColor(Color.black);
		 			pen.setWidth(2);
		 			pen.setDirection(90);
		 			pen.move(30);
		 			pen.setDirection(180);
		 			pen.move(35);
		 			pen.down();
		 			pen.setDirection(270);
		 			pen.move(25);
		 			pen.up();
		 			pen.setDirection(90);
		 			pen.move(0);
		 			pen.setDirection(0);
		 			pen.move(18);
		 			
		 			pen.down();
		 			for(int count1=1; count1<100; count1++)
		 			{
		 				pen.move(1);
		 				pen.turn(4.5);
		 			}
		 			pen.up();
		 			pen.setDirection(90);
		 			pen.move(110);
		 			pen.setDirection(180);
		 			pen.move(50);
		 			
		 			pen.setColor(Color.black);
		 			pen.up();
		 			pen.setDirection(0);
		 			pen.setDirection(270);
		 			pen.move(65);
		 			pen.setDirection(90);
		 			pen.move(35);
		 			pen.setDirection(180);
		 			pen.move(2);
		 			pen.down();
		 			for(int count1=1;count1<=360;count1++)
		 			{
		 				pen.move(20);
		 				pen.turn(180);
		 				pen.move(20);
		 				pen.turn(1);
		 			}
		 			
		 			pen.up();
		 			pen.setColor(Color.black);
		 			pen.setDirection(180);
		 			pen.move(40);
		 			
		 			
		 			pen.down();
		 			for(int count1=1;count1<=360;count1++)
		 			{
		 				pen.move(20);
		 				pen.turn(180);
		 				pen.move(20);
		 				pen.turn(1);
		 			}
		 			pen.up();
		 			pen.setColor(Color.black);
		 			pen.setDirection(90);
		 			pen.move(30);
		 			pen.setDirection(0);
		 			pen.move(20);
		 			pen.down();
		 			for(int count1=1;count1<=360;count1++)
		 			{
		 				pen.move(20);
		 				pen.turn(180);
		 				pen.move(20);
		 				pen.turn(1);
		 			}
		 			//steam
		 			
		 			pen.up();
		 			pen.setDirection(270);
		 			pen.move(38);
		 			pen.down();
		 			pen.setColor(Color.black);
		 			pen.setDirection(255);
		 			pen.move(35);
		 			pen.setDirection(0);
		 			pen.move(20);
		 			pen.setDirection(107);
		 			pen.move(35);
		 			pen.setWidth(5);
		 			pen.setDirection(180);
		 			pen.move(3);
		 			pen.setDirection(287);
		 			pen.move(33);
		 			pen.setDirection(180);
		 			pen.move(15);
		 			pen.setDirection(75);
		 			pen.move(30);
		 			pen.setDirection(0);
		 			pen.move(1);
		 			pen.setDirection(270);
		 			pen.move(3);
		 			pen.setDirection(255);
		 			pen.move(22);
		 			pen.setWidth(7);
		 			pen.setDirection(0);
		 			pen.move(10);
		 			pen.setDirection(135);
		 			pen.move(5);
		 			pen.setDirection(90);
		 			pen.move(3);
		 			pen.setDirection(315);
		 			pen.move(4);
		 			
		 			//draw 10 on top
		 			pen.up();
		 			pen.setDirection(90);
		 			pen.move(125);
		 			pen.setDirection(180);
		 			pen.move(70);
		 			pen.down();
		 			pen.setWidth(2);
		 			pen.setDirection(270);
		 			pen.move(25);
		 			pen.up();
		 			pen.setDirection(90);
		 			pen.move(0);
		 			pen.setDirection(0);
		 			pen.move(17);
		 			
		 			pen.down();
		 			for(int count1=1; count1<100; count1++)
		 			{
		 				pen.move(1);
		 				pen.turn(4.5);
		 			}
		 			pen.up();
		 			pen.setDirection(90);
		 			pen.move(25);
		 			pen.setDirection(0);
		 			pen.move(110);
		 			pen.down();
		    	 }
		 			else if(playercard31==11)
		 			{
		 				pen.up();
		 				pen.setDirection(90);
		 				pen.move(40);
		 				pen.setDirection(180);
		 				pen.move(15);
		 				pen.down();
		 				
		 				//draw j on bottom
		 				pen.setColor(Color.black);
		 				pen.setDirection(180);
		 				pen.move(10);
		 				pen.setDirection(0);
		 				pen.move(20);
		 				pen.setDirection(180);
		 				pen.move(10);
		 				pen.setDirection(270);
		 				pen.move(25);
		 				pen.setDirection(90);
		 				pen.move(0);
		 				for (int count1=1; count1<=25; count1++)
		 				{
		 					pen.move(-1);
		 					pen.turn(-8);
		 				}
		 				pen.up();
		 				pen.setDirection(90);
		 				pen.move(100);
		 				pen.setDirection(180);
		 				pen.move(67);
		 				
		 				//draw heart
		 				pen.setColor(Color.RED);
		 				pen.down();
		 				for(int count1=1;count1<=360;count1++)
		 				{
		 					pen.move(20);
		 					pen.turn(180);
		 					pen.move(20);
		 					pen.turn(1);
		 				}
		 				pen.up();
		 				pen.setDirection(0);
		 				pen.move(40);
		 				pen.down();
		 				for(int count1=1;count1<=360;count1++)
		 				{
		 					pen.move(20);
		 					pen.turn(180);
		 					pen.move(20);
		 					pen.turn(1);
		 				}
		 				pen.up();
		 				pen.setDirection(0);
		 				pen.move(21);
		 				pen.setDirection(270);
		 				pen.move(3);
		 				pen.down();
		 				pen.setDirection(240);
		 				pen.move(75);
		 				pen.setDirection(125);
		 				pen.move(75);
		 				pen.setDirection(0);
		 				pen.move(7);
		 				pen.setWidth(6);
		 				pen.setDirection(270);
		 				pen.move(5);
		 				pen.setDirection(305);
		 				pen.move(62);
		 				pen.setDirection(60);
		 				pen.move(60);
		 				pen.setDirection(180);
		 				pen.move(60);
		 				pen.setDirection(305);
		 				pen.move(52);
		 				pen.setDirection(60);
		 				pen.move(52);
		 				pen.setDirection(180);
		 				pen.move(52);
		 				pen.setDirection(305);
		 				pen.move(44);
		 				pen.setDirection(60);
		 				pen.move(42);
		 				pen.setDirection(180);
		 				pen.move(43);
		 				pen.setDirection(305);
		 				pen.move(42);
		 				pen.setDirection(60);
		 				pen.move(42);
		 				pen.setDirection(180);
		 				pen.move(40);
		 				pen.setDirection(305);
		 				pen.move(32);
		 				pen.setDirection(60);
		 				pen.move(32);
		 				pen.setWidth(15);
		 				pen.setDirection(180);
		 				pen.move(24);
		 				pen.setDirection(300);
		 				pen.move(15);
		 				pen.setDirection(40);
		 				pen.move(2);
		 				pen.up();
		 				pen.setDirection(90);
		 				pen.move(88);
		 				pen.setDirection(180);
		 				pen.move(53);
		 				
		 				// draw j on top
		 				pen.down();
		 				pen.setWidth(2);
		 				pen.setColor(Color.black);
		 				pen.setDirection(180);
		 				pen.move(10);
		 				pen.setDirection(0);
		 				pen.move(20);
		 				pen.setDirection(180);
		 				pen.move(10);
		 				pen.setDirection(270);
		 				pen.move(25);
		 				pen.setDirection(90);
		 				pen.move(0);
		 				for (int count1=1; count1<=25; count1++)
		 				{
		 					pen.move(-1);
		 					pen.turn(-8);
		 				}
		 				pen.up();
		 				pen.setDirection(90);
		 				pen.move(35);
		 				pen.setDirection(0);
		 				pen.move(139);
		 				pen.down();
		 			}
		 			else if(playercard31==12)
		 			{
		 				pen.up();
		 				pen.setDirection(90);
		 				pen.move(35);
		 				pen.setDirection(180);
		 				pen.move(30);
		 				pen.down();
		 				
		 				// draw Q bottom
		 				pen.setColor(Color.black);
		 				for (int count1=1; count1<=150; count1++)
		 				{
		 					pen.move(1);
		 					pen.turn(4);
		 				}
		 				pen.setDirection(325);
		 				pen.move(10);
		 				pen.setDirection(145);
		 				pen.move(20);
		 				pen.up();
		 				pen.setDirection(90);
		 				pen.move(75);
		 				pen.setDirection(180);
		 				pen.move(30);
		 				
		 				//draw club
		 				
		 				pen.setColor(Color.black);
		 				pen.down();
		 				for(int count1=1;count1<=360;count1++)
		 				{
		 					pen.move(20);
		 					pen.turn(180);
		 					pen.move(20);
		 					pen.turn(1);
		 				}
		 				
		 				pen.up();
		 				pen.setColor(Color.black);
		 				pen.setDirection(180);
		 				pen.move(40);
		 				
		 				
		 				pen.down();
		 				for(int count1=1;count1<=360;count1++)
		 				{
		 					pen.move(20);
		 					pen.turn(180);
		 					pen.move(20);
		 					pen.turn(1);
		 				}
		 				pen.up();
		 				pen.setColor(Color.black);
		 				pen.setDirection(90);
		 				pen.move(30);
		 				pen.setDirection(0);
		 				pen.move(20);
		 				pen.down();
		 				for(int count1=1;count1<=360;count1++)
		 				{
		 					pen.move(20);
		 					pen.turn(180);
		 					pen.move(20);
		 					pen.turn(1);
		 				}
		 				//steam
		 				
		 				pen.up();
		 				pen.setDirection(270);
		 				pen.move(38);
		 				pen.down();
		 				pen.setColor(Color.black);
		 				pen.setDirection(255);
		 				pen.move(35);
		 				pen.setDirection(0);
		 				pen.move(20);
		 				pen.setDirection(107);
		 				pen.move(35);
		 				pen.setWidth(5);
		 				pen.setDirection(180);
		 				pen.move(3);
		 				pen.setDirection(287);
		 				pen.move(33);
		 				pen.setDirection(180);
		 				pen.move(15);
		 				pen.setDirection(75);
		 				pen.move(30);
		 				pen.setDirection(0);
		 				pen.move(1);
		 				pen.setDirection(270);
		 				pen.move(3);
		 				pen.setDirection(255);
		 				pen.move(22);
		 				pen.setWidth(7);
		 				pen.setDirection(0);
		 				pen.move(10);
		 				pen.setDirection(135);
		 				pen.move(5);
		 				pen.setDirection(90);
		 				pen.move(3);
		 				pen.setDirection(315);
		 				pen.move(4);
		 				
		 				pen.up();
		 				pen.setDirection(90);
		 				pen.move(130);
		 				pen.setDirection(180);
		 				pen.move(55);
		 				
		 				//Draw Q top
		 				pen.down();
		 				pen.setColor(Color.black);
		 				pen.setWidth(2);
		 				for (int count1=1; count1<=150; count1++)
		 				{
		 					pen.move(1);
		 					pen.turn(4);
		 				}
		 				pen.setDirection(325);
		 				pen.move(10);
		 				pen.setDirection(145);
		 				pen.move(20);
		 				pen.up();
		 				pen.setDirection(90);
		 				pen.move(23);
		 				pen.setDirection(0);
		 				pen.move(123);
		 				pen.down();
		 			}
		 			else if(playercard31==13)
		 			{
		 				pen.up();
		 				pen.setDirection(90);
		 				pen.move(35);
		 				pen.setDirection(180);
		 				pen.move(23);
		 				pen.down();
		 				
		 				//Draw K bottom
		 				pen.setColor(Color.black);
		 				pen.setDirection(270);
		 				pen.move(30);
		 				pen.up();
		 				pen.setDirection(0);
		 				pen.move(15);
		 				pen.down();
		 				pen.setDirection(135);
		 				pen.move(20);
		 				pen.setDirection(45);
		 				pen.move(20);
		 				pen.up();
		 				pen.setDirection(90);
		 				pen.move(120);
		 				pen.setDirection(180);
		 				pen.move(65);
		 				pen.down();
		 				
		 				//draw diamond
		 				pen.setColor(Color.red);
		 				pen.setDirection(290);
		 				pen.move(60);
		 				pen.setDirection(250);
		 				pen.move(60);
		 				pen.setDirection(110);
		 				pen.move(60);
		 				pen.setDirection(70);
		 				pen.move(60);
		 				
		 				//fill in
		 				pen.up();
		 				pen.setDirection(270);
		 				pen.move(3);
		 				pen.down();
		 				pen.setWidth(3);
		 				pen.setDirection(290);
		 				pen.move(59);
		 				pen.setDirection(250);
		 				pen.move(57);
		 				pen.setDirection(110);
		 				pen.move(58);
		 				pen.setDirection(70);
		 				pen.move(55);
		 				
		 				pen.setDirection(290);
		 				pen.move(55);
		 				pen.setDirection(250);
		 				pen.move(51);
		 				pen.setDirection(110);
		 				pen.move(55);
		 				pen.setDirection(70);
		 				pen.move(49);
		 				
		 				pen.setWidth(5);
		 				pen.setDirection(290);
		 				pen.move(55);
		 				pen.setDirection(250);
		 				pen.move(51);
		 				pen.setDirection(110);
		 				pen.move(55);
		 				pen.setDirection(70);
		 				pen.move(53);
		 			
		 				
		 				pen.setDirection(270);
		 				pen.move(92);
		 				pen.setDirection(0);
		 				pen.move(3);
		 				pen.setDirection(90);
		 				pen.move(83);
		 				pen.setDirection(300);
		 				pen.move(4);
		 				pen.setDirection(270);
		 				pen.move(75);
		 				pen.setDirection(75);
		 				pen.move(4);
		 				pen.setDirection(90);
		 				pen.move(65);
		 				pen.setDirection(272);
		 				pen.move(7);
		 				pen.setWidth(10);
		 				pen.setDirection(270);
		 				pen.move(50);
		 				pen.setDirection(65);
		 				pen.move(11);
		 				pen.setDirection(90);
		 				pen.move(20);
		 				pen.setDirection(180);
		 				pen.move(23);
		 				pen.setDirection(70);
		 				pen.move(29);
		 				pen.setDirection(270);
		 				pen.move(62);
		 				pen.setDirection(105);
		 				pen.move(30);
		 				pen.up();
		 				pen.setDirection(90);
		 				pen.move(95);
		 				pen.setDirection(180);
		 				pen.move(55);
		 				
		 				//Draw K top
		 				pen.down();
		 				pen.setWidth(2);
		 				pen.setColor(Color.black);
		 				pen.setDirection(270);
		 				pen.move(30);
		 				pen.up();
		 				pen.setDirection(0);
		 				pen.move(15);
		 				pen.down();
		 				pen.setDirection(135);
		 				pen.move(20);
		 				pen.setDirection(45);
		 				pen.move(20);
		 				pen.up();
		 				pen.setDirection(90);
		 				pen.move(10);
		 				pen.setDirection(0);
		 				pen.move(123);
		 				pen.down();
		 			}
				return playercard31;
	}
	
	public int Dcard2(int dealercard11, StandardPen pen)
	{
		KeyboardReader reader = new KeyboardReader();
		
		Random generator = new Random();
		//outside of card
				pen.setWidth(2);
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
				
				pen.setColor(Color.orange);
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
				
				 if(dealercard11==1)
		    	 {
		    		 pen.setColor(Color.black);
		 			pen.up();
		 			pen.setDirection(180);
		 			pen.move(30);
		 			pen.setDirection(90);
		 			pen.move(8);
		 			pen.down();
		 			pen.setDirection(70);
		 			pen.move(30);
		 			pen.setDirection(290);
		 			pen.move(30);
		 			pen.setDirection(110);
		 			pen.move(15);
		 			pen.setDirection(180);
		 			pen.move(9);
		 			pen.up();
					pen.setColor(Color.black);
					pen.setDirection(90);
					pen.move(69);
					pen.setDirection(180);
					pen.move(72);
					pen.down();
					for(int count1=1;count1<=360;count1++)
					{
						pen.move(20);
						pen.turn(180);
						pen.move(20);
						pen.turn(1);
					}
					
					pen.up();
					pen.setColor(Color.black);
					pen.setDirection(0);
					pen.move(40);
					pen.down();
					for(int count1=1;count1<=360;count1++)
					{
						pen.move(20);
						pen.turn(180);
						pen.move(20);
						pen.turn(1);
					}
					pen.up();
					pen.setDirection(0);	
					pen.move(17);
					pen.setDirection(90);
					pen.move(7);
					pen.down();
					pen.setWidth(7);
					pen.setDirection(125);
					pen.move(60);
					pen.setDirection(230);
					pen.move(60);
					pen.setDirection(0);
					pen.move(65);
					pen.setDirection(125);
					pen.move(45);
					pen.setDirection(230);
					pen.move(40);
					pen.setDirection(0);
					pen.move(41);
					pen.setDirection(125);
					pen.move(30);
					pen.setDirection(230);
					pen.move(25);
					pen.setDirection(0);
					pen.move(25);
					pen.setDirection(130);
					pen.move(15);
					pen.setDirection(263);
					pen.move(15);
					pen.setDirection(125);
					pen.move(15);
					
					//stem for spade
					pen.up();
					pen.setWidth(4);
					pen.setDirection(270);
					pen.move(35);
					pen.setDirection(0);
					pen.move(9);
					pen.down();
					pen.setDirection(260);
					pen.move(40);
					pen.setDirection(0);
					pen.move(15);
					pen.setDirection(100);
					pen.move(40);
					pen.setDirection(270);
					pen.move(37);
					pen.setDirection(180);
					pen.move(5);
					pen.setDirection(80);
					pen.move(35);
					pen.setDirection(265);
					pen.move(35);
					pen.setDirection(0);
					pen.move(6);
					pen.setDirection(100);
					pen.move(35);
					pen.setDirection(95);
					pen.move(50);
					
					//ace on top
					pen.up();
					pen.setDirection(180);
					pen.move(100);
					pen.setDirection(90);
					pen.move(100);
					pen.down();
					
					pen.setWidth(2);
					pen.setColor(Color.black);
					pen.up();
					pen.setDirection(0);
					pen.move(40);
					pen.setDirection(270);
					pen.move(70);
					pen.down();
					pen.setDirection(70);
					pen.move(30);
					pen.setDirection(290);
					pen.move(30);
					pen.setDirection(110);
					pen.move(15);
					pen.setDirection(180);
					pen.move(9);
					pen.up();
					pen.setDirection(90);
					pen.move(22);
					pen.setDirection(0);
					pen.move(136);
					pen.down();
		    	 }
		    	 else if(dealercard11==2)
		    	 {
		    			pen.up();
		    			pen.setDirection(90);
		    			pen.move(32);
		    			pen.setDirection(180);
		    			pen.move(35);
		    			pen.down();
		    			pen.setDirection(200);
		    			pen.move(0);
		    			
		    			// draw 2 bottom
		    			pen.setColor(Color.black);
		    			for (int count1=1; count1<=20; count1++)
		    			{
		    				pen.move(-1);
		    				pen.turn(-5);
		    			}
		    			pen.setDirection(235);
		    			pen.move(20);
		    			pen.setDirection(0);
		    			pen.move(20);
		    			pen.up();
		    			pen.setDirection(90);
		    			pen.move(110);
		    			pen.setDirection(180);
		    			pen.move(85);
		    			pen.down();
		    			
		    			//draw heart
		    			pen.setColor(Color.RED);
		    			for(int count1=1;count1<=360;count1++)
		    			{
		    				pen.move(20);
		    				pen.turn(180);
		    				pen.move(20);
		    				pen.turn(1);
		    			}
		    			pen.up();
		    			pen.setDirection(0);
		    			pen.move(40);
		    			pen.down();
		    			for(int count1=1;count1<=360;count1++)
		    			{
		    				pen.move(20);
		    				pen.turn(180);
		    				pen.move(20);
		    				pen.turn(1);
		    			}
		    			pen.up();
		    			pen.setDirection(0);
		    			pen.move(21);
		    			pen.setDirection(270);
		    			pen.move(3);
		    			pen.down();
		    			pen.setDirection(240);
		    			pen.move(75);
		    			pen.setDirection(125);
		    			pen.move(75);
		    			pen.setDirection(0);
		    			pen.move(7);
		    			pen.setWidth(6);
		    			pen.setDirection(270);
		    			pen.move(5);
		    			pen.setDirection(305);
		    			pen.move(62);
		    			pen.setDirection(60);
		    			pen.move(60);
		    			pen.setDirection(180);
		    			pen.move(60);
		    			pen.setDirection(305);
		    			pen.move(52);
		    			pen.setDirection(60);
		    			pen.move(52);
		    			pen.setDirection(180);
		    			pen.move(52);
		    			pen.setDirection(305);
		    			pen.move(44);
		    			pen.setDirection(60);
		    			pen.move(42);
		    			pen.setDirection(180);
		    			pen.move(43);
		    			pen.setDirection(305);
		    			pen.move(42);
		    			pen.setDirection(60);
		    			pen.move(42);
		    			pen.setDirection(180);
		    			pen.move(40);
		    			pen.setDirection(305);
		    			pen.move(32);
		    			pen.setDirection(60);
		    			pen.move(32);
		    			pen.setWidth(15);
		    			pen.setDirection(180);
		    			pen.move(24);
		    			pen.setDirection(300);
		    			pen.move(15);
		    			pen.setDirection(40);
		    			pen.move(2);
		    			pen.up();
		    			
		    			//draw 2 top
		    			pen.setDirection(90);
		    			pen.move(90);
		    			pen.setDirection(180);
		    			pen.move(65);
		    			pen.setDirection(200);
		    			pen.move(0);
		    			pen.down();
		    			pen.setColor(Color.black);
		    			pen.setWidth(2);
		    			for (int count1=1; count1<=20; count1++)
		    			{
		    				pen.move(-1);
		    				pen.turn(-5);
		    			}
		    			pen.setDirection(235);
		    			pen.move(20);
		    			pen.setDirection(0);
		    			pen.move(20);
		    			pen.up();
		    			pen.setDirection(90);
		    			pen.move(33);
		    			pen.setDirection(0);
		    			pen.move(112);
		    			pen.down();
		    	 }
		    	 else if(dealercard11==3)
		    	 {
		    		 pen.up();
		 			pen.setDirection(90);
		 			pen.move(39);
		 			pen.setDirection(180);
		 			pen.move(30);
		 			pen.setDirection(220);
		 			pen.move(0);
		 			pen.down();
		 			//draw 3 on bottom
		 			pen.setColor(Color.black);
		 			for (int count1=1; count1<=40; count1++)
		 			{
		 				pen.move(-1);
		 				pen.turn(-6);
		 			}
		 			pen.setDirection(220);
		 			pen.move(0);
		 			for (int count1=1; count1<=45; count1++)
		 			{
		 				pen.move(-1);
		 				pen.turn(-6);
		 			}
		 			pen.up();
		 			pen.setDirection(90);
		 			pen.move(80);
		 			pen.setDirection(180);
		 			pen.move(68);
		 			
		 			//draw spade
		 			pen.down();
		 			for(int count1=1;count1<=360;count1++)
		 			{
		 				pen.move(20);
		 				pen.turn(180);
		 				pen.move(20);
		 				pen.turn(1);
		 			}
		 			
		 			pen.up();
		 			pen.setColor(Color.black);
		 			pen.setDirection(0);
		 			pen.move(40);
		 			pen.down();
		 			for(int count1=1;count1<=360;count1++)
		 			{
		 				pen.move(20);
		 				pen.turn(180);
		 				pen.move(20);
		 				pen.turn(1);
		 			}
		 			pen.up();
		 			pen.setDirection(0);
		 			pen.move(17);
		 			pen.setDirection(90);
		 			pen.move(7);
		 			pen.down();
		 			pen.setWidth(7);
		 			pen.setDirection(125);
		 			pen.move(60);
		 			pen.setDirection(230);
		 			pen.move(60);
		 			pen.setDirection(0);
		 			pen.move(65);
		 			pen.setDirection(125);
		 			pen.move(45);
		 			pen.setDirection(230);
		 			pen.move(40);
		 			pen.setDirection(0);
		 			pen.move(41);
		 			pen.setDirection(125);
		 			pen.move(30);
		 			pen.setDirection(230);
		 			pen.move(25);
		 			pen.setDirection(0);
		 			pen.move(25);
		 			pen.setDirection(130);
		 			pen.move(15);
		 			pen.setDirection(263);
		 			pen.move(15);
		 			pen.setDirection(125);
		 			pen.move(15);
		 			
		 			//stem for spade
		 			pen.up();
		 			pen.setWidth(4);
		 			pen.setDirection(270);
		 			pen.move(35);
		 			pen.setDirection(0);
		 			pen.move(9);
		 			pen.down();
		 			pen.setDirection(260);
		 			pen.move(40);
		 			pen.setDirection(0);
		 			pen.move(15);
		 			pen.setDirection(100);
		 			pen.move(40);
		 			pen.setDirection(270);
		 			pen.move(37);
		 			pen.setDirection(180);
		 			pen.move(5);
		 			pen.setDirection(80);
		 			pen.move(35);
		 			pen.setDirection(265);
		 			pen.move(35);
		 			pen.setDirection(0);
		 			pen.move(6);
		 			pen.setDirection(100);
		 			pen.move(35);
		 			pen.setDirection(95);
		 			pen.move(50);
		 			pen.up();
		 			pen.setDirection(90);
		 			pen.move(55);
		 			pen.setDirection(180);
		 			pen.move(55);
		 			pen.setDirection(220);
		 			pen.move(0);
		 			pen.down();
		 			pen.setWidth(2);
		 			
		 			//draw 3 top
		 			pen.setColor(Color.black);
		 			for (int count1=1; count1<=40; count1++)
		 			{
		 				pen.move(-1);
		 				pen.turn(-6);
		 			}
		 			pen.setDirection(220);
		 			pen.move(0);
		 			for (int count1=1; count1<=45; count1++)
		 			{
		 				pen.move(-1);
		 				pen.turn(-6);
		 			}
		 			pen.up();
		 			pen.setDirection(90);
		 			pen.move(42);
		 			pen.setDirection(0);
		 			pen.move(132);
		 			pen.down();
		    	 }
		    	 else if(dealercard11==4)
		 			{
		    		//draw 4 bottom
		 			pen.up();
		 			pen.setDirection(90);
		 			pen.move(35);
		 			pen.setDirection(180);
		 			pen.move(25);
		 			pen.down();
		 			pen.setColor(Color.black);
		 			pen.setDirection(270);
		 			pen.move(20);
		 			pen.setDirection(0);
		 			pen.move(20);
		 			pen.setDirection(180);
		 			pen.move(10);
		 			pen.setDirection(270);
		 			pen.move(10);
		 			pen.setDirection(90);
		 			pen.move(20);
		 			
		 			// draw diamond
		 			pen.up();
		 			pen.setDirection(180);
		 			pen.move(60);
		 			pen.setDirection(90);
		 			pen.move(125);
		 			pen.setWidth(2);
		 			pen.setColor(Color.red);
		 			pen.down();
		 			pen.setDirection(290);
		 			pen.move(60);
		 			pen.setDirection(250);
		 			pen.move(60);
		 			pen.setDirection(110);
		 			pen.move(60);
		 			pen.setDirection(70);
		 			pen.move(60);
		 			
		 			//fill in
		 			pen.up();
		 			pen.setDirection(270);
		 			pen.move(3);
		 			pen.down();
		 			pen.setWidth(3);
		 			pen.setDirection(290);
		 			pen.move(59);
		 			pen.setDirection(250);
		 			pen.move(57);
		 			pen.setDirection(110);
		 			pen.move(58);
		 			pen.setDirection(70);
		 			pen.move(55);
		 			
		 			pen.setDirection(290);
		 			pen.move(55);
		 			pen.setDirection(250);
		 			pen.move(51);
		 			pen.setDirection(110);
		 			pen.move(55);
		 			pen.setDirection(70);
		 			pen.move(49);
		 			
		 			pen.setWidth(5);
		 			pen.setDirection(290);
		 			pen.move(55);
		 			pen.setDirection(250);
		 			pen.move(51);
		 			pen.setDirection(110);
		 			pen.move(55);
		 			pen.setDirection(70);
		 			pen.move(53);
		 		
		 			
		 			pen.setDirection(270);
		 			pen.move(92);
		 			pen.setDirection(0);
		 			pen.move(3);
		 			pen.setDirection(90);
		 			pen.move(83);
		 			pen.setDirection(300);
		 			pen.move(4);
		 			pen.setDirection(270);
		 			pen.move(75);
		 			pen.setDirection(75);
		 			pen.move(4);
		 			pen.setDirection(90);
		 			pen.move(65);
		 			pen.setDirection(272);
		 			pen.move(7);
		 			pen.setWidth(10);
		 			pen.setDirection(270);
		 			pen.move(50);
		 			pen.setDirection(65);
		 			pen.move(11);
		 			pen.setDirection(90);
		 			pen.move(20);
		 			pen.setDirection(180);
		 			pen.move(23);
		 			pen.setDirection(70);
		 			pen.move(29);
		 			pen.setDirection(270);
		 			pen.move(62);
		 			pen.setDirection(105);
		 			pen.move(30);
		 			pen.up();
		 			
		 			
		 			//draw 4 top
		 			pen.setWidth(2);
		 			pen.setDirection(180);
		 			pen.move(31);
		 			pen.setDirection(90);
		 			pen.move(65);
		 			pen.up();
		 			pen.setDirection(90);
		 			pen.move(35);
		 			pen.setDirection(180);
		 			pen.move(25);
		 			pen.down();
		 			pen.setColor(Color.black);
		 			pen.setDirection(270);
		 			pen.move(20);
		 			pen.setDirection(0);
		 			pen.move(20);
		 			pen.setDirection(180);
		 			pen.move(10);
		 			pen.setDirection(270);
		 			pen.move(10);
		 			pen.setDirection(90);
		 			pen.move(20);
		 			pen.up();
		 			pen.setDirection(90);
		 			pen.move(17);
		 			pen.setDirection(0);
		 			pen.move(131);
		 			pen.down();
		 			
		 		}
		    	 else if(dealercard11==5)
		    	 {
		    			pen.up();
		    			pen.setDirection(90);
		    			pen.move(35);
		    			pen.setDirection(180);
		    			pen.move(10);
		    			pen.down();
		    			
		    			//draw 5 bottom
		    			pen.setColor(Color.black);
		    			pen.setDirection(180);
		    			pen.move(15);
		    			pen.setDirection(270);
		    			pen.move(12);
		    			pen.setDirection(220);
		    			pen.move(0);
		    			for (int count1=1; count1<=45; count1++)
		    			{
		    				pen.move(-1);
		    				pen.turn(-6);
		    			}
		    			pen.up();
		    			pen.setDirection(90);
		    			pen.move(110);
		    			pen.setDirection(180);
		    			pen.move(70);
		    			
		    			//draw heart
		    			pen.down();
		    			pen.setColor(Color.RED);
		    			for(int count1=1;count1<=360;count1++)
		    			{
		    				pen.move(20);
		    				pen.turn(180);
		    				pen.move(20);
		    				pen.turn(1);
		    			}
		    			pen.up();
		    			pen.setDirection(0);
		    			pen.move(40);
		    			pen.down();
		    			for(int count1=1;count1<=360;count1++)
		    			{
		    				pen.move(20);
		    				pen.turn(180);
		    				pen.move(20);
		    				pen.turn(1);
		    			}
		    			pen.up();
		    			pen.setDirection(0);
		    			pen.move(21);
		    			pen.setDirection(270);
		    			pen.move(3);
		    			pen.down();
		    			pen.setDirection(240);
		    			pen.move(75);
		    			pen.setDirection(125);
		    			pen.move(75);
		    			pen.setDirection(0);
		    			pen.move(7);
		    			pen.setWidth(6);
		    			pen.setDirection(270);
		    			pen.move(5);
		    			pen.setDirection(305);
		    			pen.move(62);
		    			pen.setDirection(60);
		    			pen.move(60);
		    			pen.setDirection(180);
		    			pen.move(60);
		    			pen.setDirection(305);
		    			pen.move(52);
		    			pen.setDirection(60);
		    			pen.move(52);
		    			pen.setDirection(180);
		    			pen.move(52);
		    			pen.setDirection(305);
		    			pen.move(44);
		    			pen.setDirection(60);
		    			pen.move(42);
		    			pen.setDirection(180);
		    			pen.move(43);
		    			pen.setDirection(305);
		    			pen.move(42);
		    			pen.setDirection(60);
		    			pen.move(42);
		    			pen.setDirection(180);
		    			pen.move(40);
		    			pen.setDirection(305);
		    			pen.move(32);
		    			pen.setDirection(60);
		    			pen.move(32);
		    			pen.setWidth(15);
		    			pen.setDirection(180);
		    			pen.move(24);
		    			pen.setDirection(300);
		    			pen.move(15);
		    			pen.setDirection(40);
		    			pen.move(2);
		    			
		    			//Draw 5 top
		    			pen.up();
		    			pen.setDirection(90);
		    			pen.move(85);
		    			pen.setDirection(180);
		    			pen.move(50);
		    			pen.setWidth(2);
		    			pen.down();
		    			pen.setColor(Color.black);
		    			pen.setDirection(180);
		    			pen.move(15);
		    			pen.setDirection(270);
		    			pen.move(12);
		    			pen.setDirection(220);
		    			pen.move(0);
		    			for (int count1=1; count1<=45; count1++)
		    			{
		    				pen.move(-1);
		    				pen.turn(-6);
		    			}
		    			pen.up();
		    			pen.setDirection(90);
		    			pen.move(36);
		    			pen.setDirection(0);
		    			pen.move(136);
		    			pen.down();
		    	 }
		    	 else if(dealercard11==6)
		    	 {
		    		//6 on bottom
		 			pen.up();
		 			pen.setColor(Color.black);
		 			pen.setWidth(2);
		 			
		 			pen.setDirection(180);
		 			pen.move(100);
		 			pen.setDirection(250);
		 			pen.move(0);
		 			
		 			pen.up();
		 			pen.setDirection(0);
		 			pen.move(78);
		 			pen.setDirection(90);
		 			pen.move(48);
		 			pen.setDirection(250);
		 			pen.move(0);
		 			pen.down();
		 			
		 			for(int count1=1; count1<7; count1++)
		 			{
		 				pen.move(5);
		 				pen.turn(2);
		 			}
		 			
		 			for(int count1=1; count1<100; count1++)
		 			{
		 				pen.move(1);
		 				pen.turn(7);
		 			}
		 			
		 			pen.up();
		 			pen.setColor(Color.black);
		 			pen.setDirection(90);
		 			pen.move(69);
		 			pen.setDirection(180);
		 			pen.move(67);
		 			pen.down();
		 			for(int count1=1;count1<=360;count1++)
		 			{
		 				pen.move(20);
		 				pen.turn(180);
		 				pen.move(20);
		 				pen.turn(1);
		 			}
		 			
		 			pen.up();
		 			pen.setColor(Color.black);
		 			pen.setDirection(0);
		 			pen.move(40);
		 			pen.down();
		 			for(int count1=1;count1<=360;count1++)
		 			{
		 				pen.move(20);
		 				pen.turn(180);
		 				pen.move(20);
		 				pen.turn(1);
		 			}
		 			pen.up();
		 			pen.setDirection(0);
		 			pen.move(17);
		 			pen.setDirection(90);
		 			pen.move(7);
		 			pen.down();
		 			pen.setWidth(7);
		 			pen.setDirection(125);
		 			pen.move(60);
		 			pen.setDirection(230);
		 			pen.move(60);
		 			pen.setDirection(0);
		 			pen.move(65);
		 			pen.setDirection(125);
		 			pen.move(45);
		 			pen.setDirection(230);
		 			pen.move(40);
		 			pen.setDirection(0);
		 			pen.move(41);
		 			pen.setDirection(125);
		 			pen.move(30);
		 			pen.setDirection(230);
		 			pen.move(25);
		 			pen.setDirection(0);
		 			pen.move(25);
		 			pen.setDirection(130);
		 			pen.move(15);
		 			pen.setDirection(263);
		 			pen.move(15);
		 			pen.setDirection(125);
		 			pen.move(15);
		 			
		 			//stem for spade
		 			pen.up();
		 			pen.setWidth(4);
		 			pen.setDirection(270);
		 			pen.move(35);
		 			pen.setDirection(0);
		 			pen.move(9);
		 			pen.down();
		 			pen.setDirection(260);
		 			pen.move(40);
		 			pen.setDirection(0);
		 			pen.move(15);
		 			pen.setDirection(100);
		 			pen.move(40);
		 			pen.setDirection(270);
		 			pen.move(37);
		 			pen.setDirection(180);
		 			pen.move(5);
		 			pen.setDirection(80);
		 			pen.move(35);
		 			pen.setDirection(265);
		 			pen.move(35);
		 			pen.setDirection(0);
		 			pen.move(6);
		 			pen.setDirection(100);
		 			pen.move(35);
		 			pen.setDirection(95);
		 			pen.move(50);
		 			
		 			//6 on top
		 			
		 			pen.up();
		 			pen.setColor(Color.black);
		 			pen.setWidth(2);
		 			
		 			pen.setDirection(180);
		 			pen.move(125);
		 			pen.setDirection(250);
		 			pen.move(0);
		 			
		 			pen.up();
		 			pen.setDirection(0);
		 			pen.move(78);
		 			pen.setDirection(90);
		 			pen.move(55);
		 			pen.setDirection(250);
		 			pen.move(0);
		 			pen.down();
		 			
		 			for(int count1=1; count1<7; count1++)
		 			{
		 				pen.move(5);
		 				pen.turn(2);
		 			}
		 			
		 			for(int count1=1; count1<100; count1++)
		 			{
		 				pen.move(1);
		 				pen.turn(7);
		 			}
		 			pen.up();
		 			pen.setDirection(90);
		 			pen.move(37);
		 			pen.setDirection(0);
		 			pen.move(134);
		 			pen.down();
		 		
		    	 }
		    	 else if(dealercard11==7)
		    	 {
		    		//bottom number 7
		 			
		 			pen.setColor(Color.black);
		 			pen.up();
		 			pen.setDirection(90);
		 			pen.move(40);
		 			pen.setDirection(180);
		 			pen.move(30);
		 			pen.down();
		 			pen.setDirection(0);
		 			pen.move(15);
		 			pen.setDirection(270);
		 			pen.move(30);

		 			
		 			
		 			
		 			//heart
		 			pen.up();
		 			pen.setDirection(180);
		 			pen.move(80);
		 			pen.setDirection(90);
		 			pen.move(107);
		 			pen.setColor(Color.RED);
		 			pen.down();
		 			for(int count1=1;count1<=360;count1++)
		 			{
		 				pen.move(20);
		 				pen.turn(180);
		 				pen.move(20);
		 				pen.turn(1);
		 			}
		 			pen.up();
		 			pen.setDirection(0);
		 			pen.move(40);
		 			pen.down();
		 			for(int count1=1;count1<=360;count1++)
		 			{
		 				pen.move(20);
		 				pen.turn(180);
		 				pen.move(20);
		 				pen.turn(1);
		 			}
		 			pen.up();
		 			pen.setDirection(0);
		 			pen.move(21);
		 			pen.setDirection(270);
		 			pen.move(3);
		 			pen.down();
		 			pen.setDirection(240);
		 			pen.move(75);
		 			pen.setDirection(125);
		 			pen.move(75);
		 			pen.setDirection(0);
		 			pen.move(7);
		 			pen.setWidth(6);
		 			pen.setDirection(270);
		 			pen.move(5);
		 			pen.setDirection(305);
		 			pen.move(62);
		 			pen.setDirection(60);
		 			pen.move(60);
		 			pen.setDirection(180);
		 			pen.move(60);
		 			pen.setDirection(305);
		 			pen.move(52);
		 			pen.setDirection(60);
		 			pen.move(52);
		 			pen.setDirection(180);
		 			pen.move(52);
		 			pen.setDirection(305);
		 			pen.move(44);
		 			pen.setDirection(60);
		 			pen.move(42);
		 			pen.setDirection(180);
		 			pen.move(43);
		 			pen.setDirection(305);
		 			pen.move(42);
		 			pen.setDirection(60);
		 			pen.move(42);
		 			pen.setDirection(180);
		 			pen.move(40);
		 			pen.setDirection(305);
		 			pen.move(32);
		 			pen.setDirection(60);
		 			pen.move(32);
		 			pen.setWidth(15);
		 			pen.setDirection(180);
		 			pen.move(24);
		 			pen.setDirection(300);
		 			pen.move(15);
		 			pen.setDirection(40);
		 			pen.move(2);
		 			
		 			//top 7 number
		 			pen.setWidth(2);
		 			pen.setColor(Color.black);
		 			pen.up();
		 			pen.setDirection(90);
		 			pen.move(85);
		 			pen.setDirection(180);
		 			pen.move(70);
		 			pen.down();
		 			pen.setDirection(0);
		 			pen.move(15);
		 			pen.setDirection(270);
		 			pen.move(30);
		 			pen.up();
		 			pen.setDirection(90);
		 			pen.move(43);
		 			pen.setDirection(0);
		 			pen.move(125);
		 			pen.down();
		 			 
		    	 }
		    	 else if(dealercard11==8)
		    	 {
		    		//draw number 8
		    		 pen.up();
		    			pen.setDirection(145);
		    			pen.move(20);
		    			pen.setColor(Color.black);
		    			pen.setWidth(2);
		    			pen.setDirection(45);
		    			pen.move(10);
		    			pen.setDirection(270);
		    			pen.move(5);
		    			pen.setDirection(180);
		    			pen.move(5);
		    			pen.setDirection(90);
		    			pen.move(3);
		    			pen.down();
		    			
		    			
		    			
		    			for(int count1=1; count1<100; count1++)
		    			{
		    				pen.move(1);
		    				pen.turn(7);
		    			}
		    			
		    			pen.up();
		    			pen.setDirection(90);
		    			pen.move(20);
		    			pen.down();
		    			for(int count1=1; count1<100; count1++)
		    			{
		    				pen.move(1);
		    				pen.turn(7);
		    			}
		    			pen.setColor(Color.black);
		    			pen.up();
		    			pen.setDirection(0);
		    			pen.setDirection(90);
		    			pen.move(100);
		    			pen.setDirection(270);
		    			pen.move(65);
		    			pen.setDirection(90);
		    			pen.move(35);
		    			pen.setDirection(180);
		    			pen.move(37.5);
		    			pen.down();
		    			for(int count1=1;count1<=360;count1++)
		    			{
		    				pen.move(20);
		    				pen.turn(180);
		    				pen.move(20);
		    				pen.turn(1);
		    			}
		    			
		    			pen.up();
		    			pen.setColor(Color.black);
		    			pen.setDirection(180);
		    			pen.move(40);
		    			
		    			
		    			pen.down();
		    			for(int count1=1;count1<=360;count1++)
		    			{
		    				pen.move(20);
		    				pen.turn(180);
		    				pen.move(20);
		    				pen.turn(1);
		    			}
		    			pen.up();
		    			pen.setColor(Color.black);
		    			pen.setDirection(90);
		    			pen.move(30);
		    			pen.setDirection(0);
		    			pen.move(20);
		    			pen.down();
		    			for(int count1=1;count1<=360;count1++)
		    			{
		    				pen.move(20);
		    				pen.turn(180);
		    				pen.move(20);
		    				pen.turn(1);
		    			}
		    			//steam
		    			
		    			pen.up();
		    			pen.setDirection(270);
		    			pen.move(38);
		    			pen.down();
		    			pen.setColor(Color.black);
		    			pen.setDirection(255);
		    			pen.move(35);
		    			pen.setDirection(0);
		    			pen.move(20);
		    			pen.setDirection(107);
		    			pen.move(35);
		    			pen.setWidth(5);
		    			pen.setDirection(180);
		    			pen.move(3);
		    			pen.setDirection(287);
		    			pen.move(33);
		    			pen.setDirection(180);
		    			pen.move(15);
		    			pen.setDirection(75);
		    			pen.move(30);
		    			pen.setDirection(0);
		    			pen.move(1);
		    			pen.setDirection(270);
		    			pen.move(3);
		    			pen.setDirection(255);
		    			pen.move(22);
		    			pen.setWidth(7);
		    			pen.setDirection(0);
		    			pen.move(10);
		    			pen.setDirection(135);
		    			pen.move(5);
		    			pen.setDirection(90);
		    			pen.move(3);
		    			pen.setDirection(315);
		    			pen.move(4);
		    			
		    			//top number
		    			pen.up();
		    			pen.setDirection(90);
		    			pen.move(94);
		    			pen.setDirection(180);
		    			pen.move(50);
		    			pen.setColor(Color.black);
		    			pen.setWidth(2);
		    			pen.setDirection(45);
		    			pen.move(10);
		    			pen.setDirection(270);
		    			pen.move(5);
		    			pen.setDirection(180);
		    			pen.move(5);
		    			pen.setDirection(90);
		    			pen.move(3);
		    			pen.down();
		    			
		    			
		    			
		    			for(int count1=1; count1<100; count1++)
		    			{
		    				pen.move(1);
		    				pen.turn(7);
		    			}
		    			
		    			pen.up();
		    			pen.setDirection(90);
		    			pen.move(20);
		    			pen.down();
		    			for(int count1=1; count1<100; count1++)
		    			{
		    				pen.move(1);
		    				pen.turn(7);
		    			}
		    			pen.up();
		    			pen.setDirection(90);
		    			pen.move(20);
		    			pen.setDirection(0);
		    			pen.move(120);
		    			pen.down();
		    	 }
		    	 else if(dealercard11==9)
		    	 {
		    			pen.setDirection(180);
		    			pen.move(75);
		    			pen.setDirection(90);
		    			pen.move(150);
		    			pen.setWidth(2);
		    			pen.setColor(Color.red);
		    			pen.down();
		    			pen.setDirection(290);
		    			pen.move(60);
		    			pen.setDirection(250);
		    			pen.move(60);
		    			pen.setDirection(110);
		    			pen.move(60);
		    			pen.setDirection(70);
		    			pen.move(60);
		    			
		    			//fill in
		    			pen.up();
		    			pen.setDirection(270);
		    			pen.move(3);
		    			pen.down();
		    			pen.setWidth(3);
		    			pen.setDirection(290);
		    			pen.move(59);
		    			pen.setDirection(250);
		    			pen.move(57);
		    			pen.setDirection(110);
		    			pen.move(58);
		    			pen.setDirection(70);
		    			pen.move(55);
		    			
		    			pen.setDirection(290);
		    			pen.move(55);
		    			pen.setDirection(250);
		    			pen.move(51);
		    			pen.setDirection(110);
		    			pen.move(55);
		    			pen.setDirection(70);
		    			pen.move(49);
		    			
		    			pen.setWidth(5);
		    			pen.setDirection(290);
		    			pen.move(55);
		    			pen.setDirection(250);
		    			pen.move(51);
		    			pen.setDirection(110);
		    			pen.move(55);
		    			pen.setDirection(70);
		    			pen.move(53);
		    		
		    			
		    			pen.setDirection(270);
		    			pen.move(92);
		    			pen.setDirection(0);
		    			pen.move(3);
		    			pen.setDirection(90);
		    			pen.move(83);
		    			pen.setDirection(300);
		    			pen.move(4);
		    			pen.setDirection(270);
		    			pen.move(75);
		    			pen.setDirection(75);
		    			pen.move(4);
		    			pen.setDirection(90);
		    			pen.move(65);
		    			pen.setDirection(272);
		    			pen.move(7);
		    			pen.setWidth(10);
		    			pen.setDirection(270);
		    			pen.move(50);
		    			pen.setDirection(65);
		    			pen.move(11);
		    			pen.setDirection(90);
		    			pen.move(20);
		    			pen.setDirection(180);
		    			pen.move(23);
		    			pen.setDirection(70);
		    			pen.move(29);
		    			pen.setDirection(270);
		    			pen.move(62);
		    			pen.setDirection(105);
		    			pen.move(30);
		    			
		    			//nine number on bottom
		    			pen.up();
		    			pen.setDirection(270);
		    			pen.move(72);
		    			pen.setDirection(0);
		    			pen.move(65);
		    			
		    			pen.setColor(Color.black);
		    			pen.setWidth(2);
		    			pen.down();
		    			for(int count1=1; count1<100; count1++)
		    			{
		    				pen.move(1);
		    				pen.turn(7);
		    			}
		    			pen.setDirection(0);
		    			pen.move(12);
		    			pen.setDirection(90);
		    			pen.move(2);
		    			pen.setDirection(270);
		    			pen.move(17);
		    			
		    			//9 on top
		    			pen.up();
		    			pen.setDirection(90);
		    			pen.move(185);
		    			pen.setDirection(180);
		    			pen.move(120);
		    			
		    			pen.setColor(Color.black);
		    			pen.setWidth(2);
		    			pen.down();
		    			for(int count1=1; count1<100; count1++)
		    			{
		    				pen.move(1);
		    				pen.turn(7);
		    			}
		    			pen.up();
		    			pen.setDirection(0);
		    			pen.move(4);
		    			pen.setDirection(270);
		    			pen.move(12);
		    			pen.down();
		    			pen.setDirection(270);
		    			pen.move(17);
		    			pen.up();
		    			pen.setDirection(90);
		    			pen.move(38);
		    			pen.setDirection(0);
		    			pen.move(124);
		    			pen.down();
		    	 }
		    	 else if(dealercard11==10)
		    	 {
		    		//draw 10 bottom
		 			pen.up();
		 			pen.setColor(Color.black);
		 			pen.setWidth(2);
		 			pen.setDirection(90);
		 			pen.move(30);
		 			pen.setDirection(180);
		 			pen.move(35);
		 			pen.down();
		 			pen.setDirection(270);
		 			pen.move(25);
		 			pen.up();
		 			pen.setDirection(90);
		 			pen.move(0);
		 			pen.setDirection(0);
		 			pen.move(18);
		 			
		 			pen.down();
		 			for(int count1=1; count1<100; count1++)
		 			{
		 				pen.move(1);
		 				pen.turn(4.5);
		 			}
		 			pen.up();
		 			pen.setDirection(90);
		 			pen.move(110);
		 			pen.setDirection(180);
		 			pen.move(50);
		 			
		 			pen.setColor(Color.black);
		 			pen.up();
		 			pen.setDirection(0);
		 			pen.setDirection(270);
		 			pen.move(65);
		 			pen.setDirection(90);
		 			pen.move(35);
		 			pen.setDirection(180);
		 			pen.move(2);
		 			pen.down();
		 			for(int count1=1;count1<=360;count1++)
		 			{
		 				pen.move(20);
		 				pen.turn(180);
		 				pen.move(20);
		 				pen.turn(1);
		 			}
		 			
		 			pen.up();
		 			pen.setColor(Color.black);
		 			pen.setDirection(180);
		 			pen.move(40);
		 			
		 			
		 			pen.down();
		 			for(int count1=1;count1<=360;count1++)
		 			{
		 				pen.move(20);
		 				pen.turn(180);
		 				pen.move(20);
		 				pen.turn(1);
		 			}
		 			pen.up();
		 			pen.setColor(Color.black);
		 			pen.setDirection(90);
		 			pen.move(30);
		 			pen.setDirection(0);
		 			pen.move(20);
		 			pen.down();
		 			for(int count1=1;count1<=360;count1++)
		 			{
		 				pen.move(20);
		 				pen.turn(180);
		 				pen.move(20);
		 				pen.turn(1);
		 			}
		 			//steam
		 			
		 			pen.up();
		 			pen.setDirection(270);
		 			pen.move(38);
		 			pen.down();
		 			pen.setColor(Color.black);
		 			pen.setDirection(255);
		 			pen.move(35);
		 			pen.setDirection(0);
		 			pen.move(20);
		 			pen.setDirection(107);
		 			pen.move(35);
		 			pen.setWidth(5);
		 			pen.setDirection(180);
		 			pen.move(3);
		 			pen.setDirection(287);
		 			pen.move(33);
		 			pen.setDirection(180);
		 			pen.move(15);
		 			pen.setDirection(75);
		 			pen.move(30);
		 			pen.setDirection(0);
		 			pen.move(1);
		 			pen.setDirection(270);
		 			pen.move(3);
		 			pen.setDirection(255);
		 			pen.move(22);
		 			pen.setWidth(7);
		 			pen.setDirection(0);
		 			pen.move(10);
		 			pen.setDirection(135);
		 			pen.move(5);
		 			pen.setDirection(90);
		 			pen.move(3);
		 			pen.setDirection(315);
		 			pen.move(4);
		 			
		 			//draw 10 on top
		 			pen.up();
		 			pen.setDirection(90);
		 			pen.move(125);
		 			pen.setDirection(180);
		 			pen.move(70);
		 			pen.down();
		 			pen.setWidth(2);
		 			pen.setDirection(270);
		 			pen.move(25);
		 			pen.up();
		 			pen.setDirection(90);
		 			pen.move(0);
		 			pen.setDirection(0);
		 			pen.move(17);
		 			
		 			pen.down();
		 			for(int count1=1; count1<100; count1++)
		 			{
		 				pen.move(1);
		 				pen.turn(4.5);
		 			}
		 			pen.up();
		 			pen.setDirection(90);
		 			pen.move(25);
		 			pen.setDirection(0);
		 			pen.move(110);
		 			pen.down();
		    	 }
		 			else if(dealercard11==11)
		 			{
		 				pen.up();
		 				pen.setDirection(90);
		 				pen.move(40);
		 				pen.setDirection(180);
		 				pen.move(15);
		 				pen.down();
		 				
		 				//draw j on bottom
		 				pen.setColor(Color.black);
		 				pen.setDirection(180);
		 				pen.move(10);
		 				pen.setDirection(0);
		 				pen.move(20);
		 				pen.setDirection(180);
		 				pen.move(10);
		 				pen.setDirection(270);
		 				pen.move(25);
		 				pen.setDirection(90);
		 				pen.move(0);
		 				for (int count1=1; count1<=25; count1++)
		 				{
		 					pen.move(-1);
		 					pen.turn(-8);
		 				}
		 				pen.up();
		 				pen.setDirection(90);
		 				pen.move(100);
		 				pen.setDirection(180);
		 				pen.move(67);
		 				
		 				//draw heart
		 				pen.setColor(Color.RED);
		 				pen.down();
		 				for(int count1=1;count1<=360;count1++)
		 				{
		 					pen.move(20);
		 					pen.turn(180);
		 					pen.move(20);
		 					pen.turn(1);
		 				}
		 				pen.up();
		 				pen.setDirection(0);
		 				pen.move(40);
		 				pen.down();
		 				for(int count1=1;count1<=360;count1++)
		 				{
		 					pen.move(20);
		 					pen.turn(180);
		 					pen.move(20);
		 					pen.turn(1);
		 				}
		 				pen.up();
		 				pen.setDirection(0);
		 				pen.move(21);
		 				pen.setDirection(270);
		 				pen.move(3);
		 				pen.down();
		 				pen.setDirection(240);
		 				pen.move(75);
		 				pen.setDirection(125);
		 				pen.move(75);
		 				pen.setDirection(0);
		 				pen.move(7);
		 				pen.setWidth(6);
		 				pen.setDirection(270);
		 				pen.move(5);
		 				pen.setDirection(305);
		 				pen.move(62);
		 				pen.setDirection(60);
		 				pen.move(60);
		 				pen.setDirection(180);
		 				pen.move(60);
		 				pen.setDirection(305);
		 				pen.move(52);
		 				pen.setDirection(60);
		 				pen.move(52);
		 				pen.setDirection(180);
		 				pen.move(52);
		 				pen.setDirection(305);
		 				pen.move(44);
		 				pen.setDirection(60);
		 				pen.move(42);
		 				pen.setDirection(180);
		 				pen.move(43);
		 				pen.setDirection(305);
		 				pen.move(42);
		 				pen.setDirection(60);
		 				pen.move(42);
		 				pen.setDirection(180);
		 				pen.move(40);
		 				pen.setDirection(305);
		 				pen.move(32);
		 				pen.setDirection(60);
		 				pen.move(32);
		 				pen.setWidth(15);
		 				pen.setDirection(180);
		 				pen.move(24);
		 				pen.setDirection(300);
		 				pen.move(15);
		 				pen.setDirection(40);
		 				pen.move(2);
		 				pen.up();
		 				pen.setDirection(90);
		 				pen.move(88);
		 				pen.setDirection(180);
		 				pen.move(53);
		 				
		 				// draw j on top
		 				pen.down();
		 				pen.setWidth(2);
		 				pen.setColor(Color.black);
		 				pen.setDirection(180);
		 				pen.move(10);
		 				pen.setDirection(0);
		 				pen.move(20);
		 				pen.setDirection(180);
		 				pen.move(10);
		 				pen.setDirection(270);
		 				pen.move(25);
		 				pen.setDirection(90);
		 				pen.move(0);
		 				for (int count1=1; count1<=25; count1++)
		 				{
		 					pen.move(-1);
		 					pen.turn(-8);
		 				}
		 				pen.up();
		 				pen.setDirection(90);
		 				pen.move(35);
		 				pen.setDirection(0);
		 				pen.move(139);
		 				pen.down();
		 			}
		 			else if(dealercard11==12)
		 			{
		 				pen.up();
		 				pen.setDirection(90);
		 				pen.move(35);
		 				pen.setDirection(180);
		 				pen.move(30);
		 				pen.down();
		 				
		 				// draw Q bottom
		 				pen.setColor(Color.black);
		 				for (int count1=1; count1<=150; count1++)
		 				{
		 					pen.move(1);
		 					pen.turn(4);
		 				}
		 				pen.setDirection(325);
		 				pen.move(10);
		 				pen.setDirection(145);
		 				pen.move(20);
		 				pen.up();
		 				pen.setDirection(90);
		 				pen.move(75);
		 				pen.setDirection(180);
		 				pen.move(30);
		 				
		 				//draw club
		 				
		 				pen.setColor(Color.black);
		 				pen.down();
		 				for(int count1=1;count1<=360;count1++)
		 				{
		 					pen.move(20);
		 					pen.turn(180);
		 					pen.move(20);
		 					pen.turn(1);
		 				}
		 				
		 				pen.up();
		 				pen.setColor(Color.black);
		 				pen.setDirection(180);
		 				pen.move(40);
		 				
		 				
		 				pen.down();
		 				for(int count1=1;count1<=360;count1++)
		 				{
		 					pen.move(20);
		 					pen.turn(180);
		 					pen.move(20);
		 					pen.turn(1);
		 				}
		 				pen.up();
		 				pen.setColor(Color.black);
		 				pen.setDirection(90);
		 				pen.move(30);
		 				pen.setDirection(0);
		 				pen.move(20);
		 				pen.down();
		 				for(int count1=1;count1<=360;count1++)
		 				{
		 					pen.move(20);
		 					pen.turn(180);
		 					pen.move(20);
		 					pen.turn(1);
		 				}
		 				//steam
		 				
		 				pen.up();
		 				pen.setDirection(270);
		 				pen.move(38);
		 				pen.down();
		 				pen.setColor(Color.black);
		 				pen.setDirection(255);
		 				pen.move(35);
		 				pen.setDirection(0);
		 				pen.move(20);
		 				pen.setDirection(107);
		 				pen.move(35);
		 				pen.setWidth(5);
		 				pen.setDirection(180);
		 				pen.move(3);
		 				pen.setDirection(287);
		 				pen.move(33);
		 				pen.setDirection(180);
		 				pen.move(15);
		 				pen.setDirection(75);
		 				pen.move(30);
		 				pen.setDirection(0);
		 				pen.move(1);
		 				pen.setDirection(270);
		 				pen.move(3);
		 				pen.setDirection(255);
		 				pen.move(22);
		 				pen.setWidth(7);
		 				pen.setDirection(0);
		 				pen.move(10);
		 				pen.setDirection(135);
		 				pen.move(5);
		 				pen.setDirection(90);
		 				pen.move(3);
		 				pen.setDirection(315);
		 				pen.move(4);
		 				
		 				pen.up();
		 				pen.setDirection(90);
		 				pen.move(130);
		 				pen.setDirection(180);
		 				pen.move(55);
		 				
		 				//Draw Q top
		 				pen.down();
		 				pen.setColor(Color.black);
		 				pen.setWidth(2);
		 				for (int count1=1; count1<=150; count1++)
		 				{
		 					pen.move(1);
		 					pen.turn(4);
		 				}
		 				pen.setDirection(325);
		 				pen.move(10);
		 				pen.setDirection(145);
		 				pen.move(20);
		 				pen.up();
		 				pen.setDirection(90);
		 				pen.move(23);
		 				pen.setDirection(0);
		 				pen.move(123);
		 				pen.down();
		 			}
		 			else if(dealercard11==13)
		 			{
		 				pen.up();
		 				pen.setDirection(90);
		 				pen.move(35);
		 				pen.setDirection(180);
		 				pen.move(23);
		 				pen.down();
		 				
		 				//Draw K bottom
		 				pen.setColor(Color.black);
		 				pen.setDirection(270);
		 				pen.move(30);
		 				pen.up();
		 				pen.setDirection(0);
		 				pen.move(15);
		 				pen.down();
		 				pen.setDirection(135);
		 				pen.move(20);
		 				pen.setDirection(45);
		 				pen.move(20);
		 				pen.up();
		 				pen.setDirection(90);
		 				pen.move(120);
		 				pen.setDirection(180);
		 				pen.move(65);
		 				pen.down();
		 				
		 				//draw diamond
		 				pen.setColor(Color.red);
		 				pen.setDirection(290);
		 				pen.move(60);
		 				pen.setDirection(250);
		 				pen.move(60);
		 				pen.setDirection(110);
		 				pen.move(60);
		 				pen.setDirection(70);
		 				pen.move(60);
		 				
		 				//fill in
		 				pen.up();
		 				pen.setDirection(270);
		 				pen.move(3);
		 				pen.down();
		 				pen.setWidth(3);
		 				pen.setDirection(290);
		 				pen.move(59);
		 				pen.setDirection(250);
		 				pen.move(57);
		 				pen.setDirection(110);
		 				pen.move(58);
		 				pen.setDirection(70);
		 				pen.move(55);
		 				
		 				pen.setDirection(290);
		 				pen.move(55);
		 				pen.setDirection(250);
		 				pen.move(51);
		 				pen.setDirection(110);
		 				pen.move(55);
		 				pen.setDirection(70);
		 				pen.move(49);
		 				
		 				pen.setWidth(5);
		 				pen.setDirection(290);
		 				pen.move(55);
		 				pen.setDirection(250);
		 				pen.move(51);
		 				pen.setDirection(110);
		 				pen.move(55);
		 				pen.setDirection(70);
		 				pen.move(53);
		 			
		 				
		 				pen.setDirection(270);
		 				pen.move(92);
		 				pen.setDirection(0);
		 				pen.move(3);
		 				pen.setDirection(90);
		 				pen.move(83);
		 				pen.setDirection(300);
		 				pen.move(4);
		 				pen.setDirection(270);
		 				pen.move(75);
		 				pen.setDirection(75);
		 				pen.move(4);
		 				pen.setDirection(90);
		 				pen.move(65);
		 				pen.setDirection(272);
		 				pen.move(7);
		 				pen.setWidth(10);
		 				pen.setDirection(270);
		 				pen.move(50);
		 				pen.setDirection(65);
		 				pen.move(11);
		 				pen.setDirection(90);
		 				pen.move(20);
		 				pen.setDirection(180);
		 				pen.move(23);
		 				pen.setDirection(70);
		 				pen.move(29);
		 				pen.setDirection(270);
		 				pen.move(62);
		 				pen.setDirection(105);
		 				pen.move(30);
		 				pen.up();
		 				pen.setDirection(90);
		 				pen.move(95);
		 				pen.setDirection(180);
		 				pen.move(55);
		 				
		 				//Draw K top
		 				pen.down();
		 				pen.setWidth(2);
		 				pen.setColor(Color.black);
		 				pen.setDirection(270);
		 				pen.move(30);
		 				pen.up();
		 				pen.setDirection(0);
		 				pen.move(15);
		 				pen.down();
		 				pen.setDirection(135);
		 				pen.move(20);
		 				pen.setDirection(45);
		 				pen.move(20);
		 				pen.up();
		 				pen.setDirection(90);
		 				pen.move(10);
		 				pen.setDirection(0);
		 				pen.move(123);
		 				pen.down();
		 			}
		return dealercard11;
		
		
	}

	public int Dcard1(int dealercard21, StandardPen pen)

	{
		KeyboardReader reader = new KeyboardReader();
		
		Random generator = new Random();
		//outside of card
				pen.setWidth(2);
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
				
				pen.setColor(Color.orange);
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
				
				 if(dealercard21==1)
		    	 {
		    		 pen.setColor(Color.black);
		 			pen.up();
		 			pen.setDirection(180);
		 			pen.move(30);
		 			pen.setDirection(90);
		 			pen.move(8);
		 			pen.down();
		 			pen.setDirection(70);
		 			pen.move(30);
		 			pen.setDirection(290);
		 			pen.move(30);
		 			pen.setDirection(110);
		 			pen.move(15);
		 			pen.setDirection(180);
		 			pen.move(9);
		 			pen.up();
					pen.setColor(Color.black);
					pen.setDirection(90);
					pen.move(69);
					pen.setDirection(180);
					pen.move(72);
					pen.down();
					for(int count1=1;count1<=360;count1++)
					{
						pen.move(20);
						pen.turn(180);
						pen.move(20);
						pen.turn(1);
					}
					
					pen.up();
					pen.setColor(Color.black);
					pen.setDirection(0);
					pen.move(40);
					pen.down();
					for(int count1=1;count1<=360;count1++)
					{
						pen.move(20);
						pen.turn(180);
						pen.move(20);
						pen.turn(1);
					}
					pen.up();
					pen.setDirection(0);	
					pen.move(17);
					pen.setDirection(90);
					pen.move(7);
					pen.down();
					pen.setWidth(7);
					pen.setDirection(125);
					pen.move(60);
					pen.setDirection(230);
					pen.move(60);
					pen.setDirection(0);
					pen.move(65);
					pen.setDirection(125);
					pen.move(45);
					pen.setDirection(230);
					pen.move(40);
					pen.setDirection(0);
					pen.move(41);
					pen.setDirection(125);
					pen.move(30);
					pen.setDirection(230);
					pen.move(25);
					pen.setDirection(0);
					pen.move(25);
					pen.setDirection(130);
					pen.move(15);
					pen.setDirection(263);
					pen.move(15);
					pen.setDirection(125);
					pen.move(15);
					
					//stem for spade
					pen.up();
					pen.setWidth(4);
					pen.setDirection(270);
					pen.move(35);
					pen.setDirection(0);
					pen.move(9);
					pen.down();
					pen.setDirection(260);
					pen.move(40);
					pen.setDirection(0);
					pen.move(15);
					pen.setDirection(100);
					pen.move(40);
					pen.setDirection(270);
					pen.move(37);
					pen.setDirection(180);
					pen.move(5);
					pen.setDirection(80);
					pen.move(35);
					pen.setDirection(265);
					pen.move(35);
					pen.setDirection(0);
					pen.move(6);
					pen.setDirection(100);
					pen.move(35);
					pen.setDirection(95);
					pen.move(50);
					
					//ace on top
					pen.up();
					pen.setDirection(180);
					pen.move(100);
					pen.setDirection(90);
					pen.move(100);
					pen.down();
					
					pen.setWidth(2);
					pen.setColor(Color.black);
					pen.up();
					pen.setDirection(0);
					pen.move(40);
					pen.setDirection(270);
					pen.move(70);
					pen.down();
					pen.setDirection(70);
					pen.move(30);
					pen.setDirection(290);
					pen.move(30);
					pen.setDirection(110);
					pen.move(15);
					pen.setDirection(180);
					pen.move(9);
					pen.up();
					pen.setDirection(90);
					pen.move(22);
					pen.setDirection(0);
					pen.move(136);
					pen.down();
		    	 }
		    	 else if(dealercard21==2)
		    	 {
		    			pen.up();
		    			pen.setDirection(90);
		    			pen.move(32);
		    			pen.setDirection(180);
		    			pen.move(35);
		    			pen.down();
		    			pen.setDirection(200);
		    			pen.move(0);
		    			
		    			// draw 2 bottom
		    			pen.setColor(Color.black);
		    			for (int count1=1; count1<=20; count1++)
		    			{
		    				pen.move(-1);
		    				pen.turn(-5);
		    			}
		    			pen.setDirection(235);
		    			pen.move(20);
		    			pen.setDirection(0);
		    			pen.move(20);
		    			pen.up();
		    			pen.setDirection(90);
		    			pen.move(110);
		    			pen.setDirection(180);
		    			pen.move(85);
		    			pen.down();
		    			
		    			//draw heart
		    			pen.setColor(Color.RED);
		    			for(int count1=1;count1<=360;count1++)
		    			{
		    				pen.move(20);
		    				pen.turn(180);
		    				pen.move(20);
		    				pen.turn(1);
		    			}
		    			pen.up();
		    			pen.setDirection(0);
		    			pen.move(40);
		    			pen.down();
		    			for(int count1=1;count1<=360;count1++)
		    			{
		    				pen.move(20);
		    				pen.turn(180);
		    				pen.move(20);
		    				pen.turn(1);
		    			}
		    			pen.up();
		    			pen.setDirection(0);
		    			pen.move(21);
		    			pen.setDirection(270);
		    			pen.move(3);
		    			pen.down();
		    			pen.setDirection(240);
		    			pen.move(75);
		    			pen.setDirection(125);
		    			pen.move(75);
		    			pen.setDirection(0);
		    			pen.move(7);
		    			pen.setWidth(6);
		    			pen.setDirection(270);
		    			pen.move(5);
		    			pen.setDirection(305);
		    			pen.move(62);
		    			pen.setDirection(60);
		    			pen.move(60);
		    			pen.setDirection(180);
		    			pen.move(60);
		    			pen.setDirection(305);
		    			pen.move(52);
		    			pen.setDirection(60);
		    			pen.move(52);
		    			pen.setDirection(180);
		    			pen.move(52);
		    			pen.setDirection(305);
		    			pen.move(44);
		    			pen.setDirection(60);
		    			pen.move(42);
		    			pen.setDirection(180);
		    			pen.move(43);
		    			pen.setDirection(305);
		    			pen.move(42);
		    			pen.setDirection(60);
		    			pen.move(42);
		    			pen.setDirection(180);
		    			pen.move(40);
		    			pen.setDirection(305);
		    			pen.move(32);
		    			pen.setDirection(60);
		    			pen.move(32);
		    			pen.setWidth(15);
		    			pen.setDirection(180);
		    			pen.move(24);
		    			pen.setDirection(300);
		    			pen.move(15);
		    			pen.setDirection(40);
		    			pen.move(2);
		    			pen.up();
		    			
		    			//draw 2 top
		    			pen.setDirection(90);
		    			pen.move(90);
		    			pen.setDirection(180);
		    			pen.move(65);
		    			pen.setDirection(200);
		    			pen.move(0);
		    			pen.down();
		    			pen.setColor(Color.black);
		    			pen.setWidth(2);
		    			for (int count1=1; count1<=20; count1++)
		    			{
		    				pen.move(-1);
		    				pen.turn(-5);
		    			}
		    			pen.setDirection(235);
		    			pen.move(20);
		    			pen.setDirection(0);
		    			pen.move(20);
		    			pen.up();
		    			pen.setDirection(90);
		    			pen.move(33);
		    			pen.setDirection(0);
		    			pen.move(112);
		    			pen.down();
		    	 }
		    	 else if(dealercard21==3)
		    	 {
		    		 pen.up();
		 			pen.setDirection(90);
		 			pen.move(39);
		 			pen.setDirection(180);
		 			pen.move(30);
		 			pen.setDirection(220);
		 			pen.move(0);
		 			pen.down();
		 			//draw 3 on bottom
		 			pen.setColor(Color.black);
		 			for (int count1=1; count1<=40; count1++)
		 			{
		 				pen.move(-1);
		 				pen.turn(-6);
		 			}
		 			pen.setDirection(220);
		 			pen.move(0);
		 			for (int count1=1; count1<=45; count1++)
		 			{
		 				pen.move(-1);
		 				pen.turn(-6);
		 			}
		 			pen.up();
		 			pen.setDirection(90);
		 			pen.move(80);
		 			pen.setDirection(180);
		 			pen.move(68);
		 			
		 			//draw spade
		 			pen.down();
		 			for(int count1=1;count1<=360;count1++)
		 			{
		 				pen.move(20);
		 				pen.turn(180);
		 				pen.move(20);
		 				pen.turn(1);
		 			}
		 			
		 			pen.up();
		 			pen.setColor(Color.black);
		 			pen.setDirection(0);
		 			pen.move(40);
		 			pen.down();
		 			for(int count1=1;count1<=360;count1++)
		 			{
		 				pen.move(20);
		 				pen.turn(180);
		 				pen.move(20);
		 				pen.turn(1);
		 			}
		 			pen.up();
		 			pen.setDirection(0);
		 			pen.move(17);
		 			pen.setDirection(90);
		 			pen.move(7);
		 			pen.down();
		 			pen.setWidth(7);
		 			pen.setDirection(125);
		 			pen.move(60);
		 			pen.setDirection(230);
		 			pen.move(60);
		 			pen.setDirection(0);
		 			pen.move(65);
		 			pen.setDirection(125);
		 			pen.move(45);
		 			pen.setDirection(230);
		 			pen.move(40);
		 			pen.setDirection(0);
		 			pen.move(41);
		 			pen.setDirection(125);
		 			pen.move(30);
		 			pen.setDirection(230);
		 			pen.move(25);
		 			pen.setDirection(0);
		 			pen.move(25);
		 			pen.setDirection(130);
		 			pen.move(15);
		 			pen.setDirection(263);
		 			pen.move(15);
		 			pen.setDirection(125);
		 			pen.move(15);
		 			
		 			//stem for spade
		 			pen.up();
		 			pen.setWidth(4);
		 			pen.setDirection(270);
		 			pen.move(35);
		 			pen.setDirection(0);
		 			pen.move(9);
		 			pen.down();
		 			pen.setDirection(260);
		 			pen.move(40);
		 			pen.setDirection(0);
		 			pen.move(15);
		 			pen.setDirection(100);
		 			pen.move(40);
		 			pen.setDirection(270);
		 			pen.move(37);
		 			pen.setDirection(180);
		 			pen.move(5);
		 			pen.setDirection(80);
		 			pen.move(35);
		 			pen.setDirection(265);
		 			pen.move(35);
		 			pen.setDirection(0);
		 			pen.move(6);
		 			pen.setDirection(100);
		 			pen.move(35);
		 			pen.setDirection(95);
		 			pen.move(50);
		 			pen.up();
		 			pen.setDirection(90);
		 			pen.move(55);
		 			pen.setDirection(180);
		 			pen.move(55);
		 			pen.setDirection(220);
		 			pen.move(0);
		 			pen.down();
		 			pen.setWidth(2);
		 			
		 			//draw 3 top
		 			pen.setColor(Color.black);
		 			for (int count1=1; count1<=40; count1++)
		 			{
		 				pen.move(-1);
		 				pen.turn(-6);
		 			}
		 			pen.setDirection(220);
		 			pen.move(0);
		 			for (int count1=1; count1<=45; count1++)
		 			{
		 				pen.move(-1);
		 				pen.turn(-6);
		 			}
		 			pen.up();
		 			pen.setDirection(90);
		 			pen.move(42);
		 			pen.setDirection(0);
		 			pen.move(132);
		 			pen.down();
		    	 }
		    	 else if(dealercard21==4)
		 			{
		    		//draw 4 bottom
		 			pen.up();
		 			pen.setDirection(90);
		 			pen.move(35);
		 			pen.setDirection(180);
		 			pen.move(25);
		 			pen.down();
		 			pen.setColor(Color.black);
		 			pen.setDirection(270);
		 			pen.move(20);
		 			pen.setDirection(0);
		 			pen.move(20);
		 			pen.setDirection(180);
		 			pen.move(10);
		 			pen.setDirection(270);
		 			pen.move(10);
		 			pen.setDirection(90);
		 			pen.move(20);
		 			
		 			// draw diamond
		 			pen.up();
		 			pen.setDirection(180);
		 			pen.move(60);
		 			pen.setDirection(90);
		 			pen.move(125);
		 			pen.setWidth(2);
		 			pen.setColor(Color.red);
		 			pen.down();
		 			pen.setDirection(290);
		 			pen.move(60);
		 			pen.setDirection(250);
		 			pen.move(60);
		 			pen.setDirection(110);
		 			pen.move(60);
		 			pen.setDirection(70);
		 			pen.move(60);
		 			
		 			//fill in
		 			pen.up();
		 			pen.setDirection(270);
		 			pen.move(3);
		 			pen.down();
		 			pen.setWidth(3);
		 			pen.setDirection(290);
		 			pen.move(59);
		 			pen.setDirection(250);
		 			pen.move(57);
		 			pen.setDirection(110);
		 			pen.move(58);
		 			pen.setDirection(70);
		 			pen.move(55);
		 			
		 			pen.setDirection(290);
		 			pen.move(55);
		 			pen.setDirection(250);
		 			pen.move(51);
		 			pen.setDirection(110);
		 			pen.move(55);
		 			pen.setDirection(70);
		 			pen.move(49);
		 			
		 			pen.setWidth(5);
		 			pen.setDirection(290);
		 			pen.move(55);
		 			pen.setDirection(250);
		 			pen.move(51);
		 			pen.setDirection(110);
		 			pen.move(55);
		 			pen.setDirection(70);
		 			pen.move(53);
		 		
		 			
		 			pen.setDirection(270);
		 			pen.move(92);
		 			pen.setDirection(0);
		 			pen.move(3);
		 			pen.setDirection(90);
		 			pen.move(83);
		 			pen.setDirection(300);
		 			pen.move(4);
		 			pen.setDirection(270);
		 			pen.move(75);
		 			pen.setDirection(75);
		 			pen.move(4);
		 			pen.setDirection(90);
		 			pen.move(65);
		 			pen.setDirection(272);
		 			pen.move(7);
		 			pen.setWidth(10);
		 			pen.setDirection(270);
		 			pen.move(50);
		 			pen.setDirection(65);
		 			pen.move(11);
		 			pen.setDirection(90);
		 			pen.move(20);
		 			pen.setDirection(180);
		 			pen.move(23);
		 			pen.setDirection(70);
		 			pen.move(29);
		 			pen.setDirection(270);
		 			pen.move(62);
		 			pen.setDirection(105);
		 			pen.move(30);
		 			pen.up();
		 			
		 			
		 			//draw 4 top
		 			pen.setWidth(2);
		 			pen.setDirection(180);
		 			pen.move(31);
		 			pen.setDirection(90);
		 			pen.move(65);
		 			pen.up();
		 			pen.setDirection(90);
		 			pen.move(35);
		 			pen.setDirection(180);
		 			pen.move(25);
		 			pen.down();
		 			pen.setColor(Color.black);
		 			pen.setDirection(270);
		 			pen.move(20);
		 			pen.setDirection(0);
		 			pen.move(20);
		 			pen.setDirection(180);
		 			pen.move(10);
		 			pen.setDirection(270);
		 			pen.move(10);
		 			pen.setDirection(90);
		 			pen.move(20);
		 			pen.up();
		 			pen.setDirection(90);
		 			pen.move(17);
		 			pen.setDirection(0);
		 			pen.move(131);
		 			pen.down();
		 			
		 		}
		    	 else if(dealercard21==5)
		    	 {
		    			pen.up();
		    			pen.setDirection(90);
		    			pen.move(35);
		    			pen.setDirection(180);
		    			pen.move(10);
		    			pen.down();
		    			
		    			//draw 5 bottom
		    			pen.setColor(Color.black);
		    			pen.setDirection(180);
		    			pen.move(15);
		    			pen.setDirection(270);
		    			pen.move(12);
		    			pen.setDirection(220);
		    			pen.move(0);
		    			for (int count1=1; count1<=45; count1++)
		    			{
		    				pen.move(-1);
		    				pen.turn(-6);
		    			}
		    			pen.up();
		    			pen.setDirection(90);
		    			pen.move(110);
		    			pen.setDirection(180);
		    			pen.move(70);
		    			
		    			//draw heart
		    			pen.down();
		    			pen.setColor(Color.RED);
		    			for(int count1=1;count1<=360;count1++)
		    			{
		    				pen.move(20);
		    				pen.turn(180);
		    				pen.move(20);
		    				pen.turn(1);
		    			}
		    			pen.up();
		    			pen.setDirection(0);
		    			pen.move(40);
		    			pen.down();
		    			for(int count1=1;count1<=360;count1++)
		    			{
		    				pen.move(20);
		    				pen.turn(180);
		    				pen.move(20);
		    				pen.turn(1);
		    			}
		    			pen.up();
		    			pen.setDirection(0);
		    			pen.move(21);
		    			pen.setDirection(270);
		    			pen.move(3);
		    			pen.down();
		    			pen.setDirection(240);
		    			pen.move(75);
		    			pen.setDirection(125);
		    			pen.move(75);
		    			pen.setDirection(0);
		    			pen.move(7);
		    			pen.setWidth(6);
		    			pen.setDirection(270);
		    			pen.move(5);
		    			pen.setDirection(305);
		    			pen.move(62);
		    			pen.setDirection(60);
		    			pen.move(60);
		    			pen.setDirection(180);
		    			pen.move(60);
		    			pen.setDirection(305);
		    			pen.move(52);
		    			pen.setDirection(60);
		    			pen.move(52);
		    			pen.setDirection(180);
		    			pen.move(52);
		    			pen.setDirection(305);
		    			pen.move(44);
		    			pen.setDirection(60);
		    			pen.move(42);
		    			pen.setDirection(180);
		    			pen.move(43);
		    			pen.setDirection(305);
		    			pen.move(42);
		    			pen.setDirection(60);
		    			pen.move(42);
		    			pen.setDirection(180);
		    			pen.move(40);
		    			pen.setDirection(305);
		    			pen.move(32);
		    			pen.setDirection(60);
		    			pen.move(32);
		    			pen.setWidth(15);
		    			pen.setDirection(180);
		    			pen.move(24);
		    			pen.setDirection(300);
		    			pen.move(15);
		    			pen.setDirection(40);
		    			pen.move(2);
		    			
		    			//Draw 5 top
		    			pen.up();
		    			pen.setDirection(90);
		    			pen.move(85);
		    			pen.setDirection(180);
		    			pen.move(50);
		    			pen.setWidth(2);
		    			pen.down();
		    			pen.setColor(Color.black);
		    			pen.setDirection(180);
		    			pen.move(15);
		    			pen.setDirection(270);
		    			pen.move(12);
		    			pen.setDirection(220);
		    			pen.move(0);
		    			for (int count1=1; count1<=45; count1++)
		    			{
		    				pen.move(-1);
		    				pen.turn(-6);
		    			}
		    			pen.up();
		    			pen.setDirection(90);
		    			pen.move(36);
		    			pen.setDirection(0);
		    			pen.move(136);
		    			pen.down();
		    	 }
		    	 else if(dealercard21==6)
		    	 {
		    		//6 on bottom
		 			pen.up();
		 			pen.setColor(Color.black);
		 			pen.setWidth(2);
		 			
		 			pen.setDirection(180);
		 			pen.move(100);
		 			pen.setDirection(250);
		 			pen.move(0);
		 			
		 			pen.up();
		 			pen.setDirection(0);
		 			pen.move(78);
		 			pen.setDirection(90);
		 			pen.move(48);
		 			pen.setDirection(250);
		 			pen.move(0);
		 			pen.down();
		 			
		 			for(int count1=1; count1<7; count1++)
		 			{
		 				pen.move(5);
		 				pen.turn(2);
		 			}
		 			
		 			for(int count1=1; count1<100; count1++)
		 			{
		 				pen.move(1);
		 				pen.turn(7);
		 			}
		 			
		 			pen.up();
		 			pen.setColor(Color.black);
		 			pen.setDirection(90);
		 			pen.move(69);
		 			pen.setDirection(180);
		 			pen.move(67);
		 			pen.down();
		 			for(int count1=1;count1<=360;count1++)
		 			{
		 				pen.move(20);
		 				pen.turn(180);
		 				pen.move(20);
		 				pen.turn(1);
		 			}
		 			
		 			pen.up();
		 			pen.setColor(Color.black);
		 			pen.setDirection(0);
		 			pen.move(40);
		 			pen.down();
		 			for(int count1=1;count1<=360;count1++)
		 			{
		 				pen.move(20);
		 				pen.turn(180);
		 				pen.move(20);
		 				pen.turn(1);
		 			}
		 			pen.up();
		 			pen.setDirection(0);
		 			pen.move(17);
		 			pen.setDirection(90);
		 			pen.move(7);
		 			pen.down();
		 			pen.setWidth(7);
		 			pen.setDirection(125);
		 			pen.move(60);
		 			pen.setDirection(230);
		 			pen.move(60);
		 			pen.setDirection(0);
		 			pen.move(65);
		 			pen.setDirection(125);
		 			pen.move(45);
		 			pen.setDirection(230);
		 			pen.move(40);
		 			pen.setDirection(0);
		 			pen.move(41);
		 			pen.setDirection(125);
		 			pen.move(30);
		 			pen.setDirection(230);
		 			pen.move(25);
		 			pen.setDirection(0);
		 			pen.move(25);
		 			pen.setDirection(130);
		 			pen.move(15);
		 			pen.setDirection(263);
		 			pen.move(15);
		 			pen.setDirection(125);
		 			pen.move(15);
		 			
		 			//stem for spade
		 			pen.up();
		 			pen.setWidth(4);
		 			pen.setDirection(270);
		 			pen.move(35);
		 			pen.setDirection(0);
		 			pen.move(9);
		 			pen.down();
		 			pen.setDirection(260);
		 			pen.move(40);
		 			pen.setDirection(0);
		 			pen.move(15);
		 			pen.setDirection(100);
		 			pen.move(40);
		 			pen.setDirection(270);
		 			pen.move(37);
		 			pen.setDirection(180);
		 			pen.move(5);
		 			pen.setDirection(80);
		 			pen.move(35);
		 			pen.setDirection(265);
		 			pen.move(35);
		 			pen.setDirection(0);
		 			pen.move(6);
		 			pen.setDirection(100);
		 			pen.move(35);
		 			pen.setDirection(95);
		 			pen.move(50);
		 			
		 			//6 on top
		 			
		 			pen.up();
		 			pen.setColor(Color.black);
		 			pen.setWidth(2);
		 			
		 			pen.setDirection(180);
		 			pen.move(125);
		 			pen.setDirection(250);
		 			pen.move(0);
		 			
		 			pen.up();
		 			pen.setDirection(0);
		 			pen.move(78);
		 			pen.setDirection(90);
		 			pen.move(55);
		 			pen.setDirection(250);
		 			pen.move(0);
		 			pen.down();
		 			
		 			for(int count1=1; count1<7; count1++)
		 			{
		 				pen.move(5);
		 				pen.turn(2);
		 			}
		 			
		 			for(int count1=1; count1<100; count1++)
		 			{
		 				pen.move(1);
		 				pen.turn(7);
		 			}
		 			pen.up();
		 			pen.setDirection(90);
		 			pen.move(37);
		 			pen.setDirection(0);
		 			pen.move(134);
		 			pen.down();
		 		
		    	 }
		    	 else if(dealercard21==7)
		    	 {
		    		//bottom number 7
		 			
		 			pen.setColor(Color.black);
		 			pen.up();
		 			pen.setDirection(90);
		 			pen.move(40);
		 			pen.setDirection(180);
		 			pen.move(30);
		 			pen.down();
		 			pen.setDirection(0);
		 			pen.move(15);
		 			pen.setDirection(270);
		 			pen.move(30);

		 			
		 			
		 			
		 			//heart
		 			pen.up();
		 			pen.setDirection(180);
		 			pen.move(80);
		 			pen.setDirection(90);
		 			pen.move(107);
		 			pen.setColor(Color.RED);
		 			pen.down();
		 			for(int count1=1;count1<=360;count1++)
		 			{
		 				pen.move(20);
		 				pen.turn(180);
		 				pen.move(20);
		 				pen.turn(1);
		 			}
		 			pen.up();
		 			pen.setDirection(0);
		 			pen.move(40);
		 			pen.down();
		 			for(int count1=1;count1<=360;count1++)
		 			{
		 				pen.move(20);
		 				pen.turn(180);
		 				pen.move(20);
		 				pen.turn(1);
		 			}
		 			pen.up();
		 			pen.setDirection(0);
		 			pen.move(21);
		 			pen.setDirection(270);
		 			pen.move(3);
		 			pen.down();
		 			pen.setDirection(240);
		 			pen.move(75);
		 			pen.setDirection(125);
		 			pen.move(75);
		 			pen.setDirection(0);
		 			pen.move(7);
		 			pen.setWidth(6);
		 			pen.setDirection(270);
		 			pen.move(5);
		 			pen.setDirection(305);
		 			pen.move(62);
		 			pen.setDirection(60);
		 			pen.move(60);
		 			pen.setDirection(180);
		 			pen.move(60);
		 			pen.setDirection(305);
		 			pen.move(52);
		 			pen.setDirection(60);
		 			pen.move(52);
		 			pen.setDirection(180);
		 			pen.move(52);
		 			pen.setDirection(305);
		 			pen.move(44);
		 			pen.setDirection(60);
		 			pen.move(42);
		 			pen.setDirection(180);
		 			pen.move(43);
		 			pen.setDirection(305);
		 			pen.move(42);
		 			pen.setDirection(60);
		 			pen.move(42);
		 			pen.setDirection(180);
		 			pen.move(40);
		 			pen.setDirection(305);
		 			pen.move(32);
		 			pen.setDirection(60);
		 			pen.move(32);
		 			pen.setWidth(15);
		 			pen.setDirection(180);
		 			pen.move(24);
		 			pen.setDirection(300);
		 			pen.move(15);
		 			pen.setDirection(40);
		 			pen.move(2);
		 			
		 			//top 7 number
		 			pen.setWidth(2);
		 			pen.setColor(Color.black);
		 			pen.up();
		 			pen.setDirection(90);
		 			pen.move(85);
		 			pen.setDirection(180);
		 			pen.move(70);
		 			pen.down();
		 			pen.setDirection(0);
		 			pen.move(15);
		 			pen.setDirection(270);
		 			pen.move(30);
		 			pen.up();
		 			pen.setDirection(90);
		 			pen.move(43);
		 			pen.setDirection(0);
		 			pen.move(125);
		 			pen.down();
		 			 
		    	 }
		    	 else if(dealercard21==8)
		    	 {
		    		//draw number 8
		    		 pen.up();
		    			pen.setDirection(145);
		    			pen.move(20);
		    			pen.setColor(Color.black);
		    			pen.setWidth(2);
		    			pen.setDirection(45);
		    			pen.move(10);
		    			pen.setDirection(270);
		    			pen.move(5);
		    			pen.setDirection(180);
		    			pen.move(5);
		    			pen.setDirection(90);
		    			pen.move(3);
		    			pen.down();
		    			
		    			
		    			
		    			for(int count1=1; count1<100; count1++)
		    			{
		    				pen.move(1);
		    				pen.turn(7);
		    			}
		    			
		    			pen.up();
		    			pen.setDirection(90);
		    			pen.move(20);
		    			pen.down();
		    			for(int count1=1; count1<100; count1++)
		    			{
		    				pen.move(1);
		    				pen.turn(7);
		    			}
		    			pen.setColor(Color.black);
		    			pen.up();
		    			pen.setDirection(0);
		    			pen.setDirection(90);
		    			pen.move(100);
		    			pen.setDirection(270);
		    			pen.move(65);
		    			pen.setDirection(90);
		    			pen.move(35);
		    			pen.setDirection(180);
		    			pen.move(37.5);
		    			pen.down();
		    			for(int count1=1;count1<=360;count1++)
		    			{
		    				pen.move(20);
		    				pen.turn(180);
		    				pen.move(20);
		    				pen.turn(1);
		    			}
		    			
		    			pen.up();
		    			pen.setColor(Color.black);
		    			pen.setDirection(180);
		    			pen.move(40);
		    			
		    			
		    			pen.down();
		    			for(int count1=1;count1<=360;count1++)
		    			{
		    				pen.move(20);
		    				pen.turn(180);
		    				pen.move(20);
		    				pen.turn(1);
		    			}
		    			pen.up();
		    			pen.setColor(Color.black);
		    			pen.setDirection(90);
		    			pen.move(30);
		    			pen.setDirection(0);
		    			pen.move(20);
		    			pen.down();
		    			for(int count1=1;count1<=360;count1++)
		    			{
		    				pen.move(20);
		    				pen.turn(180);
		    				pen.move(20);
		    				pen.turn(1);
		    			}
		    			//steam
		    			
		    			pen.up();
		    			pen.setDirection(270);
		    			pen.move(38);
		    			pen.down();
		    			pen.setColor(Color.black);
		    			pen.setDirection(255);
		    			pen.move(35);
		    			pen.setDirection(0);
		    			pen.move(20);
		    			pen.setDirection(107);
		    			pen.move(35);
		    			pen.setWidth(5);
		    			pen.setDirection(180);
		    			pen.move(3);
		    			pen.setDirection(287);
		    			pen.move(33);
		    			pen.setDirection(180);
		    			pen.move(15);
		    			pen.setDirection(75);
		    			pen.move(30);
		    			pen.setDirection(0);
		    			pen.move(1);
		    			pen.setDirection(270);
		    			pen.move(3);
		    			pen.setDirection(255);
		    			pen.move(22);
		    			pen.setWidth(7);
		    			pen.setDirection(0);
		    			pen.move(10);
		    			pen.setDirection(135);
		    			pen.move(5);
		    			pen.setDirection(90);
		    			pen.move(3);
		    			pen.setDirection(315);
		    			pen.move(4);
		    			
		    			//top number
		    			pen.up();
		    			pen.setDirection(90);
		    			pen.move(94);
		    			pen.setDirection(180);
		    			pen.move(50);
		    			pen.setColor(Color.black);
		    			pen.setWidth(2);
		    			pen.setDirection(45);
		    			pen.move(10);
		    			pen.setDirection(270);
		    			pen.move(5);
		    			pen.setDirection(180);
		    			pen.move(5);
		    			pen.setDirection(90);
		    			pen.move(3);
		    			pen.down();
		    			
		    			
		    			
		    			for(int count1=1; count1<100; count1++)
		    			{
		    				pen.move(1);
		    				pen.turn(7);
		    			}
		    			
		    			pen.up();
		    			pen.setDirection(90);
		    			pen.move(20);
		    			pen.down();
		    			for(int count1=1; count1<100; count1++)
		    			{
		    				pen.move(1);
		    				pen.turn(7);
		    			}
		    			pen.up();
		    			pen.setDirection(90);
		    			pen.move(20);
		    			pen.setDirection(0);
		    			pen.move(120);
		    			pen.down();
		    	 }
		    	 else if(dealercard21==9)
		    	 {
		    			pen.setDirection(180);
		    			pen.move(75);
		    			pen.setDirection(90);
		    			pen.move(150);
		    			pen.setWidth(2);
		    			pen.setColor(Color.red);
		    			pen.down();
		    			pen.setDirection(290);
		    			pen.move(60);
		    			pen.setDirection(250);
		    			pen.move(60);
		    			pen.setDirection(110);
		    			pen.move(60);
		    			pen.setDirection(70);
		    			pen.move(60);
		    			
		    			//fill in
		    			pen.up();
		    			pen.setDirection(270);
		    			pen.move(3);
		    			pen.down();
		    			pen.setWidth(3);
		    			pen.setDirection(290);
		    			pen.move(59);
		    			pen.setDirection(250);
		    			pen.move(57);
		    			pen.setDirection(110);
		    			pen.move(58);
		    			pen.setDirection(70);
		    			pen.move(55);
		    			
		    			pen.setDirection(290);
		    			pen.move(55);
		    			pen.setDirection(250);
		    			pen.move(51);
		    			pen.setDirection(110);
		    			pen.move(55);
		    			pen.setDirection(70);
		    			pen.move(49);
		    			
		    			pen.setWidth(5);
		    			pen.setDirection(290);
		    			pen.move(55);
		    			pen.setDirection(250);
		    			pen.move(51);
		    			pen.setDirection(110);
		    			pen.move(55);
		    			pen.setDirection(70);
		    			pen.move(53);
		    		
		    			
		    			pen.setDirection(270);
		    			pen.move(92);
		    			pen.setDirection(0);
		    			pen.move(3);
		    			pen.setDirection(90);
		    			pen.move(83);
		    			pen.setDirection(300);
		    			pen.move(4);
		    			pen.setDirection(270);
		    			pen.move(75);
		    			pen.setDirection(75);
		    			pen.move(4);
		    			pen.setDirection(90);
		    			pen.move(65);
		    			pen.setDirection(272);
		    			pen.move(7);
		    			pen.setWidth(10);
		    			pen.setDirection(270);
		    			pen.move(50);
		    			pen.setDirection(65);
		    			pen.move(11);
		    			pen.setDirection(90);
		    			pen.move(20);
		    			pen.setDirection(180);
		    			pen.move(23);
		    			pen.setDirection(70);
		    			pen.move(29);
		    			pen.setDirection(270);
		    			pen.move(62);
		    			pen.setDirection(105);
		    			pen.move(30);
		    			
		    			//nine number on bottom
		    			pen.up();
		    			pen.setDirection(270);
		    			pen.move(72);
		    			pen.setDirection(0);
		    			pen.move(65);
		    			
		    			pen.setColor(Color.black);
		    			pen.setWidth(2);
		    			pen.down();
		    			for(int count1=1; count1<100; count1++)
		    			{
		    				pen.move(1);
		    				pen.turn(7);
		    			}
		    			pen.setDirection(0);
		    			pen.move(12);
		    			pen.setDirection(90);
		    			pen.move(2);
		    			pen.setDirection(270);
		    			pen.move(17);
		    			
		    			//9 on top
		    			pen.up();
		    			pen.setDirection(90);
		    			pen.move(185);
		    			pen.setDirection(180);
		    			pen.move(120);
		    			
		    			pen.setColor(Color.black);
		    			pen.setWidth(2);
		    			pen.down();
		    			for(int count1=1; count1<100; count1++)
		    			{
		    				pen.move(1);
		    				pen.turn(7);
		    			}
		    			pen.up();
		    			pen.setDirection(0);
		    			pen.move(4);
		    			pen.setDirection(270);
		    			pen.move(12);
		    			pen.down();
		    			pen.setDirection(270);
		    			pen.move(17);
		    			pen.up();
		    			pen.setDirection(90);
		    			pen.move(38);
		    			pen.setDirection(0);
		    			pen.move(124);
		    			pen.down();
		    	 }
		    	 else if(dealercard21==10)
		    	 {
		    		//draw 10 bottom
		 			pen.up();
		 			pen.setColor(Color.black);
		 			pen.setWidth(2);
		 			pen.setDirection(90);
		 			pen.move(30);
		 			pen.setDirection(180);
		 			pen.move(35);
		 			pen.down();
		 			pen.setDirection(270);
		 			pen.move(25);
		 			pen.up();
		 			pen.setDirection(90);
		 			pen.move(0);
		 			pen.setDirection(0);
		 			pen.move(18);
		 			
		 			pen.down();
		 			for(int count1=1; count1<100; count1++)
		 			{
		 				pen.move(1);
		 				pen.turn(4.5);
		 			}
		 			pen.up();
		 			pen.setDirection(90);
		 			pen.move(110);
		 			pen.setDirection(180);
		 			pen.move(50);
		 			
		 			pen.setColor(Color.black);
		 			pen.up();
		 			pen.setDirection(0);
		 			pen.setDirection(270);
		 			pen.move(65);
		 			pen.setDirection(90);
		 			pen.move(35);
		 			pen.setDirection(180);
		 			pen.move(2);
		 			pen.down();
		 			for(int count1=1;count1<=360;count1++)
		 			{
		 				pen.move(20);
		 				pen.turn(180);
		 				pen.move(20);
		 				pen.turn(1);
		 			}
		 			
		 			pen.up();
		 			pen.setColor(Color.black);
		 			pen.setDirection(180);
		 			pen.move(40);
		 			
		 			
		 			pen.down();
		 			for(int count1=1;count1<=360;count1++)
		 			{
		 				pen.move(20);
		 				pen.turn(180);
		 				pen.move(20);
		 				pen.turn(1);
		 			}
		 			pen.up();
		 			pen.setColor(Color.black);
		 			pen.setDirection(90);
		 			pen.move(30);
		 			pen.setDirection(0);
		 			pen.move(20);
		 			pen.down();
		 			for(int count1=1;count1<=360;count1++)
		 			{
		 				pen.move(20);
		 				pen.turn(180);
		 				pen.move(20);
		 				pen.turn(1);
		 			}
		 			//steam
		 			
		 			pen.up();
		 			pen.setDirection(270);
		 			pen.move(38);
		 			pen.down();
		 			pen.setColor(Color.black);
		 			pen.setDirection(255);
		 			pen.move(35);
		 			pen.setDirection(0);
		 			pen.move(20);
		 			pen.setDirection(107);
		 			pen.move(35);
		 			pen.setWidth(5);
		 			pen.setDirection(180);
		 			pen.move(3);
		 			pen.setDirection(287);
		 			pen.move(33);
		 			pen.setDirection(180);
		 			pen.move(15);
		 			pen.setDirection(75);
		 			pen.move(30);
		 			pen.setDirection(0);
		 			pen.move(1);
		 			pen.setDirection(270);
		 			pen.move(3);
		 			pen.setDirection(255);
		 			pen.move(22);
		 			pen.setWidth(7);
		 			pen.setDirection(0);
		 			pen.move(10);
		 			pen.setDirection(135);
		 			pen.move(5);
		 			pen.setDirection(90);
		 			pen.move(3);
		 			pen.setDirection(315);
		 			pen.move(4);
		 			
		 			//draw 10 on top
		 			pen.up();
		 			pen.setDirection(90);
		 			pen.move(125);
		 			pen.setDirection(180);
		 			pen.move(70);
		 			pen.down();
		 			pen.setWidth(2);
		 			pen.setDirection(270);
		 			pen.move(25);
		 			pen.up();
		 			pen.setDirection(90);
		 			pen.move(0);
		 			pen.setDirection(0);
		 			pen.move(17);
		 			
		 			pen.down();
		 			for(int count1=1; count1<100; count1++)
		 			{
		 				pen.move(1);
		 				pen.turn(4.5);
		 			}
		 			pen.up();
		 			pen.setDirection(90);
		 			pen.move(25);
		 			pen.setDirection(0);
		 			pen.move(110);
		 			pen.down();
		    	 }
		 			else if(dealercard21==11)
		 			{
		 				pen.up();
		 				pen.setDirection(90);
		 				pen.move(40);
		 				pen.setDirection(180);
		 				pen.move(15);
		 				pen.down();
		 				
		 				//draw j on bottom
		 				pen.setColor(Color.black);
		 				pen.setDirection(180);
		 				pen.move(10);
		 				pen.setDirection(0);
		 				pen.move(20);
		 				pen.setDirection(180);
		 				pen.move(10);
		 				pen.setDirection(270);
		 				pen.move(25);
		 				pen.setDirection(90);
		 				pen.move(0);
		 				for (int count1=1; count1<=25; count1++)
		 				{
		 					pen.move(-1);
		 					pen.turn(-8);
		 				}
		 				pen.up();
		 				pen.setDirection(90);
		 				pen.move(100);
		 				pen.setDirection(180);
		 				pen.move(67);
		 				
		 				//draw heart
		 				pen.setColor(Color.RED);
		 				pen.down();
		 				for(int count1=1;count1<=360;count1++)
		 				{
		 					pen.move(20);
		 					pen.turn(180);
		 					pen.move(20);
		 					pen.turn(1);
		 				}
		 				pen.up();
		 				pen.setDirection(0);
		 				pen.move(40);
		 				pen.down();
		 				for(int count1=1;count1<=360;count1++)
		 				{
		 					pen.move(20);
		 					pen.turn(180);
		 					pen.move(20);
		 					pen.turn(1);
		 				}
		 				pen.up();
		 				pen.setDirection(0);
		 				pen.move(21);
		 				pen.setDirection(270);
		 				pen.move(3);
		 				pen.down();
		 				pen.setDirection(240);
		 				pen.move(75);
		 				pen.setDirection(125);
		 				pen.move(75);
		 				pen.setDirection(0);
		 				pen.move(7);
		 				pen.setWidth(6);
		 				pen.setDirection(270);
		 				pen.move(5);
		 				pen.setDirection(305);
		 				pen.move(62);
		 				pen.setDirection(60);
		 				pen.move(60);
		 				pen.setDirection(180);
		 				pen.move(60);
		 				pen.setDirection(305);
		 				pen.move(52);
		 				pen.setDirection(60);
		 				pen.move(52);
		 				pen.setDirection(180);
		 				pen.move(52);
		 				pen.setDirection(305);
		 				pen.move(44);
		 				pen.setDirection(60);
		 				pen.move(42);
		 				pen.setDirection(180);
		 				pen.move(43);
		 				pen.setDirection(305);
		 				pen.move(42);
		 				pen.setDirection(60);
		 				pen.move(42);
		 				pen.setDirection(180);
		 				pen.move(40);
		 				pen.setDirection(305);
		 				pen.move(32);
		 				pen.setDirection(60);
		 				pen.move(32);
		 				pen.setWidth(15);
		 				pen.setDirection(180);
		 				pen.move(24);
		 				pen.setDirection(300);
		 				pen.move(15);
		 				pen.setDirection(40);
		 				pen.move(2);
		 				pen.up();
		 				pen.setDirection(90);
		 				pen.move(88);
		 				pen.setDirection(180);
		 				pen.move(53);
		 				
		 				// draw j on top
		 				pen.down();
		 				pen.setWidth(2);
		 				pen.setColor(Color.black);
		 				pen.setDirection(180);
		 				pen.move(10);
		 				pen.setDirection(0);
		 				pen.move(20);
		 				pen.setDirection(180);
		 				pen.move(10);
		 				pen.setDirection(270);
		 				pen.move(25);
		 				pen.setDirection(90);
		 				pen.move(0);
		 				for (int count1=1; count1<=25; count1++)
		 				{
		 					pen.move(-1);
		 					pen.turn(-8);
		 				}
		 				pen.up();
		 				pen.setDirection(90);
		 				pen.move(35);
		 				pen.setDirection(0);
		 				pen.move(139);
		 				pen.down();
		 			}
		 			else if(dealercard21==12)
		 			{
		 				pen.up();
		 				pen.setDirection(90);
		 				pen.move(35);
		 				pen.setDirection(180);
		 				pen.move(30);
		 				pen.down();
		 				
		 				// draw Q bottom
		 				pen.setColor(Color.black);
		 				for (int count1=1; count1<=150; count1++)
		 				{
		 					pen.move(1);
		 					pen.turn(4);
		 				}
		 				pen.setDirection(325);
		 				pen.move(10);
		 				pen.setDirection(145);
		 				pen.move(20);
		 				pen.up();
		 				pen.setDirection(90);
		 				pen.move(75);
		 				pen.setDirection(180);
		 				pen.move(30);
		 				
		 				//draw club
		 				
		 				pen.setColor(Color.black);
		 				pen.down();
		 				for(int count1=1;count1<=360;count1++)
		 				{
		 					pen.move(20);
		 					pen.turn(180);
		 					pen.move(20);
		 					pen.turn(1);
		 				}
		 				
		 				pen.up();
		 				pen.setColor(Color.black);
		 				pen.setDirection(180);
		 				pen.move(40);
		 				
		 				
		 				pen.down();
		 				for(int count1=1;count1<=360;count1++)
		 				{
		 					pen.move(20);
		 					pen.turn(180);
		 					pen.move(20);
		 					pen.turn(1);
		 				}
		 				pen.up();
		 				pen.setColor(Color.black);
		 				pen.setDirection(90);
		 				pen.move(30);
		 				pen.setDirection(0);
		 				pen.move(20);
		 				pen.down();
		 				for(int count1=1;count1<=360;count1++)
		 				{
		 					pen.move(20);
		 					pen.turn(180);
		 					pen.move(20);
		 					pen.turn(1);
		 				}
		 				//steam
		 				
		 				pen.up();
		 				pen.setDirection(270);
		 				pen.move(38);
		 				pen.down();
		 				pen.setColor(Color.black);
		 				pen.setDirection(255);
		 				pen.move(35);
		 				pen.setDirection(0);
		 				pen.move(20);
		 				pen.setDirection(107);
		 				pen.move(35);
		 				pen.setWidth(5);
		 				pen.setDirection(180);
		 				pen.move(3);
		 				pen.setDirection(287);
		 				pen.move(33);
		 				pen.setDirection(180);
		 				pen.move(15);
		 				pen.setDirection(75);
		 				pen.move(30);
		 				pen.setDirection(0);
		 				pen.move(1);
		 				pen.setDirection(270);
		 				pen.move(3);
		 				pen.setDirection(255);
		 				pen.move(22);
		 				pen.setWidth(7);
		 				pen.setDirection(0);
		 				pen.move(10);
		 				pen.setDirection(135);
		 				pen.move(5);
		 				pen.setDirection(90);
		 				pen.move(3);
		 				pen.setDirection(315);
		 				pen.move(4);
		 				
		 				pen.up();
		 				pen.setDirection(90);
		 				pen.move(130);
		 				pen.setDirection(180);
		 				pen.move(55);
		 				
		 				//Draw Q top
		 				pen.down();
		 				pen.setColor(Color.black);
		 				pen.setWidth(2);
		 				for (int count1=1; count1<=150; count1++)
		 				{
		 					pen.move(1);
		 					pen.turn(4);
		 				}
		 				pen.setDirection(325);
		 				pen.move(10);
		 				pen.setDirection(145);
		 				pen.move(20);
		 				pen.up();
		 				pen.setDirection(90);
		 				pen.move(23);
		 				pen.setDirection(0);
		 				pen.move(123);
		 				pen.down();
		 			}
		 			else if(dealercard21==13)
		 			{
		 				pen.up();
		 				pen.setDirection(90);
		 				pen.move(35);
		 				pen.setDirection(180);
		 				pen.move(23);
		 				pen.down();
		 				
		 				//Draw K bottom
		 				pen.setColor(Color.black);
		 				pen.setDirection(270);
		 				pen.move(30);
		 				pen.up();
		 				pen.setDirection(0);
		 				pen.move(15);
		 				pen.down();
		 				pen.setDirection(135);
		 				pen.move(20);
		 				pen.setDirection(45);
		 				pen.move(20);
		 				pen.up();
		 				pen.setDirection(90);
		 				pen.move(120);
		 				pen.setDirection(180);
		 				pen.move(65);
		 				pen.down();
		 				
		 				//draw diamond
		 				pen.setColor(Color.red);
		 				pen.setDirection(290);
		 				pen.move(60);
		 				pen.setDirection(250);
		 				pen.move(60);
		 				pen.setDirection(110);
		 				pen.move(60);
		 				pen.setDirection(70);
		 				pen.move(60);
		 				
		 				//fill in
		 				pen.up();
		 				pen.setDirection(270);
		 				pen.move(3);
		 				pen.down();
		 				pen.setWidth(3);
		 				pen.setDirection(290);
		 				pen.move(59);
		 				pen.setDirection(250);
		 				pen.move(57);
		 				pen.setDirection(110);
		 				pen.move(58);
		 				pen.setDirection(70);
		 				pen.move(55);
		 				
		 				pen.setDirection(290);
		 				pen.move(55);
		 				pen.setDirection(250);
		 				pen.move(51);
		 				pen.setDirection(110);
		 				pen.move(55);
		 				pen.setDirection(70);
		 				pen.move(49);
		 				
		 				pen.setWidth(5);
		 				pen.setDirection(290);
		 				pen.move(55);
		 				pen.setDirection(250);
		 				pen.move(51);
		 				pen.setDirection(110);
		 				pen.move(55);
		 				pen.setDirection(70);
		 				pen.move(53);
		 			
		 				
		 				pen.setDirection(270);
		 				pen.move(92);
		 				pen.setDirection(0);
		 				pen.move(3);
		 				pen.setDirection(90);
		 				pen.move(83);
		 				pen.setDirection(300);
		 				pen.move(4);
		 				pen.setDirection(270);
		 				pen.move(75);
		 				pen.setDirection(75);
		 				pen.move(4);
		 				pen.setDirection(90);
		 				pen.move(65);
		 				pen.setDirection(272);
		 				pen.move(7);
		 				pen.setWidth(10);
		 				pen.setDirection(270);
		 				pen.move(50);
		 				pen.setDirection(65);
		 				pen.move(11);
		 				pen.setDirection(90);
		 				pen.move(20);
		 				pen.setDirection(180);
		 				pen.move(23);
		 				pen.setDirection(70);
		 				pen.move(29);
		 				pen.setDirection(270);
		 				pen.move(62);
		 				pen.setDirection(105);
		 				pen.move(30);
		 				pen.up();
		 				pen.setDirection(90);
		 				pen.move(95);
		 				pen.setDirection(180);
		 				pen.move(55);
		 				
		 				//Draw K top
		 				pen.down();
		 				pen.setWidth(2);
		 				pen.setColor(Color.black);
		 				pen.setDirection(270);
		 				pen.move(30);
		 				pen.up();
		 				pen.setDirection(0);
		 				pen.move(15);
		 				pen.down();
		 				pen.setDirection(135);
		 				pen.move(20);
		 				pen.setDirection(45);
		 				pen.move(20);
		 				pen.up();
		 				pen.setDirection(90);
		 				pen.move(10);
		 				pen.setDirection(0);
		 				pen.move(123);
		 				pen.down();
		 			}
		return dealercard21;
		
	}

	public int Dcard3(int dealercard31, StandardPen pen)
	{
		KeyboardReader reader = new KeyboardReader();
		
		Random generator = new Random();
		
		
		//outside of card
				pen.setWidth(2);
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
				
				pen.setColor(Color.orange);
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
				
				 if(dealercard31==1)
		    	 {
		    		 pen.setColor(Color.black);
		 			pen.up();
		 			pen.setDirection(180);
		 			pen.move(30);
		 			pen.setDirection(90);
		 			pen.move(8);
		 			pen.down();
		 			pen.setDirection(70);
		 			pen.move(30);
		 			pen.setDirection(290);
		 			pen.move(30);
		 			pen.setDirection(110);
		 			pen.move(15);
		 			pen.setDirection(180);
		 			pen.move(9);
		 			pen.up();
					pen.setColor(Color.black);
					pen.setDirection(90);
					pen.move(69);
					pen.setDirection(180);
					pen.move(72);
					pen.down();
					for(int count1=1;count1<=360;count1++)
					{
						pen.move(20);
						pen.turn(180);
						pen.move(20);
						pen.turn(1);
					}
					
					pen.up();
					pen.setColor(Color.black);
					pen.setDirection(0);
					pen.move(40);
					pen.down();
					for(int count1=1;count1<=360;count1++)
					{
						pen.move(20);
						pen.turn(180);
						pen.move(20);
						pen.turn(1);
					}
					pen.up();
					pen.setDirection(0);	
					pen.move(17);
					pen.setDirection(90);
					pen.move(7);
					pen.down();
					pen.setWidth(7);
					pen.setDirection(125);
					pen.move(60);
					pen.setDirection(230);
					pen.move(60);
					pen.setDirection(0);
					pen.move(65);
					pen.setDirection(125);
					pen.move(45);
					pen.setDirection(230);
					pen.move(40);
					pen.setDirection(0);
					pen.move(41);
					pen.setDirection(125);
					pen.move(30);
					pen.setDirection(230);
					pen.move(25);
					pen.setDirection(0);
					pen.move(25);
					pen.setDirection(130);
					pen.move(15);
					pen.setDirection(263);
					pen.move(15);
					pen.setDirection(125);
					pen.move(15);
					
					//stem for spade
					pen.up();
					pen.setWidth(4);
					pen.setDirection(270);
					pen.move(35);
					pen.setDirection(0);
					pen.move(9);
					pen.down();
					pen.setDirection(260);
					pen.move(40);
					pen.setDirection(0);
					pen.move(15);
					pen.setDirection(100);
					pen.move(40);
					pen.setDirection(270);
					pen.move(37);
					pen.setDirection(180);
					pen.move(5);
					pen.setDirection(80);
					pen.move(35);
					pen.setDirection(265);
					pen.move(35);
					pen.setDirection(0);
					pen.move(6);
					pen.setDirection(100);
					pen.move(35);
					pen.setDirection(95);
					pen.move(50);
					
					//ace on top
					pen.up();
					pen.setDirection(180);
					pen.move(100);
					pen.setDirection(90);
					pen.move(100);
					pen.down();
					
					pen.setWidth(2);
					pen.setColor(Color.black);
					pen.up();
					pen.setDirection(0);
					pen.move(40);
					pen.setDirection(270);
					pen.move(70);
					pen.down();
					pen.setDirection(70);
					pen.move(30);
					pen.setDirection(290);
					pen.move(30);
					pen.setDirection(110);
					pen.move(15);
					pen.setDirection(180);
					pen.move(9);
					pen.up();
					pen.setDirection(90);
					pen.move(22);
					pen.setDirection(0);
					pen.move(136);
					pen.down();
		    	 }
		    	 else if(dealercard31==2)
		    	 {
		    			pen.up();
		    			pen.setDirection(90);
		    			pen.move(32);
		    			pen.setDirection(180);
		    			pen.move(35);
		    			pen.down();
		    			pen.setDirection(200);
		    			pen.move(0);
		    			
		    			// draw 2 bottom
		    			pen.setColor(Color.black);
		    			for (int count1=1; count1<=20; count1++)
		    			{
		    				pen.move(-1);
		    				pen.turn(-5);
		    			}
		    			pen.setDirection(235);
		    			pen.move(20);
		    			pen.setDirection(0);
		    			pen.move(20);
		    			pen.up();
		    			pen.setDirection(90);
		    			pen.move(110);
		    			pen.setDirection(180);
		    			pen.move(85);
		    			pen.down();
		    			
		    			//draw heart
		    			pen.setColor(Color.RED);
		    			for(int count1=1;count1<=360;count1++)
		    			{
		    				pen.move(20);
		    				pen.turn(180);
		    				pen.move(20);
		    				pen.turn(1);
		    			}
		    			pen.up();
		    			pen.setDirection(0);
		    			pen.move(40);
		    			pen.down();
		    			for(int count1=1;count1<=360;count1++)
		    			{
		    				pen.move(20);
		    				pen.turn(180);
		    				pen.move(20);
		    				pen.turn(1);
		    			}
		    			pen.up();
		    			pen.setDirection(0);
		    			pen.move(21);
		    			pen.setDirection(270);
		    			pen.move(3);
		    			pen.down();
		    			pen.setDirection(240);
		    			pen.move(75);
		    			pen.setDirection(125);
		    			pen.move(75);
		    			pen.setDirection(0);
		    			pen.move(7);
		    			pen.setWidth(6);
		    			pen.setDirection(270);
		    			pen.move(5);
		    			pen.setDirection(305);
		    			pen.move(62);
		    			pen.setDirection(60);
		    			pen.move(60);
		    			pen.setDirection(180);
		    			pen.move(60);
		    			pen.setDirection(305);
		    			pen.move(52);
		    			pen.setDirection(60);
		    			pen.move(52);
		    			pen.setDirection(180);
		    			pen.move(52);
		    			pen.setDirection(305);
		    			pen.move(44);
		    			pen.setDirection(60);
		    			pen.move(42);
		    			pen.setDirection(180);
		    			pen.move(43);
		    			pen.setDirection(305);
		    			pen.move(42);
		    			pen.setDirection(60);
		    			pen.move(42);
		    			pen.setDirection(180);
		    			pen.move(40);
		    			pen.setDirection(305);
		    			pen.move(32);
		    			pen.setDirection(60);
		    			pen.move(32);
		    			pen.setWidth(15);
		    			pen.setDirection(180);
		    			pen.move(24);
		    			pen.setDirection(300);
		    			pen.move(15);
		    			pen.setDirection(40);
		    			pen.move(2);
		    			pen.up();
		    			
		    			//draw 2 top
		    			pen.setDirection(90);
		    			pen.move(90);
		    			pen.setDirection(180);
		    			pen.move(65);
		    			pen.setDirection(200);
		    			pen.move(0);
		    			pen.down();
		    			pen.setColor(Color.black);
		    			pen.setWidth(2);
		    			for (int count1=1; count1<=20; count1++)
		    			{
		    				pen.move(-1);
		    				pen.turn(-5);
		    			}
		    			pen.setDirection(235);
		    			pen.move(20);
		    			pen.setDirection(0);
		    			pen.move(20);
		    			pen.up();
		    			pen.setDirection(90);
		    			pen.move(33);
		    			pen.setDirection(0);
		    			pen.move(112);
		    			pen.down();
		    	 }
		    	 else if(dealercard31==3)
		    	 {
		    		 pen.up();
		 			pen.setDirection(90);
		 			pen.move(39);
		 			pen.setDirection(180);
		 			pen.move(30);
		 			pen.setDirection(220);
		 			pen.move(0);
		 			pen.down();
		 			//draw 3 on bottom
		 			pen.setColor(Color.black);
		 			for (int count1=1; count1<=40; count1++)
		 			{
		 				pen.move(-1);
		 				pen.turn(-6);
		 			}
		 			pen.setDirection(220);
		 			pen.move(0);
		 			for (int count1=1; count1<=45; count1++)
		 			{
		 				pen.move(-1);
		 				pen.turn(-6);
		 			}
		 			pen.up();
		 			pen.setDirection(90);
		 			pen.move(80);
		 			pen.setDirection(180);
		 			pen.move(68);
		 			
		 			//draw spade
		 			pen.down();
		 			for(int count1=1;count1<=360;count1++)
		 			{
		 				pen.move(20);
		 				pen.turn(180);
		 				pen.move(20);
		 				pen.turn(1);
		 			}
		 			
		 			pen.up();
		 			pen.setColor(Color.black);
		 			pen.setDirection(0);
		 			pen.move(40);
		 			pen.down();
		 			for(int count1=1;count1<=360;count1++)
		 			{
		 				pen.move(20);
		 				pen.turn(180);
		 				pen.move(20);
		 				pen.turn(1);
		 			}
		 			pen.up();
		 			pen.setDirection(0);
		 			pen.move(17);
		 			pen.setDirection(90);
		 			pen.move(7);
		 			pen.down();
		 			pen.setWidth(7);
		 			pen.setDirection(125);
		 			pen.move(60);
		 			pen.setDirection(230);
		 			pen.move(60);
		 			pen.setDirection(0);
		 			pen.move(65);
		 			pen.setDirection(125);
		 			pen.move(45);
		 			pen.setDirection(230);
		 			pen.move(40);
		 			pen.setDirection(0);
		 			pen.move(41);
		 			pen.setDirection(125);
		 			pen.move(30);
		 			pen.setDirection(230);
		 			pen.move(25);
		 			pen.setDirection(0);
		 			pen.move(25);
		 			pen.setDirection(130);
		 			pen.move(15);
		 			pen.setDirection(263);
		 			pen.move(15);
		 			pen.setDirection(125);
		 			pen.move(15);
		 			
		 			//stem for spade
		 			pen.up();
		 			pen.setWidth(4);
		 			pen.setDirection(270);
		 			pen.move(35);
		 			pen.setDirection(0);
		 			pen.move(9);
		 			pen.down();
		 			pen.setDirection(260);
		 			pen.move(40);
		 			pen.setDirection(0);
		 			pen.move(15);
		 			pen.setDirection(100);
		 			pen.move(40);
		 			pen.setDirection(270);
		 			pen.move(37);
		 			pen.setDirection(180);
		 			pen.move(5);
		 			pen.setDirection(80);
		 			pen.move(35);
		 			pen.setDirection(265);
		 			pen.move(35);
		 			pen.setDirection(0);
		 			pen.move(6);
		 			pen.setDirection(100);
		 			pen.move(35);
		 			pen.setDirection(95);
		 			pen.move(50);
		 			pen.up();
		 			pen.setDirection(90);
		 			pen.move(55);
		 			pen.setDirection(180);
		 			pen.move(55);
		 			pen.setDirection(220);
		 			pen.move(0);
		 			pen.down();
		 			pen.setWidth(2);
		 			
		 			//draw 3 top
		 			pen.setColor(Color.black);
		 			for (int count1=1; count1<=40; count1++)
		 			{
		 				pen.move(-1);
		 				pen.turn(-6);
		 			}
		 			pen.setDirection(220);
		 			pen.move(0);
		 			for (int count1=1; count1<=45; count1++)
		 			{
		 				pen.move(-1);
		 				pen.turn(-6);
		 			}
		 			pen.up();
		 			pen.setDirection(90);
		 			pen.move(42);
		 			pen.setDirection(0);
		 			pen.move(132);
		 			pen.down();
		    	 }
		    	 else if(dealercard31==4)
		 			{
		    		//draw 4 bottom
		 			pen.up();
		 			pen.setDirection(90);
		 			pen.move(35);
		 			pen.setDirection(180);
		 			pen.move(25);
		 			pen.down();
		 			pen.setColor(Color.black);
		 			pen.setDirection(270);
		 			pen.move(20);
		 			pen.setDirection(0);
		 			pen.move(20);
		 			pen.setDirection(180);
		 			pen.move(10);
		 			pen.setDirection(270);
		 			pen.move(10);
		 			pen.setDirection(90);
		 			pen.move(20);
		 			
		 			// draw diamond
		 			pen.up();
		 			pen.setDirection(180);
		 			pen.move(60);
		 			pen.setDirection(90);
		 			pen.move(125);
		 			pen.setWidth(2);
		 			pen.setColor(Color.red);
		 			pen.down();
		 			pen.setDirection(290);
		 			pen.move(60);
		 			pen.setDirection(250);
		 			pen.move(60);
		 			pen.setDirection(110);
		 			pen.move(60);
		 			pen.setDirection(70);
		 			pen.move(60);
		 			
		 			//fill in
		 			pen.up();
		 			pen.setDirection(270);
		 			pen.move(3);
		 			pen.down();
		 			pen.setWidth(3);
		 			pen.setDirection(290);
		 			pen.move(59);
		 			pen.setDirection(250);
		 			pen.move(57);
		 			pen.setDirection(110);
		 			pen.move(58);
		 			pen.setDirection(70);
		 			pen.move(55);
		 			
		 			pen.setDirection(290);
		 			pen.move(55);
		 			pen.setDirection(250);
		 			pen.move(51);
		 			pen.setDirection(110);
		 			pen.move(55);
		 			pen.setDirection(70);
		 			pen.move(49);
		 			
		 			pen.setWidth(5);
		 			pen.setDirection(290);
		 			pen.move(55);
		 			pen.setDirection(250);
		 			pen.move(51);
		 			pen.setDirection(110);
		 			pen.move(55);
		 			pen.setDirection(70);
		 			pen.move(53);
		 		
		 			
		 			pen.setDirection(270);
		 			pen.move(92);
		 			pen.setDirection(0);
		 			pen.move(3);
		 			pen.setDirection(90);
		 			pen.move(83);
		 			pen.setDirection(300);
		 			pen.move(4);
		 			pen.setDirection(270);
		 			pen.move(75);
		 			pen.setDirection(75);
		 			pen.move(4);
		 			pen.setDirection(90);
		 			pen.move(65);
		 			pen.setDirection(272);
		 			pen.move(7);
		 			pen.setWidth(10);
		 			pen.setDirection(270);
		 			pen.move(50);
		 			pen.setDirection(65);
		 			pen.move(11);
		 			pen.setDirection(90);
		 			pen.move(20);
		 			pen.setDirection(180);
		 			pen.move(23);
		 			pen.setDirection(70);
		 			pen.move(29);
		 			pen.setDirection(270);
		 			pen.move(62);
		 			pen.setDirection(105);
		 			pen.move(30);
		 			pen.up();
		 			
		 			
		 			//draw 4 top
		 			pen.setWidth(2);
		 			pen.setDirection(180);
		 			pen.move(31);
		 			pen.setDirection(90);
		 			pen.move(65);
		 			pen.up();
		 			pen.setDirection(90);
		 			pen.move(35);
		 			pen.setDirection(180);
		 			pen.move(25);
		 			pen.down();
		 			pen.setColor(Color.black);
		 			pen.setDirection(270);
		 			pen.move(20);
		 			pen.setDirection(0);
		 			pen.move(20);
		 			pen.setDirection(180);
		 			pen.move(10);
		 			pen.setDirection(270);
		 			pen.move(10);
		 			pen.setDirection(90);
		 			pen.move(20);
		 			pen.up();
		 			pen.setDirection(90);
		 			pen.move(17);
		 			pen.setDirection(0);
		 			pen.move(131);
		 			pen.down();
		 			
		 		}
		    	 else if(dealercard31==5)
		    	 {
		    			pen.up();
		    			pen.setDirection(90);
		    			pen.move(35);
		    			pen.setDirection(180);
		    			pen.move(10);
		    			pen.down();
		    			
		    			//draw 5 bottom
		    			pen.setColor(Color.black);
		    			pen.setDirection(180);
		    			pen.move(15);
		    			pen.setDirection(270);
		    			pen.move(12);
		    			pen.setDirection(220);
		    			pen.move(0);
		    			for (int count1=1; count1<=45; count1++)
		    			{
		    				pen.move(-1);
		    				pen.turn(-6);
		    			}
		    			pen.up();
		    			pen.setDirection(90);
		    			pen.move(110);
		    			pen.setDirection(180);
		    			pen.move(70);
		    			
		    			//draw heart
		    			pen.down();
		    			pen.setColor(Color.RED);
		    			for(int count1=1;count1<=360;count1++)
		    			{
		    				pen.move(20);
		    				pen.turn(180);
		    				pen.move(20);
		    				pen.turn(1);
		    			}
		    			pen.up();
		    			pen.setDirection(0);
		    			pen.move(40);
		    			pen.down();
		    			for(int count1=1;count1<=360;count1++)
		    			{
		    				pen.move(20);
		    				pen.turn(180);
		    				pen.move(20);
		    				pen.turn(1);
		    			}
		    			pen.up();
		    			pen.setDirection(0);
		    			pen.move(21);
		    			pen.setDirection(270);
		    			pen.move(3);
		    			pen.down();
		    			pen.setDirection(240);
		    			pen.move(75);
		    			pen.setDirection(125);
		    			pen.move(75);
		    			pen.setDirection(0);
		    			pen.move(7);
		    			pen.setWidth(6);
		    			pen.setDirection(270);
		    			pen.move(5);
		    			pen.setDirection(305);
		    			pen.move(62);
		    			pen.setDirection(60);
		    			pen.move(60);
		    			pen.setDirection(180);
		    			pen.move(60);
		    			pen.setDirection(305);
		    			pen.move(52);
		    			pen.setDirection(60);
		    			pen.move(52);
		    			pen.setDirection(180);
		    			pen.move(52);
		    			pen.setDirection(305);
		    			pen.move(44);
		    			pen.setDirection(60);
		    			pen.move(42);
		    			pen.setDirection(180);
		    			pen.move(43);
		    			pen.setDirection(305);
		    			pen.move(42);
		    			pen.setDirection(60);
		    			pen.move(42);
		    			pen.setDirection(180);
		    			pen.move(40);
		    			pen.setDirection(305);
		    			pen.move(32);
		    			pen.setDirection(60);
		    			pen.move(32);
		    			pen.setWidth(15);
		    			pen.setDirection(180);
		    			pen.move(24);
		    			pen.setDirection(300);
		    			pen.move(15);
		    			pen.setDirection(40);
		    			pen.move(2);
		    			
		    			//Draw 5 top
		    			pen.up();
		    			pen.setDirection(90);
		    			pen.move(85);
		    			pen.setDirection(180);
		    			pen.move(50);
		    			pen.setWidth(2);
		    			pen.down();
		    			pen.setColor(Color.black);
		    			pen.setDirection(180);
		    			pen.move(15);
		    			pen.setDirection(270);
		    			pen.move(12);
		    			pen.setDirection(220);
		    			pen.move(0);
		    			for (int count1=1; count1<=45; count1++)
		    			{
		    				pen.move(-1);
		    				pen.turn(-6);
		    			}
		    			pen.up();
		    			pen.setDirection(90);
		    			pen.move(36);
		    			pen.setDirection(0);
		    			pen.move(136);
		    			pen.down();
		    	 }
		    	 else if(dealercard31==6)
		    	 {
		    		//6 on bottom
		 			pen.up();
		 			pen.setColor(Color.black);
		 			pen.setWidth(2);
		 			
		 			pen.setDirection(180);
		 			pen.move(100);
		 			pen.setDirection(250);
		 			pen.move(0);
		 			
		 			pen.up();
		 			pen.setDirection(0);
		 			pen.move(78);
		 			pen.setDirection(90);
		 			pen.move(48);
		 			pen.setDirection(250);
		 			pen.move(0);
		 			pen.down();
		 			
		 			for(int count1=1; count1<7; count1++)
		 			{
		 				pen.move(5);
		 				pen.turn(2);
		 			}
		 			
		 			for(int count1=1; count1<100; count1++)
		 			{
		 				pen.move(1);
		 				pen.turn(7);
		 			}
		 			
		 			pen.up();
		 			pen.setColor(Color.black);
		 			pen.setDirection(90);
		 			pen.move(69);
		 			pen.setDirection(180);
		 			pen.move(67);
		 			pen.down();
		 			for(int count1=1;count1<=360;count1++)
		 			{
		 				pen.move(20);
		 				pen.turn(180);
		 				pen.move(20);
		 				pen.turn(1);
		 			}
		 			
		 			pen.up();
		 			pen.setColor(Color.black);
		 			pen.setDirection(0);
		 			pen.move(40);
		 			pen.down();
		 			for(int count1=1;count1<=360;count1++)
		 			{
		 				pen.move(20);
		 				pen.turn(180);
		 				pen.move(20);
		 				pen.turn(1);
		 			}
		 			pen.up();
		 			pen.setDirection(0);
		 			pen.move(17);
		 			pen.setDirection(90);
		 			pen.move(7);
		 			pen.down();
		 			pen.setWidth(7);
		 			pen.setDirection(125);
		 			pen.move(60);
		 			pen.setDirection(230);
		 			pen.move(60);
		 			pen.setDirection(0);
		 			pen.move(65);
		 			pen.setDirection(125);
		 			pen.move(45);
		 			pen.setDirection(230);
		 			pen.move(40);
		 			pen.setDirection(0);
		 			pen.move(41);
		 			pen.setDirection(125);
		 			pen.move(30);
		 			pen.setDirection(230);
		 			pen.move(25);
		 			pen.setDirection(0);
		 			pen.move(25);
		 			pen.setDirection(130);
		 			pen.move(15);
		 			pen.setDirection(263);
		 			pen.move(15);
		 			pen.setDirection(125);
		 			pen.move(15);
		 			
		 			//stem for spade
		 			pen.up();
		 			pen.setWidth(4);
		 			pen.setDirection(270);
		 			pen.move(35);
		 			pen.setDirection(0);
		 			pen.move(9);
		 			pen.down();
		 			pen.setDirection(260);
		 			pen.move(40);
		 			pen.setDirection(0);
		 			pen.move(15);
		 			pen.setDirection(100);
		 			pen.move(40);
		 			pen.setDirection(270);
		 			pen.move(37);
		 			pen.setDirection(180);
		 			pen.move(5);
		 			pen.setDirection(80);
		 			pen.move(35);
		 			pen.setDirection(265);
		 			pen.move(35);
		 			pen.setDirection(0);
		 			pen.move(6);
		 			pen.setDirection(100);
		 			pen.move(35);
		 			pen.setDirection(95);
		 			pen.move(50);
		 			
		 			//6 on top
		 			
		 			pen.up();
		 			pen.setColor(Color.black);
		 			pen.setWidth(2);
		 			
		 			pen.setDirection(180);
		 			pen.move(125);
		 			pen.setDirection(250);
		 			pen.move(0);
		 			
		 			pen.up();
		 			pen.setDirection(0);
		 			pen.move(78);
		 			pen.setDirection(90);
		 			pen.move(55);
		 			pen.setDirection(250);
		 			pen.move(0);
		 			pen.down();
		 			
		 			for(int count1=1; count1<7; count1++)
		 			{
		 				pen.move(5);
		 				pen.turn(2);
		 			}
		 			
		 			for(int count1=1; count1<100; count1++)
		 			{
		 				pen.move(1);
		 				pen.turn(7);
		 			}
		 			pen.up();
		 			pen.setDirection(90);
		 			pen.move(37);
		 			pen.setDirection(0);
		 			pen.move(134);
		 			pen.down();
		 		
		    	 }
		    	 else if(dealercard31==7)
		    	 {
		    		//bottom number 7
		 			
		 			pen.setColor(Color.black);
		 			pen.up();
		 			pen.setDirection(90);
		 			pen.move(40);
		 			pen.setDirection(180);
		 			pen.move(30);
		 			pen.down();
		 			pen.setDirection(0);
		 			pen.move(15);
		 			pen.setDirection(270);
		 			pen.move(30);

		 			
		 			
		 			
		 			//heart
		 			pen.up();
		 			pen.setDirection(180);
		 			pen.move(80);
		 			pen.setDirection(90);
		 			pen.move(107);
		 			pen.setColor(Color.RED);
		 			pen.down();
		 			for(int count1=1;count1<=360;count1++)
		 			{
		 				pen.move(20);
		 				pen.turn(180);
		 				pen.move(20);
		 				pen.turn(1);
		 			}
		 			pen.up();
		 			pen.setDirection(0);
		 			pen.move(40);
		 			pen.down();
		 			for(int count1=1;count1<=360;count1++)
		 			{
		 				pen.move(20);
		 				pen.turn(180);
		 				pen.move(20);
		 				pen.turn(1);
		 			}
		 			pen.up();
		 			pen.setDirection(0);
		 			pen.move(21);
		 			pen.setDirection(270);
		 			pen.move(3);
		 			pen.down();
		 			pen.setDirection(240);
		 			pen.move(75);
		 			pen.setDirection(125);
		 			pen.move(75);
		 			pen.setDirection(0);
		 			pen.move(7);
		 			pen.setWidth(6);
		 			pen.setDirection(270);
		 			pen.move(5);
		 			pen.setDirection(305);
		 			pen.move(62);
		 			pen.setDirection(60);
		 			pen.move(60);
		 			pen.setDirection(180);
		 			pen.move(60);
		 			pen.setDirection(305);
		 			pen.move(52);
		 			pen.setDirection(60);
		 			pen.move(52);
		 			pen.setDirection(180);
		 			pen.move(52);
		 			pen.setDirection(305);
		 			pen.move(44);
		 			pen.setDirection(60);
		 			pen.move(42);
		 			pen.setDirection(180);
		 			pen.move(43);
		 			pen.setDirection(305);
		 			pen.move(42);
		 			pen.setDirection(60);
		 			pen.move(42);
		 			pen.setDirection(180);
		 			pen.move(40);
		 			pen.setDirection(305);
		 			pen.move(32);
		 			pen.setDirection(60);
		 			pen.move(32);
		 			pen.setWidth(15);
		 			pen.setDirection(180);
		 			pen.move(24);
		 			pen.setDirection(300);
		 			pen.move(15);
		 			pen.setDirection(40);
		 			pen.move(2);
		 			
		 			//top 7 number
		 			pen.setWidth(2);
		 			pen.setColor(Color.black);
		 			pen.up();
		 			pen.setDirection(90);
		 			pen.move(85);
		 			pen.setDirection(180);
		 			pen.move(70);
		 			pen.down();
		 			pen.setDirection(0);
		 			pen.move(15);
		 			pen.setDirection(270);
		 			pen.move(30);
		 			pen.up();
		 			pen.setDirection(90);
		 			pen.move(43);
		 			pen.setDirection(0);
		 			pen.move(125);
		 			pen.down();
		 			 
		    	 }
		    	 else if(dealercard31==8)
		    	 {
		    		//draw number 8
		    		 pen.up();
		    			pen.setDirection(145);
		    			pen.move(20);
		    			pen.setColor(Color.black);
		    			pen.setWidth(2);
		    			pen.setDirection(45);
		    			pen.move(10);
		    			pen.setDirection(270);
		    			pen.move(5);
		    			pen.setDirection(180);
		    			pen.move(5);
		    			pen.setDirection(90);
		    			pen.move(3);
		    			pen.down();
		    			
		    			
		    			
		    			for(int count1=1; count1<100; count1++)
		    			{
		    				pen.move(1);
		    				pen.turn(7);
		    			}
		    			
		    			pen.up();
		    			pen.setDirection(90);
		    			pen.move(20);
		    			pen.down();
		    			for(int count1=1; count1<100; count1++)
		    			{
		    				pen.move(1);
		    				pen.turn(7);
		    			}
		    			pen.setColor(Color.black);
		    			pen.up();
		    			pen.setDirection(0);
		    			pen.setDirection(90);
		    			pen.move(100);
		    			pen.setDirection(270);
		    			pen.move(65);
		    			pen.setDirection(90);
		    			pen.move(35);
		    			pen.setDirection(180);
		    			pen.move(37.5);
		    			pen.down();
		    			for(int count1=1;count1<=360;count1++)
		    			{
		    				pen.move(20);
		    				pen.turn(180);
		    				pen.move(20);
		    				pen.turn(1);
		    			}
		    			
		    			pen.up();
		    			pen.setColor(Color.black);
		    			pen.setDirection(180);
		    			pen.move(40);
		    			
		    			
		    			pen.down();
		    			for(int count1=1;count1<=360;count1++)
		    			{
		    				pen.move(20);
		    				pen.turn(180);
		    				pen.move(20);
		    				pen.turn(1);
		    			}
		    			pen.up();
		    			pen.setColor(Color.black);
		    			pen.setDirection(90);
		    			pen.move(30);
		    			pen.setDirection(0);
		    			pen.move(20);
		    			pen.down();
		    			for(int count1=1;count1<=360;count1++)
		    			{
		    				pen.move(20);
		    				pen.turn(180);
		    				pen.move(20);
		    				pen.turn(1);
		    			}
		    			//steam
		    			
		    			pen.up();
		    			pen.setDirection(270);
		    			pen.move(38);
		    			pen.down();
		    			pen.setColor(Color.black);
		    			pen.setDirection(255);
		    			pen.move(35);
		    			pen.setDirection(0);
		    			pen.move(20);
		    			pen.setDirection(107);
		    			pen.move(35);
		    			pen.setWidth(5);
		    			pen.setDirection(180);
		    			pen.move(3);
		    			pen.setDirection(287);
		    			pen.move(33);
		    			pen.setDirection(180);
		    			pen.move(15);
		    			pen.setDirection(75);
		    			pen.move(30);
		    			pen.setDirection(0);
		    			pen.move(1);
		    			pen.setDirection(270);
		    			pen.move(3);
		    			pen.setDirection(255);
		    			pen.move(22);
		    			pen.setWidth(7);
		    			pen.setDirection(0);
		    			pen.move(10);
		    			pen.setDirection(135);
		    			pen.move(5);
		    			pen.setDirection(90);
		    			pen.move(3);
		    			pen.setDirection(315);
		    			pen.move(4);
		    			
		    			//top number
		    			pen.up();
		    			pen.setDirection(90);
		    			pen.move(94);
		    			pen.setDirection(180);
		    			pen.move(50);
		    			pen.setColor(Color.black);
		    			pen.setWidth(2);
		    			pen.setDirection(45);
		    			pen.move(10);
		    			pen.setDirection(270);
		    			pen.move(5);
		    			pen.setDirection(180);
		    			pen.move(5);
		    			pen.setDirection(90);
		    			pen.move(3);
		    			pen.down();
		    			
		    			
		    			
		    			for(int count1=1; count1<100; count1++)
		    			{
		    				pen.move(1);
		    				pen.turn(7);
		    			}
		    			
		    			pen.up();
		    			pen.setDirection(90);
		    			pen.move(20);
		    			pen.down();
		    			for(int count1=1; count1<100; count1++)
		    			{
		    				pen.move(1);
		    				pen.turn(7);
		    			}
		    			pen.up();
		    			pen.setDirection(90);
		    			pen.move(20);
		    			pen.setDirection(0);
		    			pen.move(120);
		    			pen.down();
		    	 }
		    	 else if(dealercard31==9)
		    	 {
		    			pen.setDirection(180);
		    			pen.move(75);
		    			pen.setDirection(90);
		    			pen.move(150);
		    			pen.setWidth(2);
		    			pen.setColor(Color.red);
		    			pen.down();
		    			pen.setDirection(290);
		    			pen.move(60);
		    			pen.setDirection(250);
		    			pen.move(60);
		    			pen.setDirection(110);
		    			pen.move(60);
		    			pen.setDirection(70);
		    			pen.move(60);
		    			
		    			//fill in
		    			pen.up();
		    			pen.setDirection(270);
		    			pen.move(3);
		    			pen.down();
		    			pen.setWidth(3);
		    			pen.setDirection(290);
		    			pen.move(59);
		    			pen.setDirection(250);
		    			pen.move(57);
		    			pen.setDirection(110);
		    			pen.move(58);
		    			pen.setDirection(70);
		    			pen.move(55);
		    			
		    			pen.setDirection(290);
		    			pen.move(55);
		    			pen.setDirection(250);
		    			pen.move(51);
		    			pen.setDirection(110);
		    			pen.move(55);
		    			pen.setDirection(70);
		    			pen.move(49);
		    			
		    			pen.setWidth(5);
		    			pen.setDirection(290);
		    			pen.move(55);
		    			pen.setDirection(250);
		    			pen.move(51);
		    			pen.setDirection(110);
		    			pen.move(55);
		    			pen.setDirection(70);
		    			pen.move(53);
		    		
		    			
		    			pen.setDirection(270);
		    			pen.move(92);
		    			pen.setDirection(0);
		    			pen.move(3);
		    			pen.setDirection(90);
		    			pen.move(83);
		    			pen.setDirection(300);
		    			pen.move(4);
		    			pen.setDirection(270);
		    			pen.move(75);
		    			pen.setDirection(75);
		    			pen.move(4);
		    			pen.setDirection(90);
		    			pen.move(65);
		    			pen.setDirection(272);
		    			pen.move(7);
		    			pen.setWidth(10);
		    			pen.setDirection(270);
		    			pen.move(50);
		    			pen.setDirection(65);
		    			pen.move(11);
		    			pen.setDirection(90);
		    			pen.move(20);
		    			pen.setDirection(180);
		    			pen.move(23);
		    			pen.setDirection(70);
		    			pen.move(29);
		    			pen.setDirection(270);
		    			pen.move(62);
		    			pen.setDirection(105);
		    			pen.move(30);
		    			
		    			//nine number on bottom
		    			pen.up();
		    			pen.setDirection(270);
		    			pen.move(72);
		    			pen.setDirection(0);
		    			pen.move(65);
		    			
		    			pen.setColor(Color.black);
		    			pen.setWidth(2);
		    			pen.down();
		    			for(int count1=1; count1<100; count1++)
		    			{
		    				pen.move(1);
		    				pen.turn(7);
		    			}
		    			pen.setDirection(0);
		    			pen.move(12);
		    			pen.setDirection(90);
		    			pen.move(2);
		    			pen.setDirection(270);
		    			pen.move(17);
		    			
		    			//9 on top
		    			pen.up();
		    			pen.setDirection(90);
		    			pen.move(185);
		    			pen.setDirection(180);
		    			pen.move(120);
		    			
		    			pen.setColor(Color.black);
		    			pen.setWidth(2);
		    			pen.down();
		    			for(int count1=1; count1<100; count1++)
		    			{
		    				pen.move(1);
		    				pen.turn(7);
		    			}
		    			pen.up();
		    			pen.setDirection(0);
		    			pen.move(4);
		    			pen.setDirection(270);
		    			pen.move(12);
		    			pen.down();
		    			pen.setDirection(270);
		    			pen.move(17);
		    			pen.up();
		    			pen.setDirection(90);
		    			pen.move(38);
		    			pen.setDirection(0);
		    			pen.move(124);
		    			pen.down();
		    	 }
		    	 else if(dealercard31==10)
		    	 {
		    		//draw 10 bottom
		 			pen.up();
		 			pen.setColor(Color.black);
		 			pen.setWidth(2);
		 			pen.setDirection(90);
		 			pen.move(30);
		 			pen.setDirection(180);
		 			pen.move(35);
		 			pen.down();
		 			pen.setDirection(270);
		 			pen.move(25);
		 			pen.up();
		 			pen.setDirection(90);
		 			pen.move(0);
		 			pen.setDirection(0);
		 			pen.move(18);
		 			
		 			pen.down();
		 			for(int count1=1; count1<100; count1++)
		 			{
		 				pen.move(1);
		 				pen.turn(4.5);
		 			}
		 			pen.up();
		 			pen.setDirection(90);
		 			pen.move(110);
		 			pen.setDirection(180);
		 			pen.move(50);
		 			
		 			pen.setColor(Color.black);
		 			pen.up();
		 			pen.setDirection(0);
		 			pen.setDirection(270);
		 			pen.move(65);
		 			pen.setDirection(90);
		 			pen.move(35);
		 			pen.setDirection(180);
		 			pen.move(2);
		 			pen.down();
		 			for(int count1=1;count1<=360;count1++)
		 			{
		 				pen.move(20);
		 				pen.turn(180);
		 				pen.move(20);
		 				pen.turn(1);
		 			}
		 			
		 			pen.up();
		 			pen.setColor(Color.black);
		 			pen.setDirection(180);
		 			pen.move(40);
		 			
		 			
		 			pen.down();
		 			for(int count1=1;count1<=360;count1++)
		 			{
		 				pen.move(20);
		 				pen.turn(180);
		 				pen.move(20);
		 				pen.turn(1);
		 			}
		 			pen.up();
		 			pen.setColor(Color.black);
		 			pen.setDirection(90);
		 			pen.move(30);
		 			pen.setDirection(0);
		 			pen.move(20);
		 			pen.down();
		 			for(int count1=1;count1<=360;count1++)
		 			{
		 				pen.move(20);
		 				pen.turn(180);
		 				pen.move(20);
		 				pen.turn(1);
		 			}
		 			//steam
		 			
		 			pen.up();
		 			pen.setDirection(270);
		 			pen.move(38);
		 			pen.down();
		 			pen.setColor(Color.black);
		 			pen.setDirection(255);
		 			pen.move(35);
		 			pen.setDirection(0);
		 			pen.move(20);
		 			pen.setDirection(107);
		 			pen.move(35);
		 			pen.setWidth(5);
		 			pen.setDirection(180);
		 			pen.move(3);
		 			pen.setDirection(287);
		 			pen.move(33);
		 			pen.setDirection(180);
		 			pen.move(15);
		 			pen.setDirection(75);
		 			pen.move(30);
		 			pen.setDirection(0);
		 			pen.move(1);
		 			pen.setDirection(270);
		 			pen.move(3);
		 			pen.setDirection(255);
		 			pen.move(22);
		 			pen.setWidth(7);
		 			pen.setDirection(0);
		 			pen.move(10);
		 			pen.setDirection(135);
		 			pen.move(5);
		 			pen.setDirection(90);
		 			pen.move(3);
		 			pen.setDirection(315);
		 			pen.move(4);
		 			
		 			//draw 10 on top
		 			pen.up();
		 			pen.setDirection(90);
		 			pen.move(125);
		 			pen.setDirection(180);
		 			pen.move(70);
		 			pen.down();
		 			pen.setWidth(2);
		 			pen.setDirection(270);
		 			pen.move(25);
		 			pen.up();
		 			pen.setDirection(90);
		 			pen.move(0);
		 			pen.setDirection(0);
		 			pen.move(17);
		 			
		 			pen.down();
		 			for(int count1=1; count1<100; count1++)
		 			{
		 				pen.move(1);
		 				pen.turn(4.5);
		 			}
		 			pen.up();
		 			pen.setDirection(90);
		 			pen.move(25);
		 			pen.setDirection(0);
		 			pen.move(110);
		 			pen.down();
		    	 }
		 			else if(dealercard31==11)
		 			{
		 				pen.up();
		 				pen.setDirection(90);
		 				pen.move(40);
		 				pen.setDirection(180);
		 				pen.move(15);
		 				pen.down();
		 				
		 				//draw j on bottom
		 				pen.setColor(Color.black);
		 				pen.setDirection(180);
		 				pen.move(10);
		 				pen.setDirection(0);
		 				pen.move(20);
		 				pen.setDirection(180);
		 				pen.move(10);
		 				pen.setDirection(270);
		 				pen.move(25);
		 				pen.setDirection(90);
		 				pen.move(0);
		 				for (int count1=1; count1<=25; count1++)
		 				{
		 					pen.move(-1);
		 					pen.turn(-8);
		 				}
		 				pen.up();
		 				pen.setDirection(90);
		 				pen.move(100);
		 				pen.setDirection(180);
		 				pen.move(67);
		 				
		 				//draw heart
		 				pen.setColor(Color.RED);
		 				pen.down();
		 				for(int count1=1;count1<=360;count1++)
		 				{
		 					pen.move(20);
		 					pen.turn(180);
		 					pen.move(20);
		 					pen.turn(1);
		 				}
		 				pen.up();
		 				pen.setDirection(0);
		 				pen.move(40);
		 				pen.down();
		 				for(int count1=1;count1<=360;count1++)
		 				{
		 					pen.move(20);
		 					pen.turn(180);
		 					pen.move(20);
		 					pen.turn(1);
		 				}
		 				pen.up();
		 				pen.setDirection(0);
		 				pen.move(21);
		 				pen.setDirection(270);
		 				pen.move(3);
		 				pen.down();
		 				pen.setDirection(240);
		 				pen.move(75);
		 				pen.setDirection(125);
		 				pen.move(75);
		 				pen.setDirection(0);
		 				pen.move(7);
		 				pen.setWidth(6);
		 				pen.setDirection(270);
		 				pen.move(5);
		 				pen.setDirection(305);
		 				pen.move(62);
		 				pen.setDirection(60);
		 				pen.move(60);
		 				pen.setDirection(180);
		 				pen.move(60);
		 				pen.setDirection(305);
		 				pen.move(52);
		 				pen.setDirection(60);
		 				pen.move(52);
		 				pen.setDirection(180);
		 				pen.move(52);
		 				pen.setDirection(305);
		 				pen.move(44);
		 				pen.setDirection(60);
		 				pen.move(42);
		 				pen.setDirection(180);
		 				pen.move(43);
		 				pen.setDirection(305);
		 				pen.move(42);
		 				pen.setDirection(60);
		 				pen.move(42);
		 				pen.setDirection(180);
		 				pen.move(40);
		 				pen.setDirection(305);
		 				pen.move(32);
		 				pen.setDirection(60);
		 				pen.move(32);
		 				pen.setWidth(15);
		 				pen.setDirection(180);
		 				pen.move(24);
		 				pen.setDirection(300);
		 				pen.move(15);
		 				pen.setDirection(40);
		 				pen.move(2);
		 				pen.up();
		 				pen.setDirection(90);
		 				pen.move(88);
		 				pen.setDirection(180);
		 				pen.move(53);
		 				
		 				// draw j on top
		 				pen.down();
		 				pen.setWidth(2);
		 				pen.setColor(Color.black);
		 				pen.setDirection(180);
		 				pen.move(10);
		 				pen.setDirection(0);
		 				pen.move(20);
		 				pen.setDirection(180);
		 				pen.move(10);
		 				pen.setDirection(270);
		 				pen.move(25);
		 				pen.setDirection(90);
		 				pen.move(0);
		 				for (int count1=1; count1<=25; count1++)
		 				{
		 					pen.move(-1);
		 					pen.turn(-8);
		 				}
		 				pen.up();
		 				pen.setDirection(90);
		 				pen.move(35);
		 				pen.setDirection(0);
		 				pen.move(139);
		 				pen.down();
		 			}
		 			else if(dealercard31==12)
		 			{
		 				pen.up();
		 				pen.setDirection(90);
		 				pen.move(35);
		 				pen.setDirection(180);
		 				pen.move(30);
		 				pen.down();
		 				
		 				// draw Q bottom
		 				pen.setColor(Color.black);
		 				for (int count1=1; count1<=150; count1++)
		 				{
		 					pen.move(1);
		 					pen.turn(4);
		 				}
		 				pen.setDirection(325);
		 				pen.move(10);
		 				pen.setDirection(145);
		 				pen.move(20);
		 				pen.up();
		 				pen.setDirection(90);
		 				pen.move(75);
		 				pen.setDirection(180);
		 				pen.move(30);
		 				
		 				//draw club
		 				
		 				pen.setColor(Color.black);
		 				pen.down();
		 				for(int count1=1;count1<=360;count1++)
		 				{
		 					pen.move(20);
		 					pen.turn(180);
		 					pen.move(20);
		 					pen.turn(1);
		 				}
		 				
		 				pen.up();
		 				pen.setColor(Color.black);
		 				pen.setDirection(180);
		 				pen.move(40);
		 				
		 				
		 				pen.down();
		 				for(int count1=1;count1<=360;count1++)
		 				{
		 					pen.move(20);
		 					pen.turn(180);
		 					pen.move(20);
		 					pen.turn(1);
		 				}
		 				pen.up();
		 				pen.setColor(Color.black);
		 				pen.setDirection(90);
		 				pen.move(30);
		 				pen.setDirection(0);
		 				pen.move(20);
		 				pen.down();
		 				for(int count1=1;count1<=360;count1++)
		 				{
		 					pen.move(20);
		 					pen.turn(180);
		 					pen.move(20);
		 					pen.turn(1);
		 				}
		 				//steam
		 				
		 				pen.up();
		 				pen.setDirection(270);
		 				pen.move(38);
		 				pen.down();
		 				pen.setColor(Color.black);
		 				pen.setDirection(255);
		 				pen.move(35);
		 				pen.setDirection(0);
		 				pen.move(20);
		 				pen.setDirection(107);
		 				pen.move(35);
		 				pen.setWidth(5);
		 				pen.setDirection(180);
		 				pen.move(3);
		 				pen.setDirection(287);
		 				pen.move(33);
		 				pen.setDirection(180);
		 				pen.move(15);
		 				pen.setDirection(75);
		 				pen.move(30);
		 				pen.setDirection(0);
		 				pen.move(1);
		 				pen.setDirection(270);
		 				pen.move(3);
		 				pen.setDirection(255);
		 				pen.move(22);
		 				pen.setWidth(7);
		 				pen.setDirection(0);
		 				pen.move(10);
		 				pen.setDirection(135);
		 				pen.move(5);
		 				pen.setDirection(90);
		 				pen.move(3);
		 				pen.setDirection(315);
		 				pen.move(4);
		 				
		 				pen.up();
		 				pen.setDirection(90);
		 				pen.move(130);
		 				pen.setDirection(180);
		 				pen.move(55);
		 				
		 				//Draw Q top
		 				pen.down();
		 				pen.setColor(Color.black);
		 				pen.setWidth(2);
		 				for (int count1=1; count1<=150; count1++)
		 				{
		 					pen.move(1);
		 					pen.turn(4);
		 				}
		 				pen.setDirection(325);
		 				pen.move(10);
		 				pen.setDirection(145);
		 				pen.move(20);
		 				pen.up();
		 				pen.setDirection(90);
		 				pen.move(23);
		 				pen.setDirection(0);
		 				pen.move(123);
		 				pen.down();
		 			}
		 			else if(dealercard31==13)
		 			{
		 				pen.up();
		 				pen.setDirection(90);
		 				pen.move(35);
		 				pen.setDirection(180);
		 				pen.move(23);
		 				pen.down();
		 				
		 				//Draw K bottom
		 				pen.setColor(Color.black);
		 				pen.setDirection(270);
		 				pen.move(30);
		 				pen.up();
		 				pen.setDirection(0);
		 				pen.move(15);
		 				pen.down();
		 				pen.setDirection(135);
		 				pen.move(20);
		 				pen.setDirection(45);
		 				pen.move(20);
		 				pen.up();
		 				pen.setDirection(90);
		 				pen.move(120);
		 				pen.setDirection(180);
		 				pen.move(65);
		 				pen.down();
		 				
		 				//draw diamond
		 				pen.setColor(Color.red);
		 				pen.setDirection(290);
		 				pen.move(60);
		 				pen.setDirection(250);
		 				pen.move(60);
		 				pen.setDirection(110);
		 				pen.move(60);
		 				pen.setDirection(70);
		 				pen.move(60);
		 				
		 				//fill in
		 				pen.up();
		 				pen.setDirection(270);
		 				pen.move(3);
		 				pen.down();
		 				pen.setWidth(3);
		 				pen.setDirection(290);
		 				pen.move(59);
		 				pen.setDirection(250);
		 				pen.move(57);
		 				pen.setDirection(110);
		 				pen.move(58);
		 				pen.setDirection(70);
		 				pen.move(55);
		 				
		 				pen.setDirection(290);
		 				pen.move(55);
		 				pen.setDirection(250);
		 				pen.move(51);
		 				pen.setDirection(110);
		 				pen.move(55);
		 				pen.setDirection(70);
		 				pen.move(49);
		 				
		 				pen.setWidth(5);
		 				pen.setDirection(290);
		 				pen.move(55);
		 				pen.setDirection(250);
		 				pen.move(51);
		 				pen.setDirection(110);
		 				pen.move(55);
		 				pen.setDirection(70);
		 				pen.move(53);
		 			
		 				
		 				pen.setDirection(270);
		 				pen.move(92);
		 				pen.setDirection(0);
		 				pen.move(3);
		 				pen.setDirection(90);
		 				pen.move(83);
		 				pen.setDirection(300);
		 				pen.move(4);
		 				pen.setDirection(270);
		 				pen.move(75);
		 				pen.setDirection(75);
		 				pen.move(4);
		 				pen.setDirection(90);
		 				pen.move(65);
		 				pen.setDirection(272);
		 				pen.move(7);
		 				pen.setWidth(10);
		 				pen.setDirection(270);
		 				pen.move(50);
		 				pen.setDirection(65);
		 				pen.move(11);
		 				pen.setDirection(90);
		 				pen.move(20);
		 				pen.setDirection(180);
		 				pen.move(23);
		 				pen.setDirection(70);
		 				pen.move(29);
		 				pen.setDirection(270);
		 				pen.move(62);
		 				pen.setDirection(105);
		 				pen.move(30);
		 				pen.up();
		 				pen.setDirection(90);
		 				pen.move(95);
		 				pen.setDirection(180);
		 				pen.move(55);
		 				
		 				//Draw K top
		 				pen.down();
		 				pen.setWidth(2);
		 				pen.setColor(Color.black);
		 				pen.setDirection(270);
		 				pen.move(30);
		 				pen.up();
		 				pen.setDirection(0);
		 				pen.move(15);
		 				pen.down();
		 				pen.setDirection(135);
		 				pen.move(20);
		 				pen.setDirection(45);
		 				pen.move(20);
		 				pen.up();
		 				pen.setDirection(90);
		 				pen.move(10);
		 				pen.setDirection(0);
		 				pen.move(123);
		 				pen.down();
		 			}
				 return dealercard31;
	}

	public int Callnumber(int number)
	{
		System.out.println();
		if(number==1)
		{
			System.out.println("You picked up 'A'");
		}
		else if(number==2)
		{
			System.out.println("You picked up '2'");
		}
		else if(number==3)
		{
			System.out.println("You picked up '3'");
		}
		else if(number==4)
		{
			System.out.println("You picked up '4'");
		}
		else if(number==5)
		{
			System.out.println("You picked up '5'");
		}
		else if(number==6)
		{
			System.out.println("You picked up '6'");
		}
		else if(number==7)
		{
			System.out.println("You picked up '7'");
		}
		else if(number==8)
		{
			System.out.println("You picked up '8'");
		}
		else if(number==9)
		{
			System.out.println("You picked up '9'");
		}
		else if(number==10)
		{
			System.out.println("You picked up '10'");
		}
		else if(number==11)
		{
			System.out.println("You picked up 'J'");
		}
		else if(number==12)
		{
			System.out.println("You picked up 'Q'");
		}
		else if(number==13)
		{
			System.out.println("You picked up 'K'");
		}
		return number;
		
	}
}
