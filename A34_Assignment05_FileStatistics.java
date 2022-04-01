import java.io.*;

class A34_Assignment05_FileStatistics
{
	public static void main (String[] args) throws IOException 
	{

		
                if(args.length!=1)
		{
			System.out.print("\n Please enter File name...");
			System.exit(0);
			
		}


		String fnm = args[0];
		System.out.println("\n Name of file is:" +fnm);

		File f=new File(fnm);


		
                if(f.exists())

		{
			System.out.println("\n Given File does not exist");
			System.exit(0);


		}

		
		
		FileInputStream fin=new FileInputStream(fnm);



		int ch;

		int countCh=0,countSp=0,countWrd=0,countLn=0;


		while((ch=fin.read ())!=-1)

		{


			if((char)ch=='\n')
			{	
				countLn++;
				countWrd++;
				
			}

			else if((char)ch==' ')
			{
			
				countSp++;
				countWrd++;
			}
			else if(ch!=13) 
			{


				countCh++;			
			}

			
		}


		fin.close();

		countWrd=countWrd+1;
		countLn=countLn+1;


		System.out.println("Number of charchters "+countCh);
		System.out.println("Number of Spaces"+countSp);
		System.out.println("Number of  Words"+countWrd);
		System.out.println("Number of Lines "+countLn);


             }


}