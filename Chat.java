import java.util.Scanner;

public class Chat {
	
	public static void chat() {
		
		Scanner input = new Scanner(System.in);
	
		Character chatPlayer = Main.getplayer();
		
		System.out.println("You walk over to where the other adults are standing.");
		if(chatPlayer.charisma == 0)
		{
			System.out.println("Your charisma is so low everyone instantly hates you.");
			System.out.println("You died of embarrasment.");
			chatPlayer.health = 0;
			Main.deathCheck(chatPlayer);		
		}
		//story if you don't die of embarrassment
		else
		{
			System.out.println("You converse with a couple other townsfolk.");
			System.out.println("You see a stranger in a heavy black coat.");
			String talkToStranger;
			
			do {
				System.out.println("Do you try to talk to him?");
				talkToStranger = input.next();
				if(talkToStranger.equals("yes")){
					break;
				}
				else if(talkToStranger.equals("no"))
				{
					//trying to ignore the stranger
					System.out.println("You turn away and avert your eyes.");
						try {
							Thread.sleep(1500);
						} catch (InterruptedException ie)
						{
							Thread.currentThread().interrupt();
						}
					System.out.println("The mysterous vibes call to you.");
						try {
							Thread.sleep(2000);
						} catch (InterruptedException ie)
						{
							Thread.currentThread().interrupt();
						}
					System.out.println("You attempt to ignore him.");
						try {
							Thread.sleep(2100);
						} catch (InterruptedException ie)
						{
							Thread.currentThread().interrupt();
						}
					System.out.println("A voice in your head forces you to confront the stranger.");
						try {
							Thread.sleep(2500);
						} catch (InterruptedException ie)
						{
							Thread.currentThread().interrupt();
						}
					System.out.println("You give up.");
					break;
				}
				else
				{
					System.out.println("Enter \"yes\" or \"no\"");
				}
				
			}while(!(talkToStranger.equals("yes")) && !(talkToStranger.equals("no")));
			
		//talking to stranger
		if(chatPlayer.charisma >= 5)
		{
			System.out.println("You ask the stranger his name.");
			System.out.println("He notices your somewhat charismatic personality and decides to answer.");
			System.out.println("");
			System.out.println("[Stranger] That's not relevant.");
			System.out.println("");
			
				System.out.println("What else would you like to ask him?");
				String strangerConversation;
					
		}
		else
		{
			System.out.println("You attempt to start a conversation.");
			System.out.println("He's unimpressed by your uncharasmatic personality.");
			System.out.println("He turns you away.");
		}
	}//end of else (chat story if you don't die of embarrassment)
				
	}
		
}
