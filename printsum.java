import java.util.*;
class printsum{
	public static void main(String[] args) {
		int a,b,c;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the first element:");
		a=s.nextInt();
		System.out.println();
		System.out.print("Enter the second element:");
		b=s.nextInt();
		System.out.println();

		c=a+b;
		System.out.print("The sum of the number is="+c);
	}
}