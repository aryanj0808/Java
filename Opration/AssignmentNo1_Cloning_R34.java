import java.util.Arrays;

class A implements Cloneable{

         int i;
         int [] demo;
         
         A()
         {
        	 i=0;
        	 demo = new int[5];
         }

         public void display()
         {
        	 System.out.println("Address of Object: "+this);
        	 System.out.println("i: "+i);
        	 System.out.println("Address of Array: "+demo+"  val:"+demo[0]);
         }
         
         public Object clone() throws CloneNotSupportedException
         {
        	 A temp = new A();
        	 
        	 temp.i = this.i;
        	 
        	 temp.demo = Arrays.copyOf(this.demo,this.demo.length);
        			 
			 return temp;
        	 
         }
         
        
}


public class AssignmentNo1_Cloning_R34 {
	
	 public static void main(String[] args) throws CloneNotSupportedException {
			
    	 A obj1 = new A();
    	 
    	 obj1.demo[0]=100;
         
    	 obj1.display();
    	
    	 A obj2 = new A();
    	
    	 obj2=(A) obj1.clone();
    	
    	 obj2.i++;
    	 
    	 obj2.demo[0]++;
    	 
    	 obj2.display();
     
     }

}
