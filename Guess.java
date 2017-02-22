// Guess.java
// Marvin Diaz
// maerdiaz
// pa2
// A game that is thinking of a number and gives you three guesses

import java.util.Scanner;

class Guess{

   public static void main( String[] args ){

      double correct, guess1, guess2, guess3;
      int a;

      Scanner sc = new Scanner(System.in);

      // create a random number that the user will have to guess right
      correct = Math.random()*10+1;
      a = (int)correct;

      // Introduction + first guess
      System.out.print("\nI'm thinking of an integer in the range 1 to 10. You have three guesses.");
      System.out.print("\n\nEnter your first guess: ");
      guess1 = sc.nextDouble();

      if ( a == guess1){
         System.out.print("You win!\n\n");
      } else  {
         System.out.println("Your guess is too "+(correct >guess1? "low.":"high."));
      }

      if ( a != guess1){
         //Second guess
         System.out.print("\nEnter your second guess: ");
         guess2 = sc.nextDouble();

         if ( a == guess2){
            System.out.print("You win!\n\n");
         } else  {
            System.out.println("Your guess is too "+(correct >guess2? "low.":"high."));
         }

         //Third guess
         if ( a != guess2 ){
            System.out.print("\nEnter your third guess: ");
            guess3 = sc.nextDouble();

            if ( a == guess3){
               System.out.print("You win!\n\n");
            } else  {
               System.out.println("Your guess is too "+(correct >guess3? "low.":"high."));
            }

            if ( a != guess3){
               System.out.println("\nYou lose. The number was "+a+".\n");
            }
         }
      }
   }
}
