import java.util.Scanner;

public class GameOfLive {

    private static boolean[][] Spielfeld = new boolean[20][20];
    private static boolean[][] Spielfeld2 = new boolean[20][20];


    private static void toad(){
        Spielfeld[8][7] = true;
        Spielfeld[9][7] = true;
        Spielfeld[10][8] = true;
        Spielfeld[9][10]= true;
        Spielfeld[8][10]= true;
        Spielfeld[7][9]= true;
    }
    private static void blinker(){
        Spielfeld[8][9]= true;
        Spielfeld[9][9]= true;
        Spielfeld[10][9]= true;
    }
    private static void beacon(){
        Spielfeld[11][10]= true;
        Spielfeld[12][10]= true;
        Spielfeld[12][9]= true;
        Spielfeld[10][7]= true;
        Spielfeld[9][7]= true;
        Spielfeld[9][8]= true;
    }

    private static void pulsar(){
        Spielfeld[4][2]= true;
        Spielfeld[2][4]= true;
        Spielfeld[2][5]= true;
        Spielfeld[2][6]= true;
        Spielfeld[4][7]= true;
        Spielfeld[5][7]= true;
        Spielfeld[6][7]= true;
        Spielfeld[7][6]= true;
        Spielfeld[7][5]= true;
        Spielfeld[7][4]= true;
        Spielfeld[6][2]= true;
        Spielfeld[5][2]= true;

        Spielfeld[4][9]= true;
        Spielfeld[5][9]= true;
        Spielfeld[6][9]= true;
        Spielfeld[7][10]= true;
        Spielfeld[7][11]= true;
        Spielfeld[7][12]= true;
        Spielfeld[6][14]= true;
        Spielfeld[5][14]= true;
        Spielfeld[4][14]= true;
        Spielfeld[2][12]= true;
        Spielfeld[2][11]= true;
        Spielfeld[2][10]= true;

        Spielfeld[9][4]= true;
        Spielfeld[9][5]= true;
        Spielfeld[9][6]= true;
        Spielfeld[10][7]= true;
        Spielfeld[11][7]= true;
        Spielfeld[12][7]= true;
        Spielfeld[14][6]= true;
        Spielfeld[14][5]= true;
        Spielfeld[14][4]= true;
        Spielfeld[12][2]= true;
        Spielfeld[11][2]= true;
        Spielfeld[10][2]= true;

        Spielfeld[9][10]= true;
        Spielfeld[9][11]= true;
        Spielfeld[9][12]= true;
        Spielfeld[10][14]= true;
        Spielfeld[11][14]= true;
        Spielfeld[12][14]= true;
        Spielfeld[14][12]= true;
        Spielfeld[14][11]= true;
        Spielfeld[14][10]= true;
        Spielfeld[12][9]= true;
        Spielfeld[11][9]= true;
        Spielfeld[10][9]= true;
    }

    private static void penta(){
        Spielfeld[4][9]= true;
        Spielfeld[3][9]= true;
        Spielfeld[2][9]= true;
        Spielfeld[4][8]= true;
        Spielfeld[4][10]= true;
        Spielfeld[7][9]= true;
        Spielfeld[7][10]= true;
        Spielfeld[7][8]= true;
        Spielfeld[8][9]= true;
        Spielfeld[9][9]= true;
        Spielfeld[10][9]= true;
        Spielfeld[11][9]= true;
        Spielfeld[12][9]= true;
        Spielfeld[12][8]= true;
        Spielfeld[12][10]= true;
        Spielfeld[15][9]= true;
        Spielfeld[15][8]= true;
        Spielfeld[15][10]= true;
        Spielfeld[16][9]= true;
        Spielfeld[17][9]= true;
    }

    private static void printSpielbrett1() throws InterruptedException {
        Thread.sleep(400);
        for (int row = 0; row < Spielfeld.length; row++) {

            System.out.println("");

            for (int column = 0; column < Spielfeld2[row].length; column++) {
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
                if(Spielfeld2[row][column] == true && alive==2 || alive== 3){
                    Spielfeld[row][column] = true;
                }else{
                }
                if(Spielfeld2[row][column]==true && alive>3){
                    Spielfeld[row][column]= false;

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
                if(Spielfeld[row][column]==true && alive==2 || alive==3){
                    Spielfeld2[row][column]= true;
                }else{
                }
                if(Spielfeld[row][column]==true && alive>3){
                    Spielfeld2[row][column]= false;

                }else{
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

        public static void main (String[]args) throws InterruptedException {
            String Antwort;
            int gen = 0;
            Scanner Tastatur= new Scanner(System.in);

            System.out.println("Welche Figur soll abgespielt werden?");
            System.out.println("Blinker - B");
            System.out.println("Toad - T");
            System.out.println("Beacon - Be");
            System.out.println("Pulsar - P");
            System.out.println("Pentadecathlon - Pe");
            Antwort=Tastatur.next();


            if(Antwort.equals("B")||Antwort.equals("b")) {
                while (gen <= 10) {
                    blinker();
                    printSpielbrett1();
                    gen++;
                }
            }else{
                if(Antwort.equals("Be") || Antwort.equals("be")){
                    while (gen <= 10) {
                        beacon();
                        printSpielbrett1();
                        gen++;
                    }
                }else{
                    if(Antwort.equals("P")||Antwort.equals("p")){
                        while (gen <= 10) {
                            pulsar();
                            printSpielbrett1();
                            gen++;
                        }
                    }else{
                        if(Antwort.equals("Pe")||Antwort.equals("pe")){
                            while (gen <= 10) {
                                penta();
                                printSpielbrett1();
                                gen++;
                            }
                        }else{
                            if(Antwort.equals("T")||Antwort.equals("t")) {
                                while (gen <= 10) {
                                    toad();
                                    printSpielbrett1();
                                    gen++;
                                }
                            }else{
                            }
                            }
                        }
                    }
                }
            }
        }


