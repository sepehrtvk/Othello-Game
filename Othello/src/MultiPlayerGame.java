import java.util.Scanner;

/**
 * this class represents an Othello game in multi player mode.
 * this class inherits form the OthelloGame class.
 *
 * @author sepehr tavakoli
 * @version 1.0
 * @since 2020.04.01
 */

public class MultiPlayerGame extends GameBoard {
    /**
     * this method starts a multi player game.
     */
    public void startMultiPlayerGame() {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            //show map.
            printMap();
            //show scoreboard.
            displayScoreBoard();

            System.out.println();
            System.out.println("Black player , choose your cell :");
            System.out.println("---------------------------------");
            System.out.println();

            //enter column.
            System.out.println("Column (from A-H) : ");
            String column = scanner.next();

            //enter row.
            System.out.println("Row (from 1-8) : ");
            int row = scanner.nextInt();

            //set player 1.
            setplayer1('●');

            //call move method.
            move(column.charAt(0), row);

            //show map.
            printMap();
            //show scoreboard.
            displayScoreBoard();

            //check end game.
            if (!gameOver()) {
                System.out.println();
                endGame();
                return;
            }
            System.out.println("White player , choose your cell :");
            System.out.println("---------------------------------");
            System.out.println();

            //enter column.
            System.out.println("Column (from A-H) : ");
            String column2 = scanner.next();

            //enter row.
            System.out.println("Row (from 1-8) : ");
            int row2 = scanner.nextInt();

            //set player 2.
            setplayer1('◯');

            //call move method.
            move(column2.charAt(0), row2);

            //check end game.
            if (!gameOver()) {
                System.out.println();
                printMap();
                displayScoreBoard();
                endGame();
                return;
            }
        }

    }
}
