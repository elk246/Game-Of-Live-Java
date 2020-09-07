import java.awt.font.ShapeGraphicAttribute;
import java.sql.SQLOutput;
import java.util.Scanner;

public class GameOfLive{

    private static boolean[][] Gameboard = new boolean[20][20];
    private static boolean[][] Gameboard2 = new boolean[20][20];



    private static void beacon() {
        Gameboard[11][10] = true;
        Gameboard[12][10] = true;
        Gameboard[12][9] = true;
        Gameboard[10][7] = true;
        Gameboard[9][7] = true;
        Gameboard[9][8] = true;
    }
    private static void pulsar() {
        Gameboard[4][2] = true;
        Gameboard[2][4] = true;
        Gameboard[2][5] = true;
        Gameboard[2][6] = true;
        Gameboard[4][7] = true;
        Gameboard[5][7] = true;
        Gameboard[6][7] = true;
        Gameboard[7][6] = true;
        Gameboard[7][5] = true;
        Gameboard[7][4] = true;
        Gameboard[6][2] = true;
        Gameboard[5][2] = true;

        Gameboard[4][9] = true;
        Gameboard[5][9] = true;
        Gameboard[6][9] = true;
        Gameboard[7][10] = true;
        Gameboard[7][11] = true;
        Gameboard[7][12] = true;
        Gameboard[6][14] = true;
        Gameboard[5][14] = true;
        Gameboard[4][14] = true;
        Gameboard[2][12] = true;
        Gameboard[2][11] = true;
        Gameboard[2][10] = true;
        Gameboard[9][4] = true;
        Gameboard[9][5] = true;
        Gameboard[9][6] = true;
        Gameboard[10][7] = true;
        Gameboard[11][7] = true;
        Gameboard[12][7] = true;
        Gameboard[14][6] = true;
        Gameboard[14][5] = true;
        Gameboard[14][4] = true;
        Gameboard[12][2] = true;
        Gameboard[11][2] = true;
        Gameboard[10][2] = true;
        Gameboard[9][10] = true;
        Gameboard[9][11] = true;
        Gameboard[9][12] = true;
        Gameboard[10][14] = true;
        Gameboard[11][14] = true;
        Gameboard[12][14] = true;
        Gameboard[14][12] = true;
        Gameboard[14][11] = true;
        Gameboard[14][10] = true;
        Gameboard[12][9] = true;
        Gameboard[11][9] = true;
        Gameboard[10][9] = true;
    }
    private static void penta() {
        Gameboard[4][9] = true;
        Gameboard[3][9] = true;
        Gameboard[2][9] = true;
        Gameboard[4][8] = true;
        Gameboard[4][10] = true;
        Gameboard[7][9] = true;
        Gameboard[7][10] = true;
        Gameboard[7][8] = true;
        Gameboard[8][9] = true;
        Gameboard[9][9] = true;
        Gameboard[10][9] = true;
        Gameboard[11][9] = true;
        Gameboard[12][9] = true;
        Gameboard[12][8] = true;
        Gameboard[12][10] = true;
        Gameboard[15][9] = true;
        Gameboard[15][8] = true;
        Gameboard[15][10] = true;
        Gameboard[16][9] = true;
        Gameboard[17][9] = true;
    }
    private static void Spaceship(){

        Gameboard[7][2] = true;
        Gameboard[5][2] = true;
        Gameboard[4][3] = true;
        Gameboard[4][4] = true;
        Gameboard[4][5] = true;
        Gameboard[4][6] = true;
        Gameboard[5][6] = true;
        Gameboard[6][6] = true;
        Gameboard[7][5] = true;

    }
    private  void Pentomino(){
        Gameboard[7][4]= true;
        Gameboard[7][5]= true;
        Gameboard[8][5]= true;
        Gameboard[6][5]= true;
        Gameboard[6][6]= true;
    }
    public void setAlive (int x, int y) {
        Gameboard[x][y]=true;
    }

    private static void printfirstGeneration(){

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


    private static void printGame() throws InterruptedException {
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



    public static  void main(String[] args) throws InterruptedException {
        GameOfLive game = new GameOfLive();
        String Antwort;
        Scanner Tastatur = new Scanner(System.in);

        System.out.println("Welche Figur soll abgespielt werden?");
        System.out.println("Blinker - B");
        System.out.println("Toad - T");
        System.out.println("Beacon - Be");
        System.out.println("Pulsar - P");
        System.out.println("Pentadecathlon - Pe");
        System.out.println("Glider - G");
        System.out.println("Spaceship - S");
        Antwort = Tastatur.next();


        if (Antwort.equals("B") || Antwort.equals("b")) {
                Blinker newBlinker= new Blinker();
                newBlinker.setAlive(game);
                printfirstGeneration();
                printGame();
        } else {
            if (Antwort.equals("Be") || Antwort.equals("be")) {
                    beacon();
                    printfirstGeneration();
                    printGame();
            } else {
                if (Antwort.equals("P") || Antwort.equals("p")) {
                        pulsar();
                        printfirstGeneration();
                        printGame();
                } else {
                    if (Antwort.equals("Pe") || Antwort.equals("pe")) {
                            penta();
                            printfirstGeneration();
                            printGame();
                    } else {
                        if (Antwort.equals("T") || Antwort.equals("t")) {
                                Toad newToad= new Toad();
                                newToad.setAlive(game);
                                printfirstGeneration();
                                printGame();
                        } else {
                            if (Antwort.equals("G") || Antwort.equals("g")) {

                                Glider newGlider= new Glider();
                                newGlider.setAlive(game);
                                printfirstGeneration();
                                printGame();
                                }else{
                                    if(Antwort.equals("S")|| Antwort.equals("s")) {
                                            Spaceship();
                                            printfirstGeneration();
                                            printGame();
                                    }else{
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }



