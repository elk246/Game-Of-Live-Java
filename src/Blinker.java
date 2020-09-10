public class Blinker extends Gameboard {

    public void setAlive(Gameboard game){
        game.setAlive(0,0);
        game.setAlive(19,0);
        game.setAlive(19,19);
       game.setAlive(0,19 );
    }
}
