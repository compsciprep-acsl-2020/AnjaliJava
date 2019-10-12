import java.util.*;
public class ArrayTotals{
   public static void main(String args[]){
   
      int a[] = new int [100];
      int num=0;
      for(int i=0; i<100; i++){
         num=(int)(Math.random()*100)+1;
         a[i]=num;
      }
      int ecount=0;int ocount=0;
      
      System.out.println("array: "+Arrays.toString(a));
      System.out.println("even: ");
      for(int i=0; i<even(a).length; i++){
         if(even(a)[i]!=0){
            ecount++;
            System.out.println(even(a)[i]);
         }
      }
      
      System.out.println();
      System.out.println("odd: ");
      for(int i=0; i<odd(a).length; i++){
         if(odd(a)[i]!=0){
            ocount++;
            System.out.println(odd(a)[i]);
         }
      }
      System.out.println("even count: "+ecount);
      System.out.println("odd count: "+ocount);
      System.out.println("total count: "+(ocount+ecount));       
   }
   
   
   public static int[] even (int a[]){
      int n[] = new int [100];
      for(int i = 0; i<a.length; i++){
         if(a[i]%2==0){
            n[i]=a[i];
         }
      }
      
      return n;
   }
   
   public static int[] odd (int[] a){
      int n[] = new int [100];
      for(int i = 0; i<a.length; i++){
         if(a[i]%2!=0){
            n[i]=a[i];
         }
      }
      return n;
   }

   
}