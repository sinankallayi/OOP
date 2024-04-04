import java.util.Scanner;
class InvalidUserException extends Exception{
public InvalidUserException(String msg){
super (msg);
}
}
public class Authentication{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter Username:");
String username=sc.nextLine();
System.out.print("Enter Password:");
String password=sc.nextLine();
try{
if(username.length()<8)
{
throw new InvalidUserException("Invalid username!,Username must be greater than 7 charachters");
}
else if(!password.equals("xyz0abc"))
{
throw new InvalidUserException("Incorrect password!,Enter correct password");
}
else{
System.out.println("Login Successfull:)");
}
}
catch(InvalidUserException e)
{
e.printStackTrace();
}
}
}
