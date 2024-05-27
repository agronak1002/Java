import java.util.*;
class collection{
	public static void main(String args[]){
		ArrayList <String> a = new ArrayList<>();
		a.add("abc");
		a.add("pqr");
		a.add("lmn");
		for(String i : a){ //for each loop
			System.out.println(i);
		}
		//System.out.println(a[1]);  error
	}
}
//ArrayList   LinkedList   Vector
//LinkedHashSet  SortedSet TreeSet
