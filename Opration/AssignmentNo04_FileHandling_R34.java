import java.io.*;
import java.util.*;

public class AssignmentNo04_FileHandling_R34
{

 public static void main(String[] args)throws IOException
 {
  if(args.length!=1)
   {
     System.out.println("\nEnter the name of file as command line argument");
     System.exit(0);
   }
  Scanner sc=new Scanner(System.in);
  String fnm=args[0];

  File f=new File(fnm);

  if(f.exists())
  {
   System.out.println("File is found");

   BufferedReader br=new BufferedReader(new FileReader(f));

  String ln;
  
   while((ln=br.readLine())!=null)
   {
    System.out.println(ln);
   }
  }

 else
 {
  f.createNewFile();
  System.out.println("New File is Created.");
 
 }

 System.out.println("Do you want to add Data(y/n)?");
 String ch=sc.nextLine();
 
 if(ch.equals("y"))
 {
  FileWriter fw=new FileWriter(f,true);
  PrintWriter pw=new PrintWriter(new BufferedWriter(fw));

  String str="";
  System.out.println("Enter the data and write 'finish' at the end of data.");
  while(!(str=sc.nextLine()).equals("finish"))
  {
   str=str+"\n";
   pw.print(str);
  }
  pw.close();
 }
}
}
   
