class gen <T extends Number>{
	T age;
	void getdata(T age){
		this.age=age;
	}
	void display(){
		System.out.println("Age = " + age);
	}
}
class generic {
	public static void main(String args[]){
		gen <Double> obj1= new gen();
		gen <Integer> obj2 = new gen();
		obj1.getdata(12.6);
		obj2.getdata(12);
		obj1.display();
		obj2.display();
	}
}
