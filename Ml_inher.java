//Multilevel inheritence
class A{
	void printA(){
		System.out.println("Class A printed");
	}
}
class B extends A{
	void printB(){
		System.out.println("Class B printed");
	}
}
class C extends B{
	void printC(){
		System.out.println("Class C printed");
	}
}
class Ml_inher{
	public static void main(String args[]){
		C obj = new C();
		obj.printA();
		obj.printB();
		obj.printC();
	}
}