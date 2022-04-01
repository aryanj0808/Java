package math.special;

public class Fibonacci
{
 String str="";
 public String fiboprint(int n)
 {
  int fn=0;
  int ln=1;
  int sum=fn+ln;
  str=fn+" "+ln;
  
  while(sum<=n)
  {
   sum=fn+ln;
   if(sum<=n)
   {
    str=str+" "+sum;
    fn=ln;
    ln=sum;
   }
  }
   return str;
 } 

}