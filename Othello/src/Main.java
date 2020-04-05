import java.util.Scanner;

/**
 * the main class to determine game type (single or multi player).
 *
 * @author sepehr tavakoli
 * @version 1.0
 * @since 2020.04.01
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //print welcome.
        System.out.println("! WELCOME TO THE OTHELLO GAME !");
        System.out.println();
        System.out.println("--------------------");
        System.out.println("| Choose game type |");
        System.out.println("--------------------");
        System.out.println("| 1) Single Player |");
        System.out.println("| 2) Multiplayer   |");
        System.out.println("--------------------");

        //get input to determine game type.
        switch (scanner.nextInt()) {

            case 1:
                //single player game.
                SinglePlayerGame singlePlayerGame = new SinglePlayerGame();
                singlePlayerGame.startSinglePlayerGame();
                break;

            case 2:
                //multi player game.
                MultiPlayerGame multiPlayerGame = new MultiPlayerGame();
                multiPlayerGame.startMultiPlayerGame();
                break;

        }
    }
}
