import java.util.*;

class pattern2{
	public static void main(String[] args) {
		int n =0;
		Scanner s= new Scanner(System.in);
		System.out.print("Enter the number of lines you want:");
		n=s.nextInt();
		for(int i=1;i<=n;i++){
			if(i<=(n/2+1)){
				int spaces=i-1;
				int stars=n-2*spaces;
				while(spaces>0){
					System.out.print(" ");
					spaces--;

				}

				
				while(stars>0){
					System.out.print("*");
					stars--;
				}
				System.out.println();
			}

			else{
				int spaces=n-i;
				int stars=n-2*spaces;	
				while(spaces>0){
					System.out.print(" ");
					spaces--;
				}
				while(stars>0){
					System.out.print("*");
					stars--;
				}
				System.out.println();

			}
		}

	}
}