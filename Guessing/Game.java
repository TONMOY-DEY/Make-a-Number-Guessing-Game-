package Guessing;

import java.util.Scanner;
import java.util.Random;

public class Game {
    public void playGame(){
    Scanner scanner=new Scanner(System.in);
    Random random=new Random();

    int Computernumber=random.nextInt(100)+1;
    int  Guessing;
    int trying=0;

   System.out.println("I have thought of a number between 1 and 100");
   System.out.println("can you guess what it is?");

    while (true){
    System.out.println("Enter your guess");
    Guessing=scanner.nextInt();
    trying++;
   
   if(Guessing>Computernumber){
    System.out.println("Your guessing number is high,please try a smaller number");
   }
   else if(Guessing<Computernumber){
    System.out.println("your guess is too low,please try a bigger number ");
   }
   else{
    System.out.println("Congratulation!your guessed the correct number");
    System.out.println("you took....."  +trying+ "trying");
    break;
   }
    }
}
}
