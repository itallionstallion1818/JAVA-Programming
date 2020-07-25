import java.util.*;

public class chemicalelement{
	String[] AMname={"Lithium","Sodium","Potassium","Rubidium","Caesium"};
	String[] TMname={"Scandium","Titanium","Vanadium","Chromium","Manganese"};
	String[] Mname={"Aluminium","Indium","Tin","Thalium","Lead"};
	int[] AlkaliMetals={3,11,19,37,55};
	int [] TransitionMetals={21,22,23,24,25};
	int[] Metals={13,49,50,81,82};
	public int searchAM(int atno){
		int ans=-1;
		for(int i=0;i<5;i++){
				if(AlkaliMetals[i]==atno)
					ans=i;
			}
			return ans;
		}

public int searchTM(int atno){
		int ans=-1;
		for(int i=0;i<5;i++){
				if(TransitionMetals[i]==atno)
					ans=i;
			}
			return ans;
		}	
public int searchM(int atno){
		int ans=-1;
		for(int i=0;i<5;i++){
				if(Metals[i]==atno)
					ans=i;
			}
			return ans;
		}	

	
	

	String type;
	int atomic_number;

	chemicalelement(int a){
		this.atomic_number=a;


	}
	public String type_of(){
		if(searchAM(this.atomic_number)!=-1){
			return "AlkaliMetal";
		}
		else if(searchTM(this.atomic_number)!=-1)
		{
			return "TransitionMetal";

		}
		else{
			return "Metal";
		}
	}

	public String name(){
		if(searchAM(this.atomic_number)!=-1){
			return AMname[searchAM(this.atomic_number)];
		}
		else if(searchTM(this.atomic_number)!=-1)
		{
			return TMname[searchTM(this.atomic_number)];

		}
		else{
			return Mname[searchM(this.atomic_number)];
		}
	}

	

	public static void main(String[] args) {

		chemicalelement ch=new chemicalelement(3); //Alkali Metal
		chemicalelement chtm=new chemicalelement(23);// Transition Metal
		chemicalelement chm=new chemicalelement(81);// Metal
		String typech=ch.type_of();
		String name=ch.name();
		System.out.println("The type of the element is "+typech);
		System.out.println("The name of the element is "+name);
		System.out.println();

		String typechtm=chtm.type_of();
		String nametm=chtm.name();
		System.out.println("The type of the element is "+typechtm);
		System.out.println("The name of the element is "+nametm);
		System.out.println();
		
		String typechm=chm.type_of();
		String namem=chm.name();
		System.out.println("The type of the element is "+typechm);
		System.out.println("The name of the element is "+namem);
	}
}