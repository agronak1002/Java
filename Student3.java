class Student{
	int id;
	String name;
	Student(){
		System.out.println("This is Default Constructor");
	}
	Student (int i, String n){
		id=i;
		name=n;
	}
	void display(){
		System.out.println("Id = " + id + " Name= " + name);
	}
}
class Student3{
	public static void main(String args[]){
		Student obj = new Student(101, "abc");
		obj.display();
		Student obj1 = new Student();
		
	}
}