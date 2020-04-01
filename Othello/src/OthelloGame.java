import java.lang.reflect.Array;

public class OthelloGame {
    private char gameMap[][] = new char[8][8];
    private char player1;
    private char player2;

    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[40m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_RESET_BACKGROUND = "\u001B[0m";


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
    
    public void setplayer1(char player1) {
        this.player1 = player1;
        if (player1 == '◯') player2 = '●';
        else player2 = '◯';
    }

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

    public void move(char x, int y) {
        switch (x) {
            case 'A':
                if (isEmpty(y - 1, 0) && isAllowed(y - 1, 0)) {
                    checkRow(y - 1, 0);
                    checkColumn(y - 1, 0);
                    checkAngle(y - 1, 0);
                }

                break;
            case 'B':
                if (isEmpty(y - 1, 1) && isAllowed(y - 1, 1)) {
                    checkRow(y - 1, 1);
                    checkColumn(y - 1, 1);
                    checkAngle(y - 1, 1);
                }


                break;
            case 'C':
                if (isEmpty(y - 1, 2) && isAllowed(y - 1, 2)) {
                    checkRow(y - 1, 2);
                    checkColumn(y - 1, 2);
                    checkAngle(y - 1, 2);
                }

                break;
            case 'D':
                if (isEmpty(y - 1, 3) && isAllowed(y - 1, 3)) {
                    checkRow(y - 1, 3);
                    checkColumn(y - 1, 3);
                    checkAngle(y - 1, 3);
                }


                break;
            case 'E':
                if (isEmpty(y - 1, 4) && isAllowed(y - 1, 4)) {
                    checkRow(y - 1, 4);
                    checkColumn(y - 1, 4);
                    checkAngle(y - 1, 4);
                }


                break;
            case 'F':
                if (isEmpty(y - 1, 5) && isAllowed(y - 1, 5)) {
                    checkRow(y - 1, 5);
                    checkColumn(y - 1, 5);
                    checkAngle(y - 1, 5);
                }


                break;
            case 'G':
                if (isEmpty(y - 1, 6) && isAllowed(y - 1, 6)) {
                    checkRow(y - 1, 6);
                    checkColumn(y - 1, 6);
                    checkAngle(y - 1, 6);
                }


                break;
            case 'H':
                if (isEmpty(y - 1, 7) && isAllowed(y - 1, 7)) {
                    checkRow(y - 1, 7);
                    checkColumn(y - 1, 7);
                    checkAngle(y - 1, 7);
                }


                break;
        }
    }

    public boolean isEmpty(int x, int y) {
        if (gameMap[x][y]==' ') return true;
        else return false;
    }

    public boolean isAllowedRow(int x, int y) {
        for (int i = 1; i < 7 - y; i++) {
            if (!isEmpty(x, y + i)) {
                if (gameMap[x][y + i] == player2) {
                    if (gameMap[x][y + i + 1] == player1) return true;
                }
            }else break;
        }
        for (int i = 1; i < y - 1; i++) {
            if (!isEmpty(x, y - i)) {
                if (gameMap[x][y - i] == player2) {
                    if (gameMap[x][y - i - 1] == player1) return true;
                }
            }else break;
        }
        return false;
    }

    public boolean isAllowedColumn(int x, int y) {
        for (int i = 1; i < 7 - x; i++) {
            if (!isEmpty(x + i, y)) {
                if (gameMap[x + i][y] == player2) {
                    if (gameMap[x + i + 1][y] == player1) return true;
                }
            }else break;
        }
        for (int i = 1; i < x - 1; i++) {
            if (!isEmpty(x - i, y)) {
                if (gameMap[x - i][y] == player2) {
                    if (gameMap[x - i - 1][y] == player1) return true;
                }
            }else break;
        }
        return false;
    }

    public boolean isAllowedAngle(int x, int y) {
        for (int i = 1; i < x-1 && i < y-1; i++) {
            if (!isEmpty(x - i, y - i)) {
                if (gameMap[x - i][y - i] == player2) {
                    if (gameMap[x - i - 1][y - i - 1] == player1) return true;
                }
            }else break;
        }
        for (int i = 1; i < 7 - x && i < 7 - y; i++) {
            if (!isEmpty(x + i, y + i)) {
                if (gameMap[x + i][y + i] == player2) {
                    if (gameMap[x + i + 1][y + i + 1] == player1) return true;
                }
            }else break;
        }
        for (int i = 1; i < 7 - y && i < x-1; i++) {
            if (!isEmpty(x - i, y + i)) {
                if (gameMap[x - i][y + i] == player2) {
                    if (gameMap[x - i - 1][y + i + 1] == player1) return true;
                }
            }else break;
        }
        for (int i = 1; i < 7 - x && i < y-1; i++) {
            if (!isEmpty(x + i, y - i)) {
                if (gameMap[x + i][y - i] == player2) {
                    if (gameMap[x + i + 1][y - i - 1] == player1) return true;

                }
            }else break;
        }
        return false;
    }

    public void checkRow(int x, int y) {
        for (int i = 1; i < 7 - y; i++) {
            if (!isEmpty(x, y + i) && !isEmpty(x, y + i + 1)) {
                if (gameMap[x][y + i] == player2 && gameMap[x][y + i + 1] == player1) {
                    for (int k = i; k > 0; k--) {
                        if (!isEmpty(x, y + k)) {
                            gameMap[x][y + k] = player1;
                            gameMap[x][y] = player1;
                        }
                    }
                }
            }
        }
        for (int i = 1; i < y - 1; i++) {
            if (!isEmpty(x, y - i) && !isEmpty(x, y - i - 1)) {
                if (gameMap[x][y - i] == player2 && gameMap[x][y - i - 1] == player1) {
                    for (int k = i; k > 0; k--) {
                        if (!isEmpty(x, y - k)) {
                            gameMap[x][y - k] = player1;
                            gameMap[x][y] = player1;
                        }
                    }
                }
            }
        }
    }

    public void checkColumn(int x, int y) {
        for (int i = 1; i < 7 - x; i++) {
            if (!isEmpty(x + i, y) && !isEmpty(x + i + 1, y)) {
                if (gameMap[x + i][y] == player2 && gameMap[x + i + 1][y] == player1) {
                    for (int k = i; k > 0; k--) {
                        if (!isEmpty(x + k, y))
                            gameMap[x + k][y] = player1;
                        gameMap[x][y] = player1;
                    }
                }
            }else break;
        }
        for (int i = 1; i < x - 1; i++) {
            if (!isEmpty(x - i, y) && !isEmpty(x - i - 1, y)) {
                if (gameMap[x - i][y] == player2 && gameMap[x - i - 1][y] == player1) {
                    for (int k = i; k > 0; k--) {
                        if (!isEmpty(x - k, y))
                            gameMap[x - k][y] = player1;
                        gameMap[x][y] = player1;
                    }
                }
            }else break;
        }
    }

    public void checkAngle(int x, int y) {
        for (int i = 1; i < x - 1 && i < y - 1; i++) {
            if (!isEmpty(x - i, y - i) && !isEmpty(x - 1 - i, y - i - 1)) {
                if (gameMap[x - i][y - i] == player2 && gameMap[x - i - 1][y - i - 1] == player1) {
                    for (int k = i; k > 0; k--) {
                        if (!isEmpty(x - k, y - k))
                            gameMap[x - k][y - k] = player1;
                        gameMap[x][y] = player1;
                    }
                }
            }else break;
        }
        for (int i = 1; i < 7 - x && i < 7 - y; i++) {
            if (!isEmpty(x + i, y + i) && !isEmpty(x + 1 + i, y + i + 1)) {
                if (gameMap[x + i][y + i] == player2 && gameMap[x + i + 1][y + i + 1] == player1) {
                    for (int k = i; k > 0; k--) {
                        if (!isEmpty(x + k, y + k))
                            gameMap[x + k][y + k] = player1;
                        gameMap[x][y] = player1;
                    }
                }
            }else break;
        }
        for (int i = 1; i < 7 - y && i < x - 1; i++) {
            if (!isEmpty(x - i, y + i) && !isEmpty(x - 1 - i, y + i + 1)) {
                if (gameMap[x - i][y + i] == player2 && gameMap[x - i - 1][y + i + 1] == player1) {
                    for (int k = i; k > 0; k--) {
                        if (!isEmpty(x - k, y + k))
                            gameMap[x - k][y + k] = player1;
                        gameMap[x][y] = player1;
                    }
                }
            }else break;
        }
        for (int i = 1; i < 7 - x && i < y - 1; i++) {
            if (!isEmpty(x + i, y - i) && !isEmpty(x + 1 + i, y - i - 1)) {
                if (gameMap[x + i][y - i] == player2 && gameMap[x + i + 1][y - i - 1] == player1) {
                    for (int k = i; k > 0; k--) {
                        if (!isEmpty(x + k, y - k))
                        gameMap[x + k][y - k] = player1;
                        gameMap[x][y] = player1;
                    }
                }
            }else break;
        }
    }

    public boolean isAllowed(int x, int y) {
        if (isAllowedRow(x, y) || isAllowedAngle(x, y) || isAllowedColumn(x, y)) return true;
        if (x < 7 && y < 7 && x > 0 && y > 0) {
            if (gameMap[x + 1][y] == ' ' &&
                    gameMap[x][y + 1] == ' ' &&
                    gameMap[x - 1][y] == ' ' &&
                    gameMap[x][y - 1] == ' ' &&
                    gameMap[x - 1][y - 1] == ' ' &&
                    gameMap[x + 1][y + 1] == ' ' &&
                    gameMap[x + 1][y - 1] == ' ' &&
                    gameMap[x - 1][y + 1] == ' ') return false;
        }
        if (y == 0 && x > 0 && x < 7) {
            if (gameMap[x + 1][y] == ' ' &&
                    gameMap[x - 1][y] == ' ' &&
                    gameMap[x - 1][y + 1] == ' ' &&
                    gameMap[x + 1][y + 1] == ' ' &&
                    gameMap[x][y + 1] == ' ') return false;
        }
        if (x == 0 && y > 0 && y < 7) {
            if (gameMap[x + 1][y] == ' ' &&
                    gameMap[x][y - 1] == ' ' &&
                    gameMap[x + 1][y] == ' ' &&
                    gameMap[x + 1][y - 1] == ' ' &&
                    gameMap[x + 1][y + 1] == ' ') return false;
        }
        if (y == 7 && x > 0 && x < 7) {
            if (gameMap[x + 1][y] == ' ' &&
                    gameMap[x - 1][y] == ' ' &&
                    gameMap[x][y - 1] == ' ' &&
                    gameMap[x - 1][y - 1] == ' ' &&
                    gameMap[x + 1][y - 1] == ' ') return false;
        }
        if (x == 7 && y > 0 && y < 7) {
            if (gameMap[x][y + 1] == ' ' &&
                    gameMap[x][y - 1] == ' ' &&
                    gameMap[x][y - 1] == ' ' &&
                    gameMap[x - 1][y + 1] == ' ' &&
                    gameMap[x - 1][y - 1] == ' ') return false;
        }
        if (x == 7 && y == 7) {
            if (gameMap[6][7] == ' ' && gameMap[7][6] == ' ' && gameMap[6][6] == ' ') return false;
        }
        if (x == 0 && y == 0) {
            if (gameMap[0][1] == ' ' && gameMap[1][0] == ' ' && gameMap[1][1] == ' ') return false;
        }
        if (x == 0 && y == 7) {
            if (gameMap[0][7] == ' ' && gameMap[6][1] == ' ' && gameMap[7][1] == ' ') return false;
        }
        if (x == 7 && y == 0) {
            if (gameMap[6][0] == ' ' && gameMap[1][7] == ' ' && gameMap[1][6] == ' ') return false;
        }

        return false;
    }

    public void displayScore() {
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

    public boolean gameOver() {
        int counter1 = 0;
        int counter2 = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (gameMap[i][j] == '●') counter1++;
                if (gameMap[i][j] == '◯') counter2++;
                //if (!isAllowedColumn(i, j) && !isAllowedRow(i, j) && !isAllowedAngle(i, j)) return true;
            }
        }
        if (counter1 == 0 || counter2 == 0) return false;
        if (counter1 + counter2 == 64) return false;

        return true;
    }

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
