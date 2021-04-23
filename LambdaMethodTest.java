package week5day5_lamda;

class Calc{
	public static void calcAdd(AddInterface f)
	{
		int result = f.add(5, 7);
		System.out.println(result);
	}
	
	public static void calcMulti (MultiInterface f) {
		int result = f.multi(5,7);
		System.out.println(result);
	}
}

public class LambdaMethodTest {

	public static void main(String[] args) {
		Calc.calcAdd((x,y)-> x+y);
		Calc.calcMulti((x,y)->x*y);
		//¿Õ∏Ì
		Calc.calcAdd(new AddInterface() {
			@Override
			public int add(int num1, int num2) {
				return num1+num2;
			}
		});
		Calc.calcMulti(new MultiInterface() {
			@Override
			public int multi(int num1, int num2) {
				return num1 * num2;
			}
		});

	}

}
