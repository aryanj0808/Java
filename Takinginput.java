import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner; //imported scanner class or external code


public class Takinginput {
    public static void main(String[] args){

        System.out.println("Taking inout from User");
        Scanner aj= new Scanner(System.in);  //aj is object of class scanner
        System.out.println("Enter NUm1");
        int a = aj.nextInt();
        System.out.println("Enter NUm2");
        int b= aj.nextInt();

        int sum= a+b;
        System.out.println("Sum="+sum);
    }
}
