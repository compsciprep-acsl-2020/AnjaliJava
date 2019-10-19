import java.util.*;
import java.io.*;
import java.lang.*;
public class AnjaliK_CHMOD_20152016C1{ 
   public static void main(String[] args) throws Exception { 
      File file = new File("chmod.in"); 
      Scanner sc = new Scanner(file); 
      String a="";String b="";String c="";String d="";String e="";
      while (sc.hasNextLine()){
         a=sc.nextLine();
         b=sc.nextLine();
         c=sc.nextLine();
         d=sc.nextLine();
         e=sc.nextLine();     
      }
      System.out.println(first(a));
      System.out.println(first(b));
      System.out.println(second(c));
      System.out.println(second(d));  
      System.out.println(third(e));
      
   }
   
   public static String first(String f){
      String [] s= f.split(",");
      String [] a= new String [3];
      String [] ans= {"","",""};
      
      for(int i=0; i<s.length; i++){
         s[i]=Integer.toString(Integer.parseInt(s[i]),2);
         if(s[i].length()==1){
            s[i]=0+""+0+s[i];
         }
         else if(s[i].length()==2){
            s[i]=0+s[i];
         }}
      for(int k=0; k<s.length; k++){
         a=s[k].split("");
         for(int i=0; i<a.length; i++){
            if(i==0&&a[i].equals("1")){
               a[i]="r";
            }
            else{
               if(i==0&&a[i].equals("0")){
                  a[i]="-";
               }
            }
            if(i==1&&a[i].equals("1")){
               a[i]="w";
            }
            else{
               if(i==1&&a[i].equals("0")){
                  a[i]="-";
               }
            }
            if(i==2&&a[i].equals("1")){
               a[i]="x";
            }
            else{
               if(i==2&&a[i].equals("0")){
                  a[i]="-";
               }
            }
            ans[k]+=a[i];
         } 
      }  
      return s[0]+" "+s[1]+" "+s[2]+" and "+ ans[0]+" "+ans[1]+" "+ans[2];
   }
   
   public static String second(String f){
      String [] s= f.split(",");
      String [] q= f.split(",");
      String [] a= new String [3];
      String [] ans= {"","",""};
      for(int k=0; k<s.length; k++){
         q[k]=Integer.parseInt(q[k],2)+""; 
      } 
      for(int k=0; k<s.length; k++){
         a=s[k].split("");
         for(int i=0; i<a.length; i++){
            if(i==0&&a[i].equals("1")){
               a[i]="r";
            }
            else{
               if(i==0&&a[i].equals("0")){
                  a[i]="-";
               }
            }
            if(i==1&&a[i].equals("1")){
               a[i]="w";
            }
            else{
               if(i==1&&a[i].equals("0")){
                  a[i]="-";
               }
            }
            if(i==2&&a[i].equals("1")){
               a[i]="x";
            }
            else{
               if(i==2&&a[i].equals("0")){
                  a[i]="-";
               }
            }
            ans[k]+=a[i];
         } 
      }    
      return q[0]+""+q[1]+""+q[2]+" and "+ ans[0]+" "+ans[1]+" "+ans[2]; 
   }
   
   public static String third(String f){
      String [] s=f.split(",");
      String [] q=f.split(",");
      String [] a= new String [3];
      String [] ans={"","",""};
       
      for(int k=0; k<s.length; k++){
         a=s[k].split("");
         for(int i=0; i<a.length; i++){
            if(!(a[i].equals("-"))){
               a[i]="1";
            }
            else{
               a[i]="0";
            }
            ans[k]+=a[i]+"";              
         }
         q[k]=Integer.parseInt(ans[k],2)+"";           
      }    
      return q[0]+""+q[1]+""+q[2]+" and "+ans[0]+" "+ans[1]+" "+ans[2];
   }
}