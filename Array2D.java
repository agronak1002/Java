import java.util.Scanner;
public class Array2D{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int a[][]= new int[3][3];
		int i, j;
		System.out.println("Enter the elements of 2D array: ");
		for(i = 0; i<3; i++){
			for(j = 0; j<3; j++){
				a[i][j]=s.nextInt();
			}
		}
		System.out.println("The elements of 2D array: ");
		for(i = 0; i<3; i++){
			for(j = 0; j<3; j++){
				System.out.print(a[i][j]+"	");
			}
		}
	}
}		