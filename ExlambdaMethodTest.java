package week5day5_lamda;

public class ExlambdaMethodTest {

	public static void main(String[] args) {
	AddInterface instance = (x,y) -> x+y;
	
	AddInterface instance2 = new AddInterface() {
		@Override
		public int add(int num1, int num2) {
			return num1 + num2;
		}
	};
	
	int result = instance.add(5, 7);
	int result2 = instance2.add(5, 7);
	
	System.out.println(result);
	System.out.println(result2);
	

	}

}
