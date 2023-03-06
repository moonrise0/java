package shape;

public abstract class shape { //클래스만들때  abrstract선택
	protected int x ;
	protected int y ;
	
	
	public shape() {   //생성자
	}


	public shape(int x, int y) { //x와 y 초기화
		this.x = x;
		this.y = y;
	}
    
	public abstract double getArea();  // abstract Method 없으면 빨간줄뜸.
	public abstract double getCircumn();
	
	public String getXY() {
		return x + " , " + y ;
	}
}
