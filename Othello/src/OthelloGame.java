import java.lang.reflect.Array;

/**
 * this OthelloGame class manages the game and makes a 8*8 map for the game.
 * Othello is a strategy board game for two players, played on an 8×8 board.
 * There are sixty-four identical game pieces called disks, which are light on one side and dark on the other.
 * Players take turns placing disks on the board with their assigned color facing up.
 *
 * @author sepehr tavakoli
 * @version 1.0
 * @since 2020.04.01
 */

public class OthelloGame {

    //game board.
    protected char gameMap[][] = new char[8][8];
    //first player.
    protected char player1;
    //second player.
    protected char player2;

    //making color for each string.
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[40m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_RESET_BACKGROUND = "\u001B[0m";

    /**
     * this constructor makes a Othello game and puts 2 black and 2 white disks in
     * the middle of board.
     */
    public OthelloGame() {
        for (int i = 0; i < gameMap.length; i++) {
            for (int j = 0; j < gameMap.length; j++) {
                this.gameMap[i][j] = ' ';
            }
        }
        this.gameMap[3][3] = '◯';
        this.gameMap[4][4] = '◯';
        this.gameMap[4][3] = '●';
        this.gameMap[3][4] = '●';
    }

    /**
     * this setplayer1 method sets the first player disk.(black or white)
     *
     * @param player1 color of the first player.
     */
    public void setplayer1(char player1) {
        this.player1 = player1;
        if (player1 == '◯') player2 = '●';
        else player2 = '◯';
    }

    /**
     * this printMap method prints rows , columns and disks for each player.
     */
    public void printMap() {
        System.out.println("       A        B        C        D        E        F        G        H ");

        for (int i = 0; i < 8; i++) {
            System.out.println("  " + ANSI_GREEN_BACKGROUND + "                                                                          " + ANSI_RESET_BACKGROUND);
            if (i % 2 == 0) {
                System.out.println("  " + ANSI_GREEN_BACKGROUND + "  " + ANSI_RESET_BACKGROUND + ANSI_BLUE_BACKGROUND + "       " + ANSI_RESET_BACKGROUND + ANSI_GREEN_BACKGROUND + "  " + ANSI_RESET_BACKGROUND + ANSI_RED_BACKGROUND + "       " + ANSI_RESET_BACKGROUND + ANSI_GREEN_BACKGROUND + "  " + ANSI_RESET_BACKGROUND + ANSI_BLUE_BACKGROUND + "       " + ANSI_RESET_BACKGROUND + ANSI_GREEN_BACKGROUND + "  " + ANSI_RESET_BACKGROUND + ANSI_RED_BACKGROUND + "       " + ANSI_RESET_BACKGROUND + ANSI_GREEN_BACKGROUND + "  " + ANSI_RESET_BACKGROUND + ANSI_BLUE_BACKGROUND + "       " + ANSI_RESET_BACKGROUND + ANSI_GREEN_BACKGROUND + "  " + ANSI_RESET_BACKGROUND + ANSI_RED_BACKGROUND + "       " + ANSI_RESET_BACKGROUND + ANSI_GREEN_BACKGROUND + "  " + ANSI_RESET_BACKGROUND + ANSI_BLUE_BACKGROUND + "       " + ANSI_RESET_BACKGROUND + ANSI_GREEN_BACKGROUND + "  " + ANSI_RESET_BACKGROUND + ANSI_RED_BACKGROUND + "       " + ANSI_RESET_BACKGROUND + ANSI_GREEN_BACKGROUND + "  " + ANSI_RESET_BACKGROUND);
                System.out.println((i + 1) + " " + ANSI_GREEN_BACKGROUND + "  " + ANSI_RESET_BACKGROUND + ANSI_BLUE_BACKGROUND + "   " + gameMap[i][0] + "   " + ANSI_RESET_BACKGROUND + ANSI_GREEN_BACKGROUND + "  " + ANSI_RESET_BACKGROUND + ANSI_BLUE_BACKGROUND + ANSI_RED_BACKGROUND + "   " + gameMap[i][1] + "   " + ANSI_RESET_BACKGROUND + ANSI_GREEN_BACKGROUND + "  " + ANSI_RESET_BACKGROUND + ANSI_BLUE_BACKGROUND + ANSI_BLUE_BACKGROUND + "   " + gameMap[i][2] + "   " + ANSI_RESET_BACKGROUND + ANSI_GREEN_BACKGROUND + "  " + ANSI_RESET_BACKGROUND + ANSI_BLUE_BACKGROUND + ANSI_RED_BACKGROUND + "   " + gameMap[i][3] + "   " + ANSI_RESET_BACKGROUND + ANSI_GREEN_BACKGROUND + "  " + ANSI_RESET_BACKGROUND + ANSI_BLUE_BACKGROUND + ANSI_BLUE_BACKGROUND + "   " + gameMap[i][4] + "   " + ANSI_RESET_BACKGROUND + ANSI_GREEN_BACKGROUND + "  " + ANSI_RESET_BACKGROUND + ANSI_BLUE_BACKGROUND + ANSI_RED_BACKGROUND + "   " + gameMap[i][5] + "   " + ANSI_RESET_BACKGROUND + ANSI_GREEN_BACKGROUND + "  " + ANSI_RESET_BACKGROUND + ANSI_BLUE_BACKGROUND + ANSI_BLUE_BACKGROUND + "   " + gameMap[i][6] + "   " + ANSI_RESET_BACKGROUND + ANSI_GREEN_BACKGROUND + "  " + ANSI_RESET_BACKGROUND + ANSI_BLUE_BACKGROUND + ANSI_RED_BACKGROUND + "   " + gameMap[i][7] + "   " + ANSI_RESET_BACKGROUND + ANSI_GREEN_BACKGROUND + "  " + ANSI_RESET_BACKGROUND);
                System.out.println("  " + ANSI_GREEN_BACKGROUND + "  " + ANSI_RESET_BACKGROUND + ANSI_BLUE_BACKGROUND + "       " + ANSI_RESET_BACKGROUND + ANSI_GREEN_BACKGROUND + "  " + ANSI_RESET_BACKGROUND + ANSI_RED_BACKGROUND + "       " + ANSI_RESET_BACKGROUND + ANSI_GREEN_BACKGROUND + "  " + ANSI_RESET_BACKGROUND + ANSI_BLUE_BACKGROUND + "       " + ANSI_RESET_BACKGROUND + ANSI_GREEN_BACKGROUND + "  " + ANSI_RESET_BACKGROUND + ANSI_RED_BACKGROUND + "       " + ANSI_RESET_BACKGROUND + ANSI_GREEN_BACKGROUND + "  " + ANSI_RESET_BACKGROUND + ANSI_BLUE_BACKGROUND + "       " + ANSI_RESET_BACKGROUND + ANSI_GREEN_BACKGROUND + "  " + ANSI_RESET_BACKGROUND + ANSI_RED_BACKGROUND + "       " + ANSI_RESET_BACKGROUND + ANSI_GREEN_BACKGROUND + "  " + ANSI_RESET_BACKGROUND + ANSI_BLUE_BACKGROUND + "       " + ANSI_RESET_BACKGROUND + ANSI_GREEN_BACKGROUND + "  " + ANSI_RESET_BACKGROUND + ANSI_RED_BACKGROUND + "       " + ANSI_RESET_BACKGROUND + ANSI_GREEN_BACKGROUND + "  " + ANSI_RESET_BACKGROUND);
            } else {
                System.out.println("  " + ANSI_GREEN_BACKGROUND + "  " + ANSI_RESET_BACKGROUND + ANSI_RED_BACKGROUND + "       " + ANSI_RESET_BACKGROUND + ANSI_GREEN_BACKGROUND + "  " + ANSI_RESET_BACKGROUND + ANSI_BLUE_BACKGROUND + "       " + ANSI_RESET_BACKGROUND + ANSI_GREEN_BACKGROUND + "  " + ANSI_RESET_BACKGROUND + ANSI_RED_BACKGROUND + "       " + ANSI_RESET_BACKGROUND + ANSI_GREEN_BACKGROUND + "  " + ANSI_RESET_BACKGROUND + ANSI_BLUE_BACKGROUND + "       " + ANSI_RESET_BACKGROUND + ANSI_GREEN_BACKGROUND + "  " + ANSI_RESET_BACKGROUND + ANSI_RED_BACKGROUND + "       " + ANSI_RESET_BACKGROUND + ANSI_GREEN_BACKGROUND + "  " + ANSI_RESET_BACKGROUND + ANSI_BLUE_BACKGROUND + "       " + ANSI_RESET_BACKGROUND + ANSI_GREEN_BACKGROUND + "  " + ANSI_RESET_BACKGROUND + ANSI_RED_BACKGROUND + "       " + ANSI_RESET_BACKGROUND + ANSI_GREEN_BACKGROUND + "  " + ANSI_RESET_BACKGROUND + ANSI_BLUE_BACKGROUND + "       " + ANSI_RESET_BACKGROUND + ANSI_GREEN_BACKGROUND + "  " + ANSI_RESET_BACKGROUND);
                System.out.println((i + 1) + " " + ANSI_GREEN_BACKGROUND + "  " + ANSI_RESET_BACKGROUND + ANSI_RED_BACKGROUND + "   " + gameMap[i][0] + "   " + ANSI_RESET_BACKGROUND + ANSI_GREEN_BACKGROUND + "  " + ANSI_RESET_BACKGROUND + ANSI_RED_BACKGROUND + ANSI_BLUE_BACKGROUND + "   " + gameMap[i][1] + "   " + ANSI_RESET_BACKGROUND + ANSI_GREEN_BACKGROUND + "  " + ANSI_RESET_BACKGROUND + ANSI_RED_BACKGROUND + ANSI_RED_BACKGROUND + "   " + gameMap[i][2] + "   " + ANSI_RESET_BACKGROUND + ANSI_GREEN_BACKGROUND + "  " + ANSI_RESET_BACKGROUND + ANSI_RED_BACKGROUND + ANSI_BLUE_BACKGROUND + "   " + gameMap[i][3] + "   " + ANSI_RESET_BACKGROUND + ANSI_GREEN_BACKGROUND + "  " + ANSI_RESET_BACKGROUND + ANSI_RED_BACKGROUND + ANSI_RED_BACKGROUND + "   " + gameMap[i][4] + "   " + ANSI_RESET_BACKGROUND + ANSI_GREEN_BACKGROUND + "  " + ANSI_RESET_BACKGROUND + ANSI_RED_BACKGROUND + ANSI_BLUE_BACKGROUND + "   " + gameMap[i][5] + "   " + ANSI_RESET_BACKGROUND + ANSI_GREEN_BACKGROUND + "  " + ANSI_RESET_BACKGROUND + ANSI_RED_BACKGROUND + ANSI_RED_BACKGROUND + "   " + gameMap[i][6] + "   " + ANSI_RESET_BACKGROUND + ANSI_GREEN_BACKGROUND + "  " + ANSI_RESET_BACKGROUND + ANSI_RED_BACKGROUND + ANSI_BLUE_BACKGROUND + "   " + gameMap[i][7] + "   " + ANSI_RESET_BACKGROUND + ANSI_GREEN_BACKGROUND + "  " + ANSI_RESET_BACKGROUND);
                System.out.println("  " + ANSI_GREEN_BACKGROUND + "  " + ANSI_RESET_BACKGROUND + ANSI_RED_BACKGROUND + "       " + ANSI_RESET_BACKGROUND + ANSI_GREEN_BACKGROUND + "  " + ANSI_RESET_BACKGROUND + ANSI_BLUE_BACKGROUND + "       " + ANSI_RESET_BACKGROUND + ANSI_GREEN_BACKGROUND + "  " + ANSI_RESET_BACKGROUND + ANSI_RED_BACKGROUND + "       " + ANSI_RESET_BACKGROUND + ANSI_GREEN_BACKGROUND + "  " + ANSI_RESET_BACKGROUND + ANSI_BLUE_BACKGROUND + "       " + ANSI_RESET_BACKGROUND + ANSI_GREEN_BACKGROUND + "  " + ANSI_RESET_BACKGROUND + ANSI_RED_BACKGROUND + "       " + ANSI_RESET_BACKGROUND + ANSI_GREEN_BACKGROUND + "  " + ANSI_RESET_BACKGROUND + ANSI_BLUE_BACKGROUND + "       " + ANSI_RESET_BACKGROUND + ANSI_GREEN_BACKGROUND + "  " + ANSI_RESET_BACKGROUND + ANSI_RED_BACKGROUND + "       " + ANSI_RESET_BACKGROUND + ANSI_GREEN_BACKGROUND + "  " + ANSI_RESET_BACKGROUND + ANSI_BLUE_BACKGROUND + "       " + ANSI_RESET_BACKGROUND + ANSI_GREEN_BACKGROUND + "  " + ANSI_RESET_BACKGROUND);

            }
        }
        System.out.println("  " + ANSI_GREEN_BACKGROUND + "                                                                          " + ANSI_RESET_BACKGROUND);
    }

    /**
     * the displayScoreBoard method prints scores of each player after each move.
     */
    public void displayScoreBoard() {
        int counter1 = 0;
        int counter2 = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (gameMap[i][j] == '●') counter1++;
                if (gameMap[i][j] == '◯') counter2++;
            }
        }
        System.out.println();
        System.out.println("                   +++++++++++++++++++++++++++++++++++++");
        System.out.println("                   | The score of the BLACK player | " + counter1 + " |");
        System.out.println("                   | The score of the WHITE player | " + counter2 + " |");
        System.out.println("                   +++++++++++++++++++++++++++++++++++++");
        System.out.println();
    }

    /**
     * the gameOver method returns false if the game has finished and no player can
     * move any disk.
     *
     * @return false to show the game has finished.
     */
    public boolean gameOver() {
        int counter1 = 0;
        int counter2 = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (gameMap[i][j] == '●') counter1++;
                if (gameMap[i][j] == '◯') counter2++;
            }
        }
        //if just only one color is on the board , game finished.
        if (counter1 == 0 || counter2 == 0) return false;

        //if board empty blocks completed , game finished.
        if (counter1 + counter2 == 64) return false;

        return true;

    }

    /**
     * the endGame method , prints the winner after game finished.
     * if no one wins the game , the game is as draw.
     */
    public void endGame() {
        int counter1 = 0;
        int counter2 = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (gameMap[i][j] == '●') counter1++;
                if (gameMap[i][j] == '◯') counter2++;
            }
        }
        if (counter1 > counter2) System.out.println("                      ! The winner is BLACK player !");
        if (counter1 < counter2) System.out.println("                      ! The winner is WHITE player !");
        if (counter1 == counter2) System.out.println("                          ! The game is draw !");
    }
}
