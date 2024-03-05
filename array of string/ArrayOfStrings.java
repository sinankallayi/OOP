import java.util.Scanner;
import java.util.Arrays;
class ArrayOfStrings{
	public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.print("\nEnter the number of Strings:");
	int size=sc.nextInt();
	String[] strings=new String[size];
	System.out.println("\nEnter the Strings:");
	for(int i=0;i<size;i++){
	strings[i]=sc.next();
	}
	System.out.println("\n1.Build in method \n2.User defined method");
	System.out.print("\nOption:");
	int opt=sc.nextInt();
	switch(opt){
	case 1://Build in method
		Arrays.sort(strings);
		break;
	case 2://User defined method
		String temp;
		for(int i=0;i<size-1;i++){
		for(int j=i+1;j<size;j++){
		if(strings[i].compareTo(strings[i])>0){
		temp=strings[i];
		strings[i]=strings[j];
		strings[j]=temp;
		}
		}
		}
		break;
		default:System.out.println("Invalid...");
		}
		for(int i=0;i<size;i++)
		System.out.println(strings[i]);
}
}
