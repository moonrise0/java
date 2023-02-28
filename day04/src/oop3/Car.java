package oop3;

public class Car {
	private String name;
	private String color;
	private int size;
	private int fsize; //전체 사이즈
	private int cfsize; //통에 넣은 사이즈.
	
	
	
	public Car() {//소스 제너레이터 USING필드
	}



	public Car(String name, String color, int size, int fsize) {
		this.name = name;
		this.color = color;
		this.size = size;
		this.fsize = fsize;
	}



	public Car(String name, String color, int size, int fsize, int cfsize) {
		this(name, color, size, fsize);
		this.cfsize = cfsize;
	}



	@Override
	public String toString() { //소스 투스트링
		return "Car [name=" + name + ", color=" + color + ", size=" + size + ", fsize=" + fsize + ", cfsize=" + cfsize
				+ "]";
	}
	
	//기름을 넣는다.
	//기름통 보다 많이 넣으면 - 다시 주유하세요.
	//음수 값이 들어가면 다시 입력하세요.를 출력한다. 색구분 잘해
	public void setCfsize(int size) {
	          
	         if (size <= 0 || fsize< (cfsize + size )) {
	     		System.out.printf("다시 주유하세요");
	     		return;
	     	} 
	               cfsize += size; 
//	         if (cfsize + size > fsize ) {
//	     		System.out.printf("다시 주유하세요");
//	     	} else( cfsize + size = cfsize) {  
//	         System.out.printf("지금현재는 ~입니다.");
	}
	
	
	
	
	
	
	
	
	//주행을 한다. 1리터당 10km를 주행가능하다.
	public void go(int distance) { 
		if(cfsize < 0 || (distance/10)> cfsize) {
			System.out.println("주유하시고 출발핫에");
			return;
	}
		System.out.printf("%s %d Go...", this.name, distance);
		cfsize = cfsize - (distance/10);
	}
	
	//멈춘다
      public void stop() { 
		System.out.printf("%s Stop...", this.name);
	}
	
	
	//생성자constructor . 클래스에 의해 객체가 생성될때 디폴트로 세팅해주는 역할, 생성자는 동일한 이름이어도 상관없다.




}