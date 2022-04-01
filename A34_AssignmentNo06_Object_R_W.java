import java.io.*;
import java.util.*;

class Person implements Serializable
{
	int id;
	String name;
	Person(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
}
public class A34_Assignment06_Object_R_W
{
public static void main(String[] args) throws Exception
	
         {
		
          Scanner sc=new Scanner(System.in);


	   int choice,id;

	    String name;

	    Person []p1=null;
	    Person []p2=null;

	     int size=1;

	     int k=0;

		
		
	  do
		
           {
			
             System.out.println("\nEnter your choice :");
			
             System.out.println("\n1:Add Record \n2:Display Record \n3:Exit\n");
			
             choice=sc.nextInt();
			
	     File record=new File("record.dat");

			
             switch(choice)
		{
		     case 1: 
			      try
					{

                     	 FileOutputStream fout=new FileOutputStream(record);
			ObjectOutputStream out = new ObjectOutputStream(fout);
			p1=new Person[size];
			 if(size>1)
				{
							
                                  for(k=0;k<size-1;k++)
							
                                   {
								
                                     p1[k]=p2[k];
							
                                   }
				}
			System.out.println("\nEnter ID:");
			id = sc.nextInt();
	
		        System.out.println("\nEnter Name:");
			name = sc.next();
					   
			Person p = new Person(id,name); 
			p1[k]=p;
			for(k=0;k<size;k++)
			{
			 out.writeObject(p1[k]);
			}
					   
			p2=new Person[size];
			for(k=0;k<size;k++)
			{
			  p2[k]=p1[k];
			}

				size++;
				out.close();
						
                               

                                 fout.close();
			}
					
                        catch(Exception ex)
					
                                  {
	
						
                                   ex.printStackTrace();
				   System.out.println(ex);
				  }
				break;
					
				case 2:
					ObjectInputStream in = new ObjectInputStream(new FileInputStream("record.dat"));
					Person obj;
					System.out.println("\nEnter your choice:");
					System.out.println("\n1.Display by id \n2.Display All \n");
					choice=sc.nextInt();
						
					switch(choice)
					{
					case 1://Display by id
					System.out.println("\nEnter ID:");
					id=sc.nextInt();
								
					try
					{
					 while((obj=(Person)in.readObject())!=null)
					  {
					    if(id==obj.id)
					     {
										
						System.out.println("\tId is :"+obj.id);
						System.out.println("\tName is: "+obj.name);
					     }
									
					   }
				         }
					   catch(Exception ex)
					   {

								
					   }
						break;
							
						 case 2:
							try
							{
								while((obj=(Person)in.readObject())!=null)
								{
								
									System.out.println("\tId is :"+obj.id);
									System.out.println("\tName is: "+obj.name);
								}
							}
							catch(Exception exc)
							{
							}
							break;
							
							 
					}
					break;
				case 3:
					System.exit(0);
					break;
			}
		}while(choice<=3);
	}
}


