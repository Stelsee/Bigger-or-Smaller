import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Type the first number: ");

        float a = scan.nextFloat();

        System.out.println("Type the second number: ");
        float b = scan.nextFloat();

        if (a > b) {
            System.out.println("True");
        }

        if (a < b){
            System.out.println("False");
        }

    }

}