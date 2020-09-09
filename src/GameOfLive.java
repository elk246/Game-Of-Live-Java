import java.awt.font.ShapeGraphicAttribute;
import java.sql.SQLOutput;
import java.util.Scanner;

public class GameOfLive{

    public static  void main(String[] args) throws InterruptedException {

        Gameboard gameboard= new Gameboard();

        String Antwort;

        Scanner Scanner = new Scanner(System.in);

        System.out.println("Choose the figure: ");
        System.out.println("Blinker - B");
        System.out.println("Toad - T");
        System.out.println("Beacon - Be");
        System.out.println("Pulsar - P");
        System.out.println("Pentadecathlon - Pe");
        System.out.println("Glider - G");
        System.out.println("Spaceship - S");
        Antwort = Scanner.next();


        if (Antwort.equals("B") || Antwort.equals("b")) {

            Blinker newBlinker = new Blinker();
            newBlinker.setAlive(gameboard);
            newBlinker.printFirstGenGame(gameboard);
            while (true) {
                newBlinker.checkgameboard();
                newBlinker.printGame();
                newBlinker.setgameboardnew();
            }
        } else {
            if (Antwort.equals("Be") || Antwort.equals("be")) {
                    Beacon newBeacon= new Beacon();
                    newBeacon.setAlive(gameboard);
                    newBeacon.printFirstGenGame(gameboard);
                    while(true) {
                        newBeacon.checkgameboard();
                        newBeacon.printGame();
                        newBeacon.setgameboardnew();
                    }
            } else {
                if (Antwort.equals("P") || Antwort.equals("p")) {
                        Pulsar newPulsar= new Pulsar();
                        newPulsar.setAlive(gameboard);
                        newPulsar.printFirstGenGame(gameboard);
                        while(true) {
                            newPulsar.checkgameboard();
                            newPulsar.printGame();
                            newPulsar.setgameboardnew();
                        }
                } else {
                    if (Antwort.equals("Pe") || Antwort.equals("pe")) {
                            Penta newPenta= new Penta();
                            newPenta.setAlive(gameboard);
                            newPenta.printFirstGenGame(gameboard);
                            while(true){
                                newPenta.checkgameboard();
                                newPenta.printGame();
                                newPenta.setgameboardnew();
                            }
                    } else {
                        if (Antwort.equals("T") || Antwort.equals("t")) {
                                Toad newToad= new Toad();
                                newToad.setAlive(gameboard);
                                newToad.printFirstGenGame(gameboard);
                                while(true) {
                                    newToad.checkgameboard();
                                    newToad.printGame();
                                    newToad.setgameboardnew();
                                }
                        } else {
                            if (Antwort.equals("G") || Antwort.equals("g")) {
                                Glider newGlider= new Glider();
                                newGlider.setAlive(gameboard);
                                newGlider.printFirstGenGame(gameboard);
                                while(true){
                                    newGlider.checkgameboard();
                                    newGlider.printGame();
                                    newGlider.setgameboardnew();
                                }
                                }else{
                                    if(Antwort.equals("S")|| Antwort.equals("s")) {
                                            Spaceship newSpaceship= new Spaceship();
                                            newSpaceship.setAlive(gameboard);
                                            newSpaceship.printFirstGenGame(gameboard);
                                            while(true) {
                                                newSpaceship.checkgameboard();
                                                newSpaceship.printGame();
                                                newSpaceship.setgameboardnew();
                                            }
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



