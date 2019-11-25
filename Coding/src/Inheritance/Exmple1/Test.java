package Inheritance.Exmple1;

public class Test {

	public static void main(String[] args) {

	
		ClassA A = new ClassB();
		System.out.println(A.i);
		A.method();
		
		ClassB B = new ClassB();
		System.out.println(B.i);
		B.method();
			
		ClassA AA = new ClassA();
		System.out.println(AA.i);
		AA.method();

	}

}
