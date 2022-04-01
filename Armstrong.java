package math.special;

public class Armstrong
{
  String str=" ";
  public String printArmstrong(int limit)
  {
   int noDig,res=1,temp=0,sum=0,rem=0;
   for(int num=0;num<=limit;num++)
   {
    temp=num;
    noDig=0;
    sum=0;
    while(temp!=0)
    {
     rem=temp%10;
     for(int i=1;i<=noDig;i++)
     {
       res=res*rem;
     }
    sum=sum+res;
    res=1;
    temp=temp/10;
    }
   if(num==sum)
   {
     str=str+" "+num;
   }
   }
 
   return str;

  }

}