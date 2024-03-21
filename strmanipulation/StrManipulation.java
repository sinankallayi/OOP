import java.util.*;
class StrManipulation{
public static void main(String[] args){
char chs[]={'W','E','L','C','O','M','E'};
String newStr=new String(chs);
System.out.println("\n-----Using new operator-----");
System.out.println("\nNew String from chr[] using new string:"+newStr);
System.out.println("\n-----String Length-----\n");
String s1="hello";
String s2="World";
System.out.println("String length of "+s1+":"+s1.length());
System.out.println(s1+"to Upper Case:"+s1.toUpperCase());
System.out.println(s1+"to Lower Case:"+s1.toLowerCase());
System.out.println("\n-----Character Concatination-----");
System.out.println("\nUsing concat():"+s1.concat(s2));
System.out.println("Using + operator:"+s1+s2);
System.out.println("\n-----Character Extraction-----");
System.out.println("\nCharacter at 3rd position:"+s1.charAt(3));
char c[]=new char[5];
s1.getChars(2,4,c,0);
System.out.println("Character between 2 and 4:"+new String(c));
System.out.println("\n-----Character Comparison-----\n");
s1="hello";
s2="HELLO";
System.out.println(s1+" Equals "+s2+":"+s1.equals(s2));
System.out.println(s1+" Equals ignore case "+s2+":"+s1.equalsIgnoreCase(s2));
System.out.println(s1+" Compare "+s2+":"+s1.compareTo(s2));
System.out.println(s1+" Compare ignore case "+s2+":"+s1.compareToIgnoreCase(s2));
System.out.println(s1+" Start with H : "+s2.startsWith("H"));
System.out.println(s1+" End with z : "+s1.endsWith("Z"));
System.out.println("\n-----Search Substring-----");
s1="Are you ok";
System.out.println("\nIndex of you in "+s1+":"+s1.indexOf("you"));
System.out.println("\n-----Modify String-----");
System.out.println("\nSubstring of "+s1+":"+s1.substring(7));
System.out.println("String replacing:"+s1.replace("ok","mad"));
System.out.println("\n-----Using valueOf-----\n");
float n=15.3f;
System.out.println(n+" is converted to "+String.valueOf(n));
}
}
