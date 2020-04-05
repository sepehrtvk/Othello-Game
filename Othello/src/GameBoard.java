public class GameBoard extends OthelloGame {

    public void move(char x, int y) {

        switch (x) {

            case 'A':
                if (isBlockEmpty(y - 1, 0) && isAllowedMove(y - 1, 0)) {
                    moveInRow(y - 1, 0);
                    moveInColumn(y - 1, 0);
                    moveInAngle(y - 1, 0);
                } else System.out.println("      !  PASS  ! ");

                break;
            case 'B':
                if (isBlockEmpty(y - 1, 1) && isAllowedMove(y - 1, 1)) {
                    moveInRow(y - 1, 1);
                    moveInColumn(y - 1, 1);
                    moveInAngle(y - 1, 1);
                } else System.out.println("      !  PASS  ! ");


                break;
            case 'C':
                if (isBlockEmpty(y - 1, 2) && isAllowedMove(y - 1, 2)) {
                    moveInRow(y - 1, 2);
                    moveInColumn(y - 1, 2);
                    moveInAngle(y - 1, 2);
                } else System.out.println("      !  PASS  ! ");

                break;
            case 'D':
                if (isBlockEmpty(y - 1, 3) && isAllowedMove(y - 1, 3)) {
                    moveInRow(y - 1, 3);
                    moveInColumn(y - 1, 3);
                    moveInAngle(y - 1, 3);
                } else System.out.println("      !  PASS  ! ");


                break;
            case 'E':
                if (isBlockEmpty(y - 1, 4) && isAllowedMove(y - 1, 4)) {
                    moveInRow(y - 1, 4);
                    moveInColumn(y - 1, 4);
                    moveInAngle(y - 1, 4);
                } else System.out.println("      !  PASS  ! ");


                break;
            case 'F':
                if (isBlockEmpty(y - 1, 5) && isAllowedMove(y - 1, 5)) {
                    moveInRow(y - 1, 5);
                    moveInColumn(y - 1, 5);
                    moveInAngle(y - 1, 5);
                } else System.out.println("      !  PASS  ! ");

                break;
            case 'G':
                if (isBlockEmpty(y - 1, 6) && isAllowedMove(y - 1, 6)) {
                    moveInRow(y - 1, 6);
                    moveInColumn(y - 1, 6);
                    moveInAngle(y - 1, 6);
                } else System.out.println("      !  PASS  ! ");


                break;
            case 'H':
                if (isBlockEmpty(y - 1, 7) && isAllowedMove(y - 1, 7)) {
                    moveInRow(y - 1, 7);
                    moveInColumn(y - 1, 7);
                    moveInAngle(y - 1, 7);
                } else System.out.println("!  PASS  ! ");
                break;
        }
    }

    public boolean isBlockEmpty(int x, int y) {
        if (gameMap[x][y] == ' ') return true;
        else return false;
    }

    public boolean isAllowedMoveRow(int x, int y) {
        for (int i = 1; i < 7 - y; i++) {
            if (!isBlockEmpty(x, y + i)) {
                if (gameMap[x][y + i] == player2) {
                    if (gameMap[x][y + i + 1] == player1) return true;
                }
            } else break;
        }
        for (int i = 1; i < y - 1; i++) {
            if (!isBlockEmpty(x, y - i)) {
                if (gameMap[x][y - i] == player2) {
                    if (gameMap[x][y - i - 1] == player1) return true;
                }
            } else break;
        }
        return false;
    }

    public boolean isAllowedMoveColumn(int x, int y) {
        for (int i = 1; i < 7 - x; i++) {
            if (!isBlockEmpty(x + i, y)) {
                if (gameMap[x + i][y] == player2) {
                    if (gameMap[x + i + 1][y] == player1) return true;
                }
            } else break;
        }
        for (int i = 1; i < x - 1; i++) {
            if (!isBlockEmpty(x - i, y)) {
                if (gameMap[x - i][y] == player2) {
                    if (gameMap[x - i - 1][y] == player1) return true;
                }
            } else break;
        }
        return false;
    }

    public boolean isAllowedMoveAngle(int x, int y) {
        for (int i = 1; i < x - 1 && i < y - 1; i++) {
            if (!isBlockEmpty(x - i, y - i)) {
                if (gameMap[x - i][y - i] == player2) {
                    if (gameMap[x - i - 1][y - i - 1] == player1) return true;
                }
            } else break;
        }
        for (int i = 1; i < 7 - x && i < 7 - y; i++) {
            if (!isBlockEmpty(x + i, y + i)) {
                if (gameMap[x + i][y + i] == player2) {
                    if (gameMap[x + i + 1][y + i + 1] == player1) return true;
                }
            } else break;
        }
        for (int i = 1; i < 7 - y && i < x - 1; i++) {
            if (!isBlockEmpty(x - i, y + i)) {
                if (gameMap[x - i][y + i] == player2) {
                    if (gameMap[x - i - 1][y + i + 1] == player1) return true;
                }
            } else break;
        }
        for (int i = 1; i < 7 - x && i < y - 1; i++) {
            if (!isBlockEmpty(x + i, y - i)) {
                if (gameMap[x + i][y - i] == player2) {
                    if (gameMap[x + i + 1][y - i - 1] == player1) return true;

                }
            } else break;
        }
        return false;
    }

    public void moveInRow(int x, int y) {
        for (int i = 1; i < 7 - y; i++) {
            if (!isBlockEmpty(x, y + i) && !isBlockEmpty(x, y + i + 1)) {
                if (gameMap[x][y + i] == player2 && gameMap[x][y + i + 1] == player1) {
                    for (int k = i; k > 0; k--) {
                        if (!isBlockEmpty(x, y + k)) {
                            gameMap[x][y + k] = player1;
                            gameMap[x][y] = player1;
                        }
                    }
                }
            }
        }
        for (int i = 1; i < y - 1; i++) {
            if (!isBlockEmpty(x, y - i) && !isBlockEmpty(x, y - i - 1)) {
                if (gameMap[x][y - i] == player2 && gameMap[x][y - i - 1] == player1) {
                    for (int k = i; k > 0; k--) {
                        if (!isBlockEmpty(x, y - k)) {
                            gameMap[x][y - k] = player1;
                            gameMap[x][y] = player1;
                        }
                    }
                }
            }
        }
    }

    public void moveInColumn(int x, int y) {
        for (int i = 1; i < 7 - x; i++) {
            if (!isBlockEmpty(x + i, y) && !isBlockEmpty(x + i + 1, y)) {
                if (gameMap[x + i][y] == player2 && gameMap[x + i + 1][y] == player1) {
                    for (int k = i; k > 0; k--) {
                        if (!isBlockEmpty(x + k, y))
                            gameMap[x + k][y] = player1;
                        gameMap[x][y] = player1;
                    }
                }
            } else break;
        }
        for (int i = 1; i < x - 1; i++) {
            if (!isBlockEmpty(x - i, y) && !isBlockEmpty(x - i - 1, y)) {
                if (gameMap[x - i][y] == player2 && gameMap[x - i - 1][y] == player1) {
                    for (int k = i; k > 0; k--) {
                        if (!isBlockEmpty(x - k, y))
                            gameMap[x - k][y] = player1;
                        gameMap[x][y] = player1;
                    }
                }
            } else break;
        }
    }

    public void moveInAngle(int x, int y) {
        for (int i = 1; i < x - 1 && i < y - 1; i++) {
            if (!isBlockEmpty(x - i, y - i) && !isBlockEmpty(x - 1 - i, y - i - 1)) {
                if (gameMap[x - i][y - i] == player2 && gameMap[x - i - 1][y - i - 1] == player1) {
                    for (int k = i; k > 0; k--) {
                        if (!isBlockEmpty(x - k, y - k))
                            gameMap[x - k][y - k] = player1;
                        gameMap[x][y] = player1;
                    }
                }
            } else break;
        }
        for (int i = 1; i < 7 - x && i < 7 - y; i++) {
            if (!isBlockEmpty(x + i, y + i) && !isBlockEmpty(x + 1 + i, y + i + 1)) {
                if (gameMap[x + i][y + i] == player2 && gameMap[x + i + 1][y + i + 1] == player1) {
                    for (int k = i; k > 0; k--) {
                        if (!isBlockEmpty(x + k, y + k))
                            gameMap[x + k][y + k] = player1;
                        gameMap[x][y] = player1;
                    }
                }
            } else break;
        }
        for (int i = 1; i < 7 - y && i < x - 1; i++) {
            if (!isBlockEmpty(x - i, y + i) && !isBlockEmpty(x - 1 - i, y + i + 1)) {
                if (gameMap[x - i][y + i] == player2 && gameMap[x - i - 1][y + i + 1] == player1) {
                    for (int k = i; k > 0; k--) {
                        if (!isBlockEmpty(x - k, y + k))
                            gameMap[x - k][y + k] = player1;
                        gameMap[x][y] = player1;
                    }
                }
            } else break;
        }
        for (int i = 1; i < 7 - x && i < y - 1; i++) {
            if (!isBlockEmpty(x + i, y - i) && !isBlockEmpty(x + 1 + i, y - i - 1)) {
                if (gameMap[x + i][y - i] == player2 && gameMap[x + i + 1][y - i - 1] == player1) {
                    for (int k = i; k > 0; k--) {
                        if (!isBlockEmpty(x + k, y - k))
                            gameMap[x + k][y - k] = player1;
                        gameMap[x][y] = player1;
                    }
                }
            } else break;
        }
    }

    public boolean isAllowedMove(int x, int y) {
        if (isAllowedMoveRow(x, y) || isAllowedMoveAngle(x, y) || isAllowedMoveColumn(x, y)) return true;
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
        if (gameOver()) return false;
        return false;
    }

}
