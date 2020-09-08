public class Gameboard  {

    private static boolean[][] gameboard = new boolean[20][20];
    private static boolean[][] gameboard2 = new boolean[20][20];

    public void setAlive (int x, int y) {
        gameboard[x][y]=true;
    }
    public void printFirstGenGame(Gameboard game){

        //Output for the first generation
        for (int row = 0; row < gameboard.length; row++) {

            System.out.println("");

            for (int column = 0; column < gameboard[row].length ; column++) {

                if (gameboard[row][column] == true) {
                    System.out.print(" @ ");
                } else {
                    System.out.print(" . ");
                }
            }
        }
        System.out.println("");

    }


    public void printGame() throws InterruptedException {
        int a = 0;

        while (a == 0) {


            Thread.sleep(400);
            for (int row = 0; row <= gameboard.length -1  ; row++) {

                System.out.println("");

                for (int column = 0; column <= gameboard[row].length -1 ; column++) {
                    int alive = 0;

                    //Ceck neigbours and the x wall
                    try {
                        if (gameboard[row][column + 1] == true) {
                            alive++;
                        }
                    } catch (Exception e) {
                        if(gameboard[row][0]== true){
                            alive++;
                        }
                    }
                    try{
                        if (gameboard[row][column - 1] == true) {
                            alive++;
                        }
                    } catch (Exception e) {
                        if (gameboard[row][gameboard.length-1] == true) {
                            alive++;
                        }
                    }
                    try {
                        if (gameboard[row + 1][column] == true) {
                            alive++;
                        }
                    } catch (Exception e) {
                        if(gameboard[0][column]==true){
                            alive++;
                        }
                    }
                    try {
                        if (gameboard[row - 1][column]==true) {
                            alive++;
                        }
                    } catch (Exception e) {
                       try{
                           if(gameboard[gameboard.length -1][column]==true) {
                           alive++;
                            }
                       }catch(Exception e1){
                       }
                    }

                    try {
                        if (gameboard[row - 1][column + 1] == true) {
                            alive++;
                        }
                    } catch (Exception e) {
                       try {
                           if (gameboard[row - 1][0] == true) {
                               alive++;
                           }
                       }catch(Exception e1){
                       }
                    }
                    try{
                         if (gameboard[row - 1][column - 1] == true) {
                            alive++;
                         }
                    }catch(Exception e) {
                        try {
                            if (gameboard[row - 1][gameboard.length -1] == true) {
                                alive++;
                            }
                        }catch(Exception e1){
                        }
                    }
                    try {
                        if (gameboard[row + 1][column - 1] == true) {
                            alive++;
                        }
                    }catch(Exception e) {
                        try {
                            if (gameboard[row + 1][gameboard.length -1] == true) {
                                alive++;
                            }
                        }catch(Exception e1){
                        }
                    }
                    try{
                        if (gameboard[row + 1][column + 1] == true) {
                            alive++;
                        }
                    }catch (Exception e) {
                        try {
                            if (gameboard[row + 1][0] == true) {
                                alive++;
                            }
                        }catch(Exception e1){
                        }
                    }
                    //Check the rules
                    if (gameboard[row][column] == false && alive == 3) {
                        gameboard2[row][column] = true;

                    } else {
                    }
                    if (gameboard[row][column] == true && alive < 2) {
                        gameboard2[row][column] = false;

                    }
                    if (gameboard[row][column] == true && alive == 2 || alive == 3) {
                        gameboard2[row][column] = true;
                    } else {
                    }
                    if (gameboard[row][column] == true && alive > 3) {
                        gameboard2[row][column] = false;
                    } else {
                    }


                    //Ceck the cell (alive or dead?)
                    if (gameboard2[row][column] == true) {
                        System.out.print(" @ ");
                    } else {
                        System.out.print(" . ");
                    }
                }
            }

            System.out.println("");


            // Set gameboard cells like gameboard cells
            for (int row = 0; row < gameboard.length; row++) {
                for (int column = 0; column < gameboard[row].length; column++) {

                    if (gameboard2[row][column] == true) {
                        gameboard[row][column] = true;
                    } else {
                        gameboard[row][column] = false;
                    }

                }
            }

        }
    }
}



