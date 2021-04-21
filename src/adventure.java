import java.util.Scanner;

public class adventure {
	void adventures() {
		map map = new map();
		@SuppressWarnings("resource")
		Scanner input_travel = new Scanner(System.in);

		while (map.getX() != 5 & map.getY() != 2) {
			
			System.out.println("you come to a stop and wonder where is next North South East or West");
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
				System.out.println(map.getY());
			}
			else if (direction.equals("South")) {
				map.setY_south(map.getY());
			}
			else if (direction.equals("East")) {
				map.setX_east(map.getX());
				System.out.println(map.getX());
			}
			
			else if (direction.equals("West")) {
				map.setX_west(map.getX());
			}
			else {
				System.out.println("you forget which direction you are suppost to go was it North?");
				//System.out.println(direction);
			}

		}
		treasure treasure = new treasure();
		treasure.get_treasure();
		System.out.println("well done you have succeeded where none have failed ;)");
	}
}
