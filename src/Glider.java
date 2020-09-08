public class Glider extends Gameboard {

    public void setAlive(Gameboard game) {
        game.setAlive(1,2);
        game.setAlive(2,3);
        game.setAlive(2,4);
        game.setAlive(1,4);
        game.setAlive(3,3);
    }
}
