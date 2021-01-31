public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, brother!");

        IPrinter printer = new Printer();

        String[][] f1 = {
                {"O","O","O"},
                {"O","O","O"},
                {"O","O","O"},
        };

        String[][] f2 = {
                {"O","O","O"},
                {"O","9","O"},
                {"O","O","O"},
        };

        printer.print(f1);

        Player player1 = new Player("Urmat", new Field(f1));
        Player player2 = new Player("Rahat", new Field(f2));

        System.out.println(player1);
        System.out.println(player2);

        Game game = new Game(player1, player2);

        game.start();
    }
}
