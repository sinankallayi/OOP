import java.util.*;
class Publisher{
String pubName;
Publisher(String pubName){
this.pubName=pubName;
}
void display(){
System.out.println("Publisher :"+pubName);
}
}
class Book extends Publisher{
String title;
String author;
Book(String pubName,String title,String author)
{
super(pubName);
this.title=title;
this.author=author;
}
void display(){
super.display();
System.out.println("Title\t  :"+title);
System.out.println("Author\t  :"+author);
}
}
class Literature extends Book{
String type;
Literature(String pubName,String title,String author,String type){
super(pubName,title,author);
this.type=type;
}
void display(){
super.display();
System.out.println("Type\t  :"+type);
System.out.println();
}
}
class Fiction extends Book{
String genre;
Fiction(String pubName,String title,String author,String genre){
super(pubName,title,author);
this.genre=genre;
}
void display(){
super.display();
System.out.println("Genre\t  :"+genre);
System.out.println();
}
}
class Books{
public static void main(String[] args){
Literature[] l=new Literature[2];
Fiction[] f=new Fiction[2];
l[0]=new Literature("Harpercollins","The Alchemist","Paulo Coelo","Drama");
l[1]=new Literature("D C Books","Aarachaar","K R Meera","Novel");
f[0]=new Fiction("Cassel","Macbeth","William Shakespeare","Trageddy");
f[1]=new Fiction("Penguin Book","The Legends of Khasak","O V Vijayan","Magical Realism");
System.out.println("\t Literature");
System.out.println();
for(int i=0;i<l.length;i++){
System.out.println("#" +(i+1));
l[i].display();
}
System.out.println("\t Fiction");
System.out.println();
for(int i=0;i<f.length;i++){
System.out.println("#" +(i+1));
f[i].display();
}
}
}
