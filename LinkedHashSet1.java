import java.util.*;
import java.util.LinkedHashSet;
import java.io.*;
class LinkedHashSet1
{
 public static void main(String args[])
 {
 
               LinkedHashSet<String> set=new LinkedHashSet<String>();
               set.add("Sneha");
               set.add("Lekshmi");
               set.add("Athulya");
               set.add("Anu");
               set.add("Haru");
               Iterator<String> i=set.iterator();
               while(i.hasNext())
               {
               System.out.println(i.next());
               }
               System.out.println("Size of LinkedHashSet = " +set.size());
  }
}
