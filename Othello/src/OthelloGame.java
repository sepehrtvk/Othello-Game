import java.lang.reflect.Array;

public class OthelloGame {
    private char gameMap[][] = new char[8][8];
    private char player1;
    private char player2;
    private int countPlayer;

    public OthelloGame() {
        for (int i = 0; i < gameMap.length; i++) {
            for (int j = 0; j < gameMap.length; j++) {
                this.gameMap[i][j] = ' ';
            }
        }
        this.gameMap[3][3] = '●';
        this.gameMap[4][4] = '●';
        this.gameMap[4][3] = '◯';
        this.gameMap[3][4] = '◯';
    }

    public char getplayer1() {
        return player1;
    }

    public void setplayer1(char player1) {
        this.player1 = player1;
        if (player1 == '◯') player2 = '●';
        else player2 = '◯';
    }

    public void printMap() {
        System.out.println("      A       B       C       D       E       F       G       H ");

        for (int i = 0; i < 8; i++) {
            System.out.println("  -----------------------------------------------------------------");
            System.out.println("  |       |       |       |       |       |       |       |       |");
            System.out.println((i + 1) + " |   " + gameMap[i][0] + "   |   " + gameMap[i][1] + "   |   " + gameMap[i][2] + "   |   " + gameMap[i][3] + "   |   " + gameMap[i][4] + "   |   " + gameMap[i][5] + "   |   " + gameMap[i][6] + "   |   " + gameMap[i][7] + "   |");
            System.out.println("  |       |       |       |       |       |       |       |       |");

        }
        System.out.println("  -----------------------------------------------------------------");

    }

