public class Gameboard  {

    private static boolean[][] Gameboard = new boolean[20][20];
    private static boolean[][] Gameboard2 = new boolean[20][20];

    public void setAlive (int x, int y) {
        Gameboard[x][y]=true;
    }
    public void printFirstGenGame(Gameboard game){

        for (int row = 0; row < Gameboard.length; row++) {

            System.out.println("");

            for (int column = 0; column < Gameboard[row].length; column++) {

                if (Gameboard[row][column] == true) {
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

            Thread.sleep(500);
            for (int row = 0; row < Gameboard.length - 1; row++) {

                System.out.println("");

                for (int column = 0; column < Gameboard[row].length - 1; column++) {
                    int alive = 0;
                    try {
                        //Check neighbour (alive or dead?)// Count alive
                        if (Gameboard[row][column + 1] == true) {
                            alive++;
                        } else {
                        }
                        if (Gameboard[row][column - 1] == true) {
                            alive++;
                        } else {
                        }
                        if (Gameboard[row + 1][column] == true) {
                            alive++;
                        } else {
                        }
                        if (Gameboard[row - 1][column] == true) {
                            alive++;
                        } else {
                        }
                        if (Gameboard[row - 1][column + 1] == true) {
                            alive++;
                        } else {
                        }
                        if (Gameboard[row - 1][column - 1] == true) {
                            alive++;
                        } else {
                        }
                        if (Gameboard[row + 1][column - 1] == true) {
                            alive++;
                        } else {
                        }
                        if (Gameboard[row + 1][column + 1] == true) {
                            alive++;
                        } else {
                        }
                    } catch (Exception e) {

                    }
                    //Check the rules
                    if (Gameboard[row][column] == false && alive == 3) {
                        Gameboard2[row][column] = true;

                    } else {
                    }
                    if (Gameboard[row][column] == true && alive < 2) {
                        Gameboard2[row][column] = false;

                    }
                    if (Gameboard[row][column] == true && alive == 2 || alive == 3) {
                        Gameboard2[row][column] = true;
                    } else {
                    }
                    if (Gameboard[row][column] == true && alive > 3) {
                        Gameboard2[row][column] = false;
                    } else {
                    }


                    //Ceck the cell (alive or dead?)
                    if (Gameboard2[row][column] == true) {
                        System.out.print(" @ ");
                    } else {
                        System.out.print(" . ");
                    }
                }
            }
            System.out.println("");


            // Cell output (alive or dead?)
            for (int row = 0; row < Gameboard.length; row++) {
                for (int column = 0; column < Gameboard[row].length; column++) {

                    if(Gameboard2[row][column]==true){
                        Gameboard[row][column]=true;
                    }else{
                        Gameboard[row][column]=false;
                    }

                }
            }

        }
    }
}

