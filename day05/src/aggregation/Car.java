package aggregation;

public class Car {
	public String name;
	public String color;
	public int size;
	//속성
	
	
	//생성자constructor . 클래스에 의해 객체가 생성될때 디폴트로 세팅해주는 역할, 생성자는 동일한 이름이어도 상관없다.
    public Car() { //이게 디폴트 컨스트럭쳐
    	
    	this.name = "k1";   
    	this.color = "red";
    	this.size = 1000;		
    }
	
	public Car(String name, String color, int size) { //아규먼트 있는 컨스트럭쳐
 		this.name = name; //this가 번지개념
		this.color = color;
		this.size = size;
	}
	
	
    
    @Override
	public String toString() {
		return "Car [name=" + name + ", color=" + color + ", size=" + size + "]";
	}

	//오퍼레이션
	public void go() {
//		System.out.println( this.name+ "Go Car ...");
		           //print 로 바꾸면 
		System.out.printf("%s, %s Go Car ....", this.name,this.color);
	}

	public void stop() {
//		System.out.println( this.name + "Stop Car ...");
	}
}