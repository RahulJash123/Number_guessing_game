import java.util.Scanner;
import java.util.Random;

public class NumberGussesingGame{

	public static void main(String args[])
    { 
    		generateRandom();
    }


    public static void generateRandom(){
    
    	Random rand=new Random();

    	//Generating a random number between 0-10
    	int randomNum=rand.nextInt(100)+1;

    	//Calling guess method
    	guess(randomNum);
    }//end generateRandom method



    public static void guess(int randomNum){
    	//creating an object of Scanner Class
    	Scanner sc=new Scanner(System.in);

    	//Welcome Message
    	System.out.println("......................Number Guessing Game...........................");
		System.out.println("YOU GOT ONLY 10 CHANCE");
    	System.out.println(" Guess a number between 1-100: ");
		int tries=0;
		while(tries<=10){
			int guess=sc.nextInt();
			tries++;
		if (guess==randomNum)
		{
			System.out.println("!correct! !YOU WIN!  " );
			System.out.println("It took you " +tries+ "tries");
			break;
		}
		else if (guess >= randomNum)
		{
			System.out.println("No! The number is higher . Guess again \n");
		}
		else
		{
			System.out.println("NO! The number is Lower . Guess again");
		}
		}
		if(tries>10)
		{
			System.out.println("Sorry, you loose , PLEASE TYR AGAIN");
		}
			else{
		System.out.println("............THANK YOU FOR PALYING, HAVE A NICE DAY..............");
			}
    	//Play again or exit?
    	System.out.println("Press 1 to Play again.");
    	System.out.println("Press 0 to exit.");
    	int choice=sc.nextInt();

    	if(choice==1)
    		generateRandom();
    	else{
    		return;
		}
    }//end guess method

}//end class