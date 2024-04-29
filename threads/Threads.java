import java.util.Scanner;
class Multiplication extends Thread{
public void run()
{
try
{
for(int i=0;i<=10;i++)
{
System.out.println(i +" x5: "+(i*5));
Thread.sleep(500);
}
}
catch(InterruptedException e){
System.out.println("Multiplication Thread Interrupted :");
}
}
}
class Prime extends Thread
{
int limit,count,flag,j,i;
Prime(int limit)
{
this.limit=limit;
}
public void run()
{
try
{
int j=2;
while(count<limit)
{
flag=1;
for(i=2;i<=(j-i);i++)
{
if(j%i==0)
{
flag=0;
break;
}
}
if(flag==1)
{
System.out.println("Prime number: "+j);
count++;
}
j++;
Thread.sleep(500);
}
}

catch(InterruptedException e)
{
System.out.println("Prime Thread Interrupted");
}
}
}
class Threads
{
public static void main(String[] args)
{
Multiplication mul=new Multiplication();
Scanner sc=new Scanner(System.in);
System.out.print("Enter the no.of Prime Numbers: ");
int l=sc.nextInt();
Prime p=new Prime(l);
mul.start();
p.start();
}
}


