import java.util.*;
public class rotate{
   public static void main (String[] args){
      int [] a={1,2,3};
      System.out.println(Arrays.toString(a));
      int b=a[0];
      a[0]=a[1];
      a[1]=a[2];
      a[2]=b;
      System.out.println(Arrays.toString(a));
   
   }
}