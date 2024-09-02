import java.util.Scanner;
public class IT24101843Lab6Q3 {

    public static void main(String[] args) {

        int number;
        double meanOfSquares;
        double rms;
        double sumOfSquares = 0;
        int count = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter positive integers(terminate input with -99)):");

        while (true) {

            System.out.print("Enter a number: ");
            number = sc.nextInt();

            if (number == -99) {
                break;
            }
            if (number > 0) {

                sumOfSquares += Math.pow(number, 2);
                count = count + 1;
            } else {

                System.out.println("Invalid input. Please enter a positive integer or -99 to terminate");
            }
        }
        if (count > 0) {
            meanOfSquares = sumOfSquares / count;
            rms = Math.sqrt(meanOfSquares);
            System.out.println("The Root Mean Square (RMS) is:  " + rms);
        }
        else {

            System.out.println("No positive numbers were entered");
        }
       
    }

}