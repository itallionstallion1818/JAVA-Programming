import java.util.*;

public class pattern1{
	public static void main(String[] args) {
		int n=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of lines:");
		n=s.nextInt();
		for(int i=1;i<=n;i++){
			int j=i;
			while(j!=0){
				System.out.print("*");
				j--;
			}
			System.out.print("\n");
		}

	}
}