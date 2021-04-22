import java.util.ArrayList;
import java.util.Random;

public class Player {
	int str;
	int Int;
	int dex;
	int perception;
	int luck;
	int money;
	Random rand = new Random();
	ArrayList<String> items = new ArrayList<String>();
	treasure treausure = new treasure();

	public void inititem() {
		items.add("compass");
	}
	public void add_inventory() {
		items.add(treausure.item());
	}
	
	public void get_inventory() {
		System.out.println(items);
	}
	public void get_stats() {
		System.out.println("str: " + str);
		System.out.println("Int: " + Int);
		System.out.println("dex: " + dex);
		System.out.println("luck: " + luck);
		System.out.println("perception: " + perception);
	}
	public void add_money(int $) {
		money = money + $;
	}
	
	public int get_money() {
		System.out.println(money);
		return money;
	}
	public void lvlup() {
		str = str + randomnum();
		Int = Int + randomnum();
		dex = dex + randomnum();;
		luck = luck + randomnum();
		perception = perception + randomnum();
		
	}
	public int randomnum() {
		int num = rand.nextInt(5);
		return num;
		
	}
}
