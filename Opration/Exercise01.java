import java.util.Scanner;
public class Exercise01 {
    //Write a program to cal percentage of a given student in cbse board exam. His marks from 5 subjects must be
    // taken as inout from the keyboard( Marks are out of 100)

    public static void main(String[] args){

//        System.out.println("Enter Name of Student");
        Scanner aj = new Scanner(System.in);
//        char ch= aj.findInLine(Character);
        System.out.println("Marks Obtain is Five subject is ");
        int a = aj.nextInt();
        int b = aj.nextInt();
        int c = aj.nextInt();
        int d = aj.nextInt();
        int e = aj.nextInt();
        float per = (a+b+c+d+e)*100/500;
//        System.out.println(ch);
        System.out.println("Percentage in Five Subject is :"+per);



    }
}
