//Single inheritence
class Square{
	int l, b;
	Square(int x, int y){
		l=x;
		b=y;
	}
	void area(){
		System.out.println("Area of Square is: " + l*b);
	}
}
class Cube extends Square{
	int h;
	Cube(int x, int y, int z){
		super(x, y);
		h=z;
	}
	void volume(){
		System.out.println("Voulume of Cube is: " + l*b*h);
	}
}
class Shape{
	public static void main(String args[]){
		Cube obj = new Cube(10, 20, 30);
		obj.area();
		obj.volume();
	}
}
