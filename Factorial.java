package math.special;

public class Factorial
{
 public int fact(int x)
 {
   int res=1;
   while(x>=1)
   {
	res=res*x;
	x--;
   }
	return res;
 }

}