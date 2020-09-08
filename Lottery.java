import java.util.Scanner;

 /* Student's Name: Jinfeng Ouyang
    Chapter 3:  Exercise 3.15

 */


public class Lottery {

    public static void main(String[] args) {
        // Generate a lottery number
        int lottery = (int) (Math.random() * 900 + 100);


        // Prompt the user to enter a guess
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your lottery pick (Three digits): ");


        int guess = input.nextInt();
        do {
            System.out.print("Enter your lottery pick (Three digits): ");
            guess = input.nextInt();

        }while (guess < 100 || guess > 999) ;


                // Get digits from lottery
                int lotteryDigit1 = lottery / 100;
                int lotteryDigit2 = lottery / 10 % 10;
                int lotteryDigit3 = lottery % 10;

                // Get digits from guess
                int guessDigit1 = guess / 100;
                int guessDigit2 = guess / 10 % 10;
                ;
                int guessDigit3 = guess % 10;

                System.out.println("The lottery number is " + lottery);

                // Check the guess
                if (guess == lottery)
                    System.out.println("Exact match: you win $12,000");
         /*
         guessDigit2 == lotteryDigit1
         && guessDigit1 == lotteryDigit2

          */

                else if ((guessDigit1 == lotteryDigit1 && guessDigit2 == lotteryDigit3 && guessDigit3 == lotteryDigit2)
                        || (guessDigit1 == lotteryDigit2 && guessDigit2 == lotteryDigit1 && guessDigit3 == lotteryDigit3)
                        || (guessDigit1 == lotteryDigit2 && guessDigit2 == lotteryDigit3 && guessDigit3 == lotteryDigit1)

                        || (guessDigit1 == lotteryDigit3 && guessDigit2 == lotteryDigit1 && guessDigit3 == lotteryDigit2)
                        || (guessDigit1 == lotteryDigit3 && guessDigit2 == lotteryDigit2 && guessDigit3 == lotteryDigit1)


                )

                    System.out.println("Match all digits: you win $5,000");

                else if (guessDigit1 == lotteryDigit1
                        || guessDigit1 == lotteryDigit2
                        || guessDigit1 == lotteryDigit3
                        || guessDigit2 == lotteryDigit1
                        || guessDigit2 == lotteryDigit2
                        || guessDigit2 == lotteryDigit3
                        || guessDigit3 == lotteryDigit1
                        || guessDigit3 == lotteryDigit2
                        || guessDigit3 == lotteryDigit3
                )
                    System.out.println("Match one digit: you win $2,000");
                else
                    System.out.println("Sorry, no match");
            }
        }

