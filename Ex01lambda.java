package week5day5_lamda;

public class Ex01lambda {

	public static void main(String[] args) {
		MyInterfaceImp f = new MyInterfaceImp();
		f.specMethod();
		
		//�͸�Ŭ���� ����ϴ� ���
		MyInterface f2 = new MyInterface() {
			@Override
			public void specMethod() {
				System.out.println("��ɱ���");
			}
		};
		f2.specMethod();
		//���ٽ�
		MyInterface f3 = ()-> System.out.println("����� �����ն���");
		f3.specMethod();

	}

}
class MyInterfaceImpl implements MyInterface{
	@Override
	public void specMethod() {
		System.out.println("��ɱ����մϴ�");
	}
}
