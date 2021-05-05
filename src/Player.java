import java.util.ArrayList;
import java.util.*;
import java.util.Random;

public class Player {
	//player stats
	int str;
	int Int;
	int dex;
	int agility;
	int luck;
	int max_health;
	int current_health;
	//Additional stuff
	int money;
	int damage_mod;
	int lvlxp ;
	int current_xp;
	
	//include random values
	Random rand = new Random();
	//arraylist containing items this is a basic inventory system
	ArrayList<String> items = new ArrayList<String>();
	//adds items to the arraylist
	treasure treausure = new treasure();
	

	Enemy orge = new Enemy(30, 10, 1, "orge");
	Enemy goblin = new Enemy(5, 2, 10,"goblin");
	Enemy skel = new Enemy(10, 7, 2, "skeleton");

	public void inititem() {
		items.add("compass");
	}
	public void add_inventory() {
		items.add(treausure.item());
	}
	
	public void get_dam(){
		System.out.println(damage_mod);
	}
	
	public void set_dam() {
		damage_mod = 10 + (dex+str);
		
	}
	public void full_heal() {
		current_health = max_health;
		items.remove("Potion");
	}
	
	public void get_inventory() {
		System.out.println(items);
		if(items.contains("Potion")) {
			System.out.println("would you like to use a Potion? input yes");
			@SuppressWarnings("resource")
			Scanner inputs = new Scanner(System.in);
			var input_2 = inputs.next();
			if(input_2.equals("yes")) {
				full_heal();
			}	
		}
	}
	public void fight(int p_health,int p_dam){
		while (p_health>0) {
			current_health = current_health - p_dam;
			p_health  = p_health- damage_mod;
		}
	}
	public void get_stats() {
		System.out.println("str: " + str);
		System.out.println("Int: " + Int);
		System.out.println("dex: " + dex);
		System.out.println("luck: " + luck);
		System.out.println("agility: " + agility);
		System.out.println("damage: " + damage_mod);
		System.out.println("health: "+ current_health +"/"+ max_health);
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
		agility = agility + randomnum();
		max_health += 50;
		current_health +=45;
		lvlxp += 30;
		set_dam();
		
	}
	public void gain_xp(int xp) {
		current_xp += xp;
		if (current_xp>=lvlxp) {
			lvlup();
		}
	}
	
	public int randomnum() {
		int num = rand.nextInt(5);
		return num;
		
	}
	public void get_cur_health() {
		System.out.println(current_health);
	}
	public void encounter() {
		int num3 = rand.nextInt(3);
		if (num3==0) {
			System.out.println("you have encountered a orge ");
			fight(orge.health, orge.dam);
			gain_xp(orge.health);
			add_money(orge.dam);
			add_inventory();
		}
		else if (num3==1) {
			System.out.println("you have encountered a goblin ");
			fight(goblin.health, goblin.dam);
			gain_xp(goblin.health);
			add_money(goblin.dam);
			add_inventory();
		}
		if (num3==2) {
			System.out.println("you have encountered a skeleton ");
			fight(skel.health, skel.dam);
			gain_xp(skel.health);
			add_money(skel.dam);
			add_inventory();
		}
		if (num3==3) {
			
		}
	}
}
