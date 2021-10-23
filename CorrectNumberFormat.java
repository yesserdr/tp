
import java.util.Scanner;


public class CorrectNumberFormat {

    public static void main(String[] args) {
        System.out.println("Enter a number");

        Scanner scanner = new Scanner(System.in);


        String line = scanner.nextLine();


        try {
            int num = Integer.parseInt(line);



            System.out.println("It's a number :)");

        }catch(NumberFormatException numberFormatException )
        {System.out.println("It's not a number :(");}
    }
}