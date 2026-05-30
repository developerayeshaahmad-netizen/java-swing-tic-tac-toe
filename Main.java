import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        WelcomeWindow welcome = new WelcomeWindow();
        welcome.setVisible(true);



        // GameWindow window = new GameWindow();

        welcome.getStartButton().addActionListener(e -> {
            
            // Fetch the names from the text fields
            String name1 = welcome.getPlayer1Name();
            String name2 = welcome.getPlayer2Name();

            // ONLY close the welcome screen when the button is pressed!
            welcome.dispose();

            //  Create game and players
            Player p1 = new Player(name1, "X");
            Player p2 = new Player(name2, "O");
            Board board = new Board();

            //  Setup the actual game window layout
            GameWindow window = new GameWindow();
            window.updateStatusText(p1.getName() + "'s turn");

            //Connect the controller and display the board
            GameController controller = new GameController(board, window, p1, p2);
            window.setVisible(true);
        });
    }
}
