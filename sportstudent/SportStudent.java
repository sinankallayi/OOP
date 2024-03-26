import java.util.*;
interface Student{
int score=10;
void displayScore();
}

interface Sports{
int score=25;
void displaySportsScore();
}

class Result implements Student,Sports{
public void displayScore(){
System.out.println("\nAcademic Score:"+Student.score);
}
public void displaySportsScore(){
System.out.println("Sports Score:"+Sports.score);
System.out.println();
}
}
class SportStudent{
public static void main(String[]args){
Result r=new Result();
r.displayScore();
r.displaySportsScore();
}
}
