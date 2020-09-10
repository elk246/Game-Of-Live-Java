public class Toad extends Gameboard  {

    public void setAlive(Gameboard game){
        game.setAlive(8,7);
        game.setAlive(9,7);
        game.setAlive(10,8);
        game.setAlive(8,10);
        game.setAlive(9,10);
        game.setAlive(7,9);
    }
}
