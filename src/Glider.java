public class Glider {

    private static boolean[][] Gameboard = new boolean[10][10];
    private static boolean[][] Gameboard2 = new boolean[10][10];


    private static void glider() {
        Gameboard[1][2] = true;
        Gameboard[2][3] = true;
        Gameboard[2][4] = true;
        Gameboard[1][4] = true;
        Gameboard[3][3] = true;


    }

    private static void printGame() throws InterruptedException {
        int a = 0;

        while (a == 0) {

            Thread.sleep(400);
            for (int row = 0; row < Gameboard.length; row++) {

                System.out.println("");

                for (int column = 0; column < Gameboard[row].length; column++) {
                    int alive = 0;
                    try {
                        //Prüfung ob lebende Nachbarzelle, wenn ja dann Counter + 1
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
                        System.out.print("");
                    }
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


                    //Prüfung ob Zelle auf true oder false gesetzt ist, um Zeichen auszugeben.
                    if (Gameboard2[row][column] == true) {
                        System.out.print(" @ ");
                    } else {
                        System.out.print(" . ");
                    }
                }
            }
            System.out.println("");


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




    public static void main(String[] args) throws InterruptedException {

        glider();
        printGame();

        }
    }



























