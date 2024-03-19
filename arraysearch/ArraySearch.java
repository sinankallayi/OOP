import java.util.*;
class ArraySearch{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number of element:");
int size=sc.nextInt();
int numbers[]=new int[size];
System.out.println("\nEnter the elements:");
for(int i=0;i<size;i++){
numbers[i]=sc.nextInt();
}
ArraySearch as=new ArraySearch();
System.out.print("\nEnter the search element:");
int se=sc.nextInt();
System.out.println("\nChoose Search option");
System.out.println("\n1.Linear Search \n2.Simple Binary Search \n3.Recursive Binary Search \n4.Using Arrays.binarySearch()");
System.out.print("\nOption:");
int opt=sc.nextInt();
int result=-1;
switch(opt){
	case 1:result=as.linearSearch(se,numbers);
		break;
	case 2:Arrays.sort(numbers);
		result=as.simpleBinarySearch(se,numbers);
		break;
	case 3:Arrays.sort(numbers);
		result=as.recursiveBinarySearch(numbers,0,size-1,se);
		break;
	case 4:Arrays.sort(numbers);
		result=Arrays.binarySearch(numbers,se);
		break;
	default:System.out.println("Invalid...");
		break;
		}
if(result>-1){
System.out.println("\n"+se+" Found :)");
}
else{
System.out.println("\n"+se+" Not Found :(");
}
}

//Linear Search

int linearSearch(int n,int[] numbers){
for(int i=0;i<numbers.length;i++){
if(numbers[i]==n){
return 1;
}
}
return -1;
}

//Simple Binary Search

int simpleBinarySearch(int n,int[] numbers){
int first=0;
int last=numbers.length-1;
int mid=(first+last)/2;
while(first<=last){
if(numbers[mid]<n){
first=mid+1;
}
else if(numbers[mid]>n){
last=mid-1;
}else{
return mid;
}
mid=(first+last)/2;
}
return -1;
}

//Recursive Binary Search

int recursiveBinarySearch(int[] numbers,int first,int last,int x){
if(first<=last && first <= numbers.length-1){
int mid=first+(last-first)/2;
if(numbers[mid]<x){
return recursiveBinarySearch(numbers,mid+1,last,x);
}
if(numbers[mid]>x){
return recursiveBinarySearch(numbers,first,mid-1,x);
}
return mid;
}
return -1;
}


}








