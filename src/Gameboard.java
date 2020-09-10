public class Gameboard {

    private static boolean[][] gameboard = new boolean[20][20];
    private static boolean[][] gameboard2 = new boolean[20][20];

    public void setAlive(int x, int y) {
        gameboard[x][y] = true;
    }

    public void printFirstGenGame(Gameboard game) {

        //Output for the first generation
        for (int row = 0; row < gameboard.length; row++) {

            System.out.println("");

            for (int column = 0; column < gameboard[row].length; column++) {

                if (gameboard[row][column] == true) {
                    System.out.print(" @ ");
                } else {
                    System.out.print(" . ");
                }
            }
        }
        System.out.println("");

    }


    public void checkgameboard() throws InterruptedException {
        for (int row = 0; row <= gameboard.length - 1; row++) {

            for (int column = 0; column <= gameboard[row].length - 1; column++) {
                int alive = 0;


                //check right wall and check neighbour
                try {
                    if (gameboard[row][column + 1]) {
                        alive++;
                    }
                } catch (Exception e) {
                    if (gameboard[row][0]) {
                        alive++;
                    }
                }
                // check left wall and check neighbour
                try {
                    if (gameboard[row][column - 1]) {
                        alive++;
                    }
                } catch (Exception e) {
                    if (gameboard[row][gameboard.length - 1]) {
                        alive++;
                    }
                }
                //check below wall an neighbour
                try {
                    if (gameboard[row + 1][column]) {
                        alive++;
                    }
                } catch (Exception e) {
                    if (gameboard[0][column]) {
                        alive++;
                    }
                }
                //check top wall and neighbour
                try {
                    if (gameboard[row - 1][column]) {
                        alive++;
                    }
                } catch (Exception e) {
                    if (gameboard[gameboard.length - 1][column]) {
                        alive++;
                    }
                }

                //check neighbour right on top
                try {
                    if (gameboard[row - 1][column + 1]) {
                        alive++;
                    }
                } catch (Exception e) {
                    //check right wall
                    if (row == 0 && column > 0 && column <= gameboard[0].length - 1) {
                        try {
                            if (gameboard[gameboard.length - 1][column + 1]) {
                                alive++;
                            }

                        } catch (Exception e1) {
                        }
                    }
                    //check the right edge top
                    if (row == 0 && column == gameboard[0].length - 1) {
                        if(gameboard[gameboard.length-1][0]){
                            alive++;
                        }
                    }

                }

                //check top wall
                if (column == gameboard[0].length - 1 && row >= 0 && row <= gameboard.length - 1) {
                    try {
                        if (gameboard[row - 1][0]) {
                            alive++;
                        }
                    }catch (Exception e){
                    }
                }


                //check neighbour left and below
                try {
                    if (gameboard[row - 1][column - 1]) {
                        alive++;
                    }
                } catch (Exception e) {
                    //check top wall
                    if (row == 0 && column >= 0 && column <= gameboard[0].length - 1) {
                        try {
                            if (gameboard[gameboard.length - 1][column - 1]) {
                                alive++;
                            }
                        }catch(Exception e1){
                        }
                    }
                    //check left wall
                    if (column == 0 && row >= 0 && row <= gameboard.length - 1) {
                       try {
                           if (gameboard[row - 1][gameboard.length - 1]) {
                               alive++;
                           }
                       }catch(Exception e1){
                       }
                    }
                    //check the left edge top
                    if (row == 0 && column == 0) {
                        if(gameboard[gameboard.length-1][gameboard.length-1]){
                            alive++;
                        }
                    }
                }


                //check neighbour left and top
                try {
                    if (gameboard[row + 1][column - 1]) {
                        alive++;
                    }
                } catch (Exception e) {
                    // check right wall
                    if (row == gameboard.length - 1 && column > 0 && column <= gameboard[0].length - 1) {
                        if (gameboard[0][column - 1]) {
                            alive++;
                        }
                    }
                    //check below wall
                    if (column == 0 && row >= 0 && row <= gameboard.length - 1) {
                        try {
                            if (gameboard[row + 1][gameboard.length - 1]) {
                                alive++;
                            }
                        }catch(Exception e1){
                        }
                    }
                    //check the left edge below
                    if (row == gameboard.length - 1 && column == 0) {
                        if(gameboard[0][gameboard.length-1]){
                            alive++;
                        }
                    }
                }


                //check neighbour right and below
                try {
                    if (gameboard[row + 1][column + 1]) {
                        alive++;
                    }
                } catch (Exception e) {
                    //check below wall
                    if (row == gameboard.length - 1 && column >= 0 && column <= gameboard[0].length - 1) {
                        try {
                            if (gameboard[0][column + 1]) {
                                alive++;
                            }
                        }catch(Exception e1){
                        }
                    }
                    //check right wall
                    if (column == gameboard[0].length - 1 && row >= 0 && row <= gameboard.length - 1) {
                        try {
                            if (gameboard[row + 1][0]) {
                                alive++;
                            }
                        }catch(Exception e1){
                        }
                    }
                    //check the edge right below
                    if (row == gameboard.length - 1 && column == gameboard.length - 1) {
                        if(gameboard[0][0]){
                            alive++;
                        }
                    }
                }


                //Check the rules
                if (gameboard[row][column] && alive == 3) {
                    gameboard2[row][column] = true;

                }
                if (gameboard[row][column] && alive < 2) {
                    gameboard2[row][column] = false;

                }
                if (gameboard[row][column] && alive == 2 || alive == 3) {
                    gameboard2[row][column] = true;
                }
                if (gameboard[row][column] && alive > 3) {
                    gameboard2[row][column] = false;
                }

            }
        }
    }




    public void printGame() throws InterruptedException {

        Thread.sleep(200);

        for (int row = 0; row <= gameboard.length - 1; row++) {
            System.out.println("");

            for (int column = 0; column <= gameboard[row].length - 1; column++) {

                //Ceck the cell (alive or dead?)
                if (gameboard2[row][column]) {
                    System.out.print(" @ ");
                } else {
                    System.out.print(" . ");
                }
            }
        }

        System.out.println("");
    }

    public void setgameboardnew(){

            // Set gameboard cells like gameboard2 cells
                for (int row = 0; row < gameboard.length; row++) {
                    for (int column = 0; column < gameboard[row].length; column++) {

                        if (gameboard2[row][column]) {
                            gameboard[row][column] = true;
                        } else {
                            gameboard[row][column] = false;
                        }

                    }
                }

            }
        }





