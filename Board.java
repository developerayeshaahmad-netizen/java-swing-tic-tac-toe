public class Board {

    private String grid[][];

    public Board() {

        grid = new String[3][3];
        reSet();

    }

    // ........Place every index = 0......//
    public void reSet() {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                grid[i][j] = " ";
            }
        }
    }

    // ...........Place the sign of player.....//

    public boolean placeMove(int row, int col, String playerSign) {

        if (grid[row][col].equals(" ")) {

            grid[row][col] = playerSign;
            return true;

        }
        return false;
    }

    public boolean checkWin(String playerSign) {

        for (int i = 0; i < 3; i++) {

            if (grid[i][0].equals(playerSign) && grid[i][1].equals(playerSign) && grid[i][2].equals(playerSign)) {

                return true;

            }
            if (grid[0][i].equals(playerSign) && grid[1][i].equals(playerSign) && grid[2][i].equals(playerSign)) {

                return true;

            }

        }
        if (grid[0][0].equals(playerSign) && grid[1][1].equals(playerSign) && grid[2][2].equals(playerSign)) {

            return true;

        }
        if (grid[0][2].equals(playerSign) && grid[1][1].equals(playerSign) && grid[2][0].equals(playerSign)) {
            return true;
        }

        return false;

    }

    public boolean isFull(){

        for(int i=0 ; i<3 ; i++){

            for(int j=0 ;  j<3;  j++){

                if (grid[i][j].equals(" ")) {

                    return false;
                    
                }



            }
        }
        return true;
    }

}
