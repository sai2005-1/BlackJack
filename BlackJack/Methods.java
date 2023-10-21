package BlackJack;

import java.util.Random;

public class Methods 
{	
	public void PrintNumber()
	{
		Random generator = new Random();

		int dice1, dice2, roll;
		dice1= generator.nextInt(6)+1;
		dice2= generator.nextInt(6)+1;
		roll=dice1+dice2;
		if(roll==2)
		{
			System.out.println("two");
		}
		else if(roll==3)
		{
			System.out.println("three");
		}
		else if(roll==4)
		{
			System.out.println("four");
		}
		else if(roll==5)
		{
			System.out.println("five");
		}
		else if(roll==6)
		{
			System.out.println("six");
		}
		else if(roll==7)
		{
			System.out.println("seven");
		}
		else if(roll==8)
		{
			System.out.println("eight");
		}
		else if(roll==9)
		{
			System.out.println("nine");
		}
		else if(roll==10)
		{
			System.out.println("ten");
		}
		else if(roll==11)
		{
			System.out.println("eleven");
		}
		else if(roll==12)
		{
			System.out.println("twelve");
		}

	}
}