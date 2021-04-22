import java.util.Random;
public class treasure {
	Random rand = new Random();
	int num = rand.nextInt(3);
	String[] all_loot = {"Lanturn","Sword","Spy glass",""};
	// lanturn will provide light in areas - sword fight - spy glass -
	public String item() {
		
		String items = all_loot[num];
		return items;
	}
	
	}
