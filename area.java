import java.util.Scanner;
class area{
	public static void main(String args[]){
		int l, b, a;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the length of rectangle: ");
		l=obj.nextInt();
		System.out.println("Enter the breadth of rectangle: ");
		b=obj.nextInt();
		a=l*b;
		System.out.println("Area = " + a);
	}
}