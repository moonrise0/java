package shape;

public class Rectangle extends shape {

	
	private double width;
	private double height;
	//생성자는 상속안되니깐 구현해야함.
	
	public Rectangle() {
	}
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public Rectangle(int x, int y, double width, double height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}



	@Override
	public double getArea() {
		return width * height;
		
	}

	

	@Override
	public double getCircumn() {
	
			return (width + height) * 2;
		
	}

	
}
