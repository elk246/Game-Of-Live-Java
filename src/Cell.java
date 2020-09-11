public class Cell {

   private boolean isAlive= false;
   private int counter = 0;



    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }



    //Getter
    public boolean isAlive() {
        return isAlive;
    }

    //setter
    public void setAlive(boolean alive) {
        isAlive = alive;
    }
}
