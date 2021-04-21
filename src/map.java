import java.util.Random;

public class map {
	int x ;
	int y ;
	int dis_x;
	int dis_y;
	int dis_2;
	float dis;
	int T;
	int Tresure_x;
	int Treasure_y;
	
	Random rand = new Random();
	
	public int getTresure_x() {
		return Tresure_x;
	}

	public void setTresure_x() {
		Tresure_x = rand.nextInt(10);
		
	}

	public int getTreasure_y() {
		return Treasure_y;
	}

	public void setTreasure_y() {
		Treasure_y = rand.nextInt(10);
	}
	public void set_x() {
		x = 5;
	}
	public void set_y() {
		y = 5;
	}

	public int getDis_x() {
		return dis_x;
	}

	public int getDis_y() {
		return dis_y;
	}

	public int getDis_2() {
		return dis_2;
	}

	public float getDis() {
		return dis;
	}

	public float location() {
		dis_x = getTresure_x() - getX();
		dis_y = getTreasure_y() - getY();
		dis_2 = ( dis_x*dis_x )+(dis_y*dis_y);
		dis = (float) Math.sqrt(dis_2);
		System.out.println("your compass reads "+dis);
		return dis;
	}
	
	public int getX() {
		return x;
	}
	public void setX_west(int x) {
		this.x = --x;
		setT();
	}
	public void setX_east(int x) {
		this.x = ++x;
		setT();
	}
	public int getY() {
		return y;
	}
	public void setY_north(int y) {
		this.y = ++y;
		setT();
	}
	public void setY_south(int y) {
		this.y = --y;
		setT();
}
	
	public void setT() {
		++T ;
	}
	public int getT() {
		return T;
	}

}
