//Use comparison operators to find out whether a given number is greater than the user entered number or not?
import java.util.Scanner;
public class Ex3 {

    public static void main(String[] args){

        int Gnum=30;

        System.out.println("Enter a number: ");
        Scanner aj = new Scanner (System.in);
        int Unum= aj.nextInt();
        System.out.println(Gnum<Unum);
    }
}
