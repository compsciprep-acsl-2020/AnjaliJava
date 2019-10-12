import java.util.*;
public class ArrayListTotals{
   public static void main(String args[]){
   
      ArrayList<Integer> a = new ArrayList<Integer>();
      int num=0;
      for(int i=0; i<100; i++){
         num=(int)(Math.random()*100)+1;
         a.add(num);
      }
      System.out.println("array: "+(a));
      System.out.println("even: "+even(a)); 
      System.out.println("odd: "+odd(a));     
      
      System.out.println("even count: "+even(a).size());
      System.out.println("odd count: "+odd(a).size());
      System.out.println("total count: "+(even(a).size()+odd(a).size()));       
   }
   
   
   public static ArrayList<Integer> even (ArrayList<Integer> a){
      ArrayList<Integer> n = new ArrayList<Integer>();
      for(int i = 0; i<a.size(); i++){
         if((int)a.get(i)%2==0){
            n.add(a.get(i));
         }
      }
      
      return n;
   }
   
   public static ArrayList<Integer> odd (ArrayList<Integer> a){
      ArrayList<Integer> n = new ArrayList<Integer>();
      for(int i = 0; i<a.size(); i++){
         if((int)a.get(i)%2!=0){
            n.add(a.get(i));
         }
      }
      
      return n;
   }
   

   
}