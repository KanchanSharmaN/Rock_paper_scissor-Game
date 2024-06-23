import java.util.Scanner;
import java.util.Random;
public class Game {
    public static void main(String[]args){
        Scanner sn = new Scanner(System.in);
        //0-rock 1-paper 2-scissor
        System.out.println("0-rock 1-paper 2-scissor\nEnter a choice:");
        int userInput = sn.nextInt();
        if(userInput>2){
            System.out.println("Invalid Choice! Try Again:");
        }else {

            Random random = new Random();
            int computerInput = random.nextInt(3);

            if (userInput == computerInput) {
                System.out.println("Draw");
            } else if (userInput == 0 && computerInput == 2 || userInput == 1 && computerInput == 0 || userInput == 2 && computerInput == 1) {
                System.out.println("You win!");
            } else {
                System.out.println("Computer win!");
            }
            //System.out.println("Computer Choice:" + computerInput);
            if (computerInput == 0) {
                System.out.println("Computer Choice: rock");
            } else if (computerInput == 1) {
                System.out.println("Computer Choice: paper");
            } else {
                System.out.println("Computer Choice: scissor");
            }
        }
    }
}
