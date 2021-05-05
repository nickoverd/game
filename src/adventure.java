import java.util.Random;
import java.util.Scanner;

public class adventure {
	void adventures() {
		map map = new map();
		Player player = new Player();
		@SuppressWarnings("resource")
		Scanner input_travel = new Scanner(System.in);
		Random rand = new Random();
		//sets up the adventure
		map.setTreasure_y();
		map.setTresure_x();
		map.set_x();
		map.set_y();
		player.inititem();
		player.lvlup();
		
		while (map.getX()!= map.getTresure_x() || map.getY()!= map.getTreasure_y()) {
			int num = rand.nextInt(2);
			System.out.println("you come to a stop and wonder where is next North South East or West");
			System.out.println("or maybe you would like to look at your Inventory or stats");
			map.location();
			if (num == 0){
				player.encounter();
				player.add_inventory();
				
			}
			if (player.current_health<=0){
				break;
			}
			var direction = input_travel.next();
			if (direction.equals("North")) {
				map.setY_north(map.getY());
				
			}
			else if (direction.equals("South")) {
				map.setY_south(map.getY());
			}
			else if (direction.equals("East")) {
				map.setX_east(map.getX());
				
			}
			
			else if (direction.equals("West")) {
				map.setX_west(map.getX());
			}
			else if (direction.equals("Inventory")) {
				player.get_money();
				player.get_inventory();
			}
			else if (direction.equals("stats")) {
				player.get_stats();
			}
			else {
				System.out.println("you forget which direction you are suppost to go was it North?");
				//System.out.println(direction);
			}

		}
		if (map.x==map.Tresure_x || map.y==map.Treasure_y) {
			int num2 = map.getT();
			if (num2 < 7) {
				System.out.println("you have recieved 10000 gold coins");
				player.add_money(10000);
				System.out.println("almost as if you knew where the treasure was");
			}
			else if (num2 < 9) {
				System.out.println("you have recieved 1000 gold coins");
				player.add_money(1000);
			}
			else if(num2 < 12) {
				System.out.println("you have recieved 100 gold coins");
				player.add_money(100);
			}
			else {
				System.out.println("you have recieved 10 gold coins");
				player.add_money(10);
				System.out.println("if only you got here before everyone else");
			
		}
		System.out.println("this is what you have attained on your journey");
		player.get_money();
		player.get_inventory();
		}
		else {
			System.out.println("you have failed");
		}
	}
}
