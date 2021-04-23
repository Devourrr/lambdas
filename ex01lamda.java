package week5day5_lamda;

public class ex01lamda {

	public static void main(String[] args) {
		// 람다이전 방식
		MyInterfaceImp f = new MyInterfaceImp();
		f.specMethod();
		
		//익명클래스 사용하는 방식
		MyInterface f2 = new MyInterface(){ //=> MyInterface를 상속받아서 클래스를 이름없이 정의하고 있음 
			@Override
			public void specMethod() {
				System.out.println("기능구현");
			}
		};
		f2.specMethod();
		new MyInterface() {
			@Override
			public void specMethod() {
				System.out.println("기능구현");
			}
		}.specMethod();
		
		//람다식
		MyInterface f3 = ()-> System.out.println("람다식: 함수형프로그래밍..사실은 익명글래스로 익명객체가 생성된다.");
		f3.specMethod();
		
		
			
			
		}

	}



class MyInterfaceImp implements MyInterface{
	@Override
	public void specMethod() {
		System.out.println("기능구현");
	}
}