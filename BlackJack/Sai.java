package BlackJack;
import java.awt.Color;

import TurtleGraphics.StandardPen;
public class Sai {

	     public int PrintCard1(int playercard1)
	     {
	    	 StandardPen pen = new StandardPen();
			
	    	 
			 if(playercard1==1)
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
				for(int count=1;count<=360;count++)
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
				for(int count=1;count<=360;count++)
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
	    	 }
	    	 else if(playercard1==2)
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
	    	 }
	    	 else if(playercard1==3)
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
	    	 }
	    	 else if(playercard1==4)
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
	 			}
	    	 else if(playercard1==5)
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
	    	 }
	    	 else if(playercard1==6)
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

	 		
	    	 }
	    	 else if(playercard1==7)
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
	    	 }
	    	 else if(playercard1==8)
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
	    			for(int count=1;count<=360;count++)
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
	    			for(int count=1;count<=360;count++)
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
	    			for(int count=1;count<=360;count++)
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
	    	 }
	    	 else if(playercard1==9)
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
	    	 }
	    	 else if(playercard1==10)
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
	 			pen.move(18);
	 			
	 			pen.down();
	 			for(int count1=1; count1<100; count1++)
	 			{
	 				pen.move(1);
	 				pen.turn(4.5);
	 			}
	    	 }
	 			else if(playercard1==11)
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
	 			}
	 			else if(playercard1==12)
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
	 				pen.move(75);
	 				pen.setDirection(180);
	 				pen.move(30);
	 			}
	 			else if(playercard1==13)
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
	 			}
			return playercard1;
	    	 
	    	 
	     }
	     
	     public int Card1(int playercard1)// parameters
	     {
	    	 
	    	 StandardPen pen = new StandardPen();
	    	 
	    	 System.out.println("You win");
	    	 if(playercard1==1)
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
				for(int count=1;count<=360;count++)
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
				for(int count=1;count<=360;count++)
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
	    	 }
	    	 else if(playercard1==2)
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
	    	 }
	    	 else if(playercard1==3)
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
	    	 }
	    	 else if(playercard1==4)
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
	 			}
	    	 else if(playercard1==5)
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
	    	 }
	    	 else if(playercard1==6)
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

	 		
	    	 }
	    	 else if(playercard1==7)
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
	    	 }
	    	 else if(playercard1==8)
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
	    			for(int count=1;count<=360;count++)
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
	    			for(int count=1;count<=360;count++)
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
	    			for(int count=1;count<=360;count++)
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
	    	 }
	    	 else if(playercard1==9)
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
	    	 }
	    	 else if(playercard1==10)
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
	 			pen.move(18);
	 			
	 			pen.down();
	 			for(int count1=1; count1<100; count1++)
	 			{
	 				pen.move(1);
	 				pen.turn(4.5);
	 			}
	    	 }
	 			else if(playercard1==11)
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
	 			}
	 			else if(playercard1==12)
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
	 				pen.move(75);
	 				pen.setDirection(180);
	 				pen.move(30);
	 			}
	 			else if(playercard1==13)
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
	 			}
	    	 
			return playercard1;
	     }
}
