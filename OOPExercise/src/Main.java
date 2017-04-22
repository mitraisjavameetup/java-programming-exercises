
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		ComplexArithmetic a = new ComplexArithmetic();
		int [] data = {10,20,30,40,50};
		System.out.println(a.sum(data));
		System.out.println(a.average(data));
	  
		AreaCalculator b = new AreaCalculator();
		System.out.println(b.circleArea(10));
		System.out.println(b.rectangleArea(10, 5));
		
	}
	
	
}
