public class Blinker extends Gameboard {

    public void setAlive(Gameboard game){
        game.setAlive(0,7);
        game.setAlive(0,8);
        game.setAlive(0,6);
    }
}
