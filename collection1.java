import java.util.*;
class collection1{
	public static void main(String args[]){
		List a = new Vector();
		a.add("abc");  
		a.add(123);
		a.add(12.5);
		Iterator itr = a.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}
//hasNext - returns boolean value
//next - value
//prev
//hasPrev