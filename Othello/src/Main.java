import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("! WELCOME TO THE OTHELLO GAME !");
        System.out.println();
        System.out.println("--------------------");
        System.out.println("| Choose game type |");
        System.out.println("--------------------");
        System.out.println("| 1) Single Player |");
        System.out.println("| 2) Multiplayer   |");
        System.out.println("--------------------");

        switch (scanner.nextInt()) {

            case 1:
                SinglePlayerGame singlePlayerGame = new SinglePlayerGame();
                singlePlayerGame.startSinglePlayerGame();
                break;

            case 2:
                MultiPlayerGame multiPlayerGame = new MultiPlayerGame();
                multiPlayerGame.startMultiPlayerGame();
                break;

        }
    }
}
