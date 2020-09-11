import java.sql.SQLOutput;

public class Gameboard {


    private static Cell[][] gameboardCell= new Cell[20][20];
    private static Cell[][] gameboardCell2= new Cell[20][20];

    // set cells for figure alive
    public void setAlive(int x, int y){
        gameboardCell[x][y].setAlive(true);
    }

    // create Gameboard
    public void createGameboard() {
        for (int row = 0; row < gameboardCell.length; row++) {
            for (int column = 0; column < gameboardCell[row].length; column++) {

            gameboardCell[row][column]=new Cell();
            gameboardCell2[row][column]=new Cell();
            }
        }
    }

    // first Gameboard output
    public void printGameboard(){
        for (int row = 0; row < gameboardCell.length; row++) {

            System.out.println("");

            for (int column = 0; column < gameboardCell[row].length; column++) {


                if (gameboardCell[row][column].isAlive() == true) {
                    System.out.print(" @ ");
                } else {
                    if(gameboardCell[row][column].isAlive() == false){
                        System.out.print(" . ");
                    }
                }
            }
        }
        System.out.println("");
    }


    // check neighbours and the rules
    public void checkgameboard() throws InterruptedException {
        for (int row = 0; row <= gameboardCell.length - 1; row++) {

            for (int column = 0; column <= gameboardCell[row].length - 1; column++) {
                int alive = 0;


                //check right wall and check neighbour
                try {
                    if (gameboardCell[row][column + 1].isAlive() == true) {
                        alive++;
                    }
                } catch (Exception e) {
                    if (gameboardCell[row][0].isAlive() == true) {
                        alive++;
                    }
                }

                // check left wall and check neighbour
                try {
                    if (gameboardCell[row][column - 1].isAlive()) {
                        alive++;
                    }
                } catch (Exception e) {
                    if (gameboardCell[row][gameboardCell.length - 1].isAlive()) {
                        alive++;
                    }
                }

                //check below wall an neighbour
                try {
                    if (gameboardCell[row + 1][column].isAlive()) {
                        alive++;
                    }
                } catch (Exception e) {
                    if (gameboardCell[0][column].isAlive()) {
                        alive++;
                    }
                }

                //check top wall and neighbour
                try {
                    if (gameboardCell[row - 1][column].isAlive()) {
                        alive++;
                    }
                } catch (Exception e) {
                    if (gameboardCell[gameboardCell.length - 1][column].isAlive()) {
                        alive++;
                    }
                }

                //check neighbour right on top
                try {
                    if (gameboardCell[row - 1][column + 1].isAlive()) {
                        alive++;
                    }
                } catch (Exception e) {
                    //check right wall
                    if (row == 0 && column >= 0 && column <= gameboardCell[0].length - 1) {
                        try {
                            if (gameboardCell[gameboardCell.length - 1][column + 1].isAlive()) {
                                alive++;
                            }
                        } catch (Exception e1) {
                        }
                    }
                    //check the right edge top
                    if (row == 0 && column == gameboardCell[0].length - 1) {
                        if(gameboardCell[gameboardCell.length-1][0].isAlive()){
                            alive++;
                        }
                    }
                }

                //check top wall
                if (column == gameboardCell[0].length - 1 && row > 0 && row <= gameboardCell.length - 1) {
                    try {
                        if (gameboardCell[row - 1][0].isAlive()) {
                            alive++;
                        }
                    }catch (Exception e){
                    }
                }

                //check neighbour left and below
                try {
                    if (gameboardCell[row - 1][column - 1].isAlive()) {
                        alive++;
                    }
                } catch (Exception e) {
                    //check top wall
                    if (row == 0 && column >= 0 && column <= gameboardCell[0].length - 1) {
                        try {
                            if (gameboardCell[gameboardCell.length - 1][column - 1].isAlive()) {
                                alive++;
                            }
                        }catch(Exception e1){
                        }
                    }
                    //check left wall
                    if (column == 0 && row >= 0 && row <= gameboardCell.length - 1) {
                       try {
                           if (gameboardCell[row - 1][gameboardCell.length - 1].isAlive()) {
                               alive++;
                           }
                       }catch(Exception e1){
                       }
                    }
                    //check the left edge top
                    if (row == 0 && column == 0) {
                        if(gameboardCell[gameboardCell.length-1][gameboardCell.length-1].isAlive()){
                            alive++;
                        }
                    }
                }


                //check neighbour left and top
                try {
                    if (gameboardCell[row + 1][column - 1].isAlive()) {
                        alive++;
                    }
                } catch (Exception e) {
                    // check right wall
                    if (row == gameboardCell.length - 1 && column > 0 && column <= gameboardCell[0].length - 1) {
                        if (gameboardCell[0][column - 1].isAlive()) {
                            alive++;
                        }
                    }
                    //check below wall
                    if (column == 0 && row >= 0 && row <= gameboardCell.length - 1) {
                        try {
                            if (gameboardCell[row + 1][gameboardCell.length - 1].isAlive()) {
                                alive++;
                            }
                        }catch(Exception e1){
                        }
                    }
                    //check the left edge below
                    if (row == gameboardCell.length - 1 && column == 0) {
                        if(gameboardCell[0][gameboardCell.length-1].isAlive()){
                            alive++;
                        }
                    }
                }


                //check neighbour right and below
                try {
                    if (gameboardCell[row + 1][column + 1].isAlive()) {
                        alive++;
                    }
                } catch (Exception e) {
                    //check below wall
                    if (row == gameboardCell.length - 1 && column >= 0 && column <= gameboardCell[0].length - 1) {
                        try {
                            if (gameboardCell[0][column + 1].isAlive()) {
                                alive++;
                            }
                        }catch(Exception e1){
                        }
                    }
                    //check right wall
                    if (column == gameboardCell[0].length - 1 && row >= 0 && row <= gameboardCell.length - 1) {
                        try {
                            if (gameboardCell[row + 1][0].isAlive()) {
                                alive++;
                            }
                        }catch(Exception e1){
                        }
                    }
                    //check the edge right below
                    if (row == gameboardCell.length - 1 && column == gameboardCell.length - 1) {
                        if(gameboardCell[0][0].isAlive()){
                            alive++;
                        }
                    }
                }


                //Check the rules
                if (gameboardCell[row][column].isAlive() && alive == 3) {
                    gameboardCell2[row][column].setAlive(true);

                }
                if (gameboardCell[row][column].isAlive() && alive < 2) {
                    gameboardCell2[row][column].setAlive(false);

                }
                if (gameboardCell[row][column].isAlive() && alive == 2 || alive == 3) {
                    gameboardCell2[row][column].setAlive(true);
                }
                if (gameboardCell[row][column].isAlive() && alive > 3) {
                    gameboardCell2[row][column].setAlive(false);
                }
            }
        }
    }



    // output game
    public void printGame() throws InterruptedException {

        Thread.sleep(200);

        for (int row = 0; row <= gameboardCell.length - 1; row++) {
            System.out.println("");

            for (int column = 0; column <= gameboardCell[row].length - 1; column++) {

                //Ceck the cell (alive, dead or stone?)
                if (gameboardCell2[row][column].isAlive()) {
                    System.out.print(" @ ");
                } else {
                        System.out.print(" . ");

                }
            }
        }

        System.out.println("");
    }

    // reset GameboardCell1
    public void setgameboardnew(){

            // Set gameboard cells like gameboard2 cells
                for (int row = 0; row < gameboardCell.length; row++) {
                    for (int column = 0; column < gameboardCell[row].length; column++) {

                        if (gameboardCell2[row][column].isAlive()) {
                            gameboardCell[row][column].setAlive(true);
                        } else {
                            gameboardCell[row][column].setAlive(false);
                        }

                    }
                }

    }
}