    public void moveBlack(char x, int y) {
//
//        switch (x) {
//            case 'A':
//                if (isEmpty(y - 1, 0) && isAllowedRowBlack(y - 1, 0) || isAllowedColumn(y - 1, 0) || isAllowedAngle(y - 1, 0))
//                    gameMap[y - 1][0] = player1;
//                break;
//            case 'B':
//                if (isEmpty(y - 1, 1) && isAllowedRowBlack(y - 1, 1) || isAllowedColumn(y - 1, 1) || isAllowedAngle(y - 1, 1))
//                    gameMap[y - 1][1] = player1;
//                break;
//            case 'C':
//                if (isEmpty(y - 1, 2) && isAllowedRowBlack(y - 1, 2) || isAllowedColumn(y - 1, 2) || isAllowedAngle(y - 1, 2))
//                    gameMap[y - 1][2] = player1;
//                break;
//            case 'D':
//                if (isEmpty(y - 1, 3) && isAllowedRowBlack(y - 1, 3) || isAllowedColumn(y - 1, 3) || isAllowedAngle(y - 1, 3))
//                    gameMap[y - 1][3] = player1;
//                break;
//            case 'E':
//                if (isEmpty(y - 1, 4) && isAllowedRowBlack(y - 1, 4) || isAllowedColumn(y - 1, 4) || isAllowedAngle(y - 1, 4))
//                    gameMap[y - 1][4] = player1;
//                break;
//            case 'F':
//                if (isEmpty(y - 1, 5) && isAllowedRowBlack(y - 1, 5) || isAllowedColumn(y - 1, 5) || isAllowedAngle(y - 1, 5))
//                    gameMap[y - 1][5] = player1;
//                break;
//            case 'G':
//                if (isEmpty(y - 1, 6) && isAllowedRowBlack(y - 1, 6) || isAllowedColumn(y - 1, 6) || isAllowedAngle(y - 1, 6))
//                    gameMap[y - 1][6] = player1;
//                break;
//            case 'H':
//                if (isEmpty(y - 1, 7) && isAllowedRowBlack(y - 1, 7) || isAllowedColumn(y - 1, 7) || isAllowedAngle(y - 1, 7))
//                    gameMap[y - 1][7] = player1;
//                break;
//        }
//    }

        switch (x) {
            case 'A':
                if (isEmpty(y - 1, 0) && isAllowed(y - 1, 1)) {
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

    private boolean isEmpty(int x, int y) {
        if (gameMap[x][y] == ' ') return true;
        else return false;
    }

    private boolean isAllowedRowBlack(int x, int y) {
        if (y != 7 && y != 0 && x != -1 && x != 8) {
            if (gameMap[x][y + 1] == player1 || gameMap[x][y - 1] == player1) return false;
        }

        for (int i = 1; i < 8 - y; i++) {
            if (gameMap[x][y + i] == player2 && gameMap[x][y + i + 1] == player1) {
                return true;
            }
        }
        for (int i = 1; i < y; i++) {
            if (gameMap[x][y - i] == player2 && gameMap[x][y - i - 1] == player1) {
                return true;
            }

        }
        return false;
    }

    private boolean isAllowedColumn(int x, int y) {
        if (x != 7 && x != 0 && y != 8 && y != -1) {
            if (gameMap[x + 1][y] == player1 || gameMap[x - 1][y] == player1) return false;
        }
        for (int i = 1; i < 8 - x; i++) {
            if (gameMap[x + i][y] == player2 && gameMap[x + i + 1][y] == player1) {
//                for (int k = i; k > 0; k--) {
//                    if (!isEmpty(x + k, y))
//                        gameMap[x + k][y] = player1;
//                }
//                if (x < 7 && y < 7) {
//                    if (gameMap[x + 1][y + 1] == player2 && gameMap[x + 2][y + 2] == player1)
//                        gameMap[x + 1][y + 1] = player1;
//                }
//                if (y > 1 && x > 1) {
//                    if (gameMap[x - 1][y - 1] == player2 && gameMap[x - 2][y - 2] == player1)
//                        gameMap[x - 1][y - 1] = player1;
//                }
//                if (y > 1 && x < 7) {
//                    if (gameMap[x + 1][y - 1] == player2 && gameMap[x + 2][y - 2] == player1)
//                        gameMap[x + 1][y - 1] = player1;
//                }
//                if (x > 1 && y < 7) {
//                    if (gameMap[x - 1][y + 1] == player2 && gameMap[x - 2][y + 2] == player1)
//                        gameMap[x - 1][y + 1] = player1;
//                }
                return true;
            }
        }
        for (int i = 1; i < x; i++) {
            if (gameMap[x - i][y] == player2 && gameMap[x - i - 1][y] == player1) {
//                for (int k = i; k > 0; k--) {
//                    if (!isEmpty(x - k, y))
//                        gameMap[x - k][y] = player1;
//                }
//                if (x < 7 && y < 7) {
//                    if (gameMap[x + 1][y + 1] == player2 && gameMap[x + 2][y + 2] == player1 && !isEmpty(x + 1, y + 1))
//                        gameMap[x + 1][y + 1] = player1;
//                }
//                if (y > 1) {
//                    if (gameMap[x - 1][y - 1] == player2 && gameMap[x - 2][y - 2] == player1 && !isEmpty(x - 1, y - 1))
//                        gameMap[x - 1][y - 1] = player1;
//                }
//                if (y > 1) {
//                    if (gameMap[x + 1][y - 1] == player2 && gameMap[x + 2][y - 2] == player1 && !isEmpty(x + 1, y + 1))
//                        gameMap[x + 1][y - 1] = player1;
//                }
//                if (gameMap[x - 1][y + 1] == player2 && gameMap[x - 2][y + 2] == player1 && !isEmpty(x - 1, y + 1))
//                    gameMap[x - 1][y + 1] = player1;

                return true;
            }

        }

        return false;
    }

    private boolean isAllowedAngle(int x, int y) {
        if (x != 7 && x != 0 && y != 0 && y != 7) {
            if (gameMap[x + 1][y + 1] == player1 || gameMap[x - 1][y - 1] == player1) return false;
        }
        if (x < 6 && y < 6) {
            for (int i = 1; i < 8 - x && i < 8 - y; i++) {
                if (gameMap[x + i][y + i] == player2 && gameMap[x + i + 1][y + i + 1] == player1) {
//                    for (int k = i; k > 0; k--) {
//                        if (!isEmpty(x - k, y + k))
//                            gameMap[x - k][y + k] = player1;
//                    }
                    return true;
                }
            }
        } else {
            for (int i = 1; i < 8 - x && i < 8 - y; i++) {
                if (gameMap[x + i][y + i] == player2) {
//                    for (int k = 1; k < 8 - x && k < 8 - y; k++) {
//                        if (!isEmpty(x - k, y + k))
//                            gameMap[x - k][y + k] = player1;
//                    }
                    return true;
                }
            }
        }
        for (int i = 1; i < x && i < y; i++) {
            if (gameMap[x - i][y - i] == player2 && gameMap[x - i - 1][y - i - 1] == player1) {
//                for (int k = i; k > 0; k--) {
//                    if (!isEmpty(x - k, y - k))
//                        gameMap[x - k][y - k] = player1;
//                }
                return true;
            }

        }
        for (int i = 1; i < x && i < y; i++) {
            if (y < 9 + i && x < 7 - i && y > i + 1 && x > i + 1) {
                if (gameMap[x + i][y - i] == player2 && gameMap[x + i + 1][y - i - 1] == player1) {
//                for (int k = i; k > 0; k--) {
//                    if (!isEmpty(x + k, y - k))
//                        gameMap[x + k][y - k] = player1;
//                }
                    return true;
                }
            }else return true;
        }
        for (int i = 1; i < x && i < y; i++) {
            if (x < 9 + i && y < 7 - i && x > i + 1 && y > i + 1) {
                if (gameMap[x - i][y + i] == player2 && gameMap[x - i - 1][y + i + 1] == player1) {
                    return true;
                }
            }else return true;
        }
        return false;
    }

    public void checkRow(int x, int y) {
        for (int i = 1; i < 8 - y; i++) {
            if (!isEmpty(x, y + i)) {
                if (gameMap[x][y + i] == player2) {
                    if (y < 8 - i) i++;
                }
                if (y < 8 - i) {
                    if (gameMap[x][y + i] == player1) {
                        for (int k = i; k > 0; k--) {
                            if (!isEmpty(x, y + k))
                                gameMap[x][y + k] = player1;
                            gameMap[x][y] = player1;
                            countPlayer++;

                        }
                    }
                }
            }
        }
        for (int i = 1; i < y; i++) {
            if (!isEmpty(x, y - i)) {
                if (gameMap[x][y - i] == player2) i++;
                if (gameMap[x][y - i] == player1) {
                    for (int k = i; k > 0; k--) {
                        if (!isEmpty(x, y - k))
                            gameMap[x][y - k] = player1;
                        gameMap[x][y] = player1;
                        countPlayer++;

                    }
                }
            }
        }
    }

    public void checkColumn(int x, int y) {
        for (int i = 1; i < 8 - x; i++) {
            if (!isEmpty(x + i, y)) {
                if (gameMap[x + i][y] == player2) i++;
                if (gameMap[x + i][y] == player1) {

                    for (int k = i; k > 0; k--) {
                        if (!isEmpty(x + k, y))
                            gameMap[x + k][y] = player1;
                        gameMap[x][y] = player1;
                        countPlayer++;
                    }

                }
            }
        }
        for (int i = 1; i < x; i++) {
            if (!isEmpty(x - i, y)) {
                if (gameMap[x - i][y] == player2) i++;
                if (gameMap[x - i][y] == player1) {
                    for (int k = i; k > 0; k--) {
                        if (!isEmpty(x - k, y))
                            gameMap[x - k][y] = player1;
                        gameMap[x][y] = player1;
                        countPlayer++;
                    }
                }
            }
        }
    }

    public void checkAngle(int x, int y) {
        for (int i = 1; i < 8; i++) {
            if (x >= i && y >= i) {
                if (!isEmpty(x - i, y - i)) {
                    if (gameMap[x - i][y - i] == player2) {
                        if (x < 8 + i && y < 8 + i && x >= i && y >= i) i++;
                    }
                    if (x < 8 + i && y < 8 + i && x >= i && y >= i) {
                        if (gameMap[x - i][y - i] == player1) {
                            for (int k = i; k > 0; k--) {
                                if (!isEmpty(x - k, y - k))
                                    gameMap[x - k][y - k] = player1;
                                gameMap[x][y] = player1;
                                countPlayer++;
                            }
                        }
                    }
                }
            }
        }
        for (int i = 1; i < 8; i++) {
            if (x < 8 - i && y < 8 - i) {
                if (!isEmpty(x + i, y + i)) {
                    if (gameMap[x + i][y + i] == player2) {
                        if (x < 8 - i && y < 8 - i) i++;
                    }
                    if (gameMap[x + i][y + i] == player1) {
                        for (int k = i; k > 0; k--) {
                            if (!isEmpty(x + k, y + k))
                                gameMap[x + k][y + k] = player1;
                            gameMap[x][y] = player1;
                            countPlayer++;
                        }
                    }
                }
            }
        }
        for (int i = 1; i < 8; i++) {
            if (x >= i && y < 8 - i) {
                if (!isEmpty(x - i, y + i)) {
                    if (gameMap[x - i][y + i] == player2) {
                        if (x < 8 + i && y < 8 - i && x >= i) i++;
                    }
                    if (x < 8 + i && y < 8 - i && x >= i) {
                        if (gameMap[x - i][y + i] == player1) {
                            for (int k = i; k > 0; k--) {
                                if (!isEmpty(x - k, y + k))
                                    gameMap[x - k][y + k] = player1;
                                gameMap[x][y] = player1;
                                countPlayer++;
                            }
                        }
                    }
                }
            }
        }
        for (int i = 1; i < 8; i++) {
            if (x < 8 - i && y >= i) {
                if (!isEmpty(x + i, y - i)) {
                    if (gameMap[x + i][y - i] == player2) {
                        if (y < 8 + i && x < 8 - i && y >= i) i++;
                    }
                    if (gameMap[x + i][y - i] == player1) {
                        for (int k = i; k > 0; k--) {
                            if (!isEmpty(x + k, y - k))
                                gameMap[x + k][y - k] = player1;
                            gameMap[x][y] = player1;
                            countPlayer++;

                        }
                    }
                }
            }
        }
    }

    private boolean isAllowed(int x, int y) {
        if (x < 7 && y < 7&&x>0&&y>0) {
            if (gameMap[x][y] == ' ' &&
                    gameMap[x + 1][y] == ' ' &&
                    gameMap[x][y + 1] ==' ' &&
                    gameMap[x - 1][y] == ' ' &&
                    gameMap[x][y - 1] == ' ' &&
                    gameMap[x + 1][y + 1] == ' ' &&
                    gameMap[x - 1][y - 1] == ' ' &&
                    gameMap[x + 1][y - 1] == ' ' &&
                    gameMap[x - 1][y + 1] == ' ') return false;
        }
        if (isAllowedRowBlack(x, y) || isAllowedAngle(x, y) || isAllowedColumn(x, y)) return true;
        else return false;
    }

    public void displayScore() {
        int counter1=0;
        int counter2=0;
        for(int i =0;i<8;i++){
            for(int j=0;j<8;j++){
                if(gameMap[i][j]==player1)counter1++;
                if(gameMap[i][j]==player2)counter2++;
            }
        }
        System.out.println();
        System.out.println("               +++++++++++++++++++++++++++++++++++++");
        System.out.println("               | The score of the BLACK player | " + counter1+" |");
        System.out.println("               | The score of the WHITE player | " + counter2+" |");
        System.out.println("               +++++++++++++++++++++++++++++++++++++");
        System.out.println();


    }
}
