import java.util.Random;
public class treasure {
	Random rand = new Random();
	String[] all_loot = {"Lanturn","Sword","Spy glass","Potion"};
	// lanturn will provide light in areas - sword fight - spy glass -
	public String item() {
		int numb = rand.nextInt(3);
		String items = all_loot[numb];
		System.out.println("you have recieved a " + all_loot[numb]);
		return items;
	}
	
	}
