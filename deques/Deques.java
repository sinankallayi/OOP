import java.util.*;
public class Deques{
public static void main(String[] args){
Deque <String> deque=new ArrayDeque<String>();
//adding values
deque.add("a");
deque.add("b");
deque.add("c");
deque.add("d");
deque.add("e");
//traverding elements
System.out.println("Elements in Dequeue :");
for(String str : deque){
System.out.print(str + " ");
}
deque.addFirst("z");
System.out.println("\nAfter adding element at the Front :");
for(String str : deque){
System.out.print(str + " ");
}
deque.addLast("f");
System.out.println("\nAfter adding element at the last :");
for(String str : deque){
System.out.print(str + " ");
}
deque.remove();
System.out.println("\nAfter first element deleted :");
for(String str : deque){
System.out.print(str + " ");
}
deque.clear();
deque.add("x");
System.out.println("\nAfter all elements deleted:");
for(String str : deque){
System.out.print(str + " ");
}
System.out.println();
}
}
