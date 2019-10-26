import java.util.*;
import java.io.*;
import java.lang.*;
public class AnjaliK_AGRAM_20162017C1{ 
   public static void main(String[] args) throws Exception { 
      File file = new File("agram.in"); 
      Scanner sc = new Scanner(file); 
      String a="";String b="";String c="";String d="";String e="";
      while (sc.hasNextLine()){
         a=sc.nextLine();
         b=sc.nextLine();
         c=sc.nextLine();
         d=sc.nextLine();
         e=sc.nextLine();     
      }
      System.out.println(play(a));
      System.out.println(play(b));
      System.out.println(play(c));
      System.out.println(play(d));
      System.out.println(play(e));
   }
   
   
   public static String play(String x){
      String ans="";
      String[] s=x.split(",");
      String opp=s[0];
      x=x.substring(2);      
      Arrays.sort(s);
      boolean has=false;
      if(x.contains(opp.charAt(1)+"")){
         has=true;
      }
      for(int i=0; i<5; i++){
         if(s[i].charAt(1)==(opp.charAt(1))&&has==true&&s[i]!=opp){
            if(s[i].charAt(0)>(opp.charAt(0))){
               ans=s[i];
               break;
            }
            else{
               ans=s[i];
            }
         }
      }
      if(has==false){
         if(s[0]!=opp){
            ans=s[0];
         }
         else{
            ans=s[1];
         }
      }
      return ans;
   }}