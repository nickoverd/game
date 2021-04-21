
public class map {
	int x ;
	int y ;
	int T;
	
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
