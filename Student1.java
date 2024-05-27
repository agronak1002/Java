class Student{
	int id;
	String name;
}
class Student1{
	public static void main(String args[]){
		Student obj = new Student();
		obj.id=101;
		obj.name = "abc";
		System.out.println("Id = " + obj.id + " Name= " + obj.name);
	}
}