public class Swirl extends Gameboard {

    public void setAlive(Gameboard game) {
        game.setAlive(7, 6);
        game.setAlive(6, 7);
        game.setAlive(5, 7);

        game.setAlive(5, 9);
        game.setAlive(6, 10);
        game.setAlive(6, 11);

        game.setAlive(8, 11);
        game.setAlive(9, 10);
        game.setAlive(10, 10);

        game.setAlive(10, 8);
        game.setAlive(9, 7);
        game.setAlive(9, 6);


    }
}
