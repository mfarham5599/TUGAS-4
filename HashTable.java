  
import java.util.*;  
public class HashTable{  
 public static void main(String args[]){  
  Hashtable<double> hm=new Hashtable<double>();  
  
  hm.put(12.2);  
  hm.put(10.1);  
  hm.put(12.1);  
  hm.put(16.3);  
  
  for(Map.Entry m:hm.entrySet()){  
   System.out.println(m.getKey()+" "+m.getValue());  
  }  
 }  
} 