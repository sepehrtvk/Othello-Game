public class PentagoGame {
    private String[][] map;
    private String nutColor;
    private String nutColor2;

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
    public static final String ANSI_RESET_BACKGROUND = "\u001B[0m";


    public PentagoGame() {
        map = new String[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                map[i][j] = "⚪";
            }
        }
    }

    public void setNutColor(String nutColor) {
        this.nutColor = nutColor;
        if (nutColor.equals("\u26ab")) nutColor2 = "\uD83D\uDD34";
        else nutColor2 = "\u26ab";

    }


    public void printMap() {

        System.out.println("             1                         2                  ");
        System.out.println("-----------------------------------------------------");
        for (int i = 0; i < 6; i++) {
            if (i == 0 || i == 3) System.out.println("|                                                    |");
            System.out.println("|                                                    |");
            System.out.println("|     " + map[i][0] + "     " + map[i][1] + "     " + map[i][2] + "     |     " + map[i][3] + "     " + map[i][4] + "     " + map[i][5] + "     |");
            System.out.println("|                                                    |");
            if (i == 2 || i == 5) System.out.println("|                                                    |");
            if (i == 2 || i == 5) {
                System.out.println("------------------------------------------------------");
                if (i == 5) System.out.println("             3                         4                  ");

            }
        }
        System.out.println();
    }

    public boolean isEmpty(int x, int y) {
        if (map[x][y].equals("⚪")) return true;
        else return false;
    }

    public void addNut(int boardNumber, int blockNumber) {
        switch (boardNumber) {
            case 1:
                switch (blockNumber) {
                    case 1:
                        map[0][0] = nutColor;
                        break;
                    case 2:
                        map[0][1] = nutColor;
                        break;
                    case 3:
                        map[0][2] = nutColor;
                        break;
                    case 4:
                        map[1][0] = nutColor;
                        break;
                    case 5:
                        map[1][1] = nutColor;
                        break;
                    case 6:
                        map[1][2] = nutColor;
                        break;
                    case 7:
                        map[2][0] = nutColor;
                        break;
                    case 8:
                        map[2][1] = nutColor;
                        break;
                    case 9:
                        map[2][2] = nutColor;
                        break;

                }
                break;
            case 2:
                switch (blockNumber) {
                    case 1:
                        map[0][3] = nutColor;
                        break;
                    case 2:
                        map[0][4] = nutColor;
                        break;
                    case 3:
                        map[0][5] = nutColor;
                        break;
                    case 4:
                        map[1][3] = nutColor;
                        break;
                    case 5:
                        map[1][4] = nutColor;
                        break;
                    case 6:
                        map[1][5] = nutColor;
                        break;
                    case 7:
                        map[2][3] = nutColor;
                        break;
                    case 8:
                        map[2][4] = nutColor;
                        break;
                    case 9:
                        map[2][5] = nutColor;
                        break;

                }
                break;
            case 3:
                switch (blockNumber) {
                    case 1:
                        map[3][0] = nutColor;
                        break;
                    case 2:
                        map[3][1] = nutColor;
                        break;
                    case 3:
                        map[3][2] = nutColor;
                        break;
                    case 4:
                        map[4][0] = nutColor;
                        break;
                    case 5:
                        map[4][1] = nutColor;
                        break;
                    case 6:
                        map[4][2] = nutColor;
                        break;
                    case 7:
                        map[5][0] = nutColor;
                        break;
                    case 8:
                        map[5][1] = nutColor;
                        break;
                    case 9:
                        map[5][2] = nutColor;
                        break;

                }
                break;
            case 4:
                switch (blockNumber) {
                    case 1:
                        map[3][3] = nutColor;
                        break;
                    case 2:
                        map[3][4] = nutColor;
                        break;
                    case 3:
                        map[3][5] = nutColor;
                        break;
                    case 4:
                        map[4][3] = nutColor;
                        break;
                    case 5:
                        map[4][4] = nutColor;
                        break;
                    case 6:
                        map[4][5] = nutColor;
                        break;
                    case 7:
                        map[5][3] = nutColor;
                        break;
                    case 8:
                        map[5][4] = nutColor;
                        break;
                    case 9:
                        map[5][5] = nutColor;
                        break;

                }
                break;
        }
    }

    public void rotateClockWise(int boardNumber) {
        String[][] mapTemp = new String[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                mapTemp[i][j] = map[i][j];
            }
        }
        switch (boardNumber) {
            case 1:
                map[0][0] = mapTemp[2][0];
                map[0][1] = mapTemp[1][0];
                map[0][2] = mapTemp[0][0];
                map[1][0] = mapTemp[2][1];
                map[1][2] = mapTemp[0][1];
                map[2][0] = mapTemp[2][0];
                map[2][1] = mapTemp[1][2];
                map[2][2] = mapTemp[0][2];
                break;
            case 2:
                map[0][3] = mapTemp[2][3];
                map[0][4] = mapTemp[1][3];
                map[0][5] = mapTemp[0][3];
                map[1][3] = mapTemp[2][4];
                map[1][5] = mapTemp[0][4];
                map[2][3] = mapTemp[2][5];
                map[2][4] = mapTemp[1][5];
                map[2][5] = mapTemp[0][5];
                break;
            case 3:
                map[3][0] = mapTemp[5][0];
                map[3][1] = mapTemp[4][0];
                map[3][2] = mapTemp[3][0];
                map[4][0] = mapTemp[5][1];
                map[4][2] = mapTemp[3][1];
                map[5][0] = mapTemp[5][2];
                map[5][1] = mapTemp[4][2];
                map[5][2] = mapTemp[3][2];
                break;
            case 4:
                map[3][3] = mapTemp[5][3];
                map[3][4] = mapTemp[4][3];
                map[3][5] = mapTemp[3][3];
                map[4][3] = mapTemp[5][4];
                map[4][5] = mapTemp[3][4];
                map[5][3] = mapTemp[5][5];
                map[5][4] = mapTemp[4][5];
                map[5][5] = mapTemp[3][5];
                break;
        }
    }

    public void rotateAntiClockWise(int boardNumber) {
        String[][] mapTemp = new String[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                mapTemp[i][j] = map[i][j];
            }
        }
        switch (boardNumber) {
            case 1:
                map[0][0] = mapTemp[0][2];
                map[0][1] = mapTemp[1][2];
                map[0][2] = mapTemp[2][2];
                map[1][0] = mapTemp[0][1];
                map[1][2] = mapTemp[2][1];
                map[2][0] = mapTemp[0][0];
                map[2][1] = mapTemp[1][0];
                map[2][2] = mapTemp[2][0];
                break;
            case 2:
                map[0][3] = mapTemp[0][5];
                map[0][4] = mapTemp[1][5];
                map[0][5] = mapTemp[2][5];
                map[1][3] = mapTemp[0][4];
                map[1][5] = mapTemp[2][4];
                map[2][3] = mapTemp[0][3];
                map[2][4] = mapTemp[1][3];
                map[2][5] = mapTemp[2][3];
                break;
            case 3:
                map[3][0] = mapTemp[3][2];
                map[3][1] = mapTemp[4][2];
                map[3][2] = mapTemp[5][2];
                map[4][0] = mapTemp[3][1];
                map[4][2] = mapTemp[5][1];
                map[5][0] = mapTemp[3][0];
                map[5][1] = mapTemp[4][0];
                map[5][2] = mapTemp[5][0];
                break;
            case 4:
                map[3][3] = mapTemp[3][5];
                map[3][4] = mapTemp[4][5];
                map[3][5] = mapTemp[5][5];
                map[4][3] = mapTemp[3][4];
                map[4][5] = mapTemp[5][4];
                map[5][3] = mapTemp[3][3];
                map[5][4] = mapTemp[4][3];
                map[5][5] = mapTemp[5][3];
                break;
        }

    }

    public boolean checkInRow(int x, int y) {
        int number1 = 0;
        int number2 = 0;
        for (int i = 1; i < 5 - y; i++) {
            if (!isEmpty(x, y + i)) {
                if (map[x][y].equals(nutColor)) {
                    if (map[x][y + i + 1].equals(nutColor)) number1++;
                }
            } else break;
        }
        for (int i = 1; i < y; i++) {
            if (!isEmpty(x, y - i)) {
                if (map[x][y - i].equals(nutColor)) {
                    if (map[x][y - i - 1].equals(nutColor)) number2++;
                }
            } else break;
        }
        if (number1 == 4 || number2 == 4) return true;
        else return false;
    }

    public boolean isAllowedMoveColumn(int x, int y) {
        int number1 = 0;
        int number2 = 0;
        for (int i = 1; i < 5 - x; i++) {
            if (!isEmpty(x + i, y)) {
                if (map[x + i][y].equals(nutColor)) {
                    if (map[x + i + 1][y].equals(nutColor)) number1++;
                }
            } else break;
        }
        for (int i = 1; i < x; i++) {
            if (!isEmpty(x - i, y)) {
                if (map[x - i][y].equals(nutColor)) {
                    if (map[x - i - 1][y].equals(nutColor)) number2++;
                }
            } else break;
        }
        if (number1 == 4 || number2 == 4) return true;
        else return false;
    }

    public boolean isAllowedMoveAngle(int x, int y) {
        int number1 = 0;
        int number2 = 0;
        int number3 = 0;
        int number4 = 0;
        for (int i = 1; i < x - 1 && i < y; i++) {
            if (!isEmpty(x - i, y - i)) {
                if (map[x][y].equals(nutColor)) {
                    if (map[x - i - 1][y - i - 1].equals(nutColor)) number1++;
                }
            } else break;
        }
        for (int i = 1; i < 5 - x && i < 5 - y; i++) {
            if (!isEmpty(x + i, y + i)) {
                if (map[x][y].equals(nutColor)) {
                    if (map[x + i + 1][y + i + 1].equals(nutColor)) number2++;
                }
            } else break;
        }
        for (int i = 1; i < 5 - y && i < x; i++) {
            if (!isEmpty(x - i, y + i)) {
                if (map[x][y].equals(nutColor)) {
                    if (map[x - i - 1][y + i + 1].equals(nutColor)) number3++;
                }
            } else break;
        }
        for (int i = 1; i < 5 - x && i < y; i++) {
            if (!isEmpty(x + i, y - i)) {
                if (map[x][y].equals(nutColor)) {
                    if (map[x + i + 1][y - i - 1].equals(nutColor)) number4++;

                }
            } else break;
        }
        if (number1 == 4 || number2 == 4 || number3 == 4 || number4 == 4) return true;
        else return false;

    }


}
