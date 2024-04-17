import java.util.Scanner;
class Player
{
	int number;
	public void guess()
	{
		number=(int)(Math.random()*10);
	}
}
class Game
{
	Scanner scan = new Scanner(System.in);
	Player p1;
	Player p2;
	Player p3;
	void startGame()
	{
		p1 = new Player();
		p2 = new Player();
		p3 = new Player();
		
		boolean p1isRight=false;
		boolean p2isRight=false;
		boolean p3isRight=false;
		
		int target = (int)(Math.random()*100)+1;
		System.out.println("I am thinking of a number between 1 to 100");
		 int i=1;
		while(i<=3)
		{
			//System.out.println("Number to be Guessed : "+target);
			p1.guess();
			p2.guess();
			p3.guess();
			//guessp1=p1.number;
			System.out.println("Player One Guess : ");
			int guessp1=scan.nextInt();
			//guessp2=p2.number;
			System.out.println("Player Two Guess : ");
			int guessp2=scan.nextInt();
			//guessp3=p3.number;
			System.out.println("Player Three Guess : ");
			int guessp3=scan.nextInt();
			if(target==guessp1)
				p1isRight=true;
			if(target==guessp2)
				p2isRight=true;
			if(target==guessp3)
				p3isRight=true;
			
			if(p1isRight || p2isRight || p3isRight)
			{
				System.out.println("Good One");
				if(p1isRight)
				System.out.println("Player one is Winner");
				else if(p2isRight)
				System.out.println("Player Two is Winner");
				else
				System.out.println("Player Three is Winner ");
				System.out.println("Game Over");
				break;
			}
			else
			{
				System.out.println("Try to Guess the Value....");
				if(guessp1<target)
			         System.out.println("Player One Guess More Value");
				else if(guessp1>target)
				    System.out.println("Player One Guess Less Value");
				if(guessp2<target)
				    System.out.println("Player Two Guess More Value");
				else if(guessp2>target)
				    System.out.println("Player Two Guess Less Value");
				if(guessp3<target)
				    System.out.println("Player Three Guess More Value");
				if(guessp3>target)
				    System.out.println("Player Three Guess Less Value");
				System.out.println("****************************************");
			}
			i++;
		}
		if(!(p1isRight || p2isRight || p3isRight))
		{
			System.out.println("you are lost your chance");
			System.out.println("Better Luck Next Time");
		}
	}
	
}

public class GuessGame {

	public static void main(String[] args) {
		Game game=new Game();
		game.startGame();

	}

}