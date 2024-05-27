class A extends Thread{      //java.lang  -  builtin
	public void run(){
		for(int i = 0; i<5; i++){
			System.out.println("I " +i);
		}
	}
}
class B extends Thread{
	public void run(){
		for(int j = 0; j<5; j++){
			System.out.println("J  "+j);
		}
	}
}
class C extends Thread{
	public void run(){
		for(int k = 0; k<5; k++){
			System.out.println("K "+k);
		}
	}
}
public class ThreadClass{
	public static void main(String args[]){
		new A().start();
		B obj = new B();
		obj.start();
		obj.suspend();
		new C().start();
	}
}

