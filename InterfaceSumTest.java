package week5day5_lamda;

import java.util.function.Function;

public class InterfaceSumTest {

	public static void main(String[] args) {
		InterfaceSum f = a-> {
								int sum = 0;
								for(int i=1; i<a;i++)
									sum+=i;
								return sum;
		};
		System.out.println(f.sum(10));
		
		//java.util.function
		Function<Integer, Integer> f1 = a->{
								int sum = 0;
								for(int i=1; i<a;i++)
									sum+=i;
								return sum;
		};
		int result2 = f1.apply(10);
		System.out.println(result2);

	}

}
