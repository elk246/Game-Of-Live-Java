public class Glider {

    private static boolean[][] Spielfeld = new boolean[10][10];
    private static boolean[][] Spielfeld2 = new boolean[10][10];


    private static void glider() {
        Spielfeld[1][2] = true;
        Spielfeld[2][3] = true;
        Spielfeld[2][4] = true;
        Spielfeld[1][4] = true;
        Spielfeld[3][3] = true;


    }

    private static void printSpielbrett1() throws InterruptedException {
        Thread.sleep(400);
        for (int row = 0; row < Spielfeld.length; row++) {

            System.out.println("");

            for (int column = 0; column < Spielfeld[row].length; column++) {
                int alive = 0;
                try {
                    //Prüfung ob lebende Nachbarzelle, wenn ja dann Counter + 1
                    if (Spielfeld2[row][column + 1] == true) {
                        alive++;
                    } else {
                    }
                    if (Spielfeld2[row][column - 1] == true) {
                        alive++;
                    } else {
                    }
                    if (Spielfeld2[row + 1][column] == true) {
                        alive++;
                    } else {
                    }
                    if (Spielfeld2[row - 1][column] == true) {
                        alive++;
                    } else {
                    }
                    if (Spielfeld2[row - 1][column + 1] == true) {
                        alive++;
                    } else {
                    }
                    if (Spielfeld2[row - 1][column - 1] == true) {
                        alive++;
                    } else {
                    }
                    if (Spielfeld2[row + 1][column - 1] == true) {
                        alive++;
                    } else {
                    }
                    if (Spielfeld2[row + 1][column + 1] == true) {
                        alive++;
                    } else {
                    }
                } catch (Exception e) {
                    System.out.print("");
                }
                if (Spielfeld2[row][column] == false && alive == 3) {
                    Spielfeld[row][column] = true;

                } else {
                }
                if (Spielfeld2[row][column] == true && alive < 2) {
                    Spielfeld[row][column] = false;

                }
                if (Spielfeld2[row][column] == true && alive == 2 || alive == 3) {
                    Spielfeld[row][column] = true;
                } else {
                }
                if (Spielfeld2[row][column] == true && alive > 3) {
                    Spielfeld[row][column] = false;
                }else{
                }


                //Prüfung ob Zelle auf true oder false gesetzt ist, um Zeichen auszugeben.
                if (Spielfeld[row][column] == true) {
                    System.out.print(" @ ");
                } else {
                    System.out.print(" . ");
                }
            }
        }
        System.out.println("");
        System.out.println("");


        Thread.sleep(400);
        for (int row = 0; row < Spielfeld2.length; row++) {
            System.out.println("");
            for (int column = 0; column < Spielfeld2[row].length; column++) {
                int alive = 0;

                try {
                    //Prüfung ob lebende Nachbarzelle, wenn ja dann Counter + 1
                    if (Spielfeld[row][column + 1] == true) {
                        alive++;
                    } else {
                    }
                    if (Spielfeld[row][column - 1] == true) {
                        alive++;
                    } else {
                    }
                    if (Spielfeld[row + 1][column] == true) {
                        alive++;
                    } else {
                    }
                    if (Spielfeld[row - 1][column] == true) {
                        alive++;
                    } else {
                    }
                    if (Spielfeld[row - 1][column + 1] == true) {
                        alive++;
                    } else {
                    }
                    if (Spielfeld[row - 1][column - 1] == true) {
                        alive++;
                    } else {
                    }
                    if (Spielfeld[row + 1][column - 1] == true) {
                        alive++;
                    } else {
                    }
                    if (Spielfeld[row + 1][column + 1] == true) {
                        alive++;
                    } else {
                    }
                } catch (Exception e) {

                }


                if (Spielfeld[row][column] == false && alive == 3) {
                    Spielfeld2[row][column] = true;

                } else {
                }
                if (Spielfeld[row][column] == true && alive < 2) {
                    Spielfeld2[row][column] = false;

                }
                if (Spielfeld[row][column] == true && alive == 2 || alive == 3) {
                    Spielfeld2[row][column] = true;
                } else {
                }
                if (Spielfeld[row][column] == true && alive > 3) {
                    Spielfeld2[row][column] = false;

                } else {
                }


                //Prüfung ob Zelle auf true oder false gesetzt ist, um Zeichen auszugeben.
                if (Spielfeld2[row][column] == true) {
                    System.out.print(" @ ");
                } else {
                    System.out.print(" . ");
                }
            }
        }
        System.out.println("");

    }



    public static void main(String[] args) throws InterruptedException {

        int a = 0;

        while (a ==0) {
            glider();
            printSpielbrett1();

        }


    }
}























