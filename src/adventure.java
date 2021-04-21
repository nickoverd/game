import java.util.Scanner;

public class adventure {
	void adventures() {
		map map = new map();
		@SuppressWarnings("resource")
		Scanner input_travel = new Scanner(System.in);
		map.setTreasure_y();
		map.setTresure_x();
		map.set_x();
		map.set_y();
		while (map.getX()!= map.getTresure_x() || map.getY()!= map.getTreasure_y()) {
			
			System.out.println("you come to a stop and wonder where is next North South East or West");
			map.location();
			{
			if (map.getY() <= -2) {
				System.out.println("you feel a foul taste in the air going anymore South is a bad idea");
			}
			if (map.getY() >= 5) {
				System.out.println("you feel a foul taste in the air going anymore North is a bad idea");
			}
			if (map.getX() <= -4) {
				System.out.println(
						"naviagion is not your strong suit ... you see a sign saying 'DO NOT ENTER' in the West");
			}
			if (map.getX() >= 6) {
				System.out.println(
						"naviagion is not your strong suit ... you see a sign saying 'DO NOT ENTER' in the East");
			}
			if (map.getX() == 4 && map.getY() == 20) {
				System.out.println("you feel a blaze on this very spot");
			}
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
			else {
				System.out.println("you forget which direction you are suppost to go was it North?");
				//System.out.println(direction);
			}

		}
		
		int num = map.getT();
		if (num < 7) {
			System.out.println("you have recieved 10000 gold coins");
			System.out.println("almost as if you knew where the treasure was");
		}
		else if (num < 9) {
			System.out.println("you have recieved 1000 gold coins");
		}
		else if(num < 12) {
			System.out.println("you have recieved 100 gold coins");
		}
		else {
			System.out.println("you have recieved 10 gold coins");
			System.out.println("if only you got here before everyone else");
		
		System.out.println("well done you have succeeded where none have failed ;)");
	}
	}
}
