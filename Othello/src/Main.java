import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OthelloGame game = new OthelloGame();
        game.printMap();
        System.out.println("Choose game type : ");
        System.out.println("1) Single Player ");
        System.out.println("2) Multiplayer ");
        switch (scanner.nextInt()) {
            case 1:
                while (game.gameOver()) {
                    System.out.println("Black player , choose your cell :");
                    System.out.println();
                    System.out.print("Column (from A-H) : ");
                    String column = scanner.next();
                    System.out.print("Row (from 1-8) : ");
                    int row = scanner.nextInt();
                    game.setplayer1('●');
                    game.move(column.charAt(0), row);
                    game.printMap();
                    game.displayScore();

                    System.out.println("White player , choose your cell :");
                    System.out.println();
                    System.out.print("Column (from A-H) : ");
                    String column2 = scanner.next();
                    System.out.print("Row (from 1-8) : ");
                    int row2 = scanner.nextInt();
                    game.setplayer1('◯');
                    game.move(column2.charAt(0), row2);
                    game.printMap();
                    game.displayScore();
                }
                game.endGame();
                break;
            case 2:
                while (game.gameOver()) {
                    System.out.println("Black player , choose your cell :");
                    System.out.println();
                    System.out.print("Column (from A-H) : ");
                    String column = scanner.next();
                    System.out.print("Row (from 1-8) : ");
                    int row = scanner.nextInt();
                    game.setplayer1('●');
                    game.move(column.charAt(0), row);
                    char multiChar;
                    int multiRow;

                    String chars = "ABCDEFGH";

                    game.setplayer1('◯');
                    while (true) {
                        Random random = new Random();
                        int column3=0;
                        char column2 = chars.charAt(random.nextInt(chars.length()));
                        int row2 = random.nextInt(8);
                        if (column2 == 'A') column3=0;
                        if (column2=='B')column3=1;
                        if (column2=='C')column3=2;
                        if (column2=='D')column3=3;
                        if (column2=='E')column3=4;
                        if (column2=='F')column3=5;
                        if (column2=='G')column3=6;
                        if (column2=='H')column3=7;

                        if (game.isAllowed( row2, column3 )&&game.isEmpty(row2,column3)){
                            System.out.println(column2+" "+(row2+1));
                            game.move(column2, row2+1);
                            break;
                        }
                    }
                    game.printMap();
                    game.displayScore();
                }
                game.endGame();
                break;
        }
        }
    }
