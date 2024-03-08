///ROCK PAEPAR SCISSOR GAME CREATED BY AKSHAY

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter 0 for Rock, 1 for paper, 2 for scissor ");
        int userInput = sc.nextInt();

        Random random = new Random();
        int computerInput = random.nextInt(3);

        if(userInput==computerInput){
        System.out.println("Drow");
        }
        else if(userInput==0 && computerInput == 2 || userInput == 1 && computerInput == 0 || userInput == 2 && computerInput == 1){
        System.out.println("You Win");
        if (userInput == 2){
            System.out.println("user choice : Scissor ");
        } else if(userInput == 1){
            System.out.println("user choice Paper");
        }else if(userInput == 0){
            System.out.println("user choice :  Rock");
        }
        }else {
            System.out.println("Computer win");
        }
        System.out.println(("Computer choice :" + computerInput));
        if (computerInput == 0){
            System.out.println("Computer choice :  Rock");
        } else if(computerInput == 1){
            System.out.println("Cumputer choice Paper");
        }else if(computerInput == 2){
            System.out.println("Computer choice :  Scissor");
        }
        
    }}

