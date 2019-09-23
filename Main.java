import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author nathan
 *
 */

public class Main {
	
	private static DecimalFormat df2 = new DecimalFormat("#.##");

	public static Character characterCreation() {
		
		Scanner input = new Scanner(System.in);
		
		String name;
		String job;
		double startingMoney = 0;
		int startingHealth = 0;
		String confirm;
		
		System.out.println("What is your name?");
		name = input.nextLine();
		System.out.println("Greetings, " + name + ".");
		
		do {
			
			confirm = "no"; //default value for confirmation of job
			
			System.out.println("What is your profession? The harder your job, the tougher you are, but the less money you have.");
			System.out.println("Type \"farmer\", \"butcher\", or \"merchant\".");
			job = input.next();
		
			if(job.equals("farmer") || job.equals("butcher") || job.equals("merchant"))
			{
				//setting money based on job
				
				switch (job)
				{
					case "farmer":
						startingMoney = 150;
						startingHealth = 150;
						break;
					case "butcher":
						startingMoney = 275;
						startingHealth = 110;
						break;
					case "merchant":
						startingMoney = 400;
						startingHealth = 75;
						break;
				}

				//asking for user confirmation
				System.out.println("You are a " + job + ". You start with $" + df2.format(startingMoney) + ". You have " + startingHealth + " max health.");
				System.out.println("Would you like to confirm this choice? Type \"yes\" or \"no\"");
				confirm = input.next();
			}
		
			else 
			{
				System.out.println("Not a valid job. Try again.");
				job = "none";
			}
			
		}while(job.equals("none") || !confirm.equals("yes"));
		
		int startingIntelligence;
		int startingCharisma;
		
		System.out.println("You have 2 stats to set: Intelligence and Charisma.");
		System.out.println("Intelligence determines your ability to preform certain actions which may be important to the story.");
		System.out.println("Charisma determines your ability to interact with other characters and the outcomes of said interactions.");
		
		do {
			System.out.println("You have 8 points to distribute.");
			System.out.println("How many points would you like to put in Intelligence?");
			startingIntelligence = input.nextInt();
			System.out.println("How many points would you like to put in Charisma?");
			startingCharisma = input.nextInt();
			
				if(startingIntelligence + startingCharisma > 8)
				{
					System.out.println("You used more than 8 points. Try again.");
				}
				else if(startingIntelligence + startingCharisma < 8)
				{
					System.out.println("You didn't use all 8 points.");
				}
				else
				{
					System.out.println("Intelligence: " + startingIntelligence);
					System.out.println("Charisma: " + startingCharisma);
					break;
				}
		
		}while(!(startingIntelligence + startingCharisma == 8));
		
		Character player = new Character(name, startingMoney, startingHealth, startingIntelligence, startingCharisma);
		System.out.println("Your name is " + name + ". You are a " + job + ". You have $" + df2.format(startingMoney) + " and " + startingHealth + " health.");
		System.out.println("You have " + startingIntelligence + " intelligence and " + startingCharisma + " charisma.");
		return player;
		
		}
	
	public static Character getplayer() {
		Character player = characterCreation();
		return player;
	}
	
