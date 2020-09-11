public class Frog extends Gameboard {

    public void setAlive(Gameboard game) {

        game.setAlive(10,9);
        game.setAlive(10,10);
        game.setAlive(9,10);
        game.setAlive(9,11);

        game.setAlive(10,12);
        game.setAlive(11,12);
        game.setAlive(11,11);
        game.setAlive(12,11);
    }
}
