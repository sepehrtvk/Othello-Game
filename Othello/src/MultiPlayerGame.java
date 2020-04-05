import java.util.Scanner;

public class MultiPlayerGame extends GameBoard {

    public void startMultiPlayerGame() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            printMap();
            displayScoreBoard();
            System.out.println();
            System.out.println("Black player , choose your cell :");
            System.out.println("---------------------------------");
            System.out.println();
            System.out.println("Column (from A-H) : ");
            String column = scanner.next();
            System.out.println("Row (from 1-8) : ");
            int row = scanner.nextInt();
            setplayer1('●');
            move(column.charAt(0), row);
            printMap();
            displayScoreBoard();
            if (!gameOver()) {
                System.out.println();
                endGame();
                return;
            }
            System.out.println("White player , choose your cell :");
            System.out.println("---------------------------------");
            System.out.println();
            System.out.println("Column (from A-H) : ");
            String column2 = scanner.next();
            System.out.println("Row (from 1-8) : ");
            int row2 = scanner.nextInt();
            setplayer1('◯');
            move(column2.charAt(0), row2);
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
