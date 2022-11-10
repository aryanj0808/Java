import java.util.*;

class Person
{
 int id;
 String name;

  Person(int id,String name)
 {
    this.id=id;
    this.name=name;
 }

 public void show() 
 {
   System.out.println("\tID: "+id);
   System.out.println("\tName: "+name);
 }
}

class Teacher extends Person
{
 double salary;
 
  Teacher(int id,String name,double salary)
  {
   super(id,name);
   this.salary=salary;

  }

 public void show()
 {
  super.show();
  System.out.println("\tSalary: "+salary);
 }
}

class Student extends Person
{
 double fees;

 Student(int id,String name,double fees)
 {
  super(id,name);
  this.fees=fees;
 }

 public void show()
 {
  super.show();
  System.out.println("\tFees: "+fees);
 }
 
}
 
class AssignmentNo2_Inheritance_R34
{
 public static void main(String[] args) throws Exception
 {
  Scanner sc=new Scanner(System.in);
  Person []p = new Person[5];

  int id;
  String name;
  double fees,salary;
  int ch,cnt=0;

 while(true)
 {
  System.out.println("\n\t***MENU***");
  System.out.println("\n\n1.Add teacher\n2.Add Student\n3.Display Teacher\n4.Display Student\n5.Exit");
  System.out.println("\n\nEnter your choice: ");
  ch=sc.nextInt();
  switch(ch)
  {
   case 1:
      if(cnt==5)
      {
        System.out.println("\nArray is Full.");
        break;
      }
    System.out.println("Enter the ID of Teacher: ");
    id=sc.nextInt();

    System.out.println("Enter the Name of Teacher: ");
    name=sc.next();

    System.out.println("Enter the Salary of Teacher: ");
    salary=sc.nextDouble();

    Teacher tobj=new Teacher(id,name,salary);
    p[cnt]=tobj;
    cnt++;
    break;

    case 2:
      if(cnt==5)
      {
        System.out.println("\nArray is Full.");
        break;
      }
    System.out.println("Enter the ID of Student: ");
    id=sc.nextInt();

    System.out.println("Enter the Name of Student: ");
    name=sc.next();

    System.out.println("Enter the Fees of Student: ");
    fees=sc.nextDouble();

    Student sobj=new Student(id,name,fees);
    p[cnt]=sobj;
    cnt++;
    break;

   case 3:
     System.out.println("\n\t***Display Teacher Info***");
     for(int i=0;i<cnt;i++)
     {
      if(p[i] instanceof Teacher)
      {
        System.out.println("\n");
        p[i].show();
      }
     }
     break;

    case 4:
      System.out.println("\n\t***Display Student Info***");
     for(int i=0;i<cnt;i++)
     {
      if(p[i] instanceof Student)
      {
        System.out.println("\n");
        p[i].show();
      }
     }
     break;

    case 5:
       System.exit(0);
       break;
  
    default:
       System.out.println("Invalid Choice.");
   
  }


 }

  
 }

}



