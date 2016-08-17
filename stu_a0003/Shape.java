public abstract class Shape {
	private int id;
	String name;
	String color;
	public void setName(){
                this.name = name;
        }
        public void setColor(){
                this.color = color;
        }
	public String getName(){
		return name;
	}
	public String getColor(){
		return color;
	}
	public abstract double calculateArea();            
	    
}

class Circle extends Shape {
	public static final double PI = 3.14159265358979323846;
	protected double r;
	protected String name;
	String color;         // Instance data
	public Circle(double r){
		this.r = r;

	
	}          // Constructor
	public double getRadius() {
		return r; 
	}          
	public double calculateArea() {
		return PI*r*r;
	//	System.out.println(a);
	 
	}          
	  
}

class Rectangle extends Shape {
	protected double w, h;
	protected String name;
	String color;             // Instance data
	public Rectangle(double w, double h) {               // Constructor
		this.w = w; 
		this.h = h;
	

 
	}
	public double getWidth() { 
		return w; 	
	}               // Accessor method
	public double getHeight() { 
		return h; 
	}              // Another accessor
	public double calculateArea() { 
		return w*h; 
	}                 // Implementations of
	
}
