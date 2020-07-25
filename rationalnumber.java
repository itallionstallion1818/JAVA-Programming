import java.util.*;

public class rationalnumber{
	public int commondivisor(int a,int b){
		int ans=0;
	if(a<b){
		int i=0;
		for(i=2;i<=a;i++){
			if(a%i==0 && b%i==0){
				ans=0;
				break;
			}

		}
		if(i==(a+1)){
			ans=1;
		}

	}
	else{
			int j=0;
			for(j=2;j<=b;j++){
			if(a%j==0 && b%j==0){
				ans=0;
				break;
			}

		}
		if(j==(b+1)){
			ans=1;
		}

	}
return ans;
}

	int p;
	int q;
	public rationalnumber(int p,int q){
		if(q!=0){
		if(p==0){
			this.p=0;
		}
		if(commondivisor(p,q)==1){
		this.p=p;
		this.q=q;
	}
	else{
		System.out.println("Common Divisor exits");
	}
		}
		else{
			System.out.println("Denominator is zero");
		}
	}

	public double rational(){
		if(this.p==0){
			return 0;
		}
		else{
		return this.p/this.q;

		}
	}
	public rationalnumber add(rationalnumber n){
		int num=this.p*n.q+this.q*n.p;
		int denom=this.q*n.q;
		return new rationalnumber(num,denom);

	}
	public rationalnumber multiply(rationalnumber n){
		int num=this.p*n.p;
		int denom=this.q*n.q;
		return new rationalnumber(num,denom);

	}
	public void show(){
		System.out.println("The rationalnumber is="+ this.p +"/" + this.q);


	}


	public static void main(String[] args) {
		rationalnumber n1=new rationalnumber(2,4); // they have a common divisor
		rationalnumber n2=new rationalnumber(1,0); // denominator is zero
		rationalnumber n3=new rationalnumber(4,5); 
		rationalnumber n4=new rationalnumber(4,9);
		rationalnumber n5=new rationalnumber(4,11);

		rationalnumber addres=n3.add(n4);
		rationalnumber mult=n3.multiply(n4);
		System.out.print("The result of addition of 4/5 and 4/9 is:");
		addres.show();
		System.out.print("The result of multiplication of 4/5 and 4/9 is:");
		mult.show();

	}
}