public class Str_fun{
	public static void main(String args[]){
		String s1 = "JAVA ";    //type 1
		char ch[]={'h', 'e', 'l', 'l', 'o'};
		String s2 = new String(ch);  //type 2
		System.out.println(s1.charAt(1));   //A
		System.out.println(s1.concat(s2));  //JAVA hello
		System.out.println(s1.toLowerCase());  //java
		System.out.println(s2.toUpperCase());  //HELLO
		System.out.println(s1.replace('A', 'B'));
	}
}