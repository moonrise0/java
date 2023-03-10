package statics;

public class Car {

	
	  private String name;
	  private String maker;
	  public static String makerName = "HD"; 
	  
	  public Car() {
		  
	  }
	  
	  public Car(String name) {
		  this.name = name;
	  }
	  
	  
	  public Car(String name, String maker) {
		  this.maker= maker;
		  this.name = name;
	  }

	@Override
	public String toString() {
		return "Car [name=" + name + ", maker=" + maker + "]";
	}
	  
	  
	  
}
