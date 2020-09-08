
/* Student's Name: Jinfeng Ouyang
   Chapter 1: Exercise 1.5
   Chapter 2:  Exercise 2.3

 */

import java.util.Scanner;

public class Result {

    // Chapter 1: Exercise 1.5 Compute
    double answer;

    public double getAnswer() {
        answer = (7.5*6.5 - 4.5*3) / (47.5- 5.5);
        return answer;
    }

    /* Chapter 2:  Exercise 2.3
    (Convert meters into feet) Write a program that reads a number in meters, converts
    it to feet, and displays the result. One meter is 3.2786 feet. */

    public double ConvertToFeet(double meter) {
        double feet = meter* 3.2786;
        return  feet;
        //System.out.println("Enter a value for meter: ");
    }



    public static void  main (String[] args) {

        Result result = new Result();

        //Chapter 1: Exercise 1.5
        double answer = result.getAnswer();
        System.out.print("\nChapter1 Exercise 1.5:\n" + "The result is " + answer + "\n");

        //Chapter 2:  Exercise 2.3
        Scanner in = new Scanner(System.in);
        System.out.println("\nEnter a value for meter: ");
        Double meter = in.nextDouble();
        Double feet = result.ConvertToFeet(meter);
        System.out.println( meter + " meter is " + feet + " feet.\n");

    }
}
