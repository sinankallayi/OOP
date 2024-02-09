import java.util.*;
public class Cube{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a limit:");
int n=sc.nextInt();
for(int i=1;i<=n;i++)
{
System.out.println(i+"\t:"+i*i*i);
}
}
}
