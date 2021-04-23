package week5day5_lamda;

public class Ex01lambda {

	public static void main(String[] args) {
		MyInterfaceImp f = new MyInterfaceImp();
		f.specMethod();
		
		//익명클래스 사용하는 방식
		MyInterface f2 = new MyInterface() {
			@Override
			public void specMethod() {
				System.out.println("기능구현");
			}
		};
		f2.specMethod();
		//람다식
		MyInterface f3 = ()-> System.out.println("기능을 구현합람다");
		f3.specMethod();

	}

}
class MyInterfaceImpl implements MyInterface{
	@Override
	public void specMethod() {
		System.out.println("기능구현합니다");
	}
}
