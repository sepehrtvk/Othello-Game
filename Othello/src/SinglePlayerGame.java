import java.util.Random;
import java.util.Scanner;

/**
 * this class represents an Othello game in single player mode.
 * this class inherits form the OthelloGame class.
 *
 * @author sepehr tavakoli
 * @version 1.0
 * @since 2020.04.01
 */

public class SinglePlayerGame extends GameBoard {
    /**
     * this method starts a single player game.
     */
    public void startSinglePlayerGame() {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            //show map.
            printMap();
            //show scoreboard.
            displayScoreBoard();

            System.out.println();
            System.out.println("Choose your cell :");
            System.out.println("------------------");
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

            if (!gameOver()) {
                endGame();
                return;
            }
            String chars = "ABCDEFGH";

            //set player 2.
            setplayer1('◯');
            //find a random column and row.
            while (true) {
                Random random = new Random();
                int column3 = 0;
                char column2 = chars.charAt(random.nextInt(chars.length()));
                int row2 = random.nextInt(8);

                //change char to number.
                if (column2 == 'A') column3 = 0;
                if (column2 == 'B') column3 = 1;
                if (column2 == 'C') column3 = 2;
                if (column2 == 'D') column3 = 3;
                if (column2 == 'E') column3 = 4;
                if (column2 == 'F') column3 = 5;
                if (column2 == 'G') column3 = 6;
                if (column2 == 'H') column3 = 7;

                //check if the random block is allowed or not.
                if (isAllowedMove(row2, column3) && isBlockEmpty(row2, column3)) {
                    System.out.println();
                    System.out.println("Computer choosed cell in Column <" + column2 + "> and Row <" + (row2 + 1) + ">");
                    System.out.println();
                    move(column2, row2 + 1);
                    break;
                }
            }
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
