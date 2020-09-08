import java.awt.font.ShapeGraphicAttribute;
import java.sql.SQLOutput;
import java.util.Scanner;

public class GameOfLive{

    private static boolean[][] Gameboard = new boolean[20][20];
    private static boolean[][] Gameboard2 = new boolean[20][20];

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
                    Beacon newBeacon= new Beacon();
                    newBeacon.setAlive(game);
                    printfirstGeneration();
                    printGame();
            } else {
                if (Antwort.equals("P") || Antwort.equals("p")) {
                        Pulsar newPulsar= new Pulsar();
                        newPulsar.setAlive(game);
                        printfirstGeneration();
                        printGame();
                } else {
                    if (Antwort.equals("Pe") || Antwort.equals("pe")) {
                            Penta newPenta= new Penta();
                            newPenta.setAlive(game);
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
                                            Spaceship newSpaceship= new Spaceship();
                                            newSpaceship.setAlive(game);
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



