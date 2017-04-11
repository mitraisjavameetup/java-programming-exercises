
public class ComplexArithmetic extends Arithmetic{

	public ComplexArithmetic() {
		super();
		// TODO Auto-generated constructor stub
	}
		public int sum (int [] x){
			int y = 0;
			for (int i = 1; i < x.length; i++) {
			y+=Add(x[i-1], x[i]);
			}
			return y;
		}
		public int average (int [] x){
			return sum(x)/x.length;
			
		}
	
}
