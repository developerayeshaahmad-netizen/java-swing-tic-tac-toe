import java.awt.Color;
import java.awt.Window;

import javax.swing.JButton;

public class GameController {

    private Board board;
    private GameWindow window;
    private Player player1;
    private Player player2;
    private Player currentPlayer;

    GameController(Board board , GameWindow window ,Player p1 , Player p2){
        this.window = window;
        this.board = board;
        this.player1 = p1;
        this.player2 = p2;
        this.currentPlayer = player1;

        attachListner();

        //....button grid...//



    }
    
    private void attachListner(){
        
        JButton[][] buttons = window.getButtons();
        for(int i =0; i<3; i++){
            for(int j=0 ; j<3 ; j++){

                int r= i;
                int c = j;

                buttons[i][j].addActionListener(e -> handleButtonClick(r,c , buttons[r][c]));

            }

        }

        window.getResetButton().addActionListener(e -> resetGame());

    }

    private void resetGame(){

        board.reSet();
       JButton[][] buttons = window.getButtons();
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            buttons[i][j].setText(" ");
        }
        }

    // ..... Resets game flow state back to the beginning....//
    currentPlayer = player1;
    window.updateStatusText(currentPlayer.getName() + "'s turn");
    }

    private void handleButtonClick(int row, int col, JButton clickedButton) {
        
        if (board.placeMove(row, col, currentPlayer.getSign())) {

            clickedButton.setText(currentPlayer.getSign());
            if (currentPlayer.getSign().equals("X")) {
                clickedButton.setForeground(new Color(230, 40 ,40));

                
            }
            else{
                clickedButton.setForeground(Color.BLACK);
            }
            
        

        if (board.checkWin(currentPlayer.getSign())) {

            window.updateStatusText(currentPlayer.getName() + " Wins!");
            
        }
        else if (board.isFull()) {

            window.updateStatusText("ITS A TIE!");

            
        }else{

            if (currentPlayer == player1) {
                currentPlayer = player2;
                
            }
            else{
                currentPlayer =player1;
            }

            window.updateStatusText(currentPlayer.getName() + "'s turn ");
        }
    }
    }

    }

