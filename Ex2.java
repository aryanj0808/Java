//Write a java program to encrypt a grade by adding 8 to it. Decrypt it to show the  correct grade
import java.util.Scanner;
public class Ex2 {

    public static void main(String[] args){

        //Encrypt grade
        char grade = 'B';
        grade = (char) (grade + 8);
        System.out.println(grade);

         // Decrypt grade

        grade=(char)(grade-8);
        System.out.println(grade);
    }
}
