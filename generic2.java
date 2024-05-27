class gen <T1, T2>{
	T1 age;
	T2 name;
	void getdata(T1 age, T2 name){
		this.age=age;
		this.name=name;
	}
	void display(){
		System.out.println("Age = " + age + "Name = " + name);
	}
}
class generic2 {
	public static void main(String args[]){
		gen <Integer, String> obj2 = new gen();
		obj2.getdata(12, "arjun");
		obj2.display();
	}
}
