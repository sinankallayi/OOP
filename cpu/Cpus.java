class Cpu{
int price=52000;
	class Processor{
	int noOfcores=4;
	String manufacturer="intel corp";
	void display(){
	System.out.println("\nProcessor");
	System.out.println("---------------");
	System.out.println("Number of cores="+noOfcores);
	System.out.println("Maufacturer="+manufacturer);
	}
}
void display(){
Processor p=new Processor();
p.display();
System.out.println("\nCpu");
System.out.println("---------------");
System.out.println("Price="+price);
}
static class Ram{
	int memory=8;
	String manufacturer="corsair";
	void display(){
	System.out.println("\nRam");
	System.out.println("---------------");
	System.out.println("Meomery="+memory);
	System.out.println("Maufacturer="+manufacturer);
	}
}
}
class Cpus{
	public static void main(String[]args){
	Cpu c1=new Cpu();
	c1.display();
	Cpu.Ram r1=new Cpu.Ram();
	r1.display();
	}
}
