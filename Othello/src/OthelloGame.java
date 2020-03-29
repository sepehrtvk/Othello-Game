import java.lang.reflect.Array;

public class OthelloGame {
    private char gameMap[][] = new char[8][8];
    private char player;

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

    public char getPlayer() {
        return player;
    }

    public void setPlayer(char player) {
        this.player = player;
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

        switch (x) {
            case 'A':
                if (isEmpty(y - 1, 0) && isAllowedRowBlack(y - 1, 0) || isAllowedColumn(y - 1, 0) || isAllowedAngle(y - 1, 0))
                    gameMap[y - 1][0] = player;
                break;
            case 'B':
                if (isEmpty(y - 1, 1) && isAllowedRowBlack(y - 1, 1) || isAllowedColumn(y - 1, 1) || isAllowedAngle(y - 1, 1))
                    gameMap[y - 1][1] = player;
                break;
            case 'C':
                if (isEmpty(y - 1, 2) && isAllowedRowBlack(y - 1, 2) || isAllowedColumn(y - 1, 2) || isAllowedAngle(y - 1, 2))
                    gameMap[y - 1][2] = player;
                break;
            case 'D':
                if (isEmpty(y - 1, 3) && isAllowedRowBlack(y - 1, 3) || isAllowedColumn(y - 1, 3) || isAllowedAngle(y - 1, 3))
                    gameMap[y - 1][3] = player;
                break;
            case 'E':
                if (isEmpty(y - 1, 4) && isAllowedRowBlack(y - 1, 4) || isAllowedColumn(y - 1, 4) || isAllowedAngle(y - 1, 4))
                    gameMap[y - 1][4] = player;
                break;
            case 'F':
                if (isEmpty(y - 1, 5) && isAllowedRowBlack(y - 1, 5) || isAllowedColumn(y - 1, 5) || isAllowedAngle(y - 1, 5))
                    gameMap[y - 1][5] = player;
                break;
            case 'G':
                if (isEmpty(y - 1, 6) && isAllowedRowBlack(y - 1, 6) || isAllowedColumn(y - 1, 6) || isAllowedAngle(y - 1, 6))
                    gameMap[y - 1][6] = player;
                break;
            case 'H':
                if (isEmpty(y - 1, 7) && isAllowedRowBlack(y - 1, 7) || isAllowedColumn(y - 1, 7) || isAllowedAngle(y - 1, 7))
                    gameMap[y - 1][7] = player;
                break;
        }
    }

    private boolean isEmpty(int x, int y) {
        if (gameMap[x][y] == ' ') return true;
        else return false;
    }

    private boolean isAllowedRowBlack(int x, int y) {
        if (y != 7 && y != 0 && x != -1 && x != 8) {
            if (gameMap[x][y + 1] == player || gameMap[x][y - 1] == player) return false;
        }
        char icon;
        if (player == '◯') icon = '●';
        else icon = '◯';
        for (int i = 1; i < 8 - y; i++) {
            if (gameMap[x][y + i] == icon && gameMap[x][y + i + 1] == player) {
                for (int k = i; k > 0; k--) {
                    gameMap[x][y + k] = player;
                }
                if (x < 7 && y < 7) {
                    if (gameMap[x + 1][y + 1] == icon && gameMap[x + 2][y + 2] == player)
                        gameMap[x + 1][y + 1] = player;
                }
                if (y > 1 && x > 1) {
                    if (gameMap[x - 1][y - 1] == icon && gameMap[x - 2][y - 2] == player)
                        gameMap[x - 1][y - 1] = player;
                }
                if (y > 1 && x < 7) {
                    if (gameMap[x + 1][y - 1] == icon && gameMap[x + 2][y - 2] == player)
                        gameMap[x + 1][y - 1] = player;
                }
                if (x > 1 && y < 7) {
                    if (gameMap[x - 1][y + 1] == icon && gameMap[x - 2][y + 2] == player)
                        gameMap[x - 1][y + 1] = player;
                }
                return true;
            }
        }
        for (int i = 1; i < y; i++) {
            if (gameMap[x][y - i] == icon && gameMap[x][y - i - 1] == player) {
                for (int k = i; k > 0; k--) {
                    gameMap[x][y - k] = player;
                }
                if (x < 7 && y < 7) {
                    if (gameMap[x + 1][y + 1] == icon && gameMap[x + 2][y + 2] == player)
                        gameMap[x + 1][y + 1] = player;
                }
                if (x > 1) {
                    if (gameMap[x - 1][y - 1] == icon && gameMap[x - 2][y - 2] == player)
                        gameMap[x - 1][y - 1] = player;
                }
                if (x < 7) {
                    if (gameMap[x + 1][y - 1] == icon && gameMap[x + 2][y - 2] == player)
                        gameMap[x + 1][y - 1] = player;
                }
                if (y < 7) {
                    if (gameMap[x - 1][y + 1] == icon && gameMap[x - 2][y + 2] == player)
                        gameMap[x - 1][y + 1] = player;
                }
                return true;
            }

        }
        return false;
    }

