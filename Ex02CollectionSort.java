package week5day5_lamda;

import java.util.ArrayList;
import java.util.Collections;

class Student3 implements Comparable<Student3>{
	
	String name;
	String address;
	int age;
	
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
		
	}
	public Student3(String name, String address, int age) {
		this.name = name;
		this.address = address;
		this.age = age;
	}
	@Override
	public String toString() {
		return name + " :" + address + " " + age; 
	}
	
	@Override
	public int compareTo(Student3 o) {
		return this.name.compareTo(o.name);
	}
}

public class Ex02CollectionSort {

	public static void main(String[] args) {
		ArrayList<Student3> arrys = new ArrayList<>();
		
		Student3 a = new Student3("ȫ�浿","�����",19);
		Student3 b = new Student3("��浿","�ϳ���",29);
		Student3 c = new Student3("���浿","���ֽ�",39);
		Student3 d = new Student3("��浿","�λ��",79);
		
		arrys.add(a);
		arrys.add(b);
		arrys.add(c);
		arrys.add(d);
		
		//list ����
		Collections.sort(arrys);
		
		for(Student3 s:arrys)
			System.out.println(s);
		
	}

}