	public static void main(String[] args) {
		//declaring scanner and random number generator "num"
		Scanner input=new Scanner(System.in);
		Random num = new Random();
		
		//Instructions
		System.out.println("[REMINDER: TYPE ALL INPUTS IN LOWERCASE (besides names)]");
		System.out.println("Welcome to the world of Exarune.");
		System.out.println("It is olden times. You live in a small town on the outskirts of a kingdom.");
		
			Character player = characterCreation();
		
		System.out.println("");
		System.out.println("---------------------------------------------------------------------------------------------------------------------");
		System.out.println("");
		System.out.println("You wake up in your cozy bed. The sun peers through your window.");
		System.out.println("It will soon be time for the annual scavenger hunt in the village.");
		System.out.println("This event is put on for the children every year. Everyone gets together and has a good time.");
		System.out.println("Your bed feels so nice however... and you're very tired.");
		
			String stayAsleep;
		
			do {
				System.out.println("Do you pull yourself out of bed now?");
				stayAsleep = input.next();
				if(stayAsleep.equals("yes")){
					break;
				}
				else if(stayAsleep.equals("no")) {
					break;
				}
				else
				{
					System.out.println("Enter \"yes\" or \"no\"");
				}
			}while(!(stayAsleep.equals("yes")) && !(stayAsleep.equals("no")));
			
			
			
		if(stayAsleep.equals("yes")) {
			
				System.out.println("You slowly get out of bed and get ready for the day. What a responsible person.");
				System.out.println("After a quick breakfast, you head outside down the path to the center of the village");
				System.out.println("Everyone is there waiting - you were almost too late.");
				System.out.println("The children are already running around following clues.");
				System.out.println("Do you join them or go and talk to the other adults?");
				System.out.println("Type \"join\" or \"chat\"");
				String joinChat;
				joinChat = input.next();
				
					if(joinChat.equals("join")) {
						System.out.println("You walk over to where the children are and hear one read a clue.");
						System.out.println("");
						System.out.println("[Child] The next clue lies on a big boulder, people may go there but the trees are older.");
						System.out.println("");
						System.out.println("The children shout about a huge rock in the forest. That must be where it is");
						System.out.println("You haven't been in the forest in a long time. It was deep and dark and seemed like it could be dangerous.");
						
						String warn;
						
							//warning children
							do {
								System.out.println("Do you warn the children not to go?");
								warn = input.next();
								if(warn.equals("yes")){
									System.out.println("You tell the children that the forest is dangerous.");
									System.out.println("They don't care.");
									break;
								}
								else if(!(warn.equals("yes")) && !(warn.equals("no")))
								{
									System.out.println("Enter \"yes\" or \"no\"");
								}
							}while(!(warn.equals("yes")) && !(warn.equals("no")));
							
							//children run to forest
							System.out.println("The children all begin running to the forest.");
							System.out.println("You follow close behind.");
							System.out.println("You enter the thick group of trees. They seem to go on forever. The children keep running.");
							System.out.println("Your right shoe comes unitied. Do you stop to tie it or keep running?");

							String tieShoe;
							
								do {
									System.out.println("Type \"tie\" or \"continue\".");
									tieShoe = input.next();
									if(tieShoe.equals("tie"))
									{
										break;
										
									}
									else if(tieShoe.equals("continue"))
									{
										break;
									}
									
								}while(!(tieShoe.equals("tie")) && !(tieShoe.equals("continue")));
								
							//story after tying shoe
							if(tieShoe.equals("tie"))
							{
								System.out.println("You stop running and kneel down to tie your shoe.");
								if(player.intelligence == 0)
								{
									System.out.println("Your intelligence is so low, you can't even figure out how to tie your shoe.");
									System.out.println("You stand back up and deal with the loose laces.");
								}
								else
								{
									System.out.println("Thankfully, your are smart enough to successfully tie your shoe.");
								}
								
								System.out.println("Unfortunately, the village children have all ran on and you have now lost them.");
								System.out.println("You look around and judge your surroundings.");
								System.out.println("Do you want to ");
									
							}
							else if(tieShoe.equals("continue"))
							{
								System.out.println("You keep running.");
								//POSSIBLY ADD THE THE ABILITY TO NOT TRIP AND INSTEAD KEEP GOING BASED ON HIGH INTELLIGENCE
								System.out.println("Unfortunately, you soon regret neglecting to tie your shoe.");
								System.out.println("You trip and fall to the ground.");
							}
						
					}
					//story from staying
					else if(joinChat.equals("chat")) {
						
						Chat.chat();
						
					}
					
		else if(stayAsleep.equals("no")) {
			
				System.out.println("Your eyes close again and you drift back to sleep.");
					//timing delay	
				int timeToWait = 3; //second
				try {
					for (int i=0; i<timeToWait ; i++) {
						Thread.sleep(1000);
						System.out.print(".");
					}
				} catch (InterruptedException ie)
				{
					Thread.currentThread().interrupt();
				}
					try {
						Thread.sleep(1000);
					} catch (InterruptedException ie)
					{
						Thread.currentThread().interrupt();
					}
				System.out.println("After a while, you wake up again.");
				System.out.println("You check the clock - you missed the scavenger hunt!");
				System.out.println("Oh well.");
				
				String stayAsleep2;
				
					do {
						System.out.println("Do you wake up now?");
						stayAsleep2 = input.next();
						if(stayAsleep2.equals("yes")){
							break;
						}
						else if(stayAsleep2.equals("no")) {
							break;
						}
						else
						{
							System.out.println("Enter \"yes\" or \"no\"");
						}
					}while(!(stayAsleep2.equals("yes")) && !(stayAsleep2.equals("no")));
				
					//Story after the scavenger hunt 
					if(stayAsleep2.equals("yes")){
						System.out.println("");
					}
					else { //you failed at life (sleep too much)
						System.out.println("You drift back to sleep once again.");
						System.out.println("You sleep.");
						System.out.println("And sleep.");
						System.out.println("And sleep.");
						System.out.println("A day that was full of oppurtunity, a day full of adventure and mystery, wasted.");
						System.out.println("You'll never get this day back, you know.");
						System.out.println("You will never experience the wild possibilities of this day...");
							try {
								Thread.sleep(3000);
							} catch (InterruptedException ie)
							{
								Thread.currentThread().interrupt();
							}
						System.out.println("Game Over. Thanks for playing!");
						System.exit(0);
					}
			}
		}//end of staying asleep the first time
	}
	
	public static void deathCheck(Character jimmy) {
		if(jimmy.health == 0)
		{
			System.out.println("Ouchies. You are dead. Thanks for playing!");
			System.exit(0);
		}
	}
	
}
