import java.util.Scanner;

public class Game {
    Player player1;
    Player player2;

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        System.out.println("Welcome to the battle game");
        System.out.println("Who is first? player1 or player2?");
        Scanner scan = new Scanner(System.in);
        String numberOfPlayer = scan.nextLine();
        if (numberOfPlayer.equals("1"))
            this.shot(player1);
        else
            this.shot(player2);
    }

    private void shot(Player player1) {
        Coordinat coordinat = new Coordinat();
        coordinat.input();
    }
}
