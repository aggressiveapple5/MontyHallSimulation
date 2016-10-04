

public class MontyHallSimulation
{

	public static void main(String[] args)
	{
	
	
		int numSwitchWins = 0;
		
		int numSimulations = Integer.parseInt(args[0]);
		for(int i = 0; i < numSimulations; i++)
		{
			numSwitchWins += game();
		}
		
		double percentSwitchWin = (double) numSwitchWins/numSimulations * 100;
		
		percentSwitchWin = format(percentSwitchWin);
		
		
		System.out.println("Switch Win: " + percentSwitchWin + "%");
		System.out.println("Stay Win: " + (100 - percentSwitchWin) + "%" );
	
	
	
	
	
	}
	/**
	* This method simulates one Monty Hall game
	* and returns 1 if switch win, 0 otherwise
	* 
	* @return int return 1 if switch win, 0 otherwise
	*/
	
	
	
	public static int game()
	{
		int car = (int) (Math.random() * 3 + 1);
		int userPick = (int) (Math.random() * 3 + 1);
		if (car == userPick)
			return 0;
		else
			return 1;
	
	
	
	}




	public static double format(double number)
	{
		
		number = number * 100;
		number = (int) number;
		number = number / 100;
		return number;
	
	
	
	
	
	
	
	
	
	}











}