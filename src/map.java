
public class map {
	int x ;
	int y ;
	int dis_x;
	int dis_y;
	int dis_2;
	float dis;
	int T;
	
	public float location() {
		dis_x = 5 - getX();
		dis_y = 2 - getY();
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
		this.T++;
	}
	public void setX_east(int x) {
		this.x = ++x;
		this.T++;
	}
	public int getY() {
		return y;
	}
	public void setY_north(int y) {
		this.y = ++y;
		this.T++;
	}
	public void setY_south(int y) {
		this.y = --y;
		this.T++;
}
	public int getT() {
		return T;
	}

}
