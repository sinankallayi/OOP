import java.util.*;
class Employee{
int empId,salary;
String name,address;
Employee(int empId,String name,String address,int salary){
this.empId=empId;
this.name=name;
this.address=address;
this.salary=salary;
}
Employee(){}
}

class Teacher extends Employee{
String department;
String subject;
Teacher(int empId,String name,String address,int salary,String department,String subject){
super(empId,name,address,salary);
this.department=department;
this.subject=subject;
}
Teacher(){
super();
}
//function to display all teachers
void displayTeachers(Teacher[] teachers){
String format="%-10s %-20s %-20s %-10s %-20s %-20s";
System.out.format(format,"empId","Name","Address","Salary","Department","Subject");
System.out.println();
System.out.format(format,"-----","-----","-----","-----","-------","-----");
System.out.println();
for(Teacher t: teachers){
System.out.format(format,t.empId,t.name,t.address,t.salary,t.department,t.subject);
System.out.println();
}
}
}

class Employees{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("Enter the no.of Employees:");
int eCount=sc.nextInt();
Teacher[] teachers=new Teacher[eCount];
for(int i=0;i<eCount;i++){
System.out.print("\nEnter EMPID:");
int empId=sc.nextInt();
sc.nextLine();
System.out.print("Enter NAME:");
String name=sc.nextLine();
System.out.print("Enter ADDRESS:");
String address=sc.nextLine();
System.out.print("Enter SALARY:");
int salary=sc.nextInt();
sc.nextLine();
System.out.print("Enter DEPARTMENT:");
String dep=sc.nextLine();
System.out.print("Enter SUBJECT:");
String sub=sc.nextLine();
teachers[i]=new Teacher(empId,name,address,salary,dep,sub); 
}
Teacher t1=new Teacher();
t1.displayTeachers(teachers);
}
}