    private boolean isAllowedColumn(int x, int y) {
        if (x != 7 && x != 0 && y != 8 && y != -1) {
            if (gameMap[x + 1][y] == player || gameMap[x - 1][y] == player) return false;
        }
        char icon;
        if (player == '◯') icon = '●';
        else icon = '◯';
        for (int i = 1; i < 8 - x; i++) {
            if (gameMap[x + i][y] == icon && gameMap[x + i + 1][y] == player) {
                for (int k = i; k > 0; k--) {
                    gameMap[x + k][y] = player;
                }
                if (x < 7 && y < 7) {
                    if (gameMap[x + 1][y + 1] == icon && gameMap[x + 2][y + 2] == player)
                        gameMap[x + 1][y + 1] = player;
                }
                if (y > 1 && x > 1) {
                    if (gameMap[x - 1][y - 1] == icon && gameMap[x - 2][y - 2] == player)
                        gameMap[x - 1][y - 1] = player;
                }
                if (y > 1 && x < 7) {
                    if (gameMap[x + 1][y - 1] == icon && gameMap[x + 2][y - 2] == player)
                        gameMap[x + 1][y - 1] = player;
                }
                if (x > 1 && y < 7) {
                    if (gameMap[x - 1][y + 1] == icon && gameMap[x - 2][y + 2] == player)
                        gameMap[x - 1][y + 1] = player;
                }
                return true;
            }
        }
        for (int i = 1; i < x; i++) {
            if (gameMap[x - i][y] == icon && gameMap[x - i - 1][y] == player) {
                for (int k = i; k > 0; k--) {
                    gameMap[x - k][y] = player;
                }
                if (x < 7 && y < 7) {
                    if (gameMap[x + 1][y + 1] == icon && gameMap[x + 2][y + 2] == player)
                        gameMap[x + 1][y + 1] = player;
                }
                if (y > 1) {
                    if (gameMap[x - 1][y - 1] == icon && gameMap[x - 2][y - 2] == player)
                        gameMap[x - 1][y - 1] = player;
                }
                if (y > 1) {
                    if (gameMap[x + 1][y - 1] == icon && gameMap[x + 2][y - 2] == player)
                        gameMap[x + 1][y - 1] = player;
                }
                if (gameMap[x - 1][y + 1] == icon && gameMap[x - 2][y + 2] == player)
                    gameMap[x - 1][y + 1] = player;

                return true;
            }

        }

        return false;
    }

//    private boolean isAllowedAngle(int x, int y) {
//        if (x != 7 && x != 0 && y != 0 && y != 7) {
//            if (gameMap[x + 1][y + 1] == player || gameMap[x - 1][y - 1] == player) return false;
//        }
//        char icon;
//        if (player == '◯') icon = '●';
//        else icon = '◯';
//        for (int i = 1; i < 8 - x && i < 8 - y; i++) {
//            if (x < 6 && y < 6) {
//                if (gameMap[x + i][y + i] == icon && gameMap[x + i + 1][y + i + 1] == player) {
//                    for (int k = i; k > 0; k--) {
//                        gameMap[x - k][y +k] = player;
//                    }
//                    return true;
//                }
//            } else {
//                if (gameMap[x - i][y - i] == icon && gameMap[x - i - 1][y - i - 1] == player) {
//                    for (int k = 1; k < 8 - x && k < 8 - y; k++) {
//                        gameMap[x - k][y - k] = player;
//                    }
//                    return true;
//                }
//            }
//        }
//        for (int i = 1; i < x && i < y; i++) {
//            if (gameMap[x - i][y - i] == icon && gameMap[x - i - 1][y - i - 1] == player) {
//                for (int k = i; k > 0; k--) {
//                    gameMap[x - k][y - k] = player;
//                }
//                return true;
//            }
//
//        }
//        for (int i = 1; i < x && i < y; i++) {
//            if (gameMap[x + i][y - i] == icon && gameMap[x + i + 1][y - i - 1] == player) {
//                for (int k = i; k > 0; k--) {
//                    gameMap[x + k][y - k] = player;
//                }
//                return true;
//            }
//
//        }
//        for (int i = 1; i < x && i < y; i++) {
//            if (gameMap[x - i][y + i] == icon && gameMap[x - i - 1][y + i + 1] == player) {
//                for (int k = i; k > 0; k--) {
//                    gameMap[x - k][y + k] = player;
//                }
//                return true;
//            }
//
//        }
//        return false;
//    }
}
