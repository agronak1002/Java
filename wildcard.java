import java.util.*;
public class wildcard{
	void printw(List <?> list){
		for(Object obj : list){
			System.out.println(obj + " ");
		}
	}
	public static void main(String args[]){
		wildcard obj = new wildcard();
		List <Integer> l = Arrays.asList(10, 20);
		obj.printw(l);
		List <String> s = Arrays.asList("abc","def");
		obj.printw(s);
	}
}