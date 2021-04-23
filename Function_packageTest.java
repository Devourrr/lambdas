package week5day5_lamda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Function_packageTest {

	public static void main(String[] args) {
		Supplier<Integer>s =()-> (int) (Math.random()*100)+1; //1~100���� ����
		Consumer<Integer>c = i-> System.out.print(i + ",");
		Predicate<Integer>p = i-> i%2 ==0;
		Function<Integer, Integer> f= i-> i/10 *10; //i�� ���� �ڸ��� ������ 0���� �����
		int result = s.get();
		System.out.println(result);
		
		c.accept(10);
		
		boolean result2 = p.test(5);
		System.out.println(result2);
		
		int result3 = f.apply(98);
		System.out.println(result3);
		

	}

}
