package exercicio1;

public class Rectangle {
	
	double width, height;
	
	public double area() {
		
		return width * height;		
	}
	
	public double perimeter() {
				
		return 2*(width + height);
	}
	
	public double diagonal() {
		
		return Math.sqrt(Math.pow(width, 2.0) + Math.pow(height, 2.0));
	}
	
	
	public String toString() {
		
		return String.format("Area: %.2f%n", area()) + 
			   String.format("Perimiter: %.2f%n", perimeter()) + 
			   String.format("Diagonal: %.2f%n", diagonal());
	}
	
	
}
