import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GameWindow extends JFrame{

    private JLabel lable = new JLabel("Player X's turn",JLabel.CENTER);
    private JButton[][] button; 
    private JButton reseButton = new JButton("Reset");
      


    GameWindow(){

        this.setTitle("TIC-TAC-TOE");
        this.setSize(400 , 500);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3,3));
        panel.setBackground(new Color(10, 50, 130));
        panel.setBorder(new javax.swing.border.EmptyBorder(40, 40, 40, 40));

        //....Lable setting.....//

        lable.setFont(new Font("Arial" , Font.BOLD , 18));
        lable.setOpaque(true);
        lable.setBackground(new Color(5 , 30, 85));
        lable.setForeground(Color.WHITE);
       this.add(lable , BorderLayout.NORTH);

       //.........Grid Button.....//

       button = new JButton[3][3];
       for(int i=0 ; i<3 ; i++){
        for(int j=0 ; j<3 ; j++){

            button[i][j]= new JButton(" ");
            button[i][j].setFocusable(false);
           

            button[i][j].setFont(new Font("Arial" , Font.BOLD , 40));
            button[i][j].setBackground(new Color(173 , 216 , 230));


             panel.add(button[i][j]);

        }
       }
       
       this.add(panel, BorderLayout.CENTER);

       //.....Reset button.......//

       reseButton.setFocusable(false);
       reseButton.setFont(new Font("Arial", Font.BOLD, 18));
        reseButton.setBackground(new Color(140, 20, 30)); 
        reseButton.setForeground(Color.WHITE);
       this.add(reseButton , BorderLayout.SOUTH);
    }

    public JButton[][] getButtons(){

        return button;

    }

    public JButton getResetButton(){

        return reseButton;
    }

    public void updateStatusText(String Text){

        lable.setText(Text);
    }
    
}
