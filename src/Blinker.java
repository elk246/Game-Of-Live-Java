public class Blinker extends Gameboard {

    public void setAlive(Gameboard game){
        game.setAlive(0,0);
        game.setAlive(0,1);
        game.setAlive(0,2);
    }
}
