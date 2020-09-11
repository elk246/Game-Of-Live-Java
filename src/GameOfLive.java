import java.awt.font.ShapeGraphicAttribute;
import java.sql.SQLOutput;
import java.util.Scanner;

public class GameOfLive {

    public static void main(String[] args) throws InterruptedException {

        Gameboard gameboard = new Gameboard();

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

            gameboard.createGameboard();
            Blinker blinker = new Blinker();
            blinker.setAlive(gameboard);
            gameboard.printGameboard();

            while (true) {
                gameboard.checkgameboard();
                gameboard.printGame();
                gameboard.setgameboardnew();
            }
        }

        if (Antwort.equals("Be") || Antwort.equals("be")) {

            gameboard.createGameboard();
            Beacon beacon = new Beacon();
            beacon.setAlive(gameboard);
            gameboard.printGameboard();

            while (true) {
                gameboard.checkgameboard();
                gameboard.printGame();
                gameboard.setgameboardnew();
            }
        }

        if (Antwort.equals("P") || Antwort.equals("p")) {

            gameboard.createGameboard();
            Pulsar pulsar = new Pulsar();
            pulsar.setAlive(gameboard);
            gameboard.printGameboard();

            while (true) {
                pulsar.checkgameboard();
                pulsar.printGame();
                pulsar.setgameboardnew();
            }
        }

        if (Antwort.equals("Pe") || Antwort.equals("pe")) {

            gameboard.createGameboard();
            Penta penta = new Penta();
            penta.setAlive(gameboard);
            gameboard.printGameboard();

            while (true) {
                penta.checkgameboard();
                penta.printGame();
                penta.setgameboardnew();
            }
        }

        if (Antwort.equals("T") || Antwort.equals("t")) {

            gameboard.createGameboard();
            Toad toad = new Toad();
            toad.setAlive(gameboard);
            gameboard.printGameboard();

            while (true) {
                toad.checkgameboard();
                toad.printGame();
                toad.setgameboardnew();
            }
        }

        if (Antwort.equals("G") || Antwort.equals("g")) {

            gameboard.createGameboard();
            Glider glider = new Glider();
            glider.setAlive(gameboard);
            gameboard.printGameboard();

            while (true) {
                glider.checkgameboard();
                glider.printGame();
                glider.setgameboardnew();
            }
        }

        if (Antwort.equals("S") || Antwort.equals("s")) {

            gameboard.createGameboard();
            Spaceship spaceship = new Spaceship();
            spaceship.setAlive(gameboard);
            gameboard.printGameboard();

            while (true) {
                spaceship.checkgameboard();
                spaceship.printGame();
                spaceship.setgameboardnew();
            }
        }
    }
}









