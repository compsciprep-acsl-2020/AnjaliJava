import java.util.*;
public class haveThree{
   public static void main(String []args){
   
      int [] a={3,1,3,3};
      int count=0;
      boolean b=false;
      for(int i=0; i<a.length; i++){
         if(a[i]==3){
            count++;
         }
      }
   
      for(int i=1; i<a.length-1; i++){
         if(a[i+1]!=3&&a[i-1]!=3){
            b=true;
         }
      }
   
      if (count==3&&b==true){
         System.out.print(true);
      }
      else{
      System.out.print(false);
      }
   }
}