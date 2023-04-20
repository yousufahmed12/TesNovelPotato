package testing;

public class Circle {
	
	private int size;
	private int x;
	private int y;
	
	
	public Circle(int size, int x, int y) {
		this.size = size;
		this.x = x;
		this.y = y;
	}


	@Override
	public String toString() {
		return "Circle [size=" + size + ", x=" + x + ", y=" + y + "]";
	}
	
	
	
	

}
