
public class treasure {

	public void get_treasure() {
		map map = new map();
		int num = map.getT();
		if (num < 5) {
			System.out.println("you have recieved 10000 gold coins");
			System.out.println("almost as if you knew where the treasure was");
		}
		else if (num < 7) {
			System.out.println("you have recieved 1000 gold coins");
		}
		else if(num < 9) {
			System.out.println("you have recieved 100 gold coins");
		}
		else {
			System.out.println("you have recieved 10 gold coins");
			System.out.println("if only you got here before everyone else");
		}
		// TODO Auto-generated method stub
	}
}
