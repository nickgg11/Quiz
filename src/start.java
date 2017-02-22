import java.util.Random;
import java.util.Scanner;

public class start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner (System.in);
		Random rnd=new Random();
		String play="";		
		int ans1 =0;
		int ans2=0;
		String difficulty;
		int playerans;
		int counterM;
		int counterE;
		do
		{
			System.out.println("what difficulty do you want? easy,medium,hard? rounding included");
			difficulty= in.nextLine();
			if (difficulty.equalsIgnoreCase("Easy")){
				System.out.println("Okay welcome to the game, The number range is 1-50 and there is only + & -");
				counterE=0;
				while (counterE<=10)
				{
					int random1E= rnd.nextInt(50-1+1)+1;
					int random2E=rnd.nextInt(50-1+1)+1;
					int SignE=rnd.nextInt(2-1+1)+1;
					if(SignE==1)
					{
						counterE++;
						ans1= random1E+random2E;
						System.out.println("The question is "+random1E+"+"+random2E);
						playerans=in.nextInt();
						if (playerans==ans1)
						{
							System.out.println("Congratulations you guess correct!");
						}
						else
						{
							System.out.println("Sorry but your incorrect.");
						}
					}
					else
					{
						counterE++;
						ans1= random1E-random2E;
						System.out.println("The question is "+random1E+"-"+random2E);
						playerans=in.nextInt();
						if (playerans==ans1)
						{
							System.out.println("Congratulations you guess correct!");
						}
						else
						{
							System.out.println("Sorry but your incorrect.");
						}
					}
					System.out.println("Bonus Question \n How many times did you use a calculator");
					System.out.println("Do you want to continue playing?");
					in.hasNextLine();
					play=in.nextLine();
				}

			}
			else if(difficulty.equalsIgnoreCase("Medium")){
				System.out.println("Welcome to the game, the number range is 1-100 and the signs are +,-,x,/");
				counterM=0;
				while(counterM<=10)
				{
					int random1M= rnd.nextInt(100-1+1)+1;
					int random2M=rnd.nextInt(100-1+1)+1;
					int signM=rnd.nextInt(4-1+1)+1;
					if (signM==1)
					{
						ans2= random1M+random2M;
						System.out.println("The question is "+random1M+"+"+random2M);
						playerans=in.nextInt();
						if (playerans==ans2)
						{
							System.out.println("Congratulations you guess correct!");
						}
						else
						{
							System.out.println("Sorry but your incorrect.");
						}
					}
					else if(signM==2)
					{
						ans2= random1M-random2M;
						System.out.println("The question is "+random1M+"-"+random2M);
						playerans=in.nextInt();
						if (playerans==ans2)
						{
							System.out.println("Congratulations you guess correct!");
						}
						else
						{
							System.out.println("Sorry but your incorrect.");
						}

					}
					else if (signM==3)
					{
						ans2= random1M * random2M;
						System.out.println("The question is "+random1M+"*"+random2M);
						playerans=in.nextInt();
						if (playerans==ans2)
						{
							System.out.println("Congratulations you guess correct!");
						}
						else
						{
							System.out.println("Sorry but your incorrect.");	
						}
					}
					else if (signM==4)
					{
						ans2= random1M / random2M;
						System.out.println("The question is "+random1M+"/"+random2M);
						playerans=in.nextInt();
						if (playerans==ans2)
						{
							System.out.println("Congratulations you guess correct!");
						}
						else
						{
							System.out.println("Sorry but your incorrect.");	
						}
						System.out.println("Bonus Question \n How many times did you use a calculator");
						System.out.println("Would you like to still play?");
						in.hasNextLine();
						play=in.nextLine();
					}
				}
			}
			else if(difficulty.equalsIgnoreCase("Hard")){
				System.out.println("Welcome to the game, the number range is 1-5000 and the signs are +,-,x,/,^(exponent)");
				int counterH;
				counterH=0;
				while(counterH<=10)
				{
					int random1H= rnd.nextInt(5000-1+1)+1;
					int random2H=rnd.nextInt(5000-1+1)+1;
					int signH=rnd.nextInt(4-1+1)+1;
					if (signH==1)
					{
						ans2= random1H+random2H;
						System.out.println("The question is "+random1H+"+"+random2H);
						playerans=in.nextInt();
						if (playerans==ans2)
						{
							System.out.println("Congratulations you guess correct!");
						}
						else
						{
							System.out.println("Sorry but your incorrect.");
						}
					}
					else if(signH==2)
					{
						ans2= random1H-random2H;
						System.out.println("The question is "+random1H+"-"+random2H);
						playerans=in.nextInt();
						if (playerans==ans2)
						{
							System.out.println("Congratulations you guess correct!");
						}
						else
						{
							System.out.println("Sorry but your incorrect.");
						}

					}
					else if (signH==3)
					{
						ans2= random1H * random2H;
						System.out.println("The question is "+random1H+"*"+random2H);
						playerans=in.nextInt();
						if (playerans==ans2)
						{
							System.out.println("Congratulations you guess correct!");
						}
						else
						{
							System.out.println("Sorry but your incorrect.");	
						}
					}
					else if (signH==4)
					{
						ans2= random1H / random2H;
						System.out.println("The question is "+random1H+"/"+random2H);
						playerans=in.nextInt();
						if (playerans==ans2)
						{
							System.out.println("Congratulations you guess correct!");
						}
						else
						{
							System.out.println("Sorry but your incorrect.");	
						}	
					}
					System.out.println("Bonus Question \n How many times did you use a calculator");
					System.out.println("Do you still want to play?");
					in.hasNextLine();
					play=in.nextLine();
				}
			}

		}while(play.equalsIgnoreCase("yes"));
	}
}

