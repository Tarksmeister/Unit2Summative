/*
 * This program allows the user to play a best of 3 game of Rock Paper Scissors
 * Stores the user results and displays them at the nd
 * Made on May 4th to May 24th, 2020
 * Made by Tarkan Ahmed Dahi
 */
package unit2summative;
import java.util.Scanner;

/**
 *
 * @author ITTech
 */
public class Unit2Summative {
    //Static Variable Declarations, also sets up the User choice array, and the Computer choice
    static int computerWins = 0;
    static int userWins = 0;
    static int [] userChoice = new int [3];
    static int computerInput = computerRandom();
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Variable declaration area
        Scanner keyedInput = new Scanner(System.in);
        int rock = 1;
        int paper = 2;
        int scissors = 3;
        
        //Loops three times. Userge plays rock, paper, scissors three times
        for (int i = 0; i <= 2; i++)
        {    
        System.out.println("\nRock, Paper, Scissors Game!"); //Classic rules for Rock Paper Scissors
        System.out.println("----------------------------");
        System.out.println("Welcome to the rock, paper, scissors game!");  
        System.out.println("The rules are simple. Pick one of the three options and try to win against a computer.");  
        System.out.println("Best two out of three, get ready to play!");  
        System.out.println("Enter choice: Rock = 1, Paper = 2, Scissors = 3");
        userChoice[i] = keyedInput.nextInt();
         //Randomizes computer input
         int computerInput = computerRandom();
         //Checks if the computer chose the same thing as the user
         if(computerInput == userChoice[i])
          {
            System.out.println("Tie!"); //this step clears a lot of future code, tie is sufficent, 
          }                             //dont need to do the computer also chose "option", and you chose this option etc
          
         //Check if the user input rock then checks what the computer chose
         else if (userChoice[i] == rock){
            if(computerInput == 2){
                System.out.println("Computer picked paper, you lose!");
                computerWins = computerWins + 1;
                    } else if (computerInput == 3){
                    System.out.println("Computer picked scissors, you win!");
                    userWins = userWins + 1;
                } 
            } 
         //Check if the user input paper then checks what the computer chose
         else if (userChoice[i] == paper){
                if(computerInput == 1){
                System.out.println("Computer picked rock, you win!");
                userWins = userWins + 1;
                    } else if (computerInput == 3){
                    System.out.println("Computer picked scissors, you lose!");
                    computerWins = computerWins + 1;
                    }
            } 
         //Check if the user unput scissors then checks what the computer chose
         else if (userChoice[i] == scissors){
                if(computerInput == 1) {
                System.out.println("Computer picked rock, you lose!");
                computerWins = computerWins + 1;
                    } else if (computerInput == 2){
                    System.out.println("Computer picked paper, you win!");
                    userWins = userWins + 1;
                    }
                }
        }
        //Results
        resultsAll(); //Overall who won this game, or if it was a tie
        firstGame(); //users choice in the first game
        secondGame(); //users choice in the second game
        thirdGame(); // users choice in the third game
      }  
    /**
     * Returns a random number that will be used as the computers choice in this game
     * @return 
     */
    public static int computerRandom(){
    int computerInput1 = (int) (Math.random() * 3) + 1;
    return computerInput1;
    }
    
    /**
     * Displays results based on wins and loses of boh the computer and the person
     */
    public static void resultsAll(){
    if(userWins < computerWins){
        System.out.println("The Computer won the best of 3, better luck next time!");    
        } else if(userWins > computerWins){
        System.out.println("You won this best of 3!!!");    
        } else if(userWins == computerWins){
        System.out.println("Overall, it was a tie.");     
        }
    }
    
    /**
     * Allows user to view what they input during the first round using an array
     */
    public static void firstGame(){
    if(userChoice[0] == 1){
        System.out.println("You picked rock first");
        } else if (userChoice[0] == 2){
        System.out.println("You picked paper first");
        } else if (userChoice[0] == 3){
        System.out.println("You picked scissors first");
        }  
    }
    
     /**
     * Allows user to view what they input during the second round using an array
     */
    public static void secondGame(){
    if(userChoice[1] == 1){
        System.out.println("You picked rock second");
        } else if (userChoice[1] == 2){
        System.out.println("You picked paper second");
        } else if (userChoice[1] == 3){
        System.out.println("You picked scissors second");
        } 
    }
    
     /**
     * Allows user to view what they input during the third round using an array
     */
    public static void thirdGame(){
    if(userChoice[2] == 1){
        System.out.println("You picked rock third");
        } else if (userChoice[2] == 2){
        System.out.println("You picked paper third");
        } else if (userChoice[2] == 3){
        System.out.println("You picked scissors third");
        }
    }
    
  }
        
    