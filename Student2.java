class Student{
	int id;
	String name;
	void getdata(int i, String n){ 
		id=i;
		name=n;
	}
	void display(){
		System.out.println("Id = " + id + " Name= " + name);
	}
}
class Student2{
	public static void main(String args[]){
		Student obj = new Student();
		obj.getdata(101, "abc");
		obj.display();
	}
}