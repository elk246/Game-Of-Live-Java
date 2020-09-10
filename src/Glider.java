public class Glider extends Gameboard {

    public void setAlive(Gameboard game) {
        game.setAlive(10,8);
        game.setAlive(9, 10);
        game.setAlive(10,10);
        game.setAlive(11,10);
        game.setAlive(11,9);

        game.setAlive(2,16);
        game.setAlive(4,17);
        game.setAlive(4,16);
        game.setAlive(3,15);
        game.setAlive(4,15);
    }
}
