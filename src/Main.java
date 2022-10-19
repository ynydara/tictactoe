import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        //test driven development
        //write a program to test your program
        //main is where to test the code
        Scanner input = new Scanner(System.in);
        while (!game.isGameover()){
            System.out.println("Enter Move");
            //do later
        }
        //input.nextChar;
        TicTacToe game = new TicTacToe();

        game.playAMove('x', 0,0 );
        game.playAMove('o', 1,1 );
        game.playAMove('x', 2,2 );
        game.playAMove('x', 0,0 );
        game.playAMove('o', 1,1 );
        game.playAMove('x', 2,2 );

       //pretend these methods or classes exits already even if it doesn't yet
        game.isGameOver(); // true or false
        game.getWinner();

        System.out.println(game);
        //write program to remove the errors.

    }
}
