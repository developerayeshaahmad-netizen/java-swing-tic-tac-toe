import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class WelcomeWindow extends JFrame {

    private JTextField player1Field;
    private JTextField player2Field;
    private JButton startButton;

    public WelcomeWindow() {
        this.setTitle("Tic-Tac-Toe Welcome");
        this.setSize(350, 250);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setLayout(new BorderLayout());

        // 1. Welcome Header (North)
        JLabel welcomeLabel = new JLabel("Welcome to Tic-Tac-Toe!", JLabel.CENTER);
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 20));
        welcomeLabel.setBorder(new EmptyBorder(15, 10, 15, 10));
        welcomeLabel.setOpaque(true);
        welcomeLabel.setBackground(new Color(5 , 30 ,85));
        welcomeLabel.setForeground(Color.WHITE);
        this.add(welcomeLabel, BorderLayout.NORTH);

        // 2. Center Form Panel for Name Inputs
        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(2, 2, 10, 15));
        formPanel.setBorder(new EmptyBorder(10, 30, 10, 30));
        formPanel.setBackground(new Color(10, 50 , 130));

        JLabel label1 = new JLabel("Player X Name:");
        label1.setFont(new Font("Arial", Font.PLAIN, 14));
        label1.setForeground(Color.WHITE);
        player1Field = new JTextField("Player X");
        player1Field.setBackground(Color.BLACK);
        player1Field.setForeground(Color.WHITE);
        player1Field.setCaretColor(Color.WHITE);


        JLabel label2 = new JLabel("Player O Name:");
        label2.setFont(new Font("Arial", Font.PLAIN, 14));
        label2.setForeground(Color.WHITE);
        player2Field = new JTextField("Player O");
        player2Field.setBackground(Color.BLACK);
        player2Field.setForeground(Color.WHITE);
        player2Field.setCaretColor(Color.WHITE);


        formPanel.add(label1);
        formPanel.add(player1Field);
        formPanel.add(label2);
        formPanel.add(player2Field);
        
        this.add(formPanel, BorderLayout.CENTER);

        // 3. Start Button (South)
        startButton = new JButton("Start Game");
        startButton.setFont(new Font("Arial", Font.BOLD, 16));
        startButton.setFocusable(false);
        startButton.setBackground(Color.WHITE);
        
        // Wrap button in a panel to add spacing/padding at the bottom
        JPanel buttonPanel = new JPanel();
        buttonPanel.setBorder(new EmptyBorder(10, 10, 15, 10));
        buttonPanel.setBackground(new Color(5 , 30 , 85));
        buttonPanel.add(startButton);
        
        this.add(buttonPanel, BorderLayout.SOUTH);
    }

    // Getters to fetch the data later
    public String getPlayer1Name() {
        String name = player1Field.getText().trim();
        return name.isEmpty() ? "Player X" : name;
    }

    public String getPlayer2Name() {
        String name = player2Field.getText().trim();
        return name.isEmpty() ? "Player O" : name;
    }

    public JButton getStartButton() {
        return startButton;
    }
}
