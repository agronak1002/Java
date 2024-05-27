import java.util.Scanner;
class myException extends Exception{
	myException(String msg){
		super(msg);  //inheritence  object  (condition: constructor)
	}
}  //custom exception
class Zero{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int a, b;
		float c;
		System.out.println("Enter the numerator: ");
		a=s.nextInt();
		System.out.println("Enter the denominator: ");
		b=s.nextInt();
		try{
			if(b==0){
				throw new myException("Division by zero not possible");
			}
			else if(a=='a'){
				throw new myException("Division by char");
			}
			else{
				c=a/b;
				System.out.println("Division = " + c);
			}
		}
		catch(myException e){
			System.out.println(e.getMessage());
		}
		finally{
			System.out.println("Successful");
		}
	}
}

/*class A{
	int z;
	A(int p){
		z=p;
	}
}
class B extends A{
	int x, y;
	B(int a, int b){
		super(a);
		b=y;
	}
}*/