package week5day5_lamda;

public class ex01lamda {

	public static void main(String[] args) {
		// �������� ���
		MyInterfaceImp f = new MyInterfaceImp();
		f.specMethod();
		
		//�͸�Ŭ���� ����ϴ� ���
		MyInterface f2 = new MyInterface(){ //=> MyInterface�� ��ӹ޾Ƽ� Ŭ������ �̸����� �����ϰ� ���� 
			@Override
			public void specMethod() {
				System.out.println("��ɱ���");
			}
		};
		f2.specMethod();
		new MyInterface() {
			@Override
			public void specMethod() {
				System.out.println("��ɱ���");
			}
		}.specMethod();
		
		//���ٽ�
		MyInterface f3 = ()-> System.out.println("���ٽ�: �Լ������α׷���..����� �͸�۷����� �͸�ü�� �����ȴ�.");
		f3.specMethod();
		
		
			
			
		}

	}



class MyInterfaceImp implements MyInterface{
	@Override
	public void specMethod() {
		System.out.println("��ɱ���");
	}
}