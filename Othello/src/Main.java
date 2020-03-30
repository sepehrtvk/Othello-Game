import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OthelloGame game = new OthelloGame();
        game.printMap();
while (true) {
    System.out.println("Black player , choose your cell :");
    System.out.println();
    System.out.print("Column (from A-H) : ");
    String column = scanner.next();
    System.out.print("Row (from 1-8) : ");
    int row = scanner.nextInt();
    game.setplayer1('◯');
    game.moveBlack(column.charAt(0), row);
    game.printMap();
    game.displayScore();

    System.out.println("White player , choose your cell :");
    System.out.println();
    System.out.print("Column (from A-H) : ");
    String column2 = scanner.next();
    System.out.print("Row (from 1-8) : ");
    int row2 = scanner.nextInt();
    game.setplayer1('●');
    game.moveBlack(column2.charAt(0), row2);
    game.printMap();
    game.displayScore();
}
    }
}
